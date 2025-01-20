package casa;

public class Coche {  //Dará el nombre a la clase principal

    //Caracteristicas comunes o Atributos
    private int ruedas; //cantidad ruedas, al ser private se encapsula y no se puede modificar fuera de esta clase
    private int largo; //en cm
    private int ancho; //en cm
    private int motor; //cc del motor
    private int pesoPlataforma; //en kg

    private String color; //para que solo se pueda manipular con setters
    private int peso_total;

    private boolean asientos_cuero, climatizador;

    //Método constructor,tiene el mismo nombre de la clase y da un estado inicial al objeto
    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        pesoPlataforma = 500;

    }

    public String datos() { //Getter= Con return devuelve el valor
        return "La plataforma del vehiculo tiene " + ruedas + " un largo de " + largo + "cm, un ancho de " + ancho + "cm, un peso de " + pesoPlataforma + "kg.";
    }

    public void setColor(String color) { //Setter= Modifica el estado de una propiedad
        this.color = color;
    }

    public String getColor() { //Getter= Con return devuelve el valor
        return "El color del coche es " + color;
    }

    public void setAsientos_cuero(String asientos_cuero) { //Configura asientos
        if (asientos_cuero.equalsIgnoreCase("si")) {
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }

    public String getAsientos_cuero() { //Informa configuración asientos
        if (asientos_cuero == true) {
            return "El coche tienes asientos de cuero";
        } else {
            return "El coche tiene asientos de serie";
        }
    }

    public void set_climatizador(String climatizador) { //setter
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    public String dimeClimatizador() {  //getter
        if (climatizador == true) {
            return "El coche incorpora climatizador";
        } else {
            return "El coche incorpora aire acondicionado";
        }
    }

    public String dime_Peso() { //setter+getter
        int peso_carroceria = 500;

        peso_total = pesoPlataforma + peso_carroceria;

        if (asientos_cuero = true) {
            peso_total = peso_total + 50;
        }
        if (climatizador = true) {
            peso_total = peso_total + 20;
        }
        return "El peso total es " + peso_total;
    }

    public int precio_coche() { //getter
        int precioFinal = 10000;
        if (asientos_cuero = true) {
            precioFinal += 2000;
        }
        if (climatizador = true) {
            precioFinal += 1500;
        }
        return precioFinal;
    }

}//Fin clase

