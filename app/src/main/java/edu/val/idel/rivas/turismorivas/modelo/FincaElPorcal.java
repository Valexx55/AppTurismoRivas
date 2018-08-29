package edu.val.idel.rivas.turismorivas.modelo;

import edu.val.idel.rivas.turismorivas.R;

public class FincaElPorcal extends PuntoDeInteres {

    public FincaElPorcal() {

        this.latitud=40.297584f;
        this.longitud=-3.525181f;
        this.nombre = "Finca de El Porcal";
        this.fecha_inicio = "Años 40";
        this.area = 4000000;
        this.direccion = null;
        this.accesibilidad = false;
        this.info_contacto = null;
        this.info_basica = "Esta finca representó el principal núcleo de población entre la destrucción de Vaciamadrid en la Guerra Civil y la fundación de Rivas-Vaciamadrid en 1959.";
        this.puntuacion = -1;
        this.categorias = new CATEGORIA[]{CATEGORIA.HISTORICO};
        this.fotos = new int[]{R.drawable.elporcal_1 };
        this.coste=-1;
        this.enlace_web= null;
        this.horario=null;
        this.info_detallada="La Finca El Porcal fue el hogar para muchos jornaleros que constituían la población del Vaciamadrid previo a la Guerra Civil. Tras la destrucción del pueblo durante la Batalla del Jarama, El Porcal se convirtió en el principal núcleo de población. Hasta allí se trasladó el Ayuntamiento durante los años 40 y se establecieron una cantina, una tienda de ultramarinos e incluso un estanco.\nTras la inauguración del nuevo casco urbano de Rivas-Vaciamadrid en 1959, la población se fue trasladando paulatinamente a este, sin embargo, la finca siguió habitada durante varios años más.\nPosteriormente los terrenos fueron adquiridos por una empresa de extracción de áridos que cerró el acceso a los terrenos y provocó la proliferación de diversas lagunas en las inmediaciones";

    }
}
