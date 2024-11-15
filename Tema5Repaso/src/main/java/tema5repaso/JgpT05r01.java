/*
5.1. Escribe una función en Java, calcularCoste(), con parámetros de entrada el peso y distancia del
servicio de mensajería. Ambos parámetros son decimales. El valor devuelto por la función también
será con decimales. La función dará por válidos los datos pasados, la validación de los datos se
hará antes de la llamada a la función.
El coste basado en el peso debe calcularse según los siguientes criterios:
- Cuando el peso del paquete es inferior o igual a 5 kilogramos, el cargo de mensajería será de 6 €
- Cuando el peso del paquete supera los 5 kilogramos, hay un cargo adicional de 1'2 € por cada
kilogramo adicional desde los 5 kilogramos
El coste basado en la distancia debe calcularse según las siguientes tarifas:
- Cuando la distancia es menor o igual a 6 kilómetros, el cargo de mensajería será de 4'2 €
- Cuando la distancia es superior a 6 kilómetros, hay un cargo adicional de 1'4 € por cada kilómetro
adicional

 */
package tema5repaso;

import java.util.Scanner;

public class JgpT05r01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double peso, distancia;

        System.out.println("Introduce el peso del articulo: ");
        peso = teclado.nextDouble();
        System.out.println("Introduce la distancia a recorrer del envio: ");
        distancia = teclado.nextDouble();

        double precio = calcularCoste(peso, distancia);

        System.out.println("El coste del envio sera de: " + String.format("%.2f", precio) + " euros");

    }

    public static double calcularCoste(double peso, double distancia) {
        double costePeso = 6;
        double costeKM = 4.2;

        if (peso <= 5) {
            costePeso = 6;
        } else {
            for (int i = 6; i <= peso; i++) {
                costePeso += 1.2;

            }
        }
        if (distancia <= 6) {
            costeKM = 4.2;
        } else {
            for (int j = 7; j <= distancia; j++) {
                costeKM += 1.4;
            }

        }
        return costePeso + costeKM;
    }

}
