package tema5;

import java.util.Scanner;

public class JgpT05E09 {

    /*
* Fernando Parga Fernandez
* Ejercicio 9: El siguiente programa tiene una variable global llamada saldo sobre la que se ejecutan las 
funciones ingresar() y  retirar() que aumentan y reducen el saldo respectivamente, no pudiendo 
quedar el saldo por debajo de cero. ¿Hay algún error? ¿Cuánto vale la variable saldo al finalizar la 
ejecución del programa? 
public class Ejercicio { 
    public static  int saldo=0; 
    public static void main(String[] args){ 
 boolean ok = false; 
      ingresar(30); 
 retirar(10); 
 if (retirar(10)==false) System.out.println("No se puede retirar tanto"); 
        System.out.println("Saldo final: "+ saldo); 
    }   
    static void ingresar(int i){ 
        saldo+=i; 
    } 
    static boolean retirar(int i){ 
        if (i>saldo) return false;  
  saldo-=i;  
  return true; 
}   }
     */


        public static int saldo = 0;

        public static void main(String[] args) {
            boolean ok = false;
            ingresar(30);
            retirar(10);
            if (retirar(10) == false) {
                System.out.println("No se puede retirar tanto");
            }
            System.out.println("Saldo final: " + saldo);
        }

        static void ingresar(int i) {
            saldo += i;
        }

        static boolean retirar(int i) {
            if (i > saldo) {
                return false;
            }
            saldo -= i;
            return true;
        }
    }

/* saldo = 10 (soy pobre)*/