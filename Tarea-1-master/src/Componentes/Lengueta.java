package Componentes;

import enums.Color;
import enums.Material;

public class Lengueta {
    private Material Material;

    private Color color;

    public Lengueta(enums.Material material, Color color) {
        Material = material;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public enums.Material getMaterial() {
        return Material;
    }

    public void setMaterial(enums.Material material) {
        Material = material;
    }
}
