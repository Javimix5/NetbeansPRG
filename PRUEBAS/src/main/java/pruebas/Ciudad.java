/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

/**
 *
 * @author CASA
 */
public class Ciudad {
    // Atributos
    private String nombre;
    private String pais;
    private double tempEnero, tempFebrero, tempMarzo, tempAbril, tempMayo, tempJunio;
    private double tempJulio, tempAgosto, tempSeptiembre, tempOctubre, tempNoviembre, tempDiciembre;

    // Constructor
    public Ciudad(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    // Método para asignar temperaturas
    public void asignarTemperatura(int mes, double temperatura) {
        switch (mes) {
            case 1 -> tempEnero = temperatura;
            case 2 -> tempFebrero = temperatura;
            case 3 -> tempMarzo = temperatura;
            case 4 -> tempAbril = temperatura;
            case 5 -> tempMayo = temperatura;
            case 6 -> tempJunio = temperatura;
            case 7 -> tempJulio = temperatura;
            case 8 -> tempAgosto = temperatura;
            case 9 -> tempSeptiembre = temperatura;
            case 10 -> tempOctubre = temperatura;
            case 11 -> tempNoviembre = temperatura;
            case 12 -> tempDiciembre = temperatura;
            default -> System.out.println("Mes inválido.");
        }
    }

    // Método para calcular la media
    public double calcularMedia() {
        return (tempEnero + tempFebrero + tempMarzo + tempAbril + tempMayo + tempJunio +
                tempJulio + tempAgosto + tempSeptiembre + tempOctubre + tempNoviembre + tempDiciembre) / 12;
    }

    // Método para mostrar temperaturas en centígrados
    public void mostrarCentigrados() {
        System.out.println("Temperaturas en grados centígrados:");
        System.out.println("Enero: " + tempEnero + "°C, Febrero: " + tempFebrero + "°C, Marzo: " + tempMarzo + "°C, Abril: " + tempAbril + "°C");
        System.out.println("Mayo: " + tempMayo + "°C, Junio: " + tempJunio + "°C, Julio: " + tempJulio + "°C, Agosto: " + tempAgosto + "°C");
        System.out.println("Septiembre: " + tempSeptiembre + "°C, Octubre: " + tempOctubre + "°C, Noviembre: " + tempNoviembre + "°C, Diciembre: " + tempDiciembre + "°C");
    }

    // Método para mostrar temperaturas en Farenheit
    public void mostrarFarenheit() {
        System.out.println("Temperaturas en grados Farenheit:");
        System.out.println("Enero: " + convertirAFarenheit(tempEnero) + "°F, Febrero: " + convertirAFarenheit(tempFebrero) + "°F, Marzo: " + convertirAFarenheit(tempMarzo) + "°F, Abril: " + convertirAFarenheit(tempAbril) + "°F");
        System.out.println("Mayo: " + convertirAFarenheit(tempMayo) + "°F, Junio: " + convertirAFarenheit(tempJunio) + "°F, Julio: " + convertirAFarenheit(tempJulio) + "°F, Agosto: " + convertirAFarenheit(tempAgosto) + "°F");
        System.out.println("Septiembre: " + convertirAFarenheit(tempSeptiembre) + "°F, Octubre: " + convertirAFarenheit(tempOctubre) + "°F, Noviembre: " + convertirAFarenheit(tempNoviembre) + "°F, Diciembre: " + convertirAFarenheit(tempDiciembre) + "°F");
    }

    // Método para convertir a Farenheit
    private double convertirAFarenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
