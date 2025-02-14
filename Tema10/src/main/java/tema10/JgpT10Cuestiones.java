package tema10;

/**
 *
 * @author Javier González Prados
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class JgpT10Cuestiones {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<PoligonoRegular> figura = new ArrayList<>();

        figura.add(new Pentagono(5));
        figura.add(new Hexagono(5));
        figura.add(new Pentagono(10));
        figura.add(new Hexagono(10));

        for (PoligonoRegular i : figura) {
            if (i instanceof Pentagono) {
                System.out.println("El area del pentagono es: " + ((Pentagono) i).area());

            }
            if (i instanceof Hexagono) {
                System.out.println("El area del hexagono es: " + ((Hexagono) i).area());

            }
        }

        /*Cuestion --G--
        ArrayList<PoligonoRegular> listaPoligonos = new ArrayList<>();
        for (PoligonoRegular p : listaPoligonos) {
            System.out.println(p.area());
        }

        Funcionaria si luego añades con listaPoligonos.add cada tipo de figura
        */

    }// Fin main

}// Fin clase

//B) - PoligonoRegular es anstractar porque cada clase depende del metodo de cantidad de lados para calcular el área

//C) - area() no podria ser abstracto ya que daria error de compilacion

//D) - Clase hija sin metodo area, no porque al ser abstracto es obligatorio

//E) - Instancia de PoligonoRegular no se podria ya que daria error de compilación

//F) - El metodo no es abstracto porque su calculo es el mismo para cualquier poligono

//H) - No funcionaria si no fuese abstracto
