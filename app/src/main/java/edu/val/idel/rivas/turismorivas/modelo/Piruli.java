package edu.val.idel.rivas.turismorivas.modelo;

import edu.val.idel.rivas.turismorivas.R;

/**
 * @autor Aurora
 * @since 31-7-2018
 * <p>
 * Esta clase que representa todos los atributos del Pirulí en Rivas-Vaciamadrid
 */

public class Piruli extends PuntoDeInteres {
    public Piruli() {
        this.nombre = "Pirulí";
        this.fecha_inicio = "Febrero de 2006";
        this.area = -1;
        this.direccion = "Vía de Servicio A-3, 28522 Rivas-Vaciamadrid, Madrid";
        this.longitud = -3.550010f;
        this.latitud = 40.355201f;
        this.accesibilidad = true;
        //this.fotos = "";
        this.info_contacto = "";
        this.enlace_web =
                "https://www.marketingdirecto.com/anunciantes-general/anunciantes/philps-da-luz-al-nuevo-simbolo-de-entrada-de-rivas-vaciamadrid";
        this.info_basica =
                "Escultura con forma de espiral situada en una de las entradas principales de Rivas-Vaciamadrid, alcanza " +
                        "52 metros de altura e inicialmente iluminado con LEDs que bañan toda su superficie, obteniendo un fantástico" +
                        " efecto visible a modo de faro desde gran distancia ";
        this.info_detallada = "Su presupuesto fue de 1,3 millones de euros. Es también conocido popularmente como el \"Pepelito\" o la \"picha del Alcalde\". El sistema de iluminación sólo funcionó durante un breve periodo , coincidiendo con la camapaña electoral de ese año" ;
        this.puntuacion = -1;
        this.horario = "Libre";
        this.coste = -1;
        this.categorias = new CATEGORIA[]{CATEGORIA.MONUMENTAL};
        this.fotos = new int[]{R.drawable.piruli_1,R.drawable.piruli_2 };
    }
}
