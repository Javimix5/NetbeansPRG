/*
 * Crea una clase Coche que represente coches. Ha de tener los siguientes atributos y
métodos:
● Atributos: marca, modelo, color, número de puertas, potencia, tipo combustible. Serán
todos private.
● Métodos:
○ 2 constructores: uno sin argumentos y otro con argumentos que inicialice todos los
atributos.
○ Métodos para asignar valores a los atributos (uno por cada atributo).
○ Métodos para devolver el contenido de los atributos (uno por cada atributo).
○ Un método que muestre en pantalla las características de un coche.
Para probar el funcionamiento de la clase Coche, crea una clase llamada TestCoche que 
contenga un método main donde se creen 2 objetos a partir de la clase Coche. Ha de pedir
por teclado los datos necesarios para cada uno de ellos. Uno de los objetos se creará 
usando el constructor que recibe los valores de todos los atributos; el otro objeto se creará 
usando el constructor sin argumentos (los valores para sus atributos se asignarán con los 
métodos específicos).
Finalmente, se han de mostrar en pantalla las características de los 2 coches.
 */
package tema6amplia;

/**
 *
 * @author javier.gonzalezprado
 */
public class Coche {

    private String marca = "Nissan";
    private String modelo = "GTR 2024";
    private String color = "Azul y blanco";
    private int numPuertas = 3;
    private int potencia = 565;
    private String combustible = "Gasolina";

    public Coche() {
    }

    public Coche(String marca, String modelo, String color, int numPuertas, int potencia, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numPuertas = numPuertas;
        this.potencia = potencia;
        this.combustible = combustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Coche{" + " marca= " + marca + ", modelo= " + modelo + ", color= " + color + ", numPuertas= " + numPuertas + ", potencia= " + potencia + ", combustible= " + combustible + '}';
    }

}
