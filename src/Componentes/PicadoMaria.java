package Componentes;

public class PicadoMaria {
    private String tipoPicado;
    private double densidadDePicado;

    public PicadoMaria (String tipoPicado,double densidadDePicado){
    this.tipoPicado = tipoPicado;
    this.densidadDePicado= densidadDePicado;
}
    public String getTipoPicado() {
        return tipoPicado;
    }

    public void setTipoPicado(String tipoPicado) {
        this.tipoPicado = tipoPicado;
    }

    public double getDensidadDePicado() {
        return densidadDePicado;
    }

    public void setDensidadDePicado(double densidadDePicado) {
        this.densidadDePicado = densidadDePicado;
    }

}