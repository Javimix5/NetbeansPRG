package tema6;

public class JgpT6e06JuegoNim {

    public static void main(String[] args) {
        Nim juego = new Nim();
        boolean finJuego = false;

        System.out.println("¡Bienvenido al juego del NIM!");
        Consola.pintarTablero(juego);

        while (!juego.fin()) {
            // Turno de la máquina
            int movimientoMaquina = juego.piensa();
            int filaMaquina = movimientoMaquina / 10;
            int cantMaquina = movimientoMaquina % 10;

            System.out.println("\nTurno de la máquina:");
            System.out.printf("La máquina retira %d palillos de la fila %d.%n", cantMaquina, filaMaquina + 1);
            juego.juega(filaMaquina, cantMaquina);
            Consola.pintarTablero(juego);

            if (juego.fin()) {
                System.out.println("¡La máquina gana!");
                break;
            }

            // Turno del jugador
            boolean jugadaValida = false;
            while (!jugadaValida) {
                System.out.println("\nTu turno:");
                int filaJugador = Consola.leerEntero("Introduce la fila (1, 2, 3, o 4):") - 1;//Añadida una fila 4 para tener una fila de 1 palillo
                int cantJugador = Consola.leerEntero("Introduce la cantidad de palillos a retirar:");

                jugadaValida = juego.juega(filaJugador, cantJugador);

                if (!jugadaValida) {
                    System.out.println("Jugada no válida. Intenta de nuevo.");
                }
            }

            Consola.pintarTablero(juego);

            if (juego.fin()) {
                System.out.println("¡Has ganado!");
                break;
            }
        }
    }
}
