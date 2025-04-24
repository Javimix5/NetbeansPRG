/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author fernando.pargafernan
 */
class Juego {
    public static String determinarResultado(Respuesta jugador, Respuesta cpu) {
        if (jugador.getClass() == cpu.getClass()) {
            return "Empate. Ambos eligieron " + jugador.getNombre();
        } else if (jugador.ganaA(cpu)) {
            return jugador.getNombre() + " gana a " + cpu.getNombre() + ". ¡Has ganado!";
        } else {
            return cpu.getNombre() + " gana a " + jugador.getNombre() + ". Has perdido.";
        }
    }
}
