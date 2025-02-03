/*Realiza un programa que permita al usuario seleccionar un tipo de figura (Triangulo o
Rectangulo), luego llame al constructor adecuado solicitando al usuario los parámetros necesarios,
dependiendo del tipo de figura.
• Después de crear la figura, mostrará las dimensiones de la misma (sea cual sea su tipo).
• Finalmente, y utilizando el operador instanceof, mostrará unos datos adicionales
dependiendo del tipo de figura que sea:
o Si es de tipo Triangulo, mostrará el área.
o Si es de tipo Rectangulo, mostrará si es de forma cuadrada o no.
• Usar una única variable para almacenar la figura, sea del tipo que sea. 
 */
package tema9;

/**
 *
 * @author Javier González Prados
 */
public class Figura {

    public int base;
    public int altura;

    public Figura(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Figura(int dimension) {
        this.base = dimension;
        this.altura = dimension;

    }

    
    public void verDimension() {
        System.out.println("");
        System.out.println("Altura: " + this.altura);        
        System.out.println("Base: " + this.base);
        
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double dameArea() {
        return (altura * base) / 2;
    }
}
