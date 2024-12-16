package examenevaluacion;

import java.util.Scanner;

/**Realiza un programa que reciba como entrada un informe que consiste en una cadena de caracteres numéricos llamados niveles, que representan las medidas de los sensores de un reactor nuclear. El programa debe comprobar que este informe es seguro. Un informe sólo es seguro si se cumplen las dos condiciones siguientes:

    • Los niveles aumentan o disminuyen de forma gradual. Es decir, todos los valores de la cadena deben estar en formato creciente o decreciente. 
    • Dos niveles adyacentes cualesquiera difieren al menos en una y como máximo en tres unidades.
Requisitos:
    • El programa pedirá la cadena numérica/informe al usuario.
    • La verificación de si el informe es seguro debe realizarse en una función a parte. 
    • No es necesario validar que la cadena introducida es correcta.
    • Pista: Usa las funciones Character.getNumericValue y Math.abs.
 *
 * @author Javier González Prados
 */
public class Ejercicio1 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce la cadena numerica:");

        String niveles = teclado.nextLine();

        if (esSeguro(niveles)) {
            System.out.println("El informe es seguro");
        } else {
            System.out.println("El informe no es seguro");
        }
    }

    public static boolean esSeguro(String informe) {
        boolean esCreciente = true, esDecreciente = false;

        for (int i = 1; i < informe.length() - 1; i++) {

            int anterior = Character.getNumericValue(informe.charAt(0)); //convierte el String en Int

            int actual = Character.getNumericValue(informe.charAt(i));

            int diferencia = Math.abs(anterior - actual);
            
            if (diferencia < 1 || diferencia > 3) {
                return false;
            }
            if ((actual > anterior && i > 1 && informe.charAt(i - 1) < informe.charAt(i - 2))) {
                return false;
            }
            anterior = actual;

        }
        return true;
    }
}
