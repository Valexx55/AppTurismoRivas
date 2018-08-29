package edu.val.idel.rivas.turismorivas.modelo;

import java.util.Arrays;
import edu.val.idel.rivas.turismorivas.R;

/**
 * @author Gonzalo Cuadrado
 * @since 31-7-2018
 * @version 1.0
 * Esta clase representa los atributos de la Laguna del Campillo
 */

public class LagunaDelCampillo extends PuntoDeInteres {
    public LagunaDelCampillo(){
        this.nombre="Laguna del Campillo";
        this.fecha_inicio="Década de los 60";
        this.area=485000;
        this.direccion="Calle Piscina Maspalomas s/n";
        this.latitud=40.321757f;
        this.longitud=-3.511793f;
        this.accesibilidad=true;
        this.info_contacto=null;
        this.info_basica="Es una formación acuática de origen artificial, que con el paso de los años ha generado todo un ecosistema que destaca por su rica fauna y flora. Situado a menos de 15 minutos de Madrid, la Laguna del Campillo destaca por su gran belleza paisajística.";
        this.info_detallada="La Laguna del Campillo tiene su origen en la extracción de áridos durante la segunda mitad del siglo XX. Durante estas labores se excavó por debajo del nivel freático, lo que provocó que al abandonar dichas actividades el agua del río Jarama, que fluye en las proximidades, inundara de forma permanente el terreno formando una laguna." +
                "Esta circunstancia provocó fuertes cambios en el ecosistema del lugar, atrayendo a una gran variedad de fauna y flora, destacando especialmente a las aves, que hoy en día habitan en la Laguna del Campillo.\n" +
                "Los terrenos en los que surgió la Laguna del Campillo permanecieron en manos privadas hasta el año 1987, momento en el que la Comunidad de Madrid los expropió a Dionisio Martín Sanz, también propietario del vertedero de Autocampo, por su alto valor ecológico.\n" +
                "En la actualidad es un entorno de libre acceso al público donde poder dar un paseo, practicar deporte o pesca deportiva.\nEl baño está prohibido por la peligrosidad que supone.";
        this.puntuacion=0;
        this.enlace_web="http://www.madrid.org/cs/Satellite?blobcol=urldata&blobheader=application%2Fpdf&blobheadername1=Content-Disposition&blobheadervalue1=filename%3DLa+laguna+del+Campillo+baja.pdf&blobkey=id&blobtable=MungoBlobs&blobwhere=1352836854087&ssbinary=true";
        this.horario="Acceso libre";
        this.coste=-1;
        this.categorias = new CATEGORIA[]{CATEGORIA.TURISTICO};
        this.fotos = new int[]{R.drawable.laguna_campillo_1,R.drawable.laguna_campillo_2, R.drawable.laguna_campillo_3 };
    }
}

