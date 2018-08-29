package edu.val.idel.rivas.turismorivas.modelo;

import edu.val.idel.rivas.turismorivas.R;

/**
 * @author Hector (XiNoRiVaS en Github)
 *
 * Esta clase representa la Casa Consistorial del Ayto de Rivas
 * con todos los atributos mencionados en la clase PuntoDeInteres
 */

public class AytoRivas extends PuntoDeInteres {

    public AytoRivas () {
        this.nombre = "Casa Consistorial del Ayuntamiento de Rivas";
        this.fecha_inicio = "1954";
        this.area = -1;
        this.direccion = "Plaza 19 de Abril s/n (28521 - Rivas Vaciamadrid)";
        this.latitud = 40.327446f;
        this.longitud = -3.518410f;
        this.horario = "De lunes a viernes de 8:00 a 20:00";
        this.info_contacto = "Teléfono: 91 660 27 10" +
                "Email: alcaldia@rivasciudad.es";
        this.info_basica = "La Casa Consistorial es el edificio histórico del Ayuntamiento de Rivas Vaciamadrid. " +
                "Se encuentra en el Casco Antiguo y forma parte del núcleo urbano diseñado por Regiones Devastadas tras la Guerra Civil." +
                "En la Casa Consistorial se encuentra la Concejalía de Salud, la Concejalía de Barrio Este, el Registro Auxiliar y Atención a la Ciudadanía.";
        this.info_detallada = "Los primeros vestigios de población en el espacio geográfico de Rivas Vaciamadrid datan de hace aproximadamente 2.300 años," +
                " cuando se estableció dentro de lo que hoy es el término municipal, una vivienda carpetana en un lugar hoy conocido como Miralrío.\n" +
                "Rivas Vaciamadrid ha sido una población cuya historia ha estado marcada por su proximidad a la ciudad de Madrid.\n" +
                "Debe su nombre, por un lado al capitán Guillermo Rivas, que en el siglo XI colonizó el lugar con un enclave cristiano, por orden del rey Alfonso VI." +
                " Por su parte Vaciamadrid parece descender de la expresión árabe Manzil Mayrit," +
                " que significa el \"parador de Mayrit\", un lugar en el que se detenían los caminantes que se dirigían a la ciudad." +
                "En 1845 Rivas incorporó a Vaciamadrid. Se trataba de la unión de dos aldeas con casas esparcidas en torno a las grandes fincas que los conformaban.\n" +
                "El llegar la Guerra Civil, por su ubicación en el frente y dando espacio a la Batalla del Jarama," +
                " la población quedó destruida, hasta que volvió a ser edificada por la Dirección General de Regiones Devastadas," +
                " en el año 1954. El pueblo se desarrolló con numerosas limitaciones llegando a contar con alrededor de 500 habitantes a finales de los años 70.\n " +
                "A principios de la siguiente década comenzaron a edificarse los primeros edificios habitados por cooperativistas, en ese momento se inició su despegue demográfico.";
        this.enlace_web = "http://www.rivasciudad.es/portal/contenedor_ficha.jsp?seccion=s_floc_d4_v1.jsp&contenido=1082&tipo=1&nivel=1400&layout=contenedor_ficha.jsp&codResi=1&language=es";
        this.coste = 0;
        this.accesibilidad = true;
        this.puntuacion = -1;
        this.categorias = new CATEGORIA[]{CATEGORIA.HISTORICO};
        this.fotos = new int[]{R.drawable.casaconsistorial_2, R.drawable.casaconsistorial_3, R.drawable.casaconsistorial_4 };


    }
}
