package edu.val.idel.rivas.turismorivas.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 *
 * @version 1.0.0
 * @autor Victor Tribaldos
 *
 * Clase utilizada para guardar las preferencias del usuario
 * Guarda las preferencias para hacer visibles las actividades de inicio y animación,
 * así como el control de si es la primera vez que se usa la app
 */
public class PreferencesUsuario {


    public static final String NOMBRE_FICHERO = "usuario_preferences";
    public static final String CLAVE_SALTAR_INTRO = "saltar_intro";
    public static final String CLAVE_SALTAR_ANIM = "saltar_anim";
    public static final String CLAVE_PRIMERA_VEZ = "primera_vez";


    //metodo que guarda las preferencias de la checkbox
    public static void guardarPrefSaltarInicio(boolean activo , Context context) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(NOMBRE_FICHERO, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(CLAVE_SALTAR_INTRO, activo);
        editor.commit();
    }

    //metodo que recupera las preferencias de la checkbox
    public static boolean getPrefSaltarInicio(Context context){

        boolean valor = false;

            SharedPreferences sharedPreferences = context.getSharedPreferences(NOMBRE_FICHERO, Context.MODE_PRIVATE);
            valor = sharedPreferences.getBoolean(CLAVE_SALTAR_INTRO,false);

        return valor;
    }

    public static void guardarPrefSaltarAnim(boolean activo ,Context context) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(NOMBRE_FICHERO, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(CLAVE_SALTAR_ANIM, activo);
        editor.commit();
    }

    //metodo que recupera las preferencias de la checkbox
    public static boolean getPrefSaltarAnim(Context context){

        boolean valor = false;

        SharedPreferences sharedPreferences = context.getSharedPreferences(NOMBRE_FICHERO, Context.MODE_PRIVATE);
        valor = sharedPreferences.getBoolean(CLAVE_SALTAR_ANIM,false);

        return valor;
    }


    public static void guardarPrefPrimeraVez(boolean activo , Context context) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(NOMBRE_FICHERO, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(CLAVE_PRIMERA_VEZ, activo);
        editor.commit();
    }

    //metodo que recupera las preferencias de la checkbox
    public static boolean getPrefPrimeraVez(Context context){

        boolean valor = false;

        SharedPreferences sharedPreferences = context.getSharedPreferences(NOMBRE_FICHERO, Context.MODE_PRIVATE);
        valor = sharedPreferences.getBoolean(CLAVE_PRIMERA_VEZ,true);

        return valor;
    }

}
