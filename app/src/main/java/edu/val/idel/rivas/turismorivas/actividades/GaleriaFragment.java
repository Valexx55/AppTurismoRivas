package edu.val.idel.rivas.turismorivas.actividades;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import edu.val.idel.rivas.turismorivas.R;
import edu.val.idel.rivas.turismorivas.modelo.PuntoDeInteres;
import edu.val.idel.rivas.turismorivas.util.Constantes;

/**
 * @author vale
 * @since 2-8-18
 * @see  PuntoDeInteresActivity
 *
 * Fragmento que representa la galeria de imágenes asociada al punto de interés.
 * Consta ademaś de una descripción texual en su Layout, donde se ecribe superpuesto
 * el nombre del citado punto
 *
 *
 */

public class GaleriaFragment extends Fragment {


    private ViewPager viewPager;
    private FragmentAdapterFotos pagerAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista = null;

        vista = inflater.inflate(R.layout.fragment_galeria, container, false);

        viewPager = (ViewPager) vista.findViewById(R.id.vp_fotos);

        pagerAdapter = new FragmentAdapterFotos(getChildFragmentManager());
        FragmentActivity fa = getActivity();

        pagerAdapter.setPuntoDeInteres(PuntoDeInteresActivity.getPuntoDeInteresActual());
        viewPager.setAdapter(pagerAdapter);
        TextView tv = vista.findViewById(R.id.nombre_sitio);
        tv.setText(PuntoDeInteresActivity.getPuntoDeInteresActual().getNombre());

        Log.d(Constantes.TAG_APP, "Pager Adapter Asociado");



        return vista;

    }
}
