package edu.val.idel.rivas.turismorivas.modelo;

import edu.val.idel.rivas.turismorivas.R;

/**
 * @author Hector (XiNoRiVaS en Github)
 *
 * Esta clase representa el Castillo de Rivas
 * con todos los atributos mencionados en la clase PuntoDeInteres
 */

public class CastilloDeRivas extends PuntoDeInteres {

    public CastilloDeRivas () {
        this.nombre = "Castillo de Rivas";
        this.area=-1;
        this.fecha_inicio = "Año 1154";
        this.latitud = 40.381833f;
        this.longitud = -3.518844f;
        this.direccion = null;
        this.info_contacto = null;
        this.horario = "Horario Libre";
        this.info_basica = "El Castillo de Rivas se encuentra en un promontorio situado en la orilla derecha del río Jarama," +
                " en el término municipal de Rivas Vaciamadrid, provincia de Madrid. A los pies del cerro se encuentra la ermita del Cristo de Rivas";
        this.info_detallada = "La primera referencia escrita del castillo data del año 1154," +
                " fecha en la que Alfonso VII lo dona al Arzobispo de Toledo. " +
                "Tras varios cambios de posesión la fortificación perdió su antiguo valor estratégico al alejarse la frontera hacia tierras manchegas. " +
                "Las Relaciones de Felipe II señalan el estado ruinoso del castillo ya en el siglo XVI. \n Apenas quedan restos visibles de esta fortaleza," +
                " entre ellos restos de muros alrededor del cerro, que se confunden con las ondulaciones del terreno," +
                " un posible aljibe y los vestigios de lo que pudo ser el camino de acceso a la fortificación. \n En la zona norte, la más vulnerable del cerro," +
                " existe un corte artificial del terreno aprovechado como foso. En el extremo meridional puede verse otro pequeño foso." +
                " En superficie existe abundante material cerámico de época islámica.";
        this.enlace_web = "https://www.diarioderivas.es/castillo-ribas-jarama/";
        this.puntuacion = -1;
        this.accesibilidad = false;
        this.coste = 0;
        this.categorias = new CATEGORIA[]{CATEGORIA.HISTORICO};
        this.fotos = new int[]{R.drawable.castillorivas_1, R.drawable.castillorivas_2, R.drawable.castillorivas_5, R.drawable.castillorivas_6 };


    }

}
