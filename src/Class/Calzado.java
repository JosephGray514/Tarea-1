package Class;
import Componentes.*;
import enums.Color;
import enums.TipoAlmohadilla;
import enums.TipoCordon;

public class Calzado {
    private Cordon cordon;
    private Tacon tacon;
    private Almohadilla almohadilla;
    private Velcro velcro;
    private Color color;
    private TipoAlmohadilla tipoAlmohadilla;
   private  TipoCordon tipoCordon;

   private lengueta lengueta;
   private Forro forro;

    public Calzado(Cordon cordon, Tacon tacon, Almohadilla almohadilla, Velcro velcro, Color color, TipoAlmohadilla tipoAlmohadilla, TipoCordon tipoCordon, Forro forro, lengueta lengueta) {
        this.cordon = cordon;
        this.tacon = tacon;
        this.almohadilla = almohadilla;
        this.velcro = velcro;
        this.color = color;
        this.tipoAlmohadilla = tipoAlmohadilla;
        this.tipoCordon = tipoCordon;
        this.forro=forro;
        this.lengueta=lengueta;

    }

    public TipoAlmohadilla getTipoAlmohadilla() {
        return tipoAlmohadilla;
    }

    public void setTipoAlmohadilla(TipoAlmohadilla tipoAlmohadilla) {
        this.tipoAlmohadilla = tipoAlmohadilla;
    }

    public Componentes.lengueta getLengueta() {
        return lengueta;
    }

    public void setLengueta(Componentes.lengueta lengueta) {
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

    public TipoAlmohadilla getTipo() {
        return tipoAlmohadilla;
    }

    public void setTipo(TipoAlmohadilla tipoAlmohadilla) {
        this.tipoAlmohadilla = tipoAlmohadilla;
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

    public TipoCordon getTipoCordon() {
        return tipoCordon;
    }

    public void setTipoCordon(TipoCordon tipoCordon) {
        this.tipoCordon = tipoCordon;
    }
}
