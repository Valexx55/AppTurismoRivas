package edu.val.idel.rivas.turismorivas.modelo;

import edu.val.idel.rivas.turismorivas.R;

/**
 * @author Clara
 * @since 30-7-2018
 *
 * La clase representa a las trincheras, cuyas atributos son heredadas de la clase PuntoDeInteres
 *
 * **/
public class Trincheras extends PuntoDeInteres{
    public Trincheras(){
        this.nombre = "Trincheras de la Guerra Civil";
        this.fecha_inicio="1937";
        this.area=20000;
        this.direccion="Arroyo de los migueles, Cerro de la Oliva y Cerro de la Hoya ";
        this.latitud=40.334212f;
        this.longitud=-3.543987f;
        this.accesibilidad=false;
        this.info_contacto=null;
        this.enlace_web=null;
        this.info_basica="En Rivas-Vaciamadrid, junto al valle formado por el arroyo de Los Migueles y la carretera de Valencia, se conserva un conocido conjunto de construcciones bélicas de la Guerra Civil Española.";
        this.info_detallada="Acabada la batalla del Jarama, en marzo de 1937, quedaban aún dos años más de Guerra Civil, durante ese tiempo, se construyeron más de veinte kilómetros de trincheras y fortificaciones en Vaciamadrid, excavadas entre el Cerro de la Oliva y la Hoya, frente a la Depuradora Suroriental, pertenecía a una segunda línea de resistencia, que en toda su extensión corría paralela al río Manzanares hasta llegar a Madrid.\n" +
                "Durante la Batalla, los nacionalistas tomaron las cumbres de Coberteras y las instalaciones de la fábrica militar de La Marañosa, llegando hasta el Espolón de Vaciamadrid para batir desde allí con sus fusiles la carretera de Valencia.\n" +
                "Se recupera parte del terreno perdido a pesar del elevado coste humano, instalándose trincheras a una mínima distancia de las rebeldes. El Espolón quedaría dividido entre ambos bandos, en un terreno con altísima concentración militar y de nula utilidad estratégica.\nRealmente los nacionalistas jamás abandonarán las alturas principales, por lo que el esfuerzo republicano se enmarcaría más en lo político y en cuestiones relativas a la moral de la tropa." +
                "Finalizada la Batalla comienza la guerra de trincheras y la fortificación de lo ya conseguido.\nEl ejército republicano, repartido en ambas márgenes del Manzanares, levanta varias líneas defensivas paralelas al río, desde las posiciones cuerpo a cuerpo con el adversario en el mismísimo extremo del Espolón de Vaciamadrid, hasta las que recorren los cerros de la margen izquierda, a retaguardia de las anteriores." +
                "En estas últimas, que llegan hasta Madrid, estarán encuadradas las trincheras del Cerro de la Oliva y del Puesto de Escuadra." +
                "Durante los meses después de la Batalla, principalmente a lo largo del año 1938, se van construyendo las trincheras y los emplazamientos para ametralladoras de esta Línea de Sostenes.\nNo hay evidencia exacta de ello, pero probablemente a finales de 1938 se proyecta y termina este Puesto de Escuadra, enmarcado en una serie de fortificaciones que se ejecutan en la zona del Espolón de Vaciamadrid.\n" +
                 "El fortín, ejecutado en hormigón y en un estado de conservación aceptable, está literalmente incrustado a media ladera del cerro más pequeño. De esta manera las obras quedaban mejor enmascaradas a la observación enemiga que posiciones más elevadas, también presentes en el Cerro de la Oliva.\n" +
                "Este fortín a media altura, embutido en el terreno y cubierto en parte con la tierra extraída para su vaciado, consigue mimetizarse con el entorno, ocultando su silueta.\nEs una obra proyectada y pensada con cierta dedicación. De hecho este tipo de construcciones fueron reglamentarias, conservándose documentación sobre su diseño y costes en materiales y horas de trabajo.\nEstamos pues ante un modelo estandarizado, del que a pesar de ello no se conservan ejemplares.\n" +
                "Rivas ha aprobado un servicio de intervención arqueológica con el objetivo de investigar, consolidar y señalizar restos vinculados a la Guerra Civil en el frente del Jarama";

        this.puntuacion=-1;
        this.horario="Acceso libre";
        this.coste=0;
        this.categorias = new CATEGORIA[]{CATEGORIA.HISTORICO};
        this.fotos = new int[]{R.drawable.trinchera_1,R.drawable.trinchera_3, R.drawable.trinchera_5,R.drawable.trinchera_6, R.drawable.trinchera_7  };
    }
}
