/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Clases.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

// Clase principal que representa la interfaz gráfica del juego.
// Hereda de JFrame y contiene todos los componentes visuales y la lógica de interacción.
public class InterfazJuego extends JFrame {

    private JLabel mensaje;
    private JLabel imagenJugador;
    private JLabel imagenCPU;
    private JLabel etiquetaJugador;
    private JLabel etiquetaCPU;
    private JLabel imagenTabla;
    private JPanel panelBotones;
    private JPanel panelImagenes;
    private JPanel panelResultados;
    private Random rand = new Random();

    // Constructor que inicializa toda la interfaz gráfica del juego:
    // Configura la ventana, los paneles de botones, las imágenes de juego, y la estructura de layout
 public InterfazJuego() {
    // Título de la ventana y configuración básica
    setTitle("Piedra, Papel, Tijera, Lagarto, Spock");
    setSize(600, 765);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    // Mensaje principal que se mostrará arriba de todo
    mensaje = new JLabel("Selecciona una opción", SwingConstants.CENTER);
    mensaje.setFont(new Font("Arial", Font.BOLD, 18));
    add(mensaje, BorderLayout.NORTH);

    // Panel que contiene los botones de elección con imágenes
    panelBotones = new JPanel(new FlowLayout());
    String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};

    // Se crea un botón por cada opción, con imagen y acción
    for (String opcion : opciones) {
        JButton boton = new JButton(new ImageIcon("src/imagenes/" + opcion.toLowerCase() + ".png"));
        boton.setToolTipText(opcion); // Ayuda al pasar el cursor
        boton.addActionListener(e -> jugar(opcion)); // Acción al pulsar
        panelBotones.add(boton);
    }
    add(panelBotones, BorderLayout.CENTER); // Se añaden los botones al centro

    // Panel para mostrar las imágenes del jugador y la CPU lado a lado
    panelImagenes = new JPanel();
    panelImagenes.setLayout(new BoxLayout(panelImagenes, BoxLayout.X_AXIS));
    panelImagenes.setAlignmentX(Component.CENTER_ALIGNMENT);

    // Subpanel para mostrar la imagen del jugador con su etiqueta
    JPanel panelJugador = new JPanel();
    panelJugador.setLayout(new BoxLayout(panelJugador, BoxLayout.Y_AXIS));
    imagenJugador = new JLabel();
    etiquetaJugador = new JLabel("Tu elección", SwingConstants.CENTER);
    etiquetaJugador.setAlignmentX(Component.CENTER_ALIGNMENT);
    panelJugador.add(imagenJugador);
    panelJugador.add(etiquetaJugador);

    // Subpanel para mostrar la imagen de la CPU con su etiqueta
    JPanel panelCPU = new JPanel();
    panelCPU.setLayout(new BoxLayout(panelCPU, BoxLayout.Y_AXIS));
    imagenCPU = new JLabel();
    etiquetaCPU = new JLabel("Elección CPU", SwingConstants.CENTER);
    etiquetaCPU.setAlignmentX(Component.CENTER_ALIGNMENT);
    panelCPU.add(imagenCPU);
    panelCPU.add(etiquetaCPU);

    // Se organizan los subpaneles dentro del panel de imágenes
    panelImagenes.add(Box.createHorizontalGlue()); // Espaciado flexible
    panelImagenes.add(panelJugador);
    panelImagenes.add(Box.createRigidArea(new Dimension(40, 0))); // Separación fija
    panelImagenes.add(panelCPU);
    panelImagenes.add(Box.createHorizontalGlue());

    // Panel para mostrar posibles resultados adicionales (actualmente no usado directamente)
    panelResultados = new JPanel();
    panelResultados.setLayout(new BoxLayout(panelResultados, BoxLayout.Y_AXIS));

    // Imagen que muestra la tabla de resultados (quién gana a quién)
    imagenTabla = new JLabel();
    imagenTabla.setIcon(new ImageIcon("src/imagenes/tabla_resultados.png"));

    // Centra la ventana en la pantalla
    setLocationRelativeTo(null);
}


    // Método que controla el flujo del juego paso a paso
// 1. El usuario elige una opción
// 2. Se elimina lo que hay en pantalla
// 3. Se muestran las elecciones del jugador y la CPU
// 4. Se determina quién gana y se muestra el resultado final
    private void jugar(String opcionJugador) {
        // Se borra lo que hay en pantalla (botones de elección)
        remove(panelBotones);
        revalidate();
        repaint();

        Respuesta jugador = crearRespuesta(opcionJugador);
        String opcionCPU = randomOpcion();
        Respuesta cpu = crearRespuesta(opcionCPU);

        // Se indica qué ha elegido el jugador
        mensaje.setText("Has elegido: " + jugador.getNombre());

        // Se espera un segundo y luego se muestran las elecciones de ambos
        Timer paso1 = new Timer(1000, e1 -> {
            imagenJugador.setIcon(new ImageIcon("src/imagenes/" + opcionJugador.toLowerCase() + ".png"));
            imagenCPU.setIcon(new ImageIcon("src/imagenes/" + opcionCPU.toLowerCase() + ".png"));
            add(panelImagenes, BorderLayout.CENTER);
            mensaje.setText("La máquina ha elegido: " + cpu.getNombre());
            revalidate();
            repaint();

            // Después de otro tiempo, se determina quién gana
            Timer paso2 = new Timer(1500, e2 -> {
                String textoGanador;
                if (jugador.getClass() == cpu.getClass()) {
                    textoGanador = "Ambos eligieron " + jugador.getNombre();
                } else if (jugador.ganaA(cpu)) {
                    textoGanador = jugador.getNombre() + " gana a " + cpu.getNombre();
                } else {
                    textoGanador = cpu.getNombre() + " gana a " + jugador.getNombre();
                }
                mensaje.setText(textoGanador);
                add(imagenTabla, BorderLayout.SOUTH);
                revalidate();
                repaint();

                // Finalmente, se muestra el mensaje de resultado (ganaste, perdiste, empate)
                Timer paso3 = new Timer(1500, e3 -> {
                    String resultado;
                    if (jugador.getClass() == cpu.getClass()) {
                        resultado = "¡Empate!";
                    } else if (jugador.ganaA(cpu)) {
                        resultado = "¡Has ganado!";
                    } else {
                        resultado = "Has perdido...";
                    }
                    mensaje.setText("<html><center>" + textoGanador + "<br>" + resultado + "</center></html>");

                    Timer reinicio = new Timer(2500, e4 -> {
                        remove(panelImagenes);
                        remove(imagenTabla);
                        mensaje.setText("Selecciona una opción");
                        add(panelBotones, BorderLayout.CENTER);
                        revalidate();
                        repaint();
                    });
                    reinicio.setRepeats(false);
                    reinicio.start();
                });
                paso3.setRepeats(false);
                paso3.start();
            });
            paso2.setRepeats(false);
            paso2.start();
        });
        paso1.setRepeats(false);
        paso1.start();
    }

    // Método auxiliar que crea una instancia de la clase correspondiente
// según la opción elegida (Piedra, Papel, Tijera, Lagarto o Spock)
    private Respuesta crearRespuesta(String nombre) {
        switch (nombre) {
            case "Piedra":
                return new Piedra();
            case "Papel":
                return new Papel();
            case "Tijera":
                return new Tijera();
            case "Lagarto":
                return new Lagarto();
            case "Spock":
                return new Spock();
            default:
                return null;
        }
    }

    // Método auxiliar que devuelve una opción aleatoria para la CPU
    private String randomOpcion() {
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        return opciones[rand.nextInt(opciones.length)];
    }
}
