package edu.val.idel.rivas.turismorivas.actividades;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import edu.val.idel.rivas.turismorivas.R;


/**
 *
 * @author vale
 * @since  2-8-2018
 *
 * Clase que infla cada vista (foto), para que sea usada por el FragmentAdaptarFotos
 */
public class FotoDetailFragment extends Fragment {

    private int id_drawable;

    /**
     *
     * @param args contiene la clave con el id de la foto (R.drawable) y es invocado automáticamente por su Adapter
     */
    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);
        Log.d(getClass().getCanonicalName(), "SetArgumentsInvocado");
        id_drawable = args.getInt("N_FOTO");
    }

    public FotoDetailFragment() {
        // constructor por defecto, requerido
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_foto_detail, container, false);

        try {

            ImageView imageView = rootView.findViewById(R.id.foto_actual);
            Drawable drawable = getResources().getDrawable(this.id_drawable);
            imageView.setImageDrawable(drawable);

        }catch (Exception e)
        {
            Log.e("MENSAJE", e.getMessage());
        }


        return rootView;
    }
}
