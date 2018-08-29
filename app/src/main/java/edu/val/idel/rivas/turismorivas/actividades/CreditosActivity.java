package edu.val.idel.rivas.turismorivas.actividades;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.List;

import edu.val.idel.rivas.turismorivas.R;
import edu.val.idel.rivas.turismorivas.util.Constantes;

/**
 * @author vale
 * @since 1-8-2018
 *
 * Clase de créditos donde aparecen los pariticpantes. El que sepa leer código, tiene
 * premio para descubir el huevo de pascua ;)
 */

public class CreditosActivity extends AppCompatActivity {


    private final static String URL_AYTO_RIVAS  = "http://www.rivasciudad.es";
    private final static String URL_IDEL_FORMACION  = "http://www.formacionidelsl.com/";
    private static String RESPUESTA_BUENA = "quiero un mojito";
    private static String URL_VIDEO_YOUTUBE = "https://youtu.be/Yxd5qU_XvKc";
    private static String PREGUNTA = "¿Qué quieres reina?";
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.atras);

        ImageButton boton_mojito = findViewById(R.id.boton_mojito);

        boton_mojito.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Log.d(Constantes.TAG_APP, "Aquí irá el huevo de PASCUA");


                if (!SpeechRecognizer.isRecognitionAvailable(getBaseContext())) {
                    Log.d(Constantes.TAG_APP, "Aquí irá el huevo de PASCUA");


                } else {
                    Log.d("MIAPP", "Sí hay pa voz SE PUEDE MOSTRAR");


                    pregunta();

                }
                return true;
            }
        });

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

    private void pregunta() {


        mediaPlayer = MediaPlayer.create(this, R.raw.pregunta_2);
        mediaPlayer.setLooping(false);
        mediaPlayer.setVolume(100, 100);

        Intent intent = new Intent
                (RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, "es");
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, PREGUNTA);
        startActivityForResult(intent, 200);

        mediaPlayer.start();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 200) {
            if (resultCode == RESULT_OK) {
                List<String> results = data.getStringArrayListExtra
                        (RecognizerIntent.EXTRA_RESULTS);
                String mAnswer = results.get(0);

                Log.d(Constantes.TAG_APP, mAnswer);
                if (mAnswer.equals(RESPUESTA_BUENA))
                {
                    Log.d(Constantes.TAG_APP, "RESPUESTA BUENA");
                    Toast.makeText(this, "RESPUESTA BUENA", Toast.LENGTH_SHORT).show();
                    Intent ivideo = new Intent(Intent.ACTION_VIEW);
                    ivideo.setData(Uri.parse(URL_VIDEO_YOUTUBE));

                    startActivity(ivideo);

                } else {
                    Log.d(Constantes.TAG_APP, "RESPUESTA MALA");
                    Toast.makeText(this, "RESPUESTA MALA", Toast.LENGTH_SHORT).show();
                    mediaPlayer = MediaPlayer.create(this, R.raw.dennis_2);
                    mediaPlayer.setLooping(false);
                    mediaPlayer.setVolume(100, 100);
                    mediaPlayer.start();
                }
            }
        }
    }
    public void irARivas (View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse(URL_AYTO_RIVAS);
        intent.setData(uri);
        startActivity(intent);
    }

    public void irAIdel (View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse(URL_IDEL_FORMACION);
        intent.setData(uri);
        startActivity(intent);
    }
}
