

package examenevaluacion;

import java.util.Random;


/**
 *
 * @author Javier González Prados
 */

public class Password {
    private int longitud;
    private String contraseña;
    
    public Password(){
    this.longitud= 8;
     this.contraseña = generarContraseña(this.longitud);
    }
    
   public Password(int longitud){
       this.longitud= longitud;
     this.contraseña = generarContraseña(this.longitud);
   } 
   
   public Password(String contraseña){
       this.longitud = contraseña.length();
       this.contraseña= contraseña;
   } 

    public int getLongitud() {
        return longitud;
    }
   
    public String getContraseña() {
        return contraseña;
    }

    @Override
    public String toString() {
        return "Password{" + "longitud=" + longitud + ", contrase\u00f1a=" + contraseña + '}';
    }
    
   public boolean esFuerte(){ //Verifica si es Fuerte la contraseña
   int mayusculas = 0, minusculas = 0, numeros =0;
   
   for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
   if (Character.isUpperCase(c))
       mayusculas++;
   else if (Character.isLowerCase(c))
       minusculas++;
   else if (Character.isDigit(c))
       numeros++;
   }
   return mayusculas >2 && minusculas > 2 && numeros >3;
   
   }
   
   public String generarContraseña (int longitud){
   Random random = new Random();
   StringBuilder nuevaContraseña = new StringBuilder();
   
       for (int i = 0; i < longitud; i++) {
           int tipo = random.nextInt(3);
           
           if (tipo == 0)
               nuevaContraseña.append((char) ('A' + random.nextInt(26))); //Indica todo el abecedario en Mayúsculas
       else if (tipo == 1)
           nuevaContraseña.append((char) ('a' + random.nextInt(26))); //Indica todo el abecedario en Minúsculas
       else 
   nuevaContraseña.append(random.nextInt(10)); //Indica los 10 primero números 0-9
       }
   return nuevaContraseña.toString();
   }
    

}//Fin clase
