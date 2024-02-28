

public class Empeine {


    private double ancho;
    private EstiloEmpeine estilo;
    private Color color;

 public Empeine (double ancho,EstiloEmpeine estilo,Color color) {
     this.ancho= ancho;
     this.estilo=estilo;
     this.color=color;
 }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public EstiloEmpeine getEstilo() {
        return estilo;
    }

    public void setEstilo(EstiloEmpeine estilo) {
        this.estilo = estilo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}