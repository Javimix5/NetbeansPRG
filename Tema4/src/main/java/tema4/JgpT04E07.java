/*
 * 4.7. Un algoritmo de encriptado monoalfabético consiste en la sustitución de una letra por otra a 
 * lo largo de todo el mensaje, por ejemplo las A por F, las B por X, las C por M. Obviamente si la A pasa 
 * a ser F, ninguna otra letra pasará F. Hacer un programa que le introduzca una cadena en mayúsculas 
 * y muestre la cadena encriptada en (todo lo que no sean letras mayúsculas se deja intacto: números, 
 * espacios en blanco, etc.). Hacer una segunda versión que funcione con mayúsculas y minúsculas.   
 */
package tema4;

import java.util.Scanner;

public class JgpT04E07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
String alfabeto = "ABCDEFGHIJKLMNOPQRSTUWXYZ";
String encriptacion = "DEFGHIJKLMNOPQRSTUVWXYZABC";
System.out.print("Introduce un mensaje que deseas encriptar: ");
String mensaje = teclado.nextLine().toUpperCase();
StringBuilder mensajeEncriptado = new StringBuilder();
for (int i = 0; i < mensaje.length(); i++) {
char caracter = mensaje.charAt(i);
if (Character.isLetter(caracter)) {
int posicionLetraOriginal = alfabeto.indexOf(caracter);
mensajeEncriptado.append(encriptacion.charAt(posicionLetraOriginal));
} else {
mensajeEncriptado.append(caracter);
}
}

System.out.println("El mensaje encriptado es: " + mensajeEncriptado);

//CON MAYUSCULAS Y MINUSCULAS
//String alfabetoOriginalMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//String alfabetoEncriptadoMayus = "FZQWODPEYVUTJSKLMXICAHNRBGT";
//
//String alfabetoOriginalMinus = "abcdefghijklmnopqrstuvwxyz";
//String alfabetoEncriptadoMinus = "fzwodpeyvutjsklmxicahnrbgt";
//
//System.out.println("Introduce el texto a encriptar (puede contener mayúsculas y minúsculas): ");
//String textoOriginal = teclado.nextLine();
//
//StringBuilder textoEncriptado = new StringBuilder();
//
//for (int i = 0; i < textoOriginal.length(); i++) {
//char caracter = textoOriginal.charAt(i);
//
//if (Character.isUpperCase(caracter)) {
//int indice = alfabetoOriginalMayus.indexOf(caracter);
//textoEncriptado.append(alfabetoEncriptadoMayus.charAt(indice));
//}
//else if (Character.isLowerCase(caracter)) {
//int indice = alfabetoOriginalMinus.indexOf(caracter);
//textoEncriptado.append(alfabetoEncriptadoMinus.charAt(indice));
//} else {
//textoEncriptado.append(caracter);
//}
//}
// Mostrar el texto encriptado
//System.out.println("El mensaje encriptado es: " + textoEncriptado.toString());
    }

}
