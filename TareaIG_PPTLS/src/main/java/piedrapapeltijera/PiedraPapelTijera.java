/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package piedrapapeltijera;

import Clases.InterfazJuego;
import javax.swing.SwingUtilities;

/**
 *
 * @author fernando.pargafernan
 */
public class PiedraPapelTijera {

    public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
            InterfazJuego juego = new InterfazJuego();
            juego.setVisible(true);
        });
    }
}
