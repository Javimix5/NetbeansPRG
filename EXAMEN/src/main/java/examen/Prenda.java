/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Random;

/**
 *
 * @author javier.gonzalezprado
 */
public class Prenda {

//Atributos
    private static long stockPrendas = 0;
    private static String tipo;
    private static int referencia;
    private static double precioSinIva;
    private static double iva = 21.0;
    private static double precioConIva;
    private static int talla;
    private char sexo;

//Constantes
    public static final char hombre = 'H';
    public static final char mujer = 'M';
    public static final String falda = "falda";
    public static final String jersey = "jersey";
    public static final String pantalon = "pantalón";

    public Prenda(String tipo, int talla, char sexo, double precioSinIva, double iva) {
        this.setTipo(tipo); // Establece tipo con validación
        this.talla = talla;
        this.sexo = sexo;
        this.precioSinIva = precioSinIva;
        this.iva = iva;
        this.referencia = generarReferencia();
        stockPrendas++; // Incrementa stock
        this.setPrecioConIva(); // Calcula el precio con IVA
    }

    // Constructor alternativo
    public Prenda(String tipo, double precioSinIva) {
        this(tipo, 42, 'H', precioSinIva, 21.0); // Valores predeterminados
    }

    // Método para establecer el tipo con validación
    private void setTipo(String tipo) {
        if (tipo != null && (tipo.equalsIgnoreCase("falda") || tipo.equalsIgnoreCase("pantalon") || tipo.equalsIgnoreCase("jersey"))) {
            this.tipo = tipo.toLowerCase();
        } else {
            this.tipo = null;
        }
    }

    // Generar referencia aleatoria de 5 cifras
    private int generarReferencia() {
        Random random = new Random();
        return 10000 + random.nextInt(90000);
    }

    // Establecer el precio con IVA
    private void setPrecioConIva() {
        this.precioConIva = this.precioSinIva + (this.precioSinIva * this.iva / 100);
    }

    // Método toString para mostrar todos los valores
    @Override
    public String toString() {
        return "Prenda {"
                + "tipo='" + tipo + '\''
                + ", talla=" + talla
                + ", sexo=" + sexo
                + ", precioSinIva=" + precioSinIva
                + ", iva=" + iva
                + ", precioConIva=" + precioConIva
                + ", referencia=" + referencia
                + ", stockPrendas=" + stockPrendas
                + '}';
    }
}
