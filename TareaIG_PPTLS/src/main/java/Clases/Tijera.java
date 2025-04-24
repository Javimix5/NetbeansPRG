/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author fernando.pargafernan
 */
public class Tijera extends Respuesta {
    public Tijera() {
        super("Tijera");
    }

    @Override
    public boolean ganaA(Respuesta otra) {
        return otra instanceof Papel || otra instanceof Lagarto;
    }
}
