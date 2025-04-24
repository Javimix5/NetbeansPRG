package juegopkmn;


public class Personaje {
    String nombre;
    int salud = 400;
    int velocidad;
    Ataque[] ataques;
    boolean bloqueado = false;

    public Personaje(String nombre, int velocidad, Ataque[] ataques) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.ataques = ataques;
    }

    public boolean estaVivo() {
        return salud > 0;
    }
}
