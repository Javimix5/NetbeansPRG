package juegopkmn;


public class Jugador {
    String nombre;
    Personaje[] personajes;
    int actual = 0;

    public Jugador(String nombre, Personaje[] personajes) {
        this.nombre = nombre;
        this.personajes = personajes;
    }

    public boolean tienePersonajesVivos() {
        for (Personaje p : personajes)
            if (p.estaVivo()) return true;
        return false;
    }

    public void cambiarPersonaje(int indice) {
        if (indice >= 0 && indice < personajes.length && personajes[indice].estaVivo()) {
            actual = indice;
        }
    }

    public Personaje getActual() {
        return personajes[actual];
    }
}
