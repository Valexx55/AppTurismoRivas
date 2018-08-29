package edu.val.idel.rivas.turismorivas.listener;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.util.Log;
import android.view.MenuItem;


import edu.val.idel.rivas.turismorivas.actividades.MapaActivity;

/**
 * @author vale
 * @since  13/08/18.
 *
 * Listener para el Menú lateral de Navegación. Se emplea para detectar cuando un punto
 * de interés es seleccionado en el menú y llamar a la MapaActivity para que focalice el punto
 * seleccionado en el mapa
 */

public class MenuNavListener implements NavigationView.OnNavigationItemSelectedListener {

    private Context context;//guardamos una referencia a la actividad que contiene el mapa y el menú

    public MenuNavListener (Context context)
    {
        this.context = context;
    }


    /**
     * Método que captura las selecciones del menú lateral (Navigator), y gestiona
     * la petición del usuario. Puede seleccionar un punto de interés (0-15)
     * o cambiar de tipo de mapa (opciones 16-18)
     *
     *
     * @param item el menú seleccionado
     * @return el valor devuelto por el padre
     */
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


        String menu = item.getTitle().toString();
        int npi = item.getOrder();//obtengo el número del punto de interés

        Log.d(getClass().getCanonicalName(), "Ha tocado la opción " + menu + " " +npi);

        MapaActivity activity = (MapaActivity) context;
        if (npi<16) {
            activity.visitaPuntoDeInteres(npi);
        } else {
            activity.cambiarTipoMapa(npi);

        }



        return false;
    }
}
