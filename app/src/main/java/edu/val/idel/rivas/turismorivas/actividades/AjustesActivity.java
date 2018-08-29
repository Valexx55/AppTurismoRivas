package edu.val.idel.rivas.turismorivas.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

import edu.val.idel.rivas.turismorivas.R;
import edu.val.idel.rivas.turismorivas.util.PreferencesUsuario;


/**
 * @author Cuadrado
 * @since 27-7-18
 *
 * Clase para permitir al usuario mostrar u ocultar las ventandas de inicio y animación
 *
 * 13-8-18 Vale. Agrega barra menú de navegación y opción de saltar animación
 */
public class AjustesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes);
        initControles ();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.atras);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) //tocó el botón de para atrás
        {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }

    public void casilla_marcada (View v){
        CheckBox casilla=(CheckBox)v;
        if (v.getId()==R.id.mostrar_inicio) {
            PreferencesUsuario.guardarPrefSaltarInicio(casilla.isChecked(), this);
        } else
        {
            PreferencesUsuario.guardarPrefSaltarAnim(casilla.isChecked(), this);
        }
    }


    private void initControles ()
    {
        marcar_casilla_inicio();
        marcar_casilla_intro();
    }

    private void marcar_casilla_intro (){
        CheckBox casilla=findViewById(R.id.mostrar_spalsh);
        casilla.setChecked(PreferencesUsuario.getPrefSaltarAnim(this));

    }

    public void marcar_casilla_inicio (){
        CheckBox casilla=findViewById(R.id.mostrar_inicio);
        casilla.setChecked(PreferencesUsuario.getPrefSaltarInicio(this));

    }
}
