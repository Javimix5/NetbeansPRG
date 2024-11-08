/*
 * 4.13. Realizar un programa al que se le introduzca un número decimal y lo convierta a 
 * un String con su representación hexadecimal. Hay que hacerlo codificando el proceso sin usar las 
 * clases de Java y luego compararlo con el resultado ofrecido por las clases de Java para convertir de 
 * decimal a hexadecimal. 
 * Para convertir a hexadecimal hay que hacer divisiones sucesivas entre 16 de los cocientes 
 * obtenidos hasta que el cociente sea cero. El número será la concatenación de restos, 
 * convirtiendo los mayores de 9 a la letra correspondiente: 10-> A, 11->B…15->F   
 */
package tema4;

import java.util.Scanner;

public class JgpT04E13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        int decimal = teclado.nextInt();

        // Conversión manual de decimal a hexadecimal
        String hexManual = convertirDecimalAHexadecimal(decimal);
        System.out.println("Hexadecimal (manual): " + hexManual);

        // Conversión usando la clase Integer para comparar resultados
        String hexJava = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal (usando Integer.toHexString): " + hexJava);

        // Comparación de resultados
        if (hexManual.equals(hexJava)) {
            System.out.println("Ambas conversiones coinciden.");
        } else {
            System.out.println("Las conversiones no coinciden.");
        }
    }

    private static String convertirDecimalAHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        StringBuilder hexString = new StringBuilder();

        // Tabla de caracteres hexadecimales para los valores 10-15
        char[] hexChars = {'A', 'B', 'C', 'D', 'E', 'F'};

        while (decimal > 0) {
            int resto = decimal % 16;
            decimal /= 16;

            // Si el resto es mayor o igual a 10, usa el carácter correspondiente (A-F)
            if (resto >= 10) {
                hexString.insert(0, hexChars[resto - 10]);
            } else {
                // Si el resto es menor a 10, añade el número directamente
                hexString.insert(0, resto);
            }
        }
        return hexString.toString();
    }
}
//Función principal:
//Pide al usuario un número decimal como entrada.
//Llama al método convertirDecimalAHexadecimal para realizar la conversión manual a hexadecimal.
//Usa Integer.toHexString(decimal).toUpperCase() para convertir el número con las herramientas de Java y compara ambos resultados.

//Método convertirDecimalAHexadecimal:
//Realiza divisiones sucesivas entre 16, guardando el resto de cada división.
//Para restos de 10 a 15, convierte estos valores en caracteres hexadecimales (A-F) usando una tabla (hexChars).
//Añade cada resto (ya convertido en carácter hexadecimal si corresponde) al inicio del StringBuilder para formar el número hexadecimal en el orden correcto.

//Comparación:
//Al final, el programa verifica si el resultado manual coincide con el de Integer.toHexString y muestra el resultado de la comparación.