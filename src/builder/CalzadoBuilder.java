package builder;


import Componentes.*;
import  Class.*;
import enums.Color;
import enums.TipoAlmohadilla;
import enums.TipoCordon;

public class CalzadoBuilder implements Builder{
     private TipoCordon tipoCordon;
    private Almohadilla almohadilla;
    private  TipoAlmohadilla tipoAlmohadilla;
    private Cordon cordon;
    private Tacon tacon;
    private Velcro velcro;
    private Color color;

    private lengueta lengueta;
    private Forro forro;

    @Override
    public void setCordon(Cordon cordon) {
        this.cordon = cordon;
    }


    @Override
    public void setTacon(Tacon tacon) {
      this.tacon=tacon;
    }


    @Override
    public void setVelcro(Velcro velcro) {
        this.velcro = velcro;
    }

    @Override
    public void setAlmohadilla(Almohadilla almohadilla) {
     this.almohadilla=almohadilla;
    }

    @Override
    public void setTipoCordon(TipoCordon tipoCordon) {
        this.tipoCordon=tipoCordon;
    }
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setTipoAlmohadilla(TipoAlmohadilla tipoAlmohadilla) {
     this.tipoAlmohadilla=tipoAlmohadilla;
    }

    @Override
    public void setForro(Forro forro) {
        this.forro=forro;
    }

    @Override
    public void setlengueta(Componentes.lengueta lengueta) {
    this.lengueta=lengueta;
    }

    @Override
    public Calzado getCalsado() {
        return new Calzado(this.cordon, this.tacon, this.almohadilla, this.velcro,this.color,this.tipoAlmohadilla,this.tipoCordon,this.forro,this.lengueta );
    }
}
