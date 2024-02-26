import builder.CalzadoBuilder;
import director.ClazadoBuilderDirector;
import Class.*;

public class Main {
    public static void main(String[] args) {
        Calzado calzado;
        ClazadoBuilderDirector clazadoBuilderDirector = new ClazadoBuilderDirector();
        CalzadoBuilder calzadoBuilder = new CalzadoBuilder();
        clazadoBuilderDirector.buildCalzadoCordonAmarillo(calzadoBuilder);
        calzado = calzadoBuilder.getCalsado();
        System.out.println("Calzado: "+ calzado.getColor());

    }
}