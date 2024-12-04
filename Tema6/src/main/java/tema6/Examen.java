package tema6;

public class Examen {
    public String respostasCorrectas;
    public double acierto;
    public double fallo;

    Examen(){}
    
    Examen(String correctas, double acierto, double fallo) {
        this.respostasCorrectas = correctas;
        this.acierto = acierto;
        this.fallo = Math.abs(fallo);
    }

    public boolean checkFormat(String respotas) {
        if (respotas.length() != 20) {
            return false;
        } else {
            for (int i = 0; i < 20; i++) {
                if (respotas.charAt(i) != 'a' && respotas.charAt(i) != 'b' && respotas.charAt(i) != 'c' && respotas.charAt(i) != 'd' && respotas.charAt(i) != 'x') {
                    return false;
                } else if (Character.toUpperCase(respotas.charAt(i)) != 'A' && Character.toUpperCase(respotas.charAt(i)) != 'B' && Character.toUpperCase(respotas.charAt(i)) != 'C' && Character.toUpperCase(respotas.charAt(i)) != 'D' && Character.toUpperCase(respotas.charAt(i)) != 'X') {
                    return false;
                }
            }
        return true;    
        }
    }
    
    public double calcularNota(String respostas) {
        double nota = 0;
        if (!checkFormat(respostas)) {
            return -1;
        } else {
            for (int i = 0; i < 20; i++) {
                if (Character.toUpperCase(respostas.charAt(i)) == Character.toUpperCase(respostasCorrectas.charAt(i))) {
                    nota += acierto;
                } else {
                    nota = Math.max(0, nota - fallo);
                }
            }
        }
        return nota;
    }

    
} // fin clase
