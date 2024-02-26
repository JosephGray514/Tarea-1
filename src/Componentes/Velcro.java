package Componentes;

import enums.Color;
import enums.Tipo;

public class Velcro {

    private Tipo tipo;
    private Color color;

    public Velcro(Tipo tipo, Color color) {
        this.tipo = tipo;
        this.color = color;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
