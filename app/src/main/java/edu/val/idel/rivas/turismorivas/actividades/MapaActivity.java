package edu.val.idel.rivas.turismorivas.actividades;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

import edu.val.idel.rivas.turismorivas.R;
import edu.val.idel.rivas.turismorivas.listener.MenuNavListener;
import edu.val.idel.rivas.turismorivas.modelo.AuditorioMiguelRios;
import edu.val.idel.rivas.turismorivas.modelo.AytoRivas;
import edu.val.idel.rivas.turismorivas.modelo.CastilloDeRivas;
import edu.val.idel.rivas.turismorivas.modelo.CuevasDeLaGuerraCivil;
import edu.val.idel.rivas.turismorivas.modelo.ErmitaDelCristo;
import edu.val.idel.rivas.turismorivas.modelo.FincaElPorcal;
import edu.val.idel.rivas.turismorivas.modelo.LagunaDelCampillo;
import edu.val.idel.rivas.turismorivas.modelo.MonumentoMartiresVaciamadrid;
import edu.val.idel.rivas.turismorivas.modelo.ParqueLineal;
import edu.val.idel.rivas.turismorivas.modelo.ParroquiaSanMarcos;
import edu.val.idel.rivas.turismorivas.modelo.ParroquiaSantaMonica;
import edu.val.idel.rivas.turismorivas.modelo.Piruli;
import edu.val.idel.rivas.turismorivas.modelo.PuenteDelTrenDeArganda;
import edu.val.idel.rivas.turismorivas.modelo.PuentedeArganda;
import edu.val.idel.rivas.turismorivas.modelo.PuntoDeInteres;
import edu.val.idel.rivas.turismorivas.modelo.Trincheras;
import edu.val.idel.rivas.turismorivas.modelo.YacimientoArqueologicoMiralrio;
import edu.val.idel.rivas.turismorivas.util.Constantes;
import edu.val.idel.rivas.turismorivas.util.PreferencesUsuario;

/**
 * @version 1.0.1
 * @author Cuadrado
 * @since 20-7-18
 *
 * 13-8-2018 1.0.1 Vale Refactorizo, se agrega el menú lateral de navegación. Comentarios normalizados.
 * Inclusión de iconos de menú en resolución estándar (24x24)
 *
 * Clase utilizada utilizada para mostrar el mapa y dibujar los marcadores de cada punto de interés
 * Se recogen los eventos sobre el menú lateral (apertura, cierre y selección)
 */
public class MapaActivity extends AppCompatActivity implements OnMapReadyCallback {


    public static final byte NUM_PUNTOS_INTERES = 16;//TOTAL DE PUNTOS DE INTERÉS CATALOGADOS
    private final static LatLng POSICION_INICIO = new LatLng(40.351906, -3.535733);//POSICIÓN GEOGRÁFICA DE RIVAS
    private final static float NIVEL_ZOOM = 13;//NIVEL DE PROXIMIDAD DE LA CÁMARA DEL MAPA

    private GoogleMap googleMap;//el mapa propiamente dicho
    private static List<PuntoDeInteres> lpi;//listado de puntos de interés
    private DrawerLayout drawerLayout;//el menú lateral
    private boolean menu_visible;//para gestionar si está visible o no el menú lateral

    private static List<Marker> lista_marcadores;//lista que almacena los marcadores del mapa, para que desde el menú lateral, cuando se pulse un nombre, se pueda ir a ese marcador (centrar el mapa en él y mostrar su cartelito)


    @Override
    public void onCreate(Bundle savedInstanceState) {
        try {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_mapa_menu);

           //TODO habría que chequear si hay conexión a internet y está el api disponible :Issue abierto https://github.com/googlemaps/android-samples/issues/104

            //iniciamos el menú
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); //muestra el boton de para atrás (por defecto)
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.menu_lateral);//personalizo con el del menu

            //asignamos listener del menú lateral
            drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
            NavigationView navigationView = (NavigationView) findViewById(R.id.navview);
            navigationView.setNavigationItemSelectedListener(new MenuNavListener(this));


            //si es la primera vez queremos informar al usuario de la necesidad de tener conexión a internet (al menos la primera vez)
            if (primeraVez ())
            {
                mostrarBienvenida ();
            }

            //pedimos a la librería de Google El mapa, de forma asíncrnona. onMapReady será invocado. a la vuelta
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);

        } catch (Throwable t) {
            Log.e("MIAPP", "Error en maps", t);
            //TODO mostrar Dialog de Cierre de aplicación
        }
    }

    /**
     * Se le informa al usuario mediante una Diálgo Alerta que debe tener conexión
     * a internet. Se actualiza que este mensaje ha sido mostrado tras su aceptación
     *
     */
    private void mostrarBienvenida ()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.bienvenido);
        builder.setMessage(R.string.aviso_pvez);
        builder.setPositiveButton(R.string.aceptar, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                PreferencesUsuario.guardarPrefPrimeraVez(false, getBaseContext());
            }
        });

        AlertDialog mensaje_aviso = builder.create();
        mensaje_aviso.getButton(DialogInterface.BUTTON_POSITIVE);
        //personalizo el color que por defecto es coloraccent, pero entra en conflicto con el color de valoración de las estrellas
        mensaje_aviso.show();
        //después de mostralo, hay que personalizar el color y no antes. Si no falla
        Button botonok = mensaje_aviso.getButton(DialogInterface.BUTTON_POSITIVE);
        botonok.setTextColor(ContextCompat.getColor(this, R.color.colorGris));




    }

    /**
     * Método empleado para saber si es la primera vez que el usuario entra en esta pantalla
     *
     * @return true si es la primera vez que el usuario abre esta actividad, false en caso contrario
     */
    private boolean primeraVez ()
    {
        boolean pvez = false;

            pvez = PreferencesUsuario.getPrefPrimeraVez(this);

        return pvez;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id_item = item.getItemId();
        switch (id_item) {
            case R.id.creditos:
                startActivity(new Intent(this, CreditosActivity.class));
                break;

            case R.id.ajustes:
                startActivity(new Intent(this, AjustesActivity.class));
                break;

            case android.R.id.home:
                if (menu_visible) {
                    drawerLayout.closeDrawers();
                    menu_visible = false;
                } else {
                    drawerLayout.openDrawer(GravityCompat.START);
                    menu_visible = true;
                }
        }
        return super.onOptionsItemSelected(item);
    }


    /**
     * Método que permite obtener un Punto de Interés por su id (posición en la lista en realidad)
     *
     * @param i el id del punto de interés
     * @return el punto de interés i-ésimo
     */
    public static PuntoDeInteres getPuntoDeInteres(int i) {
        PuntoDeInteres pi = null;

            pi = lpi.get(i);

        return pi;
    }


    /**
     * Método que dibuja en el mapa la ubicación física de los puntos de interés.
     * A cada punto dibujado (Marker), se le asigna un número con setTag, que identifica numéricamente
     * a cada punto de interés. De este modo, se consigue a posteriori con getTag, obtener el punto de interés
     * asociado a ese Marker
     *
     * @param lpuntoDeInteres la lista de puntos con la info de cada punto
     * @param googleMap el mapa donde se dibuja
     */
    public static void marcarPuntos(List<PuntoDeInteres> lpuntoDeInteres, GoogleMap googleMap) {
        Marker m = null;
        MarkerOptions opciones_marcador = null;
        LatLng posicion = null;

        MapaActivity.lista_marcadores = new ArrayList<Marker>();//para almacenar los marersy luego poder refrenciarlos tras clickar el menú lateral

        for (int i = 0; i < lpuntoDeInteres.size(); i++) {

            opciones_marcador = new MarkerOptions();
            opciones_marcador.title(lpuntoDeInteres.get(i).getNombre());
            posicion = new LatLng(lpuntoDeInteres.get(i).getLatitud(), lpuntoDeInteres.get(i).getLongitud());
            opciones_marcador.position(posicion);
            m = googleMap.addMarker(opciones_marcador);
            m.setTag(i);
            MapaActivity.lista_marcadores.add(m);//Guardo la lista de marcadores para luego poder recurrir a ella cuando tenga que referirme a un marcador desde su selección en el menú lateral

        }
    }

    /**
     * Método que centra el mapa de forma inicial
     *
     * @param googleMap
     */
    private static void centrar_mapa(GoogleMap googleMap) {
        googleMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(POSICION_INICIO, NIVEL_ZOOM));

    }


    /**
     * Método que carga toda la información disponible de cada punto de interés documentado.
     *
     * @return la lista de puntos de interés que será mostrada
     */
    private List<PuntoDeInteres> obtenerListaPuntosDeInteres() {

        List<PuntoDeInteres> lpi = null;

            lpi = new ArrayList<PuntoDeInteres>(NUM_PUNTOS_INTERES);
            lpi.add(new AuditorioMiguelRios());
            lpi.add(new AytoRivas());
            lpi.add(new CastilloDeRivas());
            lpi.add(new CuevasDeLaGuerraCivil());
            lpi.add(new ErmitaDelCristo());
            lpi.add(new FincaElPorcal());
            lpi.add(new LagunaDelCampillo());
            lpi.add(new MonumentoMartiresVaciamadrid());
            lpi.add(new ParqueLineal());
            lpi.add(new ParroquiaSanMarcos());
            lpi.add(new ParroquiaSantaMonica());
            lpi.add(new Piruli());
            lpi.add(new PuentedeArganda());
            lpi.add(new PuenteDelTrenDeArganda());
            lpi.add(new Trincheras());
            lpi.add(new YacimientoArqueologicoMiralrio());


        return lpi;
    }

    /**
     * Se produce una llamada a este método al obtener la imagen que represeta el mapa
     * del servicio de Google Maps API. Aprovechamos para iniciar el mapa con la información
     * gráfica y de control que queremos proveer
     *
     * @param googleMap la variable que represeta el mapa
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;

        centrar_mapa(googleMap);//centramos la cámara
        lpi = obtenerListaPuntosDeInteres();//obtenemos los puntos de interés, con sus respectiva descripción
        marcarPuntos(lpi, googleMap);//señalamos los puntos en el mapa

        //asginamos el listener para cuando la información mostrada por el marcador sea tocada (cartelito con el nombre)
        this.googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                int npi = (int) marker.getTag();//obtenemos el número de punto de interés
                Log.d(Constantes.TAG_APP, "NPI seleccionado = " + npi);//transitamos a la actividad que muestra el detalle
                Intent i = new Intent(getBaseContext(), PuntoDeInteresActivity.class);//con un intent explícito
                i.putExtra(Constantes.CLAVE_INTENT_PI, npi);
                startActivity(i);
            }
        });
    }

    /**
     * Este método es invocado cuando un punto de interés ha sido seleccinado desde el menú lateral
     * Lo que hace el método es centrar el mapa en ese punto y mostrar el letrero correspondiente a ese marcador
     *
     * @param id_marker el id del marcador
     */
    public void visitaPuntoDeInteres(int id_marker) {

        //NOTA: Posible mejora: informar al usuario con un diálogo que toque el nombre del sitio para acceder a la ficha
        //NOTA 2: Al simular nosotros que se ha tocado el marker, se enfoca la cámara y se dibuja el letrero de información,
        //https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerClickListener.html#onMarkerClick(com.google.android.gms.maps.model.Marker)
        //pero no se consigue dibujar los iconos de Google Maps como acceso directo para cómo llegar o ver en Maps
        //Debate en foro sin solución aparente https://stackoverflow.com/questions/29801193/how-to-trigger-the-onclick-event-of-a-marker-on-a-google-maps-v2-for-android#comment57351853_31156994

        drawerLayout.closeDrawers();//cierre del menú lateral
        Marker m = lista_marcadores.get(id_marker);
        m.showInfoWindow();
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(m.getPosition(), NIVEL_ZOOM));
        menu_visible = false;
    }


    /**
     * Método que cambia el tipo de mapa a ojos del usuario, según su selección en el menú lateral:
     * SATÉLITE, HÍBRRIDO, O NORMAL (Dibujo-Esquema)
     *
     * @param tipo_mapa identifica el tipo de mapa que el usuario quieree
     */
    public void cambiarTipoMapa(int tipo_mapa) {

        int n_t_mapa = -1;

        switch (tipo_mapa)
        {
            case 16:
                n_t_mapa = GoogleMap.MAP_TYPE_HYBRID;
                break;
            case 17:
                n_t_mapa = GoogleMap.MAP_TYPE_NORMAL;
                break;
            case 18:
                n_t_mapa = GoogleMap.MAP_TYPE_SATELLITE;
                break;
        }
        drawerLayout.closeDrawers();//cierre del menú
        googleMap.setMapType(n_t_mapa);

    }


}