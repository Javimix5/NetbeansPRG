/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author CASA
 */
public class Frase {
    // Atributo privado
    private String cadena;

    // Constructor
    public Frase(String cadena) {
        this.cadena = cadena;
    }

    // Obtener la frase original
    public String obtenerFrase() {
        return cadena;
    }

    // Eliminar espacios en blanco al principio y al final
    public void eliminarBlancos() {
        cadena = cadena.trim();
    }

    // Contar letras (sin espacios ni puntuación)
    public int contarLetras() {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isLetter(c)) {
                contador++;
            }
        }
        return contador;
    }

    // Invertir la frase
    public String invertirFrase() {
        StringBuilder invertida = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida.append(cadena.charAt(i));
        }
        return invertida.toString();
    }

    // Contar palabras en la frase
    public int contarPalabras() {
        int contador = 0;
        boolean enPalabra = false;

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isWhitespace(cadena.charAt(i))) {
                if (enPalabra) {
                    enPalabra = false;
                }
            } else {
                if (!enPalabra) {
                    enPalabra = true;
                    contador++;
                }
            }
        }
        return contador;
    }

    // Mostrar palabras de la frase, separadas por salto de línea
    public String separarPalabras() {
        StringBuilder palabrasSeparadas = new StringBuilder();
        StringBuilder palabraActual = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            if (Character.isWhitespace(c)) {
                if (palabraActual.length() > 0) {
                    palabrasSeparadas.append(palabraActual).append("\n");
                    palabraActual.setLength(0); // Vaciar el acumulador
                }
            } else {
                palabraActual.append(c);
            }
        }

        if (palabraActual.length() > 0) {
            palabrasSeparadas.append(palabraActual);
        }

        return palabrasSeparadas.toString();
    }

    // Encontrar la posición de la primera vocal
    public int primeraVocal() {
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < cadena.length(); i++) {
            if (vocales.indexOf(cadena.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; // No hay vocales
    }

    // Encontrar la posición de la última vocal
    public int ultimaVocal() {
        String vocales = "aeiouAEIOU";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            if (vocales.indexOf(cadena.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; // No hay vocales
    }

    // Comprobar si la primera letra es mayúscula
    public boolean comprobarMayuscula() {
        return !cadena.isEmpty() && Character.isUpperCase(cadena.charAt(0));
    }

    // Convertir a mayúsculas
    public String convertirMayuscula() {
        return cadena.toUpperCase();
    }

    // Convertir a minúsculas
    public String convertirMinuscula() {
        return cadena.toLowerCase();
    }

    // Vectorizar la cadena (mostrar cada carácter separado)
    public String vectorizar() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            resultado.append(cadena.charAt(i)).append(" ");
        }
        return resultado.toString().trim(); // Elimina el último espacio extra
    }
}
