
package pruebas;

import java.util.Scanner;

/**
 *
 * @author Javier González Prados
 * 
 */
public class DiasMes {
    
    static int diasMes, dia, año, mes;
    
static Scanner scanner = new Scanner(System.in);
   
    public static void main(String[] args) {
        
        if (mes < 1 || mes > 12) System.out.println("Fecha incorrecta"); 
        else {
                diasMes = calcularDiasMes(mes, año);
                int z= calcularDiasMes(2,2020);
                if (dia <1 || dia > diasMes) System.out.println("Fecha incorrecta");
            else System.out.println("Fecha correcta");
            }
        }//fin main
 
      
 /**
  * FUNCION Calcular dias del mes, se necesita que se introduzcan el mes y el año
  * @param m Corresponde al mes
  * @param a Corresponde al año
  * @return Número de dias que tiene el mes
  */ 
   
static int calcularDiasMes(int m, int a){
    if (m==2) {
        if (esBisiesto(a)) return 29;
        return 28;
    }
    if (m==4 || m==6 || m==9 || m==11) return 30;
        return 31;
  }
static boolean esBisiesto (int aa){
        if ((aa % 4 == 0 && aa % 100 != 0) || aa % 400 ==0) return true;
        return false;
    }

}//fin clase

