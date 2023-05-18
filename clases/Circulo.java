package clases;

public class Circulo extends Figura
{
    private double radio;
    public Circulo(double radio){
        this.radio= radio;
    }
    public void calcularAreaPerimetro(double radio){
        this.area = Math.PI*Math.pow(radio, 2);
        this.perimetro = 2*Math.PI*radio;
    }
    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }


    
}
