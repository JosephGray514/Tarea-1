package Componentes;

import enums.Color;
import enums.TipoAlmohadilla;

public class Velcro {

    private Color color;

    public Velcro(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
