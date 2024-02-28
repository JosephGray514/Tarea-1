package builder;

import Componentes.Almohadilla;
import Componentes.Cordon;
import Componentes.Tacon;
import Componentes.Velcro;
import  Class.*;
import enums.Color;
import enums.TipoAlmohadilla;
import enums.TipoCordon;

public class CalzadoBuilder implements Builder{
     private TipoCordon tipoCordon;
    private Almohadilla almohadilla;
    private Cordon cordon;
    private Tacon tacon;
    private Velcro velcro;
    private Color color;

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
    public Calzado getCalsado() {
        return new Calzado(this.cordon, this.tacon, this.almohadilla, this.velcro,this.color, this.tipoCordon);
    }
}
