package Componentes;

import enums.Material;
import enums.Tipo;

public class Almohadilla {
    private Tipo tipo;
    private Material material;

    public Almohadilla(Tipo tipo, Material material) {
        this.tipo = tipo;
        this.material = material;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}

