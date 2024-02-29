package builder;


import Componentes.*;
import  Class.*;
import enums.Color;
import enums.Suela;
import enums.TipoCordon;
import enums.EstiloEmpeine;

public class CalzadoBuilder implements Builder{

    private TipoCordon tipoCordon;

    private Almohadilla almohadilla;
    private Cordon cordon;
    private Tacon tacon;
    private Velcro velcro;
    private Color color;
    private Lengueta lengueta;
    private Forro forro;

    private Suela suela;
    private Empeine empeine;
    private PicadoMaria picadoMaria;


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
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setForro(Forro forro) {
        this.forro=forro;
    }

    @Override
    public void setlengueta(Lengueta lengueta) {
    this.lengueta=lengueta;
    }

    @Override
    public void setSuela(Suela suela) {
        this.suela=suela;
    }
    public void setEmpeine(Empeine empeine) {
        this.empeine=empeine;
    }
    public void setPicadoMaria(PicadoMaria picadoMaria) {
        this.picadoMaria=picadoMaria;
    }


    @Override
    public Calzado getCalsado() {
        return new Calzado(this.cordon, this.tacon, this.almohadilla, this.velcro, this.color, this.forro, this.lengueta, this.suela);
    }




}
