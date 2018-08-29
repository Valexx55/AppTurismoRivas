package edu.val.idel.rivas.turismorivas.modelo;

import edu.val.idel.rivas.turismorivas.R;

public class CuevasDeLaGuerraCivil extends PuntoDeInteres {
    public CuevasDeLaGuerraCivil() {

        this.nombre = "Cuevas del Parque Lineal del Manzanares";
        this.fecha_inicio = "1937";
        this.area = -1;
        this.direccion = "Arroyo y camino del Congosto";
        this.latitud = 40.316751f;
        this.longitud = -3.565763f;
        this.info_basica = "Zona geográfica donde se encuentran algunas cuevas de origen medieval. Entre las más conocidas se encuentran" +
                " la cueva del Congosto, " +
                "la cueva de los Migueles, la cueva de la Salmedina y la cueva de Luis Candelas.";
        this.info_detallada = "Este conjunto de cuevas se encuentran situadas a lo largo del Parque Lineal del Manzanares, siguiendo el curso del Arroyo de los Migueles.\n" +
                "Su datación no es completamente precisa, estableciendo la Edad Media " +
                "como el periodo más probable para su creación, lo que si se puede afirmar sin lugar a dudas es" +
                " que están excavadas por la mano del hombre. \nSe especula con la finalidad que pudieron tener, pero lo más probable es que usaran a modo " +
                "de refugio para aquellos que transitaban el camino.\nEn época decimonónica las cuevas fueron utilizadas por bandoleros, escogiendo el nombre de algunos de ellos " +
                "como apodo para las cuevas.\nPor último, durante la Guerra Civil, estas cavidades fueron utilizadas por el bando republicano para diversas funciones. ";
        this.info_contacto = null;
        this.horario = "Acceso Libre";
        this.coste = -1;
        this.accesibilidad = false;
        this.enlace_web = "http://www.parquelineal.es/blog/la-cueva-del-congosto/";
        this.puntuacion = -1;
        this.categorias = new CATEGORIA[]{CATEGORIA.HISTORICO, CATEGORIA.TURISTICO};
        this.fotos = new int[]{R.drawable.cueva_1,R.drawable.cueva_2 ,R.drawable.cueva_3, R.drawable.cueva_4, R.drawable.cueva_5 };

    }
}
