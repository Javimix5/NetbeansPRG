package tema5;

import java.util.Scanner;

public class JgpT05E10 {

    /*
* Fernando Parga Fernandez
* Ejercicio 10:  Este código es erróneo ¿Qué mostraría por pantalla? ¿Por qué? 
 
public static void main(String[] args)  { 
   float saldo = 500f; 
   saldo = ingresar(saldo, 400f); 
   if (ingresar(saldo, 400f)>1000f)  
            System.out.println("Ya tienes más de 1000 euros: " + saldo); 
       else System.out.println("No tienes más de 1000 euros: " + saldo); 
} 
 
static float ingresar (float saldo, float increm){ return saldo+increm;}
     */
    public static void main(String[] args) {
        float saldo = 500f;
        saldo = ingresar(saldo, 400f);
        if (ingresar(saldo, 400f) > 1000f) {
            System.out.println("Ya tienes más de 1000 euros: " + saldo);
        } else {
            System.out.println("No tienes más de 1000 euros: " + saldo);
        }
    }

    static float ingresar(float saldo, float increm) {
        return saldo + increm;
    }
}
/*Faltaba corchete y dice que tenemos 900 euros*/