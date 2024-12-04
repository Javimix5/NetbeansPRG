package tema6;

public class RuletaRusa {
    private int bala;
    public String xogador1;
    public String xogador2;
    public String xogadorActivo;
    public int disparos;
    
    
    RuletaRusa(String xogador1, String xogador2) {   
        this.xogador1 = xogador1;
        this.xogador2 = xogador2;
    }
    
    public void xerarBala() {
        bala = (int) (Math.random() * 6);
        disparos = 0;
        int randomNumber = (int) (Math.random() * 2) + 1;
        if (randomNumber == 1) {
            xogadorActivo = xogador1;
        } else if (randomNumber  == 2) {
            xogadorActivo = xogador2;
        }
    }
    
    public boolean pegarTiro() {
        System.out.println("O xogador activo e " + xogadorActivo);
        disparos++;
        if (bala == 0) {
            System.out.println("O xogador " + xogadorActivo + " ta muelto");
            System.out.println("Rematou a partida!");
            return true;
        } else {
            bala--;
            if (xogadorActivo.equals(xogador1)) {
                xogadorActivo = xogador2;
            } else if (xogadorActivo.equals(xogador2)) {
                xogadorActivo = xogador1;
            }
            switch (disparos) {
                case 1, 2 -> System.out.println("Non se disparou a bala, menos mal!");
                case 3 -> System.out.println("Estades tendo moita sorte!");
                case 4 -> System.out.println("Estades tentando a morte xa!");
                case 5 -> System.out.println("Esta xa e a ultima, o proximo vai palmar");
            }
            return false;
        }
    }
}
