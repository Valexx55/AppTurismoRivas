package edu.val.idel.rivas.turismorivas.actividades;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import edu.val.idel.rivas.turismorivas.R;
import edu.val.idel.rivas.turismorivas.modelo.PuntoDeInteres;

/**
 * @author vale
 * @since 2-8-18
 * @see {@link GaleriaFragment}, {@link FotoDetailFragment}
 *
 * Es el marco que va proporcinando fotos al GaleriaFragement, almacennado para ello
 * la referencia a la colección de imágenes relativa al punto de interés en curso.
 * Emplea la clase FotoFragmentDeatil, para propicionar las vistas que se rendrizan en la Galeria
 */

public class FragmentAdapterFotos extends FragmentStatePagerAdapter {


    private int [] array_fotos_actual ;

    public FragmentAdapterFotos (FragmentManager fm)
    {

        super (fm);
    }

    public void setPuntoDeInteres(PuntoDeInteres pi)
    {
        array_fotos_actual = pi.getFotos();

    }
    @Override
    public Fragment getItem(int i) {
        FotoDetailFragment fragment = null;
        Bundle bundle = null;

        fragment = new FotoDetailFragment();
        bundle = new Bundle();

        bundle.putInt("N_FOTO", array_fotos_actual[i]);//al fragment le damos un tag, que valdrá a la postre para la id del la foto en curso
        fragment.setArguments(bundle);


        return  fragment;
    }

    @Override
    public int getCount() {
        int tamanio = 0;

        tamanio = array_fotos_actual.length;

        return tamanio;
    }
}
