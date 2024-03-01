package Componentes;


import enums.Material;
import enums.Color;

public class Forro {
    private Material Material;
    private Color color;

    public Forro(Color color, Material material) {
        this.color=color;
        this.Material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Material getMaterial() {
        return Material;
    }

    public void setMaterial(Material material) {
        Material = material;
    }
}
