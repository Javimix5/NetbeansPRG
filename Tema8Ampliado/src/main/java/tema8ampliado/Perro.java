package tema8ampliado;

/**
 *
 * @author Javier González Prados
 */
public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    public void sonido() {
        System.out.println("Guau");
    }

    public void sonido(Perro perro) {
        System.out.println("Guau guau guauuuuuuu");
    }

}//Fin clase
