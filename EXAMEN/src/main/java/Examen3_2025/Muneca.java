package Examen3_2025;

/**
 *
 * @author Javier González Prados
 */
public class Muneca extends Juguete {

    public Muneca(String nombre, double precio) {
        super(nombre, precio);

    }

    
    //Método Peinar
    public void peinar(){
        System.out.println("Se esta peinando la muneca " + getNombre() + "...");
    
    
    }
    
    //Metodo Aplicar Descuento
    public void aplicarDescuento(double descuento) {
        super.aplicarDescuento(descuento+10);
                
    }
    
    
}//Fin clase
