package Componentes;

import enums.Material;

public class lengueta {
    private Material Material;


    public lengueta( Material material) {
        this.Material = material;
    }

    public enums.Material getMaterial() {
        return Material;
    }

    public void setMaterial(enums.Material material) {
        Material = material;
    }
}
