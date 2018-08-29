package edu.val.idel.rivas.turismorivas.modelo;

import edu.val.idel.rivas.turismorivas.R;

/**
 * @author Clara
 * @since 30-7-2018
 *
 * Esta clase representa al puente del tren de Arganda, cuyas atributos son heredadas de la clase PuntoDeInteres
 *
 * **/
public class PuenteDelTrenDeArganda extends PuntoDeInteres {

        public PuenteDelTrenDeArganda(){
            this.nombre = "Puente del tren de Arganda";
            this.fecha_inicio="1886";
            this.area=14866;
            this.direccion=null;
            this.latitud=40.325963f;
            this.longitud=-3.485899f;
            this.accesibilidad=false;
            this.info_contacto=null;
            this.enlace_web="http://www.vapormadrid.org";
            this.info_basica="Puente ferroviario de hierro con valor histórico y arquitectónico que pertenecía a la Compañía de ferrocarriles del Tajuña";
            this.info_detallada="Pertenece a la vieja línea de vía estrecha que unía Madrid con Alocén, en Guadalajara. Pertenecía a la Compañía de Ferrocarriles del Tajuña y tuvo una irregular vida pues con capital belga pretendían llevarlo hasta Aragón pero no se terminó por problemas económicos.\n" +
                    "El tramo madrileño, especialmente el que enlazaba Vicálvaro con Morata de Tajuña permaneció activo hasta el año 1997 y todavía hoy, en festivos circula un tren turístico desde La Poveda, en Arganda del Rey hasta la vieja fábrica de viguetas, junto a la laguna del Campillo.\n" +
                    "La línea se inauguró en 1886 luego el puente de hierro se corresponderá con aquellos años.\nMantiene un larguísimo tablero de 288 metros apoyado en estribos de cabecera y cinco pilas de hormigón de variada forma, quedando una sola de ellas dentro del cauce actual. El ancho es de 5,16 metros incluido el pasillo de inspección y consta de celosía doble de 3,58 metros de altura intermedia.\n" +
                    "Toda la estructura esta cosida y reafirmada por un trabajo perfecto de remaches salvo pequeños detalles de cortas pletinas, chapas o cartabones de refuerzo que se han unido por soldadura.\n" +
                    "Durante la Guerra Civil  el frente llega a las proximidades de las vía en Madrid. El tren sería protagonista indirecto durante la Batalla del Jarama en febrero de 1937. A la estación de Montarco (en el actual Rivas-Vaciamadrid) llegarán parte de los efectivos con los que la República detiene la ofensiva franquista para cortar las comunicaciones de Madrid y cerrar el cerco al Sur y al Este de la capital.\n" +
                    "Poco antes de acabar la guerra, las tropas republicanas deciden volar el puente del tren sobre el Jarama.\n Será sustituido después, en 1939, por otro de ancho normal.\nSituado en Rivas-Vaciamadrid, hoy es una de las infraestructuras conservadas del Tren de Arganda, siendo un emblema de la historia ferroviaria de la región.\n " +

                    "Durante la posguerra  las infraestructuras se deterioran sin apenas reinversión.\n" +
                    " El famoso lema popular sobre el Tren de Arganda, que pita más que anda se acuña popularmente en estos años.\n" +

                    "En 1990 un grupo de aficionados al ferrocarril adquirieron una vieja locomotora de vapor. Con el tiempo, esta asociación logró reconstruir esta pieza histórica y, además, recuperar el tramo La Poveda (Arganda) y La Laguna del Campillo (Rivas) \n" +
                    "El horario del tren que pasa por el puente:\n" +
                    "Temporada de Otoño:\nDomingos del 7 de Octubre al 30 de Diciembre de 2018\n" +
                    "Horarios de salida:\n 11:00, 12:00 y 13:00\n" +
                    "Viaje en el Tren de Vapor (ida y vuelta) + visita al pequeño Museo de la Estación: 5 €";
            this.puntuacion=-1;
            this.horario="Acceso libre";
            this.coste=0;
            this.categorias = new CATEGORIA[]{CATEGORIA.HISTORICO};
            this.fotos = new int[]{R.drawable.tren_1,R.drawable.tren_2, R.drawable.tren_3};
        }


}
