package edu.val.idel.rivas.turismorivas.modelo;

import edu.val.idel.rivas.turismorivas.R;

/**
 * @autor Aurora
 * @since 31-7-2018
 *
 * Esta clase que representa todos los atributos de la Parroquia de Santa Mónica en Rivas-Vaciamadrid

 */
public class ParroquiaSantaMonica extends PuntoDeInteres{
    public ParroquiaSantaMonica(){
        this.nombre = "Parroquia de Santa Mónica";
        this.fecha_inicio = "8 noviembre de 2008";
        this.area = -1;
        this.direccion = "Calle Libertad 17, 28523 Rivas-Vaciamadrid, Madrid";
        this.longitud = -3.542483f ;
        this.latitud = 40.363587f;
        this.accesibilidad = true;
        this.info_contacto =
                "Administración parroquial " +
                "Correo electrónico:   administracion@parroquiasantamonica.com" +
                "Teléfono: 651 76 52 56";
        this.enlace_web = "http://www.parroquiasantamonica.com";
        this.info_basica = "Lugar de culto con una arquitectura moderna que destaca ante las otras por su singular apariencia " +
                "recubierta en acero cortén";
        this.info_detallada = "La iglesia de Santa Mónica es un templo ideado en 1999 y consagrado el 8 de noviembre " +
                "de 2008, obra de Ignacio Vicens.\n" +
                "De planta muy alargada, ocupa la mayoría del solar, dejando únicamente un patio longitudinal, de acceso y " +
                "servicios, paralelo a uno de sus lados largos." +
                "Es un edificio concebido como una caja ciega de áspero acero cortén. Sin embargo, es una Iglesia luminosa " +
                "en su interior, y un edificio símbolo de la capacidad de la iglesia de utilizar los lenguajes de la arquitectura" +
                " y del arte de hoy.\n" +
                "Para acceder al edificio, se debe atravesar una gran puerta doble. Para entrar a la capilla de diario, otra " +
                "puerta gruesa, blanca. Las puertas que dan acceso a la iglesia son, en cambio, ligerísimas, invitando a los " +
                "fieles a entrar.\n" +
                "Las esculturas, muy cuidadas, de la Virgen María y Santa Mónica, son del escultor Javier Viver y y las pinturas" +
                " de la capilla del Santísimo, que representan la creación, del prestigioso artista José Manuel Ciria.";
        this.puntuacion = -1;
        this.horario = "Horario del despacho parroquial\n" +
                "Lunes y miércoles:\n de 17:00 a 19:00 horas.\n" +
                "Exposición con el Santísimo y rezo de vísperas\n" +
                "Todos los jueves:\n de 19:00 a 20:00 horas.\n" +
                "Confesiones\n" +
                "De lunes a sábado:\n desde 30 minutos hasta 5 minutos antes de cada Misa.\n" +
                "Domingos y festivos:\nAntes, después y durante las Misas de esos días.\n" +
                "Rezo del santo rosario\n" +
                "Todos los días:\n 19:30 horas (excepto Jueves y Viernes de Cuaresma).\n" +
                "Celebración mensual de Santa Mónica\n" +
                "Todos los días 27 de mes:\n Misa a las 20:00 horas\n" +
                "Horario de Misas\n" +
                "Misa de las Familias:\n " +
                "Domingos a las 11:30 horas.\n" +
                "Laborables (lunes a viernes):\n" +
                "   9:30 horas (excepto en verano).\n" +
                "   20:00 horas.\n " +
                "Sábados:\n" +
                "   10:00 horas (excepto en verano).\n" +
                "   20:00 horas.\n" +
                "Domingos y festivos:\n" +
                "   10:00 horas.\n" +
                "   11:30 horas (excepto en verano)\n. En período escolar: Misa de las Familias.\n" +
                "   12:00 horas (excepto en el mes de Agosto)\n. En la ermita del Cristo de Rivas.\n" +
                "   13:00 horas.";
        this.coste = -1;
        this.categorias = new CATEGORIA[]{CATEGORIA.RELIGIOSO, CATEGORIA.MONUMENTAL};
        this.fotos = new int[]{R.drawable.parroquia_smonica_1,R.drawable.parroquia_smonica_3 };

    }
}
