
package edu.val.idel.rivas.turismorivas.modelo;

import edu.val.idel.rivas.turismorivas.R;

public class ParqueLineal extends PuntoDeInteres {


                public ParqueLineal() {

                    this.nombre = "Parque Lineal";
                    this.enlace_web = "http://www.rivasciudad.es/portal/contenedor_ficha_mambiente.jsp?seccion=s_floc_d4_v1.jsp&contenido=1350&nivel=1400&tipo=1&codResi=1&language=es&codMenu=115&codMenuPN=37";
                    this.accesibilidad = false;
                    this.fecha_inicio = " Construido en 2007 y reabierto tras una serie de modificaciones en 2011";
                    this.latitud = 40.362310f;
                    this.longitud = -3.543900f;
                    this.horario = " Libre acceso";
                    this.info_basica = "Un espacio de naturaleza entre el trazado urbano. El Parque Lineal es uno de los más característicos de la ciudad, con elementos que lo dotan de una identidad propia";

                    this.info_detallada = "Este parque, en el que se invertieron casi 8 millones de euros y que junto con el de Bellavista y Miralrío " +
                            "representan el modelo de ciudad ripense, discurre por encima de la línea 9 de metro y une la avenida " +
                            "del Deporte con la Avenida de Los Almendros. " +
                            "Su trazado va desde la zona de La Cañada hasta el polideportivo Cerro del Telégrafo.\nTiene forma de curva, cuenta con una " +
                            "torre mirador de 26 metros de altura desde la que se podrá contemplar la ciudad, posee una ría de agua de 450 metros que " +
                            "desemboca en un pequeño lago con una fuente cibernética y a cuyas orillas surge un anfiteatro de títeres.\n" +
                            "Otros elementos que completan el parque son un laberinto vegetal, dos aulas al aire libre desde donde se podrán contemplar.\n" +
                            "Según el gobierno municipal, la creación del parque supuso la recuperación de una zona que no tenía uso público. Es una oportunidad " +
                            "única para dotar a la zona de un elemento central que vertebre y de sentido a las urbanizaciones que crecen en ella.\nEstá " +
                            "concebido como un espacio de encuentro y ocio, pensado para el paseo familiar";

                    this.categorias = new CATEGORIA[]{CATEGORIA.OTRA};
                    this.fotos = new int[]{R.drawable.parque_lineal_1,R.drawable.parque_lineal_2, R.drawable.parque_lineal_3 };
                    this.area = 85000;
                    this.coste = -1;
                    this.info_contacto = null;
                    this.puntuacion=-1;
                    this.direccion = "Calle Andrea R. González y Calle Ricardo Zamora";



                }}