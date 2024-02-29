package gestor;
import builder.CalzadoBuilder;
import director.ClazadoBuilderDirector;
import Class.*;
import java.io.BufferedReader;
import java.io.*;
public class Gestor {
    public static void CalsadoAmarillo(){
        // Se declara el calzado
        Calzado calzado;
        // Se declara el Director
        ClazadoBuilderDirector calzadoBuilderDirector = new ClazadoBuilderDirector();
        // Se declara el Builder
        CalzadoBuilder calzadoBuilder = new CalzadoBuilder();
        //El metodo del calzado deseado del Director recibe por parametro el Builder
        calzadoBuilderDirector.buildCalzadoCordonAmarillo(calzadoBuilder);
        //El calzado toma el valor del calzado creado por el Builder
        calzado = calzadoBuilder.getCalsado();

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
    public static void CalsadoNegro(){
        // Se declara el calzado
        Calzado calzado;
        // Se declara el Director
        ClazadoBuilderDirector calzadoBuilderDirector = new ClazadoBuilderDirector();
        // Se declara el Builder
        CalzadoBuilder calzadoBuilder = new CalzadoBuilder();
        //El metodo del calzado deseado del Director recibe por parametro el Builder
        calzadoBuilderDirector.buildCalzadoCordonNegro(calzadoBuilder);
        //El calzado toma el valor del calzado creado por el Builder
        calzado = calzadoBuilder.getCalsado();

    }
    public static void CalsadoVelcroAzul (){
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

    }
    public static void CalzadoTacon  (){
        Calzado calzado;
        // Se declara el Director
        ClazadoBuilderDirector calzadoBuilderDirector = new ClazadoBuilderDirector();
        // Se declara el Builder
        CalzadoBuilder calzadoBuilder = new CalzadoBuilder();
        //El metodo del calzado deseado del Director recibe por parametro el Builder
        calzadoBuilderDirector.buildCalzadoJoseph(calzadoBuilder);
        //El calzado toma el valor del calzado creado por el Builder
        calzado = calzadoBuilder.getCalsado();
        
    }


}
