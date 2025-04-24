/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jgp.juegopkmn_2;

/**
 *
 * @author Javier González Prados
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;


class Ataque {
    String nombre;
    int dano;
    double probabilidad;
    boolean esBloqueo;
    boolean esCuracion;

    public Ataque(String nombre, int dano, double probabilidad, boolean esBloqueo, boolean esCuracion) {
        this.nombre = nombre;
        this.dano = dano;
        this.probabilidad = probabilidad;
        this.esBloqueo = esBloqueo;
        this.esCuracion = esCuracion;
    }

    public boolean acierta() {
        return Math.random() <= probabilidad;
    }
}

class Personaje {
    String nombre;
    int salud = 400;
    int velocidad;
    Ataque[] ataques;
    int usosBloqueoConsecutivos = 0;

    public Personaje(String nombre, int velocidad, Ataque[] ataques) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.ataques = ataques;
    }

    public boolean puedeBloquear() {
        return usosBloqueoConsecutivos < 2;
    }

    public void usarBloqueo() {
        usosBloqueoConsecutivos++;
    }

    public void resetearBloqueo() {
        usosBloqueoConsecutivos = 0;
    }

    public void recibirDano(int cantidad) {
        salud -= cantidad;
        if (salud < 0) salud = 0;
    }

    public void curar(int cantidad) {
        salud += cantidad;
        if (salud > 400) salud = 400;
    }
}

class Jugador {
    String nombre;
    Personaje[] personajes;
    int personajeActual = 0;

    public Jugador(String nombre, Personaje[] personajes) {
        this.nombre = nombre;
        this.personajes = personajes;
    }

    public Personaje getPersonajeActual() {
        return personajes[personajeActual];
    }

    public boolean cambiarPersonaje() {
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i].salud > 0 && i != personajeActual) {
                personajeActual = i;
                return true;
            }
        }
        return false;
    }

    public boolean haPerdido() {
        for (Personaje p : personajes) {
            if (p.salud > 0) return false;
        }
        return true;
    }
}

public class JuegoGUI extends JFrame {
    Jugador jugador1, jugador2;
    JComboBox<String> ataqueBox1, ataqueBox2;
    JTextArea log;
    JLabel salud1, salud2;
    JButton botonAtacar;

    public JuegoGUI() {
        setTitle("Duelo de Personajes");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        Ataque[] ataques1 = new Ataque[]{
            new Ataque("Golpe Fuerte", 200, 0.3, false, false),
            new Ataque("Golpe Seguro", 60, 1.0, false, false),
            new Ataque("Bloqueo", 0, 1.0, true, false),
            new Ataque("Curar", -40, 1.0, false, true)
        };

        Ataque[] ataques2 = new Ataque[]{
            new Ataque("Rayo Potente", 200, 0.3, false, false),
            new Ataque("Rayo Constante", 60, 1.0, false, false),
            new Ataque("Escudo", 0, 1.0, true, false),
            new Ataque("Sanar", -40, 1.0, false, true)
        };

        jugador1 = new Jugador("Jugador 1", new Personaje[]{
            new Personaje("Heroe1", 50, ataques1),
            new Personaje("Heroe2", 30, ataques1),
            new Personaje("Heroe3", 70, ataques1)});

        jugador2 = new Jugador("Jugador 2", new Personaje[]{
            new Personaje("Villano1", 60, ataques2),
            new Personaje("Villano2", 40, ataques2),
            new Personaje("Villano3", 80, ataques2)});

        JPanel panelTop = new JPanel();
        ataqueBox1 = new JComboBox<>(getNombresAtaques(jugador1));
        ataqueBox2 = new JComboBox<>(getNombresAtaques(jugador2));
        panelTop.add(new JLabel("Jugador 1"));
        panelTop.add(ataqueBox1);
        panelTop.add(new JLabel("Jugador 2"));
        panelTop.add(ataqueBox2);

        botonAtacar = new JButton("Atacar");
        botonAtacar.addActionListener(e -> realizarTurno());
        panelTop.add(botonAtacar);

        add(panelTop, BorderLayout.NORTH);

        log = new JTextArea();
        log.setEditable(false);
        add(new JScrollPane(log), BorderLayout.CENTER);

        JPanel panelBottom = new JPanel();
        salud1 = new JLabel("Salud Jugador 1: 400");
        salud2 = new JLabel("Salud Jugador 2: 400");
        panelBottom.add(salud1);
        panelBottom.add(salud2);
        add(panelBottom, BorderLayout.SOUTH);

        setVisible(true);
    }

    private String[] getNombresAtaques(Jugador j) {
        return Arrays.stream(j.getPersonajeActual().ataques).map(a -> a.nombre).toArray(String[]::new);
    }

    private void realizarTurno() {
        Personaje p1 = jugador1.getPersonajeActual();
        Personaje p2 = jugador2.getPersonajeActual();

        Ataque a1 = p1.ataques[ataqueBox1.getSelectedIndex()];
        Ataque a2 = p2.ataques[ataqueBox2.getSelectedIndex()];

        List<String> resultados = new ArrayList<>();

        // Orden por velocidad
        if (p1.velocidad >= p2.velocidad) {
            ejecutarAtaque(jugador1, jugador2, a1, resultados);
            if (jugador2.haPerdido()) terminarJuego(jugador1);
            ejecutarAtaque(jugador2, jugador1, a2, resultados);
            if (jugador1.haPerdido()) terminarJuego(jugador2);
        } else {
            ejecutarAtaque(jugador2, jugador1, a2, resultados);
            if (jugador1.haPerdido()) terminarJuego(jugador2);
            ejecutarAtaque(jugador1, jugador2, a1, resultados);
            if (jugador2.haPerdido()) terminarJuego(jugador1);
        }

        actualizarSalud();
        log.setText(String.join("\n", resultados));
    }

    private void ejecutarAtaque(Jugador atacante, Jugador defensor, Ataque ataque, List<String> log) {
        Personaje pAtacante = atacante.getPersonajeActual();
        Personaje pDefensor = defensor.getPersonajeActual();

        if (ataque.esCuracion) {
            pAtacante.curar(-ataque.dano);
            log.add(atacante.nombre + " se curó +40 HP con " + ataque.nombre);
            pAtacante.resetearBloqueo();
        } else if (ataque.esBloqueo) {
            if (pAtacante.puedeBloquear()) {
                log.add(atacante.nombre + " se prepara para bloquear con " + ataque.nombre);
                pAtacante.usarBloqueo();
            } else {
                log.add(atacante.nombre + " falló su bloqueo por usarlo demasiadas veces!");
                pAtacante.resetearBloqueo();
            }
        } else {
            if (ataque.acierta()) {
                if (pDefensor.ataques[ataqueBox2.getSelectedIndex()].esBloqueo && pDefensor.puedeBloquear()) {
                    log.add(defensor.nombre + " bloqueó el ataque de " + atacante.nombre);
                } else {
                    pDefensor.recibirDano(ataque.dano);
                    log.add(atacante.nombre + " acertó con " + ataque.nombre + " e hizo " + ataque.dano + " de daño!");
                }
            } else {
                log.add(atacante.nombre + " falló su ataque " + ataque.nombre);
            }
            pAtacante.resetearBloqueo();
        }
    }

    private void actualizarSalud() {
        salud1.setText("Salud Jugador 1: " + jugador1.getPersonajeActual().salud);
        salud2.setText("Salud Jugador 2: " + jugador2.getPersonajeActual().salud);
    }

    private void terminarJuego(Jugador ganador) {
        JOptionPane.showMessageDialog(this, ganador.nombre + " ha ganado el duelo!");
        System.exit(0);
    }

    public static void main(String[] args) {
        new JuegoGUI();
    }
}
