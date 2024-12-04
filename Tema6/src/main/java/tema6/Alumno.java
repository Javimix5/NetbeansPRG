package tema6;

import java.time.LocalDate;

public class Alumno {
    public String nomeCompleto;
    public String DNI;
    public LocalDate dataNacemento;
    static String nomeDaEscola = "IES Fernando Wirtz";
    

    Alumno(){}
    
    Alumno(String nome, String DNI, LocalDate data) {
        this.nomeCompleto = nome;
        this.DNI = Alumno.checkDNI(DNI) ? DNI : "DNI non valido";
        this.dataNacemento = data;
    }
    
    static boolean checkDNI(String DNI) {
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        if (DNI.length() != 9) {
            return false;
        } else {
            for (int i = 0; i < 9; i++) {
                if (i < 8 && !Character.isDigit(DNI.charAt(i))) {
                    return false;
                }
                if (i == 8 && !Character.isUpperCase(DNI.charAt(i))) {
                    return false;
                } else if (DNI.charAt(8) != letrasDNI.charAt(Integer.parseInt(DNI.substring(0,8)) % 23)) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public LocalDate getDataNacemento() {
        return dataNacemento;
    }
    
    public void setDataNacemento(LocalDate data) {
        dataNacemento = data;
    }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    
    public void setNomeCompleto(String nome) {
        nomeCompleto = nome;
    }
    
    public String getDNI() {
        return DNI;
    }
    
    public void setDNI(String DNI) {
        if (Alumno.checkDNI(DNI)) {
            this.DNI = DNI;
        }
    }
    
    public boolean isMayorDeEdad() {
        if (LocalDate.now().getYear() - dataNacemento.getYear() > 18) {
            return true;
        } else if (LocalDate.now().getYear() - dataNacemento.getYear() == 18 && LocalDate.now().getMonthValue() > dataNacemento.getMonthValue()) {
            return true;
        } else if (LocalDate.now().getYear() - dataNacemento.getYear() == 18 && LocalDate.now().getMonthValue() == dataNacemento.getMonthValue() && LocalDate.now().getDayOfMonth() > dataNacemento.getDayOfMonth()) {
            return true;
        }
        return false;
    }
    
    public boolean compareWith(Alumno alumno) {
        /*
        if (alumno.getDataNacemento().getYear() < dataNacemento.getYear()) {
            return true;
        } else if (alumno.getDataNacemento().getYear() == dataNacemento.getYear() && alumno.getDataNacemento().getMonthValue() < dataNacemento.getMonthValue()) {
            return true;
        } else if (alumno.getDataNacemento().getYear() == dataNacemento.getYear() && alumno.getDataNacemento().getMonthValue() == dataNacemento.getMonthValue() && alumno.getDataNacemento().getDayOfMonth() < dataNacemento.getDayOfMonth()) {
            return true;
        }
        return false;*/
        return alumno.getDataNacemento().isBefore(dataNacemento);
    }
    
    public boolean isDuplicate(Alumno alumno) {
        if (nomeCompleto.equals(alumno.getNomeCompleto()) && dataNacemento == alumno.getDataNacemento() && DNI.equals(alumno.getDNI())) {
            return true;
        } else {
            return false;
        }
    }
} // fin clase
