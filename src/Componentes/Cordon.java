package Componentes;

import enums.Color;
import enums.TipoAlmohadilla;
import enums.TipoCordon;

public class Cordon {

    private TipoCordon tipoCordon;
    private Color color;

    public Cordon(TipoCordon tipoCordon, Color color) {
        this.tipoCordon = tipoCordon;
        this.color = color;
    }

    public TipoCordon getTipoCordon() {
        return tipoCordon;
    }

    public void setTipoCordon(TipoCordon tipoCordon) {
        this.tipoCordon = tipoCordon;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
