package edu.val.idel.rivas.turismorivas.actividades;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import edu.val.idel.rivas.turismorivas.R;
import edu.val.idel.rivas.turismorivas.modelo.PuntoDeInteres;
import edu.val.idel.rivas.turismorivas.util.Constantes;


/**
 * @author vale tribaldos domenech
 * @since 27-7-18
 *
 * Claser que representa la pantalla que muestra la información detallada
 * de un punto de interés. Al cargarse, obtiene la información del punto
 * de interés seleccionado y dibuja toda su información,
 *
 */
public class PuntoDeInteresActivity extends AppCompatActivity {

    private boolean botonInformacion;

    private static PuntoDeInteres puntoDeInteres;

    public static PuntoDeInteres getPuntoDeInteresActual ()
    {
        return puntoDeInteres;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("MIAPP","Dentro intent");
        int npi = (int)getIntent().getIntExtra(Constantes.CLAVE_INTENT_PI, -1);
        puntoDeInteres = MapaActivity.getPuntoDeInteres(npi);
        Log.d(Constantes.TAG_APP, "NOMBRE pi = " + puntoDeInteres.getNombre());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punto_de_interes);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.atras);


        botonInformacion=false;

        rellenarTextviews(puntoDeInteres);
    }





    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id_item = item.getItemId();
        switch (id_item) {
            case android.R.id.home:
                Log.d(Constantes.TAG_APP, "Tocada opción salir");
                super.onBackPressed();

                break;

            default:
                Log.d(Constantes.TAG_APP, "Tocado opcion desconocida");

        }
        return super.onOptionsItemSelected(item);
    }
    //Este metodo rellena los textviews del documento xml
    public void rellenarTextviews(PuntoDeInteres punto_interes){
        rellenarNombre(punto_interes);
        rellenarFecha(punto_interes);
        rellenarArea(punto_interes);
        rellenarDireccion(punto_interes);
        rellenarAccesibilidad(punto_interes);
        rellenarLatitud(punto_interes);
        rellenarLongitud(punto_interes);
        rellenarInfocontacto(punto_interes);
        rellenarEnlaceweb(punto_interes);
//        rellenarPuntuacion(punto_interes);
        rellenarHorario(punto_interes);
        rellenarCoste(punto_interes);
        rellenarInfoBasica(punto_interes);
        //rellenarTitulo(punto_interes);
        rellenarCategoria(punto_interes);
    }

    public void rellenarCategoria(PuntoDeInteres punto_interes){
        TextView text = null;
        String dato = "";
        PuntoDeInteres.CATEGORIA categorias[] = punto_interes.getCategorias();

        text = findViewById(R.id.detalles_categoria);
        if(categorias!=null) {
            for (int i = 0; i < categorias.length; i++) {
                if (i == categorias.length - 1)
                    dato += categorias[i];
                else
                    dato += categorias[i] + " / ";
            }
            if (dato != "null") {
                text.setText(dato);
            }
        }else{
            LinearLayout li = findViewById(R.id.linearcategoria);
            li.setVisibility(View.GONE);
        }
    }



    // Esto metodos rellenan los textviews (cada uno el suyo) del documento xml ademas se comprueba si el dato es null o no.
    //TODO rellenar los else, y borrar los layouts si estan vacios
    public void rellenarNombre(PuntoDeInteres punto_interes){
        TextView text;
        String dato;

        text = findViewById(R.id.detalles_nombre);
        dato = punto_interes.getNombre();
        if(dato!=null) {
            text.setText(dato);
        }else{
            LinearLayout li = findViewById(R.id.linearnombre);
            li.setVisibility(View.GONE);
        }
    }

    public void rellenarFecha(PuntoDeInteres punto_interes){
        TextView text;
        String dato;

        text = findViewById(R.id.detalles_fecha);
        dato = punto_interes.getFecha_inicio();
        if(dato!=null) {
            text.setText(dato);
        }else{
            LinearLayout li = findViewById(R.id.linearfecha);
            li.setVisibility(View.GONE);
        }

    }

    public void rellenarArea(PuntoDeInteres punto_interes){
        TextView text;
        String dato;

        text = findViewById(R.id.detalles_area);
        if(punto_interes.getArea()!=-1){
            dato = punto_interes.getArea()+"m²";
            text.setText(dato);
        }else{
            LinearLayout li = findViewById(R.id.lineararea);
            li.setVisibility(View.GONE);
        }
    }

    public void rellenarDireccion(PuntoDeInteres punto_interes){
        TextView text;
        String dato;

        text = findViewById(R.id.detalles_direccion);
        dato = punto_interes.getDireccion();
        if(dato!=null){
            text.setText(dato);
        }else{
            LinearLayout li = findViewById(R.id.lineardireccion);
            li.setVisibility(View.GONE);
        }
    }

    public void rellenarAccesibilidad(PuntoDeInteres punto_interes){
        TextView text;

        text = findViewById(R.id.detalles_accesibilidad);
        if(punto_interes.isAccesibilidad()) {
            text.setText("Si");
        }else{
            text.setText("No");
        }
    }

    public void rellenarLatitud(PuntoDeInteres punto_interes){
        TextView text;

        text = findViewById(R.id.detalles_latitud);
        text.setText(punto_interes.getLatitud()+"");
    }

    public void rellenarLongitud(PuntoDeInteres punto_interes){
        TextView text;

        text = findViewById(R.id.detalles_longitud);
        text.setText(punto_interes.getLongitud()+"");
    }

    public void rellenarInfocontacto(PuntoDeInteres punto_interes){
        TextView text;
        String dato;

        text = findViewById(R.id.detalles_infocontacto);
        dato = punto_interes.getInfo_contacto();
        if(dato != null && dato != "") {
            text.setText(dato);
        }else{
            LinearLayout li = findViewById(R.id.linearinfocontacto);
            li.setVisibility(View.GONE);
        }
    }

    public void rellenarEnlaceweb(PuntoDeInteres punto_interes){
        TextView text;
        String dato;

        text = findViewById(R.id.detalles_enlaceweb);
        dato = punto_interes.getEnlace_web();
        if(dato != null){
            dato = recortarEnlace(dato);
            text.setText(dato);
        }else{
            LinearLayout li = findViewById(R.id.linearenlaceweb);
            li.setVisibility(View.GONE);
        }
    }


    public void rellenarHorario(PuntoDeInteres punto_interes){
        TextView text;
        String dato;

        text = findViewById(R.id.detalles_horario);
        dato = punto_interes.getHorario();
        if(dato != null) {
            text.setText(dato);
        }else{
            LinearLayout li = findViewById(R.id.linearhorario);
            li.setVisibility(View.GONE);
        }
    }

    public void rellenarCoste(PuntoDeInteres punto_interes){
        TextView text;
        String dato;
        float coste;

        text = findViewById(R.id.detalles_coste);
        coste = punto_interes.getCoste();
        if(coste == 0.0 || coste == -1.0) {
            text.setText("Sin coste.");
        }else{
            dato = coste+"";
            text.setText(dato);
        }
    }

    public void rellenarInfoBasica(PuntoDeInteres punto_interes){
        TextView text;
        String dato;

        text = findViewById(R.id.detalles_infobasica);
        text.setText(punto_interes.getInfo_basica());
    }


// FIN RELLENAR


    /**
     * Este metodo recibe una vista y lanza un intent con el enlace Web del PuntoDeInteres de la clase
     * @param view
     */
    public void irAEnlaceweb(View view)
    {
        //TODO HAY QUE PROBARLO BIEN, SI NO EXISTE EL ENLACE NO SE QUE PASA, MIRAR ENLACE POR DEFECTO
        String enlace;
   /*     TextView textView = findViewById(R.id.detalles_enlaceweb);
        enlace = textView.getText().toString(); */
        enlace = puntoDeInteres.getEnlace_web();
        if(enlace!=null) {
            try {
                Uri uri = Uri.parse(enlace);//y Su URI
                Intent intent = new Intent(Intent.ACTION_VIEW, uri); //creo el intent
                startActivity(intent);

            } catch (Throwable t) {
                Log.e("MIAPP", "ERROR", t);
            }
        }
    }


    /**
     * Recorta un string dado, por lo general utilizado para que el enlace web quede mas visible
     * @param dato
     * @return
     */
    private String recortarEnlace(String dato){
        String info ;
        if(dato.length()>30){
            info = dato.substring(0,25)+"...";
        }else{
            info = dato;
        }
        return info;
    }

    // Version antigua de rellenarTextViews();
    public void mostrarPuntoInteres(PuntoDeInteres punto_interes){
        TextView text;

        text = findViewById(R.id.detalles_nombre);
        text.setText(punto_interes.getNombre());

        text = findViewById(R.id.detalles_fecha);
        text.setText(punto_interes.getFecha_inicio());

        text = findViewById(R.id.detalles_area);
        text.setText(punto_interes.getArea()+" m²");

        text = findViewById(R.id.detalles_direccion);
        text.setText(punto_interes.getDireccion());

        text = findViewById(R.id.detalles_latitud);
        text.setText(punto_interes.getLatitud()+"");

        text = findViewById(R.id.detalles_longitud);
        text.setText(punto_interes.getLongitud()+"");

        text = findViewById(R.id.detalles_accesibilidad);
        text.setText(punto_interes.isAccesibilidad()+"");

        text = findViewById(R.id.detalles_infocontacto);
        text.setText(punto_interes.getInfo_contacto());

        text = findViewById(R.id.detalles_enlaceweb);
        text.setText(punto_interes.getEnlace_web());

        text = findViewById(R.id.detalles_horario);
        text.setText(punto_interes.getHorario());

        text = findViewById(R.id.detalles_coste);
        text.setText(punto_interes.getCoste()+"");

        text = findViewById(R.id.detalles_infobasica);
        text.setText(punto_interes.getInfo_basica());
    }


    /**
     * Metodo utilizado para el boton de ver mas detalles
     *
     * @param view El botón de más información pulsado
     */
    public void sacarInfoDetalle(View view) {
        TextView text;
        text = findViewById(R.id.detalles_infobasica);
        Button boton =(Button)view;
        TextView titulo =findViewById(R.id.textviewinfobasica);
        if(botonInformacion == false){
            text.setText(puntoDeInteres.getInfo_detallada());

            boton.setText("menos información");
            int colorGris = getResources().getColor(R.color.colorGris);
            boton.setBackgroundColor(colorGris);

            titulo.setText(R.string.info_detallada);

            botonInformacion=true;
        }else{
            int rojoRivas=getResources().getColor(R.color.rojoRivas);
            text.setText(puntoDeInteres.getInfo_basica());

            boton.setText("más información");
            boton.setBackgroundColor(rojoRivas);

            titulo.setText(R.string.info_basica);
            botonInformacion=false;

        }

    }

}
