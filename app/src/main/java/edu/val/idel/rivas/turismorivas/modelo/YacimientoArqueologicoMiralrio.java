package edu.val.idel.rivas.turismorivas.modelo;

import edu.val.idel.rivas.turismorivas.R;

/**
 * @since 31/7/2018
 * @autor Victor Tribaldos
 * @version 1.0.0
 *
 * Esta clase representa los atributos del yacimiento arqueológico Miralrio
 */
public class YacimientoArqueologicoMiralrio extends PuntoDeInteres {

    public YacimientoArqueologicoMiralrio(){
        nombre = "Yacimiento Arqueológico Miralrío";
        fecha_inicio = "Año 2009";
        area = 3000;
        direccion = "Calle Marcial Laranda con Calle Miralrío.";
        latitud = 40.325463f;
        longitud =  -3.516268f;
        accesibilidad = true;
        info_contacto = "Telefono 91 660 27 90 / 27 92";

        enlace_web = "http://www.rivasciudad.es/portal/contenedor_ficha.jsp?seccion=s_floc_d4_v1.jsp" +
                "&contenido=2424&nivel=1400&tipo=1&codResi=1&codMenu=37";

        info_basica = "Yacimiento carpetano de Miralrío con unos 3000 metros cuadrados de superficie, " +
                "en la margen derecha del río Jarama, cerca de la desembocadura del río Manzanares";

        info_detallada =  "Yacimiento carpetano con unos 3000 metros cuadrados de superficie, " +
                "en la margen derecha del río Jarama cerca de la desembocadura del río Manzanares.\n" +
                "Consta de dos yacimientos uno data de la edad del bronce (1500-1000 a.c) " +
                "y otro  de la II Edad del Hierro y fechado entre los siglos IV y II antes de Cristo.\n" +
                "Estos restos constituyen uno de los pocos vestigios conservados y " +
                "visitables del pueblo carpetano en la Comunidad de Madrid.";

        puntuacion = 0;
        horario = " las visitas se realizan el ultimo sábado de cada mes, previa reserva telefónica.";
        coste = -1;
        this.categorias = new CATEGORIA[]{CATEGORIA.CULTURAL, CATEGORIA.HISTORICO};
        this.fotos = new int[]{R.drawable.miralrio2,R.drawable.miralrio3};

    }



}
