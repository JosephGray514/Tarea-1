package gestor;
import builder.CalzadoBuilder;
import director.ClazadoBuilderDirector;
import Class.*;
import ticket.Boletin;

public class Gestor {

    public static String CalzadoConCordon(){
        Calzado calzado;

        ClazadoBuilderDirector calzadoBuilderDirector = new ClazadoBuilderDirector();

        CalzadoBuilder calzadoBuilder = new CalzadoBuilder();

        calzadoBuilderDirector.buildCalzadoCordon(calzadoBuilder);

        calzado = calzadoBuilder.getCalsado();

        Boletin boletin = new Boletin();
        String mensaje = boletin.boletinCalzadoCordon(calzado);

        return mensaje;
    }

    public static String CalzadoConVelcro(){

        Calzado calzado;

        ClazadoBuilderDirector calzadoBuilderDirector = new ClazadoBuilderDirector();

        CalzadoBuilder calzadoBuilder = new CalzadoBuilder();

        calzadoBuilderDirector.buildCalzadoVelcro(calzadoBuilder);

        calzado = calzadoBuilder.getCalsado();

        Boletin boletin = new Boletin();

        String mensaje = boletin.boletinCalzadoVelcro(calzado);

        return mensaje;
    }

    public static String CalzadoConAlmohadilla(){

        Calzado calzado;

        ClazadoBuilderDirector calzadoBuilderDirector = new ClazadoBuilderDirector();

        CalzadoBuilder calzadoBuilder = new CalzadoBuilder();

        calzadoBuilderDirector.buildCalzadoConAlmohadilla(calzadoBuilder);

        calzado = calzadoBuilder.getCalsado();

        Boletin boletin = new Boletin();

        String mensaje = boletin.boletinCalzadoConAlmohadilla(calzado);

        return mensaje;
    }

    public static String CalzadoConTacon  (){
        Calzado calzado;

        ClazadoBuilderDirector calzadoBuilderDirector = new ClazadoBuilderDirector();

        CalzadoBuilder calzadoBuilder = new CalzadoBuilder();

        calzadoBuilderDirector.buildCalzadoTacon(calzadoBuilder);

        calzado = calzadoBuilder.getCalsado();
        Boletin boletin = new Boletin();

        String mensaje = boletin.boletinCalzadoTacon(calzado);

        return mensaje;
    }


}
