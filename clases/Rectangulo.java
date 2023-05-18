package clases;

public class Rectangulo extends Figura
 {
  
    private double base;
    private double altura;
    public Rectangulo(double base,double altura){
        this.base= base;
        this.altura= altura;
    }
    public void calcularAreaPerimetro(double base,double altura){
        this.area = base * altura;
        this.perimetro = 2*base + 2*altura;
        

    }
    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
}
