package tema6;

public class Ruleta {
    public int saldoUsuario;

    Ruleta(){}
    
    Ruleta(int saldo) {
        this.saldoUsuario = saldo;
    }

    public int getSaldo() {
        return saldoUsuario;
    }
    
    public void ronda(int cantidadeApostada, String aposta) {
        int randomNumber = (int) (Math.random() * 36);
        if (cantidadeApostada < saldoUsuario) {
            saldoUsuario -= cantidadeApostada;
            if (randomNumber % 2 == 0 && randomNumber != 0 && (aposta.equals("Par") || aposta.equals("par") || aposta.equals("PAR"))) {
                saldoUsuario += cantidadeApostada;
            } else if (randomNumber % 2 == 1 && randomNumber != 0 && (aposta.equals("Impar") || aposta.equals("impar") || aposta.equals("IMPAR"))) {
                saldoUsuario += cantidadeApostada;
            }
        }
    }

    
} // fin clase
