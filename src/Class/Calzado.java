package Class;
import Componentes.*;
import enums.Color;
import enums.Tipo;

public class Calzado {
    private Cordon cordon;
    private Tacon tacon;
    private Almohadilla almohadilla;
    private Velcro velcro;
    private Color color;
    private Tipo tipo;


    public Calzado(Cordon cordon, Tacon tacon, Almohadilla almohadilla, Velcro velcro, Color color, Tipo tipo) {
        this.cordon = cordon;
        this.tacon = tacon;
        this.almohadilla = almohadilla;
        this.velcro = velcro;
        this.color = color;
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
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


}
