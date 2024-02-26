package Componentes;

import enums.Material;

public class Tacon {
    private int Altura;
    private Material material;

    public Tacon(int altura, Material material) {
        Altura = altura;
        this.material = material;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int altura) {
        Altura = altura;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
