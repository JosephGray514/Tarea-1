package Componentes;

import enums.Color;
import enums.TipoAlmohadilla;

public class Velcro {

    private TipoAlmohadilla tipo;
    private Color color;

    public Velcro(TipoAlmohadilla tipo, Color color) {
        this.tipo = tipo;
        this.color = color;
    }

    public TipoAlmohadilla getTipo() {
        return tipo;
    }

    public void setTipo(TipoAlmohadilla tipoAlmohadilla) {
        this.tipo = tipoAlmohadilla;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
