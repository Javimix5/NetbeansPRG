/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6;

/**
 *
 * @author javier.gonzalezprado
 */
import java.util.Random;

public class CuentaCorriente2 {

    public String iban;
    private float saldo;
    private int contadorIngresos;

    //añado "static" para que sea común para todas las cuentas
    private static float porcentajeComision;

    public CuentaCorriente2(String esO10001) {
    }

    CuentaCorriente2(String iban, float porcentajeComision) {
        this.iban = iban;
        this.saldo = 0;
        this.porcentajeComision = porcentajeComision;
        this.contadorIngresos = 0;
    }
//lo hago static

    public static void setComision(float comision) {
        porcentajeComision = comision;
    }

    public float getComision() {
        return porcentajeComision;
    }

    public float getSaldo() {
        return (saldo);
    }

    public void ingresar(float importe) {
        float bonus = 0;
        if (++contadorIngresos == 3) {
            contadorIngresos = 0;
            bonus = 0.7f;
        }
        saldo += importe + bonus;
    }

    public boolean retirar(float importe) {
        float comision = (porcentajeComision * importe);
        if (importe + comision <= saldo) {
            saldo -= importe + comision;  //resta (importe+comision)
            contadorIngresos = 0;
            return true;
        } else {
            return false;
        }
    }

} // fin clase
