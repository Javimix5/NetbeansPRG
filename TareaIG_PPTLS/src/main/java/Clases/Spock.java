/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author fernando.pargafernan
 */
public class Spock extends Respuesta {
    public Spock() {
        super("Spock");
    }

    @Override
    public boolean ganaA(Respuesta otra) {
        return otra instanceof Tijera || otra instanceof Piedra;
    }
}
