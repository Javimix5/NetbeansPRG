package juegopkmn;


public class Ataque {
    enum Tipo { DANIO_GRANDE, DANIO_SEGURO, BLOQUEO, CURACION }
    Tipo tipo;
    String nombre;
    int usos;

    public Ataque(Tipo tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.usos = 0;
    }

    public int ejecutar(Personaje atacante, Personaje defensor, boolean puedeBloquear) {
        switch (tipo) {
            case DANIO_GRANDE:
                if (Math.random() < 0.3) {
                    defensor.salud -= 200;
                    return 200;
                }
                return 0;
            case DANIO_SEGURO:
                defensor.salud -= 60;
                return 60;
            case BLOQUEO:
                if (usos < 2 && puedeBloquear) {
                    usos++;
                    defensor.bloqueado = true;
                }
                return 0;
            case CURACION:
                atacante.salud = Math.min(400, atacante.salud + 40);
                return -40;
        }
        return 0;
    }
}
