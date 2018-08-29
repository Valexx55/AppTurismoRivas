package edu.val.idel.rivas.turismorivas.modelo;

import edu.val.idel.rivas.turismorivas.R;

public class PuentedeArganda extends PuntoDeInteres {
    public PuentedeArganda() {
        this.nombre = "Puente de Arganda";
        this.fecha_inicio = "1818";
        this.area = 163;
        this.direccion = null;
        this.latitud = 40.319056f;
        this.longitud = -3.510894f;
        this.info_basica = "Es una estructura de hierro que conecta Arganda del Rey y Rivas-Vaciamadrid." +
                "No ofrece su uso al tráfico desde 1964, fue sustituido por uno de mayor " +
                "tamaño que da servicio a la Carretera Nacional N III (Carretera de Madrid-Valencia)." +
                "El puente ha sido un punto de conexión entre la ciudad de Madrid y las ciudades del Levante.";
        this.info_detallada = "El incremento de mercancías hacia la capital procedente de Valencia y del " +
                "Levante se incrementó desde el siglo XVIII. En el siglo XV se utilizaban unas barcas " +
                "propiedad conjunta entre el Rey y la villa de Arganda, y posteriormente compartidas entre " +
                "Madrid y Arganda del Rey. Pronto el empleo de estas barcas se hizo insuficiente como servicio " +
                "de transporte y se comenzó a pensar en la posibilidad de construir un puente similar al Puente " +
                "de la Reina (Aranjuez) pero se descartó por lo costoso de la obra." +
                "Fueron los hermanos Francisco y José Díaz (naturales de Villaseca de la Sagra) los promotores " +
                "de la idea de un puente de madera, inaugurado el 22 de noviembre de 1818, siendo el 31 de abril " +
                "de 1831 cuando se desploma y no lo vuelven a construir." +
                "En 1842 y hasta 1843 se construye el primer puente colgante (60m de luz y 7.40m de ancho, " +
                "soportado sobre cables suspendidos de soporte) del municipio de mano del ingeniero José María de " +
                "Lerma. En 1858 se hundió una pila de soporte arrastrando a una veintena de personas que lo cruzaban " +
                "en ese momento." +
                "Se intentó construir un nuevo puente con soportes de hierro pero se desestimó debido a su elevado " +
                "coste. Se reconstruyó de nuevo de forma colgante por el ingeniero Joaquín Pano Ruata derribándose de " +
                "nuevo en 1866." +
                "Nuevamente se reconstruye por el ingeniero Eugenio Barrón y Avignon (ingeniero del viaducto de Segovia), " +
                "se puso en funcionamiento en 1862, pero en 1887 se quiebra una vigueta y se vuelve a desplomar." +
                "" +
                "La estructura de hierro que conocemos no se construyó hasta 1910, anteriormente, en el periodo 1818-1830 " +
                "hubo una estructura de madera a modo de pasarela, de 1843-1858 y 1862-1910 hubo una serie de puentes " +
                "colgante hasta el actual.";
        this.info_contacto = null;
        this.horario = "Acceso Libre";
        this.coste = -1;
        this.accesibilidad = false;
        this.enlace_web = "https://es.wikipedia.org/wiki/Puente_de_Arganda#El_puente_en_la_cultura";
        this.puntuacion = -1;
        this.categorias = new CATEGORIA[]{CATEGORIA.HISTORICO, CATEGORIA.TURISTICO};
        this.fotos = new int[]{R.drawable.puente_1,R.drawable.puente_3, R.drawable.puente_4};




    }
}
