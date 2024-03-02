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
            mensaje = "\u001B[31m"+"*--- Boletin Calzado Con Velcro ---*\n";
            mensaje += "\u001B[36m"+"El velcro del calzado es de color: " +"\u001B[35m"+ calzado.getVelcro().getColor() + "\n";
            mensaje += "\u001B[36m"+"El color del calzado es: " +"\u001B[31m"+ calzado.getColor() + "\n";
            mensaje += "\u001B[36m"+"La suela del calzado es de: "+"\u001B[34m"+calzado.getSuela()+"\n";
            mensaje += "\u001B[36m"+"El forro del calzado es de material: " +"\u001B[34m"+ calzado.getForro().getMaterial()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+ " y de color: " +"\u001B[33m" +calzado.getForro().getColor() + "\n";
            mensaje += "\u001B[36m"+"El picado maria del calzado es de tipo: "+ "\u001B[34m"+ calzado.getPicadoMaria().getTipoPicado() +"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+ " y de densidad: "+"\u001B[34m" + calzado.getPicadoMaria().getDensidadDePicado() + "\n";
            mensaje += "\u001B[36m"+"El empeine del calzado es de : "+"\u001B[34m" + calzado.getEmpeine().getEstilo() +"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+ " de ancho: "+"\u001B[34m" + calzado.getEmpeine().getAncho()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m" + " y de color: " +"\u001B[37m "+ calzado.getEmpeine().getColor() + "\n";
            mensaje += "\u001B[36m"+"La lengueta del calzado es de material: "+" \u001B[34m" + calzado.getLengueta().getMaterial()+ "\u001B[0m"+"\u001B[40m" +"\u001B[36m"+ " y de color: "+"\u001B[37m" + calzado.getEmpeine().getColor() + "\n";
        }
        return  mensaje;
    }

    public String boletinCalzadoCordon(Calzado calzado) {

        String mensajeCordonAmarillo = "";

        if (calzado.getCordon() != null){
            mensajeCordonAmarillo = "\u001B[31m"+"*--- Boletin Calzado Con Cordon ---*\n";
            mensajeCordonAmarillo += "\u001B[36m"+"El cordon del calzado es: "+calzado.getCordon().getTipoCordon()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" y de color: "+"\u001B[31m"+calzado.getCordon().getColor() +"\n";
            mensajeCordonAmarillo += "\u001B[36m"+"El color del calzado es: "+"\u001B[33m"+calzado.getColor()+"\n";
            mensajeCordonAmarillo += "\u001B[36m"+"La suela del calzado es de: "+"\u001B[34m"+calzado.getSuela()+"\n";
            mensajeCordonAmarillo += "\u001B[36m"+"El forro del calzado es de material: "+"\u001B[34m"+calzado.getForro().getMaterial()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" y de color: "+"\u001B[32m"+calzado.getForro().getColor()+"\n";
            mensajeCordonAmarillo += "\u001B[36m"+"El picado maria del calzado es de tipo: "+"\u001B[34m"+calzado.getPicadoMaria().getTipoPicado()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" y de densidad: "+"\u001B[34m"+calzado.getPicadoMaria().getDensidadDePicado()+"\n";
            mensajeCordonAmarillo += "\u001B[36m"+"El empeine del calzado es de : "+"\u001B[34m"+calzado.getEmpeine().getEstilo()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" y de ancho: "+"\u001B[34m"+calzado.getEmpeine().getAncho()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" y de color: "+"\u001B[37m"+calzado.getEmpeine().getColor()+"\n";
            mensajeCordonAmarillo += "\u001B[36m"+"La lengueta del calzado es de material: "+"\u001B[34m"+calzado.getLengueta().getMaterial()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" y de color: "+"\u001B[37m"+calzado.getEmpeine().getColor()+"\n";
        }
        return  mensajeCordonAmarillo;
    }


    public String boletinCalzadoTacon(Calzado calzado){

        String mensajeCalzadoTacon = "";

        if (calzado.getTacon() != null){
            mensajeCalzadoTacon = "\u001B[31m"+"*--- Boletin Calzado Con Tacon ---*\n";
            mensajeCalzadoTacon += "\u001B[36m"+"El color del calzado es: "+"\u001B[33m"+calzado.getColor()+"\n";
            mensajeCalzadoTacon += "\u001B[36m"+"La suela del calzado es de: "+"\u001B[34m"+calzado.getSuela()+"\n";
            mensajeCalzadoTacon += "\u001B[36m"+"El velcro del calzado es de color: " +"\u001B[31m"+ calzado.getVelcro().getColor() + "\n";
            mensajeCalzadoTacon += "\u001B[36m"+"El forro del calzado es de material: "+"\u001B[34m"+calzado.getForro().getMaterial()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" y de color: "+"\u001B[32m"+calzado.getForro().getColor()+"\n";
            mensajeCalzadoTacon += "\u001B[36m"+"El material del tacon es: "+"\u001B[34m"+calzado.getTacon().getMaterialTacon()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" y de altura: "+"\u001B[34m"+calzado.getTacon().getAltura()+"cm\n";
            mensajeCalzadoTacon += "\u001B[36m"+"El picado maria del calzado es: "+"\u001B[34m"+calzado.getPicadoMaria().getTipoPicado()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+"y la densidad es"+"\u001B[34m"+calzado.getPicadoMaria().getDensidadDePicado()+"\n";
            mensajeCalzadoTacon += "\u001B[36m"+"El empeine del calzado es de : "+"\u001B[34m"+calzado.getEmpeine().getEstilo()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" de ancho: "+"\u001B[34m"+calzado.getEmpeine().getAncho()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" y de color: "+"\u001B[33m"+calzado.getEmpeine().getColor()+"\n";
            mensajeCalzadoTacon += "\u001B[36m"+"La lengueta del calzado es de material: "+"\u001B[34m"+calzado.getLengueta().getMaterial()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" y de color: "+"\u001B[33m"+calzado.getEmpeine().getColor()+"\n";
        }
        return  mensajeCalzadoTacon;
    }

    public String boletinCalzadoConAlmohadilla(Calzado calzado) {
        String mensajeAlmohadilla = "";
        if (calzado.getAlmohadilla() != null){
            mensajeAlmohadilla = "\u001B[31m"+"*--- Boletin Calzado Con Almohadilla ---*\n";
            mensajeAlmohadilla += "\u001B[36m"+"El color del calzado es: "+"\u001B[35m"+calzado.getColor()+"\n";
            mensajeAlmohadilla += "\u001B[36m"+"La suela del calzado es de: "+"\u001B[34m"+calzado.getSuela()+"\n";
            mensajeAlmohadilla += "\u001B[36m"+"El cordon del calzado es: "+"\u001B[34m"+calzado.getCordon().getTipoCordon()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" y de color: "+"\u001B[35m"+calzado.getCordon().getColor()+"\n";
            mensajeAlmohadilla += "\u001B[36m"+"El forro del calzado es de material: "+"\u001B[34m"+calzado.getForro().getMaterial()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" y de color: "+"\u001B[37m"+calzado.getForro().getColor()+"\n";
            mensajeAlmohadilla += "\u001B[36m"+"El picado maria del calzado es: "+"\u001B[34m"+calzado.getPicadoMaria().getTipoPicado()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+"y la densidad es "+"\u001B[34m"+calzado.getPicadoMaria().getDensidadDePicado()+"\n";
            mensajeAlmohadilla += "\u001B[36m"+"El empeine del calzado es de : "+"\u001B[34m"+calzado.getEmpeine().getEstilo()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" de ancho: "+"\u001B[34m"+calzado.getEmpeine().getAncho()+" y de color: "+"\u001B[32m"+calzado.getEmpeine().getColor()+"\n";
            mensajeAlmohadilla += "\u001B[36m"+"La lengueta del calzado es de material: "+"\u001B[34m"+calzado.getLengueta().getMaterial()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" y de color: "+"\u001B[34m"+calzado.getEmpeine().getColor()+"\n";
            mensajeAlmohadilla += "\u001B[36m"+"La almohadilla del calzado es de tipo: "+"\u001B[34m"+calzado.getAlmohadilla().getTipo()+"\u001B[0m"+"\u001B[40m" +"\u001B[36m"+" y de material: "+"\u001B[34m"+calzado.getAlmohadilla().getMaterial()+"\n";
        }
        return mensajeAlmohadilla;
    }

}