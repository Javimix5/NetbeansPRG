/*
 * 6.9.- Ejercicios de fechas. Usando las clases de Java para el manejo de fechas, realiza programas 
con la siguiente funcionalidad: 
a) Introducir tu fecha de nacimiento y muestre cuantos días han pasado hasta ahora mismo. 
b) Introducir una fecha y un número de días y calcule la fecha que se obtiene al incrementar 
dichos días a la fecha. 
c) Introducir dos horas de reloj y nos dé la diferencia entre ambas en segundos. 
d) ¿Cuántos años bisiestos ha habido desde el año 1 dC? 
e) Introducir una fecha y mostrar el día de la semana que le corresponde. 
f) Introducir un tipo de producto (1- perecedero, 2-electrónica, 3-ropa) y la fecha de compra, y 
que informe si se puede devolver a día de hoy o no (los plazos de devolución, son 
respectivamente 5 horas, 6 meses, 15 días) 
g) Introducir un año y decir cuántos domingos tiene. 
h) Indica el día de la semana (en texto, en gallego) del 31 de diciembre de los últimos 5 años
 */
package tema6;

/**
 *
 * @author javier.gonzalezprado
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.Duration;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import java.util.HashMap;

import java.util.Scanner;

public class JgpT6e09Fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        

//a)Comparar Nacimiento
    System.out.println("COMPARAR EL TIEMPO QUE HA PASADO DESDE FECHA DE NACIMIENTO");
        System.out.println("Introduce tu fecha de nacimiento (yyyy-mm-dd):");
        String nacer = teclado.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(nacer);
        LocalDate hoy = LocalDate.now();

        long tiempo = ChronoUnit.DAYS.between(fechaNacimiento, hoy);
        System.out.println("Han pasado " + tiempo + " dias desde tu fecha de nacimiento.");
        System.out.print(""); 
        
//b)Calcular fecha al incrementar días
System.out.println("INCREMENTAR DIAS DESDE UNA FECHA");
        System.out.println("Introduce una fecha (yyyy-mm-dd):");
        LocalDate fecha1 = LocalDate.parse(teclado.nextLine());
        System.out.println("Introduce el numero de dias a incrementar:");
        int dias = teclado.nextInt();

        LocalDate fechaResultante = fecha1.plusDays(dias);
        System.out.println("La nueva fecha es: " + fechaResultante);
        System.out.print("");
        
//c)Diferencia de horas
System.out.println("DIFERENCIA ENTRE LAS DOS HORAS");
        System.out.println("Introduce la primera hora (HH:mm:ss):");
        LocalTime hora1 = LocalTime.parse(teclado.nextLine());
        System.out.println("Introduce la segunda hora (HH:mm:ss):");
        LocalTime hora2 = LocalTime.parse(teclado.nextLine());

        long segundos = Duration.between(hora1, hora2).getSeconds();
        System.out.println("La diferencia es de " + Math.abs(segundos) + " segundos.");
        System.out.print("");
        
//d)Años bisiestos desde el año 1 d.C
System.out.println("AÑOS BISIESTOS DESDE EL AÑO 1 d.C.");
        int contador = 0;
        for (int year = 1; year <= LocalDate.now().getYear(); year++) {
            if (LocalDate.of(year, 1, 1).isLeapYear()) {
                contador++;
            }
        }
        System.out.println("Desde el año 1 d.C. ha habido " + contador + " años bisiestos.");
        System.out.print("");
        
//e)Día de la semana de una fecha 
System.out.println("DIA DE LA SEMANA DE UNA FECHA");
        System.out.println("Introduce una fecha (yyyy-mm-dd):");
        LocalDate fecha2 = LocalDate.parse(teclado.nextLine());

        DayOfWeek diaSemana1 = fecha2.getDayOfWeek();
        System.out.println("El dia de la semana es: " + diaSemana1);
        System.out.print("");
 
//f)Verificar devolución de productos
System.out.println("SE PUEDE DEVOLVER EL PRODUCTO");
        System.out.println("Introduce el tipo de producto (1-perecedero, 2-electronica, 3-ropa):");
        int tipoProducto = teclado.nextInt();
        teclado.nextLine(); // Consumir nueva línea
        System.out.println("Introduce la fecha de compra (yyyy-MM-ddTHH:mm:ss):");
        LocalDateTime fechaCompra = LocalDateTime.parse(teclado.nextLine());
        LocalDateTime ahora = LocalDateTime.now();

        boolean puedeDevolver = false;

        switch (tipoProducto) {
            case 1 -> // Perecedero: 5 horas
                puedeDevolver = Duration.between(fechaCompra, ahora).toHours() <= 5;
            case 2 -> // Electrónica: 6 meses
                puedeDevolver = Period.between(fechaCompra.toLocalDate(), ahora.toLocalDate()).toTotalMonths() <= 6;
            case 3 -> // Ropa: 15 días
                puedeDevolver = Duration.between(fechaCompra, ahora).toDays() <= 15;
        }

        System.out.println("¿Se puede devolver? " + (puedeDevolver ? "Sí" : "No"));
        System.out.print("");
        
//g)Contar los domingos en un año
System.out.println("DOMINGOS DE ESE AÑO");
        System.out.println("Introduce un año:");
        int year = teclado.nextInt();

        int domingos = 0;
        LocalDate fecha = LocalDate.of(year, 1, 1);
        while (fecha.getYear() == year) {
            if (fecha.getDayOfWeek() == DayOfWeek.SUNDAY) {
                domingos++;
            }
            fecha = fecha.plusDays(1);
        }
        System.out.println("El año " + year + " tiene " + domingos + " domingos.");
        System.out.print("");
        
//h)Día de la semana (en gallego) de 31 de diciembre de los últimos 5 años
System.out.println("EN GALLEGO, DIAS DE LA SEMANA CORRESPONDIENTES AL 31 DE DICIEMBRE DESDE HACE 5 AÑOS");
        HashMap<DayOfWeek, String> diasGallego = new HashMap<>();
        diasGallego.put(DayOfWeek.MONDAY, "Luns");
        diasGallego.put(DayOfWeek.TUESDAY, "Martes");
        diasGallego.put(DayOfWeek.WEDNESDAY, "Mercores");
        diasGallego.put(DayOfWeek.THURSDAY, "Xoves");
        diasGallego.put(DayOfWeek.FRIDAY, "Venres");
        diasGallego.put(DayOfWeek.SATURDAY, "Sabado");
        diasGallego.put(DayOfWeek.SUNDAY, "Domingo");

        int year2 = LocalDate.now().getYear();
        for (int i = 0; i < 5; i++) {
            LocalDate fecha3 = LocalDate.of(year2 - i, 12, 31);
            DayOfWeek diaSemana2 = fecha3.getDayOfWeek();
            System.out.println("El 31 de diciembre de " + (year2 - i) + " fue " + diasGallego.get(diaSemana2));
        }
        

    }

}
