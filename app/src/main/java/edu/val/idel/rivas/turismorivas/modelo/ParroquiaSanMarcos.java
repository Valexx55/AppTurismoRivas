package edu.val.idel.rivas.turismorivas.modelo;

import edu.val.idel.rivas.turismorivas.R;

public class ParroquiaSanMarcos extends PuntoDeInteres {


        public ParroquiaSanMarcos () {

            this.accesibilidad = true;
            this.nombre = "Parroquia San Marcos";
            this.enlace_web = "http://www.parroquiasanmarcos.com/iframeFondo2.php?file=Horarios.html";
            this.fecha_inicio = "Fue en 1632, el 21 de marzo, a petición de los ciudadanos de esta villa " +
                    "con la autorizacion del cardenal Zapata," +
                    " arzobispo de Toledo, cuando se inaugura un nuevo templo a la vez parroquial con el titulo de San Marcos";

            this.latitud =40.327602f;
            this.longitud =-3.518747f;
            this.coste = -1;
            this.horario = "De lunes a domingo, desde las 9:00 a las 8:00 de la tarde noche";
            this.info_detallada = "La iglesia parroquial de Rivas-Vaciamadrid es de estilo neoclásico, resultando su factura realmente bella. Podemos destacar de ella la presencia, en su techo, de las vistosas cigüeñas, las cuales ya no emigran en invierno y permanecen durante todo el año con nosotros, alegrando la vista de todos aquellos amantes de las aves y de los pequeños de nuestra parroquia que no dejan de asombrarse de la existencia de pájaros.\nEn verano de 2008 se acometieron unas necesarias obras de remodelación ante la necesidad de acondicionar un edificio de casi 50 años y para aumentar la capacidad del mismo, ya que con el aumento de la población del núcleo urbano, nuestra iglesia se nos había quedado pequeña.\n"+
                    "Después de muchos años de esfuerzos y de acumulación del capital necesario se afrontaron dichas obras, con la única ayuda de los fieles y del Arzobispado de Alcalá de Henares, mostrando siempre receptivo y amable ante nuestras peticiones."+
                    "Actualmente las obras más visibles están terminadas, pero quedan pendientes remodelaciones importantes que con ayuda de Dios esperamos acometer lo antes posible";
            this.info_basica = "La iglesia parroquial de Rivas - Vaciamadrid es de estilo neoclásico, resultando su factura realmente bella. Podemos destacar de ella la presencia, en su techo de las vistosas cigueñas, las cuales ya no emigran en invierno y peranecen  durante todo el año con nosotros," + " alegrando la vista de todos aquellos amantes de las aves y de los pequeños de nuestra parroquia que " + "o dejan  de asombrarse de la existencia de pájaros con una sola pata";
            this.categorias = new CATEGORIA[]{CATEGORIA.RELIGIOSO, CATEGORIA.CULTURAL};
            this.fotos = new int[]{R.drawable.parroquia_smarcos_2,R.drawable.parroquia_smarcos_3, R.drawable.parroquia_smarcos_4 };
            this.area = -1;
            this.info_contacto = null;
            this.direccion="Calle del Ayuntamiento, 3, 28521 Rivas-Vaciamadrid, Madrid";
            this.puntuacion = -1;
        }
}

