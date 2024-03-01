package gestor;
import builder.CalzadoBuilder;
import director.ClazadoBuilderDirector;
import Class.*;
import ticket.Boletin;

public class Gestor {

    public static String CalzadoConCordon(){
        // Se declara el calzado
        Calzado calzado;
        // Se declara el Director
        ClazadoBuilderDirector calzadoBuilderDirector = new ClazadoBuilderDirector();
        // Se declara el Builder
        CalzadoBuilder calzadoBuilder = new CalzadoBuilder();
        //El metodo del calzado deseado del Director recibe por parametro el Builder
        calzadoBuilderDirector.buildCalzadoCordon(calzadoBuilder);
        //El calzado toma el valor del calzado creado por el Builder
        calzado = calzadoBuilder.getCalsado();

        Boletin boletin = new Boletin();
        String mensaje = boletin.boletinCalzadoCordon(calzado);

        return mensaje;
    }

    public static String CalzadoConVelcro(){
        // Se declara el calzado
        Calzado calzado;
        // Se declara el Director
        ClazadoBuilderDirector calzadoBuilderDirector = new ClazadoBuilderDirector();
        // Se declara el Builder
        CalzadoBuilder calzadoBuilder = new CalzadoBuilder();
        //El metodo del calzado deseado del Director recibe por parametro el Builder
        calzadoBuilderDirector.buildCalzadoVelcro(calzadoBuilder);
        //El calzado toma el valor del calzado creado por el Builder
        calzado = calzadoBuilder.getCalsado();
        //
        Boletin boletin = new Boletin();

        String mensaje = boletin.boletinCalzadoVelcro(calzado);

        return mensaje;
    }

    public static String CalzadoConAlmohadilla(){
        // Se declara el calzado
        Calzado calzado;
        // Se declara el Director
        ClazadoBuilderDirector calzadoBuilderDirector = new ClazadoBuilderDirector();
        // Se declara el Builder
        CalzadoBuilder calzadoBuilder = new CalzadoBuilder();
        //El metodo del calzado deseado del Director recibe por parametro el Builder
        calzadoBuilderDirector.buildCalzadoConAlmohadilla(calzadoBuilder);
        //El calzado toma el valor del calzado creado por el Builder
        calzado = calzadoBuilder.getCalsado();

        Boletin boletin = new Boletin();

        String mensaje = boletin.boletinCalzadoConAlmohadilla(calzado);

        return mensaje;
    }

    public static String CalzadoConTacon  (){
        Calzado calzado;
        // Se declara el Director
        ClazadoBuilderDirector calzadoBuilderDirector = new ClazadoBuilderDirector();
        // Se declara el Builder
        CalzadoBuilder calzadoBuilder = new CalzadoBuilder();
        //El metodo del calzado deseado del Director recibe por parametro el Builder
        calzadoBuilderDirector.buildCalzadoTacon(calzadoBuilder);
        //El calzado toma el valor del calzado creado por el Builder
        calzado = calzadoBuilder.getCalsado();
        Boletin boletin = new Boletin();

        String mensaje = boletin.boletinCalzadoTacon(calzado);

        return mensaje;
    }

                  // Colores
    //     Negro
//\u001B[30m

//      Rojo
//\u001B[31m

//     Verde
//\u001B[32m

//   Amarillo
//\u001B[33m

//      Azul
//\u001B[34m

//   Púrpura
//\u001B[35m

//      Cian
//\u001B[36m

//    Blanco
//\u001B[37m


}
