package pMates;

/**
 *
 * @author Javier González Prados
 */
public class CalculadoraPro extends Calculadora {

    public String sumarHexa() {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }        
        return Integer.toHexString(suma);
    }

    public int menor() {
        int menor = super.menor();
        return menor < 0 ? 0 : menor;

    }
}//Fin clase
