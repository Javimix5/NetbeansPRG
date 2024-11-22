/*
 * Clase Cuenta
 */
package clasesobjetos;

/**
 *
 * @author Javier.gonzalezprado
 */
import java.util.Random;

public class Cuenta {

    private String Titular;
    private double Saldo;
    private String IBAN;
    

    public Cuenta() {
        this.IBAN = generarIban();
    }

    public Cuenta(String Titular) {
        this.Titular = Titular;
        this.Saldo = 0.0;
        this.IBAN = generarIban();
    }

    private String generarIban() {
        StringBuilder numeros = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 20; ++i) {
            int numero = random.nextInt(10);
            numeros.append(numero);
        }
        return "ES" + numeros.toString();
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getIBAN() {
        return generarIban();
    }

    public String toString() {
        return "Cuenta: "
                + "titular: " + Titular + ", saldo " + Saldo;
    }

}
