/*
 * 6.12. Diseña una clase llamada Alumno para gestionar los alumnos de una escuela. Contiene los 
atributos: nombre completo, DNI, fecha de nacimiento y nombre de la escuela (común para todos 
los alumnos). Además del constructor, los métodos set y get para cada atributo, tendrá los siguientes 
métodos: 
- Método que nos dice si es mayor de edad o no. 
- Método al que se le pase como parámetro otro alumno y nos devuelva true si el alumno pasado es 
menor que él mismo. False en caso contrario. 
- Método al que se le pase como parámetro otro alumno y nos devuelva true si el alumno pasado es 
exactamente igual en todos los campos (un duplicado). False en caso contrario. 
Realiza a continuación un programa sencillo que use la clase definida */
package tema6;

/**
 *
 * @author javier.gonzalezprado
 */
import java.time.LocalDate;

import java.util.Scanner;

public class JgpT6e12Alumnos {

 static Scanner teclado = new Scanner(System.in, "ISO-8859-1"); 

    public static int askDecision() {
        System.out.println("Queres rexistrar algun alumno no instituto " + Alumno.nomeDaEscola + "? (1 para si, 0 para non)");
        int decision = Integer.parseInt(teclado.nextLine());
        while (decision != 1 && decision != 0) {
            System.out.println("Valor incorrecto");
            decision = Integer.parseInt(teclado.nextLine());
        }
        return decision;
    }

    public static void main(String[] args) {
        int decision = askDecision();
        System.out.println("Podes inscribir ata 5 alumnos no colexio.");
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        Alumno alumno4 = new Alumno();
        Alumno alumno5 = new Alumno();
        String DNI;
        for (int i = 1; i <= 5; i++) {
            decision = askDecision();
            if (i == 1 && decision == 1) {
                System.out.println("Introduce o nome completo do alumno (non vou comprobar que o escribas ben, asi que ten coidado)");
                alumno1.setNomeCompleto(teclado.nextLine());
                System.out.println("Introduce o DNI do alumno (este si que vou comprobar que esta ben escrito)");
                DNI = teclado.nextLine();
                while (!Alumno.checkDNI(DNI)) {
                    System.out.println("DNI incorrecto. Introducelo de novo.");
                    DNI = teclado.nextLine();
                }
                alumno1.setDNI(DNI);
                System.out.println("Introduce a data de nacemento do alumno (formato AAAA-MM-DD");
                alumno1.setDataNacemento(LocalDate.parse(teclado.nextLine()));
            } else if (i == 2 && decision == 1) {
                System.out.println("Introduce o nome completo do alumno (non vou comprobar que o escribas ben, asi que ten coidado)");
                alumno2.setNomeCompleto(teclado.nextLine());
                System.out.println("Introduce o DNI do alumno (este si que vou comprobar que esta ben escrito)");
                DNI = teclado.nextLine();
                while (!Alumno.checkDNI(DNI)) {
                    System.out.println("DNI incorrecto. Introducelo de novo.");
                    DNI = teclado.nextLine();
                }
                alumno2.setDNI(DNI);
                System.out.println("Introduce a data de nacemento do alumno (formato AAAA-MM-DD");
                alumno2.setDataNacemento(LocalDate.parse(teclado.nextLine()));
            } else if (i == 3 && decision == 1) {
                System.out.println("Introduce o nome completo do alumno (non vou comprobar que o escribas ben, asi que ten coidado)");
                alumno3.setNomeCompleto(teclado.nextLine());
                System.out.println("Introduce o DNI do alumno (este si que vou comprobar que esta ben escrito)");
                DNI = teclado.nextLine();
                while (!Alumno.checkDNI(DNI)) {
                    System.out.println("DNI incorrecto. Introducelo de novo.");
                    DNI = teclado.nextLine();
                }
                alumno3.setDNI(DNI);
                System.out.println("Introduce a data de nacemento do alumno (formato AAAA-MM-DD");
                alumno3.setDataNacemento(LocalDate.parse(teclado.nextLine()));
            } else if (i == 4 && decision == 1) {
                System.out.println("Introduce o nome completo do alumno (non vou comprobar que o escribas ben, asi que ten coidado)");
                alumno4.setNomeCompleto(teclado.nextLine());
                System.out.println("Introduce o DNI do alumno (este si que vou comprobar que esta ben escrito)");
                DNI = teclado.nextLine();
                while (!Alumno.checkDNI(DNI)) {
                    System.out.println("DNI incorrecto. Introducelo de novo.");
                    DNI = teclado.nextLine();
                }
                alumno4.setDNI(DNI);
                System.out.println("Introduce a data de nacemento do alumno (formato AAAA-MM-DD");
                alumno4.setDataNacemento(LocalDate.parse(teclado.nextLine()));
            } else if (i == 5 && decision == 1) {
                System.out.println("Introduce o nome completo do alumno (non vou comprobar que o escribas ben, asi que ten coidado)");
                alumno5.setNomeCompleto(teclado.nextLine());
                System.out.println("Introduce o DNI do alumno (este si que vou comprobar que esta ben escrito)");
                DNI = teclado.nextLine();
                while (!Alumno.checkDNI(DNI)) {
                    System.out.println("DNI incorrecto. Introducelo de novo.");
                    DNI = teclado.nextLine();
                }
                alumno5.setDNI(DNI);
                System.out.println("Introduce a data de nacemento do alumno (formato AAAA-MM-DD");
                alumno5.setDataNacemento(LocalDate.parse(teclado.nextLine()));
            } else if (decision == 0) {
                break;
            }
        }
    }
}
