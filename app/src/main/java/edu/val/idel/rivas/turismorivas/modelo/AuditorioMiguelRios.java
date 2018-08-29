package edu.val.idel.rivas.turismorivas.modelo;

import edu.val.idel.rivas.turismorivas.R;
/**
 * @since 31/7/2018
 * @autor Victor Tribaldos
 * @version 1.0.0
 *
 * Esta clase representa los atributos del Auidtorio Miguel Ríos
 */
public class AuditorioMiguelRios extends PuntoDeInteres{

    public AuditorioMiguelRios(){
        nombre = "Auditorio Miguel Ríos";
        fecha_inicio = "Septiembre de 2009";
        area = 360000;
        direccion = "AV Juan Carlos I s/n ";
        latitud = 40.345842f;
        longitud =  -3.512977f;
        accesibilidad = true;
        info_contacto = "Telefono: 916 60 27 25  Calle: Paseo Alicia Alonso, s/n, 28521 Rivas Vaciamadrid";
        enlace_web = "http://www.rivasciudad.es/portal/contenedor_ficha.jsp" +
                "?seccion=s_floc_d4_v1.jsp&contenido=1046&nivel=1400&tipo=1&codResi=1&language=es&codMenu=67&codMenuPN=37&ca=26";

        info_basica = "El Auditorio Miguel Ríos de Rivas tiene capacidad para 15.000 espectadores (ampliable a 34.000). " +
                "Un impresionante 'anfiteatro' diseñado sobre la falda de una colina para albergar espectáculos musicales y escénicos";

        info_detallada = "El Auditorio Miguel Ríos de Rivas tiene capacidad para 15.000 espectadores (ampliable a 34.000). " +
                "Un impresionante 'anfiteatro' diseñado sobre la falda de una colina para albergar espectáculos musicales y escénicos";

        puntuacion = 0;
        horario = "Depende del evento.";
        coste = -1;
        this.categorias = new CATEGORIA[]{CATEGORIA.CULTURAL};
        this.fotos = new int[]{R.drawable.miguelr01,R.drawable.miguelr02, R.drawable.miguelr03 };


    }




}
