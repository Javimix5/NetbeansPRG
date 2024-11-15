/*
5.3. Escribe una función, numerosArmstrong(), que tiene como parámetros dos números enteros,
uno de límite inferior y otro superior. La función no devuelve nada.
La función numerosArmstrong() escribe por pantalla los números Armstrong comprendidos entre el
límite inferior y el superior. Un número Armstrong es aquel que la suma de cada una de sus dígitos
elevada a la potencia de la cantidad de sus dígitos es igual al número.
Ejemplo:
4 = 41
153 = 13
 + 53
 + 33
 (elevamos a 3 porque tiene 3 dígitos)
8208 = 84
 + 24
 + 04
 + 84
 (elevamos a 4 porque tiene 4 dígitos)

 */
package tema5repaso;

import java.util.Scanner;

public class JgpT05r03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        do{
        System.out.println("Introduce el numero Inferior: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el numero Superior: ");
        num2 = teclado.nextInt();

        if (num1>=num2){
            System.out.println("El pirmer numero debe de ser mayor al segundo");
        }
        }while (num1 >= num2);
  
        System.out.println("Los numeros Amstrong son los siguientes: ");
        numerosArmstrong(num1, num2);
    }

    public static void numerosArmstrong(int num1, int num2) {
        // Recorrer los números en el rango dado
        for (int i = num1; i <= num2; i++) {
            if (esNumeroArmstrong(i)) {
                System.out.println(i); // Mostrar el número Armstrong encontrado
            }
        }
    }

    private static boolean esNumeroArmstrong(int numero) {
        int suma = 0;
        int temp = numero;
        int digitos = contarDigitos(numero);

        // Calcular la suma de los dígitos elevados a la potencia del número de dígitos
        while (temp > 0) {
            // Convertir el carácter a un número entero restando el valor ASCII de '0'
            int digito = temp % 10;
            suma += Math.pow(digito, digitos);
            temp /= 10;
        }

        // Comprobar si la suma es igual al número original
        return suma == numero;
    }

    private static int contarDigitos(int numero) {
        int contador = 0;
        while (numero > 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }
}
