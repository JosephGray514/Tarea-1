package Componentes;

import enums.Material;
import enums.MaterialTacon;

public class Tacon {
    private int Altura;
    private MaterialTacon materialTacon;

    public Tacon(int altura, MaterialTacon materialTacon) {
        Altura = altura;
        this.materialTacon = materialTacon;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int altura) {
        Altura = altura;
    }

    public MaterialTacon getMaterialTacon() {
        return materialTacon;
    }

    public void setMaterialTacon(MaterialTacon materialTacon) {
        this.materialTacon = materialTacon;
    }
}
