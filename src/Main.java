public class Main {

    public static void main(String[] args) {
        try {
            int numero = 15;
            verificaRange(numero, 10, 20);
            System.out.println(numero + " è nel range ");
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e);
        }
    }

    static void verificaRange(int numero, int minimo, int massimo) {
        if (numero < minimo || numero > massimo) {
            throw new IllegalArgumentException("Il numero non è nel range specificato.");
        }
    }
}






