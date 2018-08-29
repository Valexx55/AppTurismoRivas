package edu.val.idel.rivas.turismorivas.actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import edu.val.idel.rivas.turismorivas.R;
import edu.val.idel.rivas.turismorivas.util.PreferencesUsuario;

/**
 *
 * @version 1.0.0
 * @autor: Aurora Oliveira y Gonzalo Cuadrado
 * @since 1-8-2018
 *
 * Clase utilizada para acceder a la activity de créditos o a la aplicación y recordar si se quiere mostrar de nuevo
 */
public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    //Método para saber que botón se toca y lanza el Intent al activity que corresponde
    public void boton_tocado(View v) {
        Button ir_aplicacion = findViewById(R.id.ir_aplicacion);
        Button ir_creditos = findViewById(R.id.ir_creditos);
        if (v.equals(ir_aplicacion)) {
            startActivity(new Intent(this, MapaActivity.class));
            finish();
        } else {
            startActivity(new Intent(this, CreditosActivity.class));
        }

    }

    public void noMostrar(View v) {
        CheckBox checkBox = (CheckBox) v;

        if (checkBox.isChecked()) {
            //MARCAR QUE QUIERE GUARDAR LOS DATOS
            PreferencesUsuario.guardarPrefSaltarInicio(true, this);

        } else {
            //DESMARCAR QUE QUIERE GUARDAR LOS DATOS
            PreferencesUsuario.guardarPrefSaltarInicio(false, this);
        }

    }
}
