package ejecutable;

import javax.swing.JOptionPane;

import clases.Circulo;
import clases.Figura;
import clases.Rectangulo;

public class Test{
    public static void main(String[] args)
    {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la Base del rectangulo : "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la Altura del rectangulo: "));
        Rectangulo miRectangulo= new Rectangulo(base, altura);
        miRectangulo.calcularAreaPerimetro(base, altura);
        JOptionPane.showMessageDialog( null, "El Area de el rectangulo es: " +miRectangulo.getArea()+"\n El perimetro de el rectangulo es: "+ miRectangulo.getPerimetro());
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo: "));
        Circulo miCirculo = new Circulo(radio); 
        miCirculo.calcularAreaPerimetro(radio);
        JOptionPane.showMessageDialog(null, "El Area es: "+ miCirculo.getArea()+"El Perimetro es:"+ miCirculo.getPerimetro());
    }


}