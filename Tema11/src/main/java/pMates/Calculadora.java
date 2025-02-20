package pMates;

import java.util.ArrayList;

/**
 *
 * @author Javier González Prados
 */
public class Calculadora {

    ArrayList<Integer> numeros = new ArrayList<>();

    private int sumar() {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    protected int menor() {
        int menor = numeros.get(0);
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    public double media() {
        return (double) sumar() / numeros.size();

    }

}//Fin clase
