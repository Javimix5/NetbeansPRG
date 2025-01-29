package tema8ampliado;

/**
 *
 * @author Javier González Prados
 */
public class Circulo {

    private double radio;
    private String color;

    // Constructor predeterminado
    public Circulo() {
        this.radio = 1.0;
        this.color = "rojo";
    }

    // Constructor con parámetro de radio
    public Circulo(double radio) {
        if (radio <= 0) {
            System.out.println("El radio debe ser un valor positivo");
        }
        this.radio = radio;
        this.color = "rojo";
    }

    // Método getRadio
    public double getRadio() {
        return this.radio;
    }

    // Método getArea
    public double getArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
}
