package Class;
import Componentes.*;
import enums.Color;
import enums.Suela;
import enums.TipoCordon;

public class Calzado {
    private Cordon cordon;
    private Tacon tacon;
    private Almohadilla almohadilla;
    private Velcro velcro;
    private Color color;
    private Lengueta lengueta;
    private Forro forro;
    private Suela suela;
    private PicadoMaria picadoMaria;
    private  Empeine empeine;

    public Calzado(Cordon cordon, Tacon tacon, Almohadilla almohadilla, Velcro velcro, Color color, Lengueta lengueta, Forro forro, Suela suela, PicadoMaria picadoMaria, Empeine empeine) {
        this.cordon = cordon;
        this.tacon = tacon;
        this.almohadilla = almohadilla;
        this.velcro = velcro;
        this.color = color;
        this.lengueta = lengueta;
        this.forro = forro;
        this.suela = suela;
        this.picadoMaria = picadoMaria;
        this.empeine = empeine;
    }

    public Suela getSuela() {
        return suela;
    }

    public void setSuela(Suela suela) {
        this.suela = suela;
    }

    public Lengueta getLengueta() {
        return lengueta;
    }

    public void setLengueta(Lengueta lengueta) {
        this.lengueta = lengueta;
    }

    public Forro getForro() {
        return forro;
    }

    public void setForro(Forro forro) {
        this.forro = forro;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Cordon getCordon() {
        return cordon;
    }

    public void setCordon(Cordon cordon) {
        this.cordon = cordon;
    }

    public Tacon getTacon() {
        return tacon;
    }

    public void setTacon(Tacon tacon) {
        this.tacon = tacon;
    }

    public Almohadilla getAlmohadilla() {
        return almohadilla;
    }

    public void setAlmohadilla(Almohadilla almohadilla) {
        this.almohadilla = almohadilla;
    }

    public Velcro getVelcro() {
        return velcro;
    }

    public void setVelcro(Velcro velcro) {
        this.velcro = velcro;
    }

    public PicadoMaria getPicadoMaria() {
        return picadoMaria;
    }

    public void setPicadoMaria(PicadoMaria picadoMaria) {
        this.picadoMaria = picadoMaria;
    }

    public Empeine getEmpeine() {
        return empeine;
    }

    public void setEmpeine(Empeine empeine) {
        this.empeine = empeine;
    }
}
