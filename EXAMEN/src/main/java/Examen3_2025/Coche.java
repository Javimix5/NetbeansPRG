package Examen3_2025;

/**
 *
 * @author Javier González Prados
 */
public class Coche extends Juguete {

    private boolean tieneBateria;

    public Coche(String nombre, double precio, boolean tieneBateria) {
        super(nombre, precio);
        this.tieneBateria = tieneBateria;
    }

    
    //Método Acelerar
    public void acelerar() {
        System.out.println("El coche " + getNombre() + " esta acelerando");

    }

    //Metodo Mostrar Tiene Bateria
    public void mostrar() {
        super.mostrar();

        System.out.println("¿Tiene bateria? " + (tieneBateria ? "Si" : "No"));
    }

}//Fin clase
