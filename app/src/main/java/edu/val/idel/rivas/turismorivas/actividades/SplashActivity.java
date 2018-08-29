package edu.val.idel.rivas.turismorivas.actividades;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import edu.val.idel.rivas.turismorivas.R;
import edu.val.idel.rivas.turismorivas.util.Constantes;
import edu.val.idel.rivas.turismorivas.util.PreferencesUsuario;


/**
 * @author Arantxa
 * @since 27-7-2018
 *
 * Clase que ofrece una animación al inicio de la app.
 * La animación ofrece una imagen de rotativa de imáganes sobre el municipio de Rivas
 */
public class SplashActivity extends AppCompatActivity {

    private AnimationDrawable ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Constantes.TAG_APP, "Inicio APP");
        setContentView(R.layout.activity_splash);

        if (!PreferencesUsuario.getPrefSaltarAnim(this)) //si está activada la animación
        {

            Log.d(Constantes.TAG_APP, "Preparamos animación");
            //1 obtengo la imagen
            ImageView imagenView = findViewById(R.id.imagenes);
            //2 cargo la animacion
            imagenView.setBackgroundResource(R.drawable.introduccion);
            this.ad = (AnimationDrawable) imagenView.getBackground();
            this.ad.start();
            Log.d(Constantes.TAG_APP, "Animación lanzada");
        } else {
            Log.d(Constantes.TAG_APP, "Animación desactivada");
            Intent intent = null;

            if (PreferencesUsuario.getPrefSaltarInicio(this))
            {
                Log.d(Constantes.TAG_APP, "Inicio desactivada. A mapas");
                intent = new Intent(this , MapaActivity.class);

            } else {
                Log.d(Constantes.TAG_APP, "Inicio activado. A inicio");
                intent = new Intent(this , InicioActivity.class);
            }
            startActivity(intent);
            finish();
        }
    }

    public void saltar (View v ) {

        Log.d(Constantes.TAG_APP, "Tocó saltar");
        this.ad.stop();
        Log.d(Constantes.TAG_APP, "Animación detenida");
        Intent intent = null;
        boolean quiere_saltar = PreferencesUsuario.getPrefSaltarInicio(this);
        if (quiere_saltar)
        {
            intent = new Intent(this , MapaActivity.class);
        }
        else {
            intent = new Intent(this , InicioActivity.class);
        }

        startActivity(intent);//ejecuto el intent (salta a la accion)
        finish();// finaliza la actividad (introduccion)
    }
}
