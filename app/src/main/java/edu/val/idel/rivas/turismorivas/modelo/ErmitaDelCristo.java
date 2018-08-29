package edu.val.idel.rivas.turismorivas.modelo;

import edu.val.idel.rivas.turismorivas.R;

public class ErmitaDelCristo extends PuntoDeInteres {

    public ErmitaDelCristo () {

        this.nombre = "Ermita del Cristo de Rivas";
        this.fecha_inicio = "Siglo XVII";
        this.area = -1;
        this.direccion = "M-823, 2011, 28522 Rivas-Vaciamadrid, Madrid";
        this.latitud = (float) 40.381071;
        this.longitud = (float) -3.517831;
        this.accesibilidad = false;
        this.info_contacto = "91 669 12 67";
        this.info_basica = "Lugar religioso situado cerca del río Jarama al Norte de Rivas, es un convento del siglo XVII que " +
                "destaca por la visita que recibe de todos los fieles que acuden a su cita anual.";
        this.horario = "HORARIO DE MISAS: domingos y festivos a las 12:00 horas";
        this.coste=-1;
        this.info_detallada="El convento de los mercedarios descalzos alberga la ermita del Cristo de Rivas. Su evento más sonado es la Romería del Cristo de Rivas, que se celebra el 29 de septiembre en el conocido día del " +
                "Veranillo de San Miguel, remontándose su origen a 1655. Una de las actividades por la que es más " +
                "conocido el municipio tiene que ver con la ermita del Cristo de Rivas, que cada 29 de septiembre " +
                "desde hace siglos se convierte en un centro de peregrinación con motivo de la romería que llega " +
                "hasta ella.\nEsta romería cuenta con una importante devoción popular desde muy antiguo, " +
                "la del Santo Cristo de los Afligidos de Rivas";
        this.categorias = new CATEGORIA[]{CATEGORIA.RELIGIOSO, CATEGORIA.MONUMENTAL};
        this.fotos = new int[]{R.drawable.cristorivas_1,R.drawable.cristorivas_2, R.drawable.cristorivas_3 };
        this.enlace_web = "http://www.artesaniaiberica.es/2013/11/03/romeria-del-santo-cristo-de-los-afligidos-de-rivas/";;
        this.puntuacion = -1;
    }
}
