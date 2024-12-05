/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package formas;

/**
 *
 * @author javier.gonzalezprado
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CirculoEnPantalla extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Establece el centro y el radio del círculo
        int x = 100;
        int y = 100;
        int radio = 50;

        // Dibuja el círculo
        g2d.drawOval(x - radio, y - radio, radio * 2, radio * 2);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Círculo");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(new CirculoEnPantalla());
        ventana.setSize(300, 300);
        ventana.setVisible(true);
    }
}