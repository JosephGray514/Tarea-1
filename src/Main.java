import builder.CalzadoBuilder;
import director.ClazadoBuilderDirector;
import Class.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
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
        //Se imprimer los datos del calzado
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
        System.out.println("Color del calzado :"+" "+"\u001B[33m" +calzado.getColor()+ "\u001B[0m"+
                " \n "+
                "Tipo del cordon: " +calzado.getCordon().getTipoCordon()+"\n"
                + "Color del cordon: "+ "\u001B[30m "+calzado.getCordon().getColor()+"\u001B[0m "+"\n"+
                "Material del forro: " +calzado.getForro().getMaterial()+"\n"
                +"Color del forro: "+" \u001B[32m"+ calzado.getForro().getColor()+"\u001B[0m"+"\n"
                + "Material de la lengueta: " +calzado.getLengueta().getMaterial()+"\n"
                + "Color de la lengueta: "+"\u001B[31m " +calzado.getLengueta().getColor()+"\u001B[0m"+"\n"


          );
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
        //Se imprimer los datos del calzado
//        System.out.println("Calzado: "+ calzado.getColor()+" "+"Tipo"+" "+calzado.getCordon().getTipoCordon());
        System.out.println("Calzado"+"\u001B[33m" +calzado.getColor()+ "\u001B[0m"+" "+"Tipo"+calzado.getCordon().getTipoCordon());
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
        //Se imprimer los datos del calzado
        System.out.println("\n" + "      Calzado con velcro     " + "\n"
                + "Color: " +calzado.getColor() +"\n"
                + "Tipo de suela: " +calzado.getSuela() +"\n"
                + "Tipo del velcro: " +calzado.getVelcro().getTipo()+"\n"
                + "Color del velcro: " +calzado.getVelcro().getColor()+"\n");
    }
    public static void CalzadoJoseph  (){
        Calzado calzado;
        // Se declara el Director
        ClazadoBuilderDirector calzadoBuilderDirector = new ClazadoBuilderDirector();
        // Se declara el Builder
        CalzadoBuilder calzadoBuilder = new CalzadoBuilder();
        //El metodo del calzado deseado del Director recibe por parametro el Builder
        calzadoBuilderDirector.buildCalzadoJoseph(calzadoBuilder);
        //El calzado toma el valor del calzado creado por el Builder
        calzado = calzadoBuilder.getCalsado();
      System.out.println("\n" + "      Calzado Joseph     " + "\n"
              + "Color del calzado: " +calzado.getColor() +"\n"
              + "Tipo de suela: " +calzado.getSuela() +"\n"
              + "Tipo del cordon: " +calzado.getCordon().getTipoCordon()+"\n"
              + "Color del cordon: " +calzado.getCordon().getColor()+"\n"
              + "Color del forro: " +calzado.getForro().getColor()+"\n"
              + "Material del forro: " +calzado.getForro().getMaterial()+"\n"
              + "Material de la lengueta: " +calzado.getLengueta().getMaterial()+"\n"
              + "Color de la lengueta: " +calzado.getLengueta().getColor()+"\n"
              + "Altura del tacon: " +calzado.getTacon().getAltura()+"\n"
             + "Material del tacon: " +calzado.getTacon().getMaterialTacon()+"\n");
    }

    public static void mostrarMenu() {
        out.println("1. Calsado Amarillo");
        out.println("2. Calsado Negro ");
        out.println("3. Calsado velcro ");
        out.println("4. Calsado josep");
        out.println("s.salir");
    }
    public static void ejecutarOpcion(String opcion) throws Exception {
        switch (opcion) {
            case "1":
                CalsadoAmarillo();
                break;
            case "2":
                CalsadoNegro();
                break;
            case "3":
                CalsadoVelcroAzul();
                break;
            case "4":
                CalzadoJoseph();
                break;
            case "s":
                out.println("Cerrando sesión");
        }
    }
  public static void main(String[] args) throws Exception {
      String opcion = "";
      while(!opcion.equals("s")) {
          mostrarMenu();
          System.out.println("Ingrese la opción deseada: ");
          opcion = in.readLine();
          ejecutarOpcion(opcion);
      }

  }
}
