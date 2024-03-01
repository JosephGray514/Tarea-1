package Componentes;

import enums.Material;
import enums.TipoAlmohadilla;

public class Almohadilla {
    private TipoAlmohadilla tipoAlmohadilla;
    private Material material;

    public Almohadilla(TipoAlmohadilla tipoAlmohadilla, Material material) {
        this.tipoAlmohadilla = tipoAlmohadilla;
        this.material = material;
    }

    public TipoAlmohadilla getTipo() {
        return tipoAlmohadilla;
    }

    public void setTipoAlmohadilla(TipoAlmohadilla tipoAlmohadilla) {
        this.tipoAlmohadilla = tipoAlmohadilla;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}

