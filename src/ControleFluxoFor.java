public class ControleFluxoFor {
    public static void main(String[] args) {
        //Variavl local i localmente deve ser inicializada
        for (int i = 0; i < 10; i++) {
            System.out.println("valor de i é: " + i);
            if (i == 5) {
                break;
            }
        }
    }
}
