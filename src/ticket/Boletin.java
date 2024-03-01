package ticket;

import Componentes.*;
import builder.Builder;
import builder.CalzadoBuilder;
import enums.*;
import  Class.*;
public class Boletin  {


    public String boletinCalzadoVelcro (Calzado calzado){
        String mensaje = "";

        if (calzado.getVelcro() != null) {
            mensaje = "El velcro del calzado es de color: " + calzado.getVelcro().getColor() + "\n";
            mensaje += "El color del calzado es: " + calzado.getColor() + "\n";
            mensaje += "El forro del calzado es de material: " + calzado.getForro().getMaterial() + " y de color: " + calzado.getForro().getColor() + "\n";
            mensaje += "El material del tacon es: " + calzado.getTacon().getMaterialTacon() + " y de altura: " + calzado.getTacon().getAltura() + "\n";
            mensaje += "El picado maria del calzado es de tipo: " + calzado.getPicadoMaria().getTipoPicado() + " y de densidad: " + calzado.getPicadoMaria().getDensidadDePicado() + "\n";
            mensaje += "El empeine del calzado es de : " + calzado.getEmpeine().getEstilo() + " de ancho: " + calzado.getEmpeine().getAncho() + " y de color: " + calzado.getEmpeine().getColor() + "\n";
            mensaje += "La lengueta del calzado es de material: " + calzado.getLengueta().getMaterial() + " y de color: " + calzado.getEmpeine().getColor() + "\n";
        }
        return  mensaje;
    }

    public String boletinCalzadoCordonAmarillo(Calzado calzado) {

        String mensajeCordonAmarillo = "";

        if (calzado.getCordon() != null){
            mensajeCordonAmarillo += "El cordon del calzado es: "+calzado.getCordon().getTipoCordon()+" y de color: "+"\u001B[33m"+calzado.getCordon().getColor()+"" +"\n";
            mensajeCordonAmarillo += "El color del calzado es: "+calzado.getColor()+"\n";
            mensajeCordonAmarillo += "El forro del calzado es de material: "+calzado.getForro().getMaterial()+" y de color: "+calzado.getForro().getColor()+"\n";
            mensajeCordonAmarillo += "El material del tacon es: "+calzado.getTacon().getMaterialTacon()+" y de altura: "+calzado.getTacon().getAltura()+"\n";
            mensajeCordonAmarillo += "El picado maria del calzado es de tipo: "+calzado.getPicadoMaria().getTipoPicado()+" y de densidad: "+calzado.getPicadoMaria().getDensidadDePicado()+"\n";
            mensajeCordonAmarillo += "El empeine del calzado es de : "+calzado.getEmpeine().getEstilo()+" de ancho: "+calzado.getEmpeine().getAncho()+" y de color: "+calzado.getEmpeine().getColor()+"\n";
            mensajeCordonAmarillo += "La lengueta del calzado es de material: "+calzado.getLengueta().getMaterial()+" y de color: "+calzado.getEmpeine().getColor()+"\n";
            mensajeCordonAmarillo += "La almohadilla del calzado es de tipo: "+calzado.getAlmohadilla().getTipo()+" y de material: "+calzado.getAlmohadilla().getMaterial();
        }
        return  mensajeCordonAmarillo;
    }


    public String boletinCalzadoTacon(Calzado calzado){

        String mensajeCalzadoTacon = "";

        if (calzado.getTacon() != null){
            mensajeCalzadoTacon += "El color del calzado es: "+calzado.getColor()+"\n";
            mensajeCalzadoTacon += "El cordon del calzado es: "+calzado.getCordon().getTipoCordon()+" y de color: "+"\u001B[33m"+calzado.getCordon().getColor()+"" +"\n";
            mensajeCalzadoTacon += "El forro del calzado es de material: "+calzado.getForro().getMaterial()+" y de color: "+calzado.getForro().getColor()+"\n";
            mensajeCalzadoTacon += "El material del tacon es: "+calzado.getTacon().getMaterialTacon()+" y de altura: "+calzado.getTacon().getAltura()+"\n";
            mensajeCalzadoTacon += "El picado maria del calzado es: "+calzado.getPicadoMaria()+"\n";
            mensajeCalzadoTacon += "El empeine del calzado es de : "+calzado.getEmpeine().getEstilo()+" de ancho: "+calzado.getEmpeine().getAncho()+" y de color: "+calzado.getEmpeine().getColor()+"\n";
            mensajeCalzadoTacon += "La lengueta del calzado es de material: "+calzado.getLengueta().getMaterial()+" y de color: "+calzado.getEmpeine().getColor()+"\n";
            mensajeCalzadoTacon += "La almohadilla del calzado es de tipo: "+calzado.getAlmohadilla().getTipo()+" y de material: "+calzado.getAlmohadilla().getMaterial();
        }
        return  mensajeCalzadoTacon;
    }

    public String boletinCalzadoAlmohadillaErogonomica(Calzado calzado) {
        String mensajeAlmohadilla = "";



        return mensajeAlmohadilla;
    }

}