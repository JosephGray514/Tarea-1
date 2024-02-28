import builder.CalzadoBuilder;
import director.ClazadoBuilderDirector;
import Class.*;

public class Main {
  public static void main(String[] args) {

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
      System.out.println("Calzado: "+ calzado.getColor()+" "+"Tipo"+" "+calzado.getCordon().getTipoCordon());


      //Joseph Gray
      Calzado calzado2;

      CalzadoBuilder calzadoBuilder2 = new CalzadoBuilder();

      calzadoBuilderDirector.buildCalzadoVelcro(calzadoBuilder2);

      calzado = calzadoBuilder2.getCalsado();

      System.out.println("\n" + "      Calzado con velcro     " + "\n"
                        + "Color: " +calzado.getColor() +"\n"
                        + "Tipo de suela: " +calzado.getSuela() +"\n"
                        + "Tipo del velcro: " +calzado.getVelcro().getTipo()+"\n"
                        + "Color del velcro: " +calzado.getVelcro().getColor()+"\n");

      //Joseph Gray
      Calzado calzadoJoseph;

      CalzadoBuilder calzadoBuilderJoseph = new CalzadoBuilder();

      calzadoBuilderDirector.buildCalzadoJoseph(calzadoBuilderJoseph);

      calzadoJoseph = calzadoBuilderJoseph.getCalsado();

      System.out.println("\n" + "      Calzado Joseph     " + "\n"
              + "Color del calzado: " +calzadoJoseph.getColor() +"\n"
              + "Tipo de suela: " +calzadoJoseph.getSuela() +"\n"
              + "Tipo del cordon: " +calzadoJoseph.getCordon().getTipoCordon()+"\n"
              + "Color del cordon: " +calzadoJoseph.getCordon().getColor()+"\n"
              + "Color del forro: " +calzadoJoseph.getForro().getColor()+"\n"
              + "Material del forro: " +calzadoJoseph.getForro().getMaterial()+"\n"
              + "Material de la lengueta: " +calzadoJoseph.getLengueta().getMaterial()+"\n"
              + "Color de la lengueta: " +calzadoJoseph.getLengueta().getColor()+"\n"
              + "Altura del tacon: " +calzadoJoseph.getTacon().getAltura()+"\n"
              + "Material del tacon: " +calzadoJoseph.getTacon().getMaterialTacon()+"\n");
  }
}
