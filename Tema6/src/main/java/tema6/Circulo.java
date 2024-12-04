package tema6;

public class Circulo {
    public double radio;

    Circulo(){}
    
    Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }
    
    public double calcularDiametro() {
        return 2 * radio;
    }
    
    public double calcularSuperficie() {
        return Math.PI * Math.pow(radio, 2);
    }
} // fin clase
