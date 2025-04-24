package juegopkmn;

import javax.swing.*;
import java.awt.*;

public class JuegoGUI extends JFrame {

    private Jugador jugador1, jugador2;
    private final JLabel salud1, salud2;
    private final JButton[] ataqueButtons = new JButton[4];
    private final JButton cambiarButton;
    private final JTextArea consola;
    private int turno = 1;
    private int ataqueSeleccionado = -1;

    public JuegoGUI() {
        setTitle("Batalla por Turnos");
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        consola = new JTextArea(10, 50);
        consola.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(consola);

        JPanel saludPanel = new JPanel(new GridLayout(2, 1));
        salud1 = new JLabel();
        salud2 = new JLabel();
        saludPanel.add(salud1);
        saludPanel.add(salud2);

        JPanel ataquePanel = new JPanel(new GridLayout(2, 2));
        for (int i = 0; i < 4; i++) {
            ataqueButtons[i] = new JButton();
            int finalI = i;
            ataqueButtons[i].addActionListener(e -> seleccionarAtaque(finalI));
            ataquePanel.add(ataqueButtons[i]);
        }

        cambiarButton = new JButton("Cambiar Personaje");
        cambiarButton.addActionListener(e -> cambiarPersonaje());

        add(scrollPane, BorderLayout.NORTH);
        add(saludPanel, BorderLayout.WEST);
        add(ataquePanel, BorderLayout.CENTER);
        add(cambiarButton, BorderLayout.SOUTH);

        inicializarJuego();
        actualizarInterfaz();
    }

    private void inicializarJuego() {
        Ataque[] ataques = new Ataque[]{
            new Ataque(Ataque.Tipo.DANIO_GRANDE, "Ataque Fuerte"),
            new Ataque(Ataque.Tipo.DANIO_SEGURO, "Ataque Seguro"),
            new Ataque(Ataque.Tipo.BLOQUEO, "Bloqueo"),
            new Ataque(Ataque.Tipo.CURACION, "Curación")
        };

        Personaje[] personajes1 = {
            new Personaje("Guerrero", 10, clonarAtaques(ataques)),
            new Personaje("Mago", 20, clonarAtaques(ataques)),
            new Personaje("Tanque", 5, clonarAtaques(ataques))
        };

        Personaje[] personajes2 = {
            new Personaje("Ninja", 25, clonarAtaques(ataques)),
            new Personaje("Arquero", 15, clonarAtaques(ataques)),
            new Personaje("Bestia", 8, clonarAtaques(ataques))
        };

        jugador1 = new Jugador("Jugador 1", personajes1);
        jugador2 = new Jugador("Jugador 2", personajes2);
    }

    private Ataque[] clonarAtaques(Ataque[] base) {
        Ataque[] nuevos = new Ataque[base.length];
        for (int i = 0; i < base.length; i++) {
            nuevos[i] = new Ataque(base[i].tipo, base[i].nombre);
        }
        return nuevos;
    }

    private void seleccionarAtaque(int index) {
        ataqueSeleccionado = index;
        ejecutarTurno();
    }

    private void ejecutarTurno() {
        Jugador atacante = turno == 1 ? jugador1 : jugador2;
        Jugador defensor = turno == 1 ? jugador2 : jugador1;
        Personaje pa = atacante.getActual();
        Personaje pd = defensor.getActual();
        Ataque ataque = pa.ataques[ataqueSeleccionado];
        ataqueSeleccionado = -1;

        int resultado = ataque.ejecutar(pa, pd, !pd.bloqueado);
        String mensaje = atacante.nombre + " usó " + ataque.nombre + " con " + pa.nombre + ". ";

        if (ataque.tipo == Ataque.Tipo.DANIO_GRANDE) {
            mensaje += (resultado > 0) ? "¡Golpe crítico!" : "¡Falló!";
        } else if (ataque.tipo == Ataque.Tipo.DANIO_SEGURO) {
            mensaje += "Ataque seguro acertado.";
        } else if (ataque.tipo == Ataque.Tipo.BLOQUEO) {
            mensaje += (resultado > 0) ? "¡Bloqueo preparado!" : "¡El bloqueo falló o ya no puede usarse!";
        } else if (ataque.tipo == Ataque.Tipo.CURACION) {
            mensaje += "Se curó 40 puntos.";
        }

        consola.append(mensaje + "\\n");

        pd.bloqueado = false;

        if (!defensor.getActual().estaVivo()) {
            consola.append(defensor.nombre + " perdió a " + pd.nombre + ". Debe cambiar de personaje.\\n");
            if (!defensor.tienePersonajesVivos()) {
                consola.append("¡" + atacante.nombre + " gana el duelo!\\n");
                deshabilitarBotones();
                return;
            } else {
                cambioForzado(defensor);
            }
        }

        turno = (turno == 1) ? 2 : 1;
        actualizarInterfaz();
    }

    private void cambioForzado(Jugador jugador) {
        for (int i = 0; i < jugador.personajes.length; i++) {
            if (jugador.personajes[i].estaVivo()) {
                jugador.actual = i;
                consola.append(jugador.nombre + " cambia automáticamente a " + jugador.getActual().nombre + ".\\n");
                break;
            }
        }
    }

    private void cambiarPersonaje() {
        Jugador actual = turno == 1 ? jugador1 : jugador2;
        String opciones = "0: " + actual.personajes[0].nombre + "\\n1: " + actual.personajes[1].nombre + "\\n2: " + actual.personajes[2].nombre;
        String input = JOptionPane.showInputDialog(this, "¿A qué personaje cambiar?\\n" + opciones);
        try {
            int nuevo = Integer.parseInt(input);
            if (nuevo != actual.actual && actual.personajes[nuevo].estaVivo()) {
                actual.actual = nuevo;
                consola.append(actual.nombre + " cambió a " + actual.getActual().nombre + ".\\n");
                turno = (turno == 1) ? 2 : 1;
                actualizarInterfaz();
            }
        } catch (NumberFormatException e) {
            consola.append("Cambio cancelado.\\n");
        }
    }

    private void actualizarInterfaz() {
        salud1.setText("Jugador 1 - " + jugador1.getActual().nombre + ": " + jugador1.getActual().salud + " HP");
        salud2.setText("Jugador 2 - " + jugador2.getActual().nombre + ": " + jugador2.getActual().salud + " HP");

        Personaje actual = (turno == 1 ? jugador1 : jugador2).getActual();
        for (int i = 0; i < 4; i++) {
            ataqueButtons[i].setText(actual.ataques[i].nombre);
            ataqueButtons[i].setEnabled(true);
        }
        cambiarButton.setEnabled(true);
    }

    private void deshabilitarBotones() {
        for (JButton b : ataqueButtons) b.setEnabled(false);
        cambiarButton.setEnabled(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JuegoGUI gui = new JuegoGUI();
            gui.setVisible(true);
        });
    }
}
