package edu.val.idel.rivas.turismorivas.modelo;

import edu.val.idel.rivas.turismorivas.R;

/**
 * @author Gonzalo Cuadrado
 * @since 31-7-2018
 * Esta clase representa los atributos del Monumento a los Mártires de Vaciamadrid
 */

public class MonumentoMartiresVaciamadrid extends PuntoDeInteres {
    public MonumentoMartiresVaciamadrid(){
        this.nombre="Monumento a los Mártires de Vaciamadrid";
        this.fecha_inicio="1940";
        this.area=-1;
        this.direccion="Calle Rafael Canogar, 1";
        this.latitud=40.3393424f;
        this.longitud=-3.5196004f;
        this.accesibilidad=true;
        this.info_contacto="Teléfono: 91 281 73 99" +
                "Web municipal: http://www.rivasciudad.es/portal/contenedor_ficha.jsp?seccion=s_floc_d4_v1.jsp&contenido=1096&nivel=1400&tipo=1&codResi=1&language=es&codMenu=37";
        this.enlace_web="http://sepanquantos.blogspot.com/2009/03/la-causa-general-en-rivas-vaciamadrid.html";
        this.info_basica="Monumento a los asesinados por milicianos durante las sacas de las cárceles madrileñas producidas en noviembre de 1936. Fue construido en 1940, año en el que se realizó un homenaje oficial a los caídos.";
        this.info_detallada="Una vez estallada la Guerra Civil y con las tropas del autodenominado bando nacional avanzando rápidamente hacia la capital, el gobierno republicano encabezado por Francisco Largo Caballero decidió trasladarse el 6 de noviembre de 1936 a Valencia. Durante estos días de desorden en la capital, se produjo la Matanza de Paracuellos, pero nuestra localidad también tiene una trágica historia relacionada con las sacas de presos.\n" +
                "El alcalde ripense Francisco Alcázar Calvo, da testimonio en 1940, dentro del marco de la Causa General, del asesinato de 228 personas a las puertas del cementerio de Vaciamadrid entre el 20 de octubre de 1936 y el 18 de diciembre de ese mismo año.\n" +
                "La Causa General fue un proceso iniciado por la dictadura franquista para depurar los crímenes cometidos exclusivamente por el bando republicano, sus informes fueron a menudo magnificados o maquillados para favorecer al bando vencedor. Sin embargo, sus documentos son útiles para conocer los crímenes cometidos en la zona republicana." +
                "Durante este periodo de tiempo se produjeron sacas de presos con una ideología cercana al bando sublevado en las cárceles madrileñas ante el miedo a que, si los “nacionales” tomaban la capital, estos pudieran unirse a ellos.\nLa idea del gobierno republicano era trasladarlos a otras cárceles, sin embargo, las milicias obreras que se habían hecho con el control de las prisiones, tomaron la decisión de fusilarlos y enterrarlos en fosas comunes.\n" +
                "El 5 de noviembre de 1940, se produjo un homenaje a estos presos asesinados en el cementerio de nuestra localidad, donde se encontraba la fosa común. Dicho homenaje fue inmortalizado por el fotógrafo Martín Santos Yubero y por el Diario ABC que recogía la noticia. Además, se inauguró un monumento en su recuerdo." +
                "Posteriormente, los cuerpos de la fosa fueron trasladados al Valle de los Caídos donde descansan en la actualidad.\nEl monumento por su parte, continúa en nuestro cementerio local, aunque en un estado ruinoso y sin ninguna placa o cartel que informe de lo que allí ocurrió en 1936.";
        this.puntuacion=0;
        this.horario="Octubre a abril:" +
                "Lunes a domingo: De 9,00 a 18,00 horas." +
                "Mayo a septiembre:" +
                "Lunes a domingo: De 9,00 a 20,00 horas.";
        this.coste=-1;
        this.categorias = new CATEGORIA[]{CATEGORIA.HISTORICO, CATEGORIA.MONUMENTAL};
        this.fotos = new int[]{R.drawable.martires_vaciamadrid_1,R.drawable.martires_vaciamadrid_2, R.drawable.martires_vaciamadrid_3 };

    }
}
