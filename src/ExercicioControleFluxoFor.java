public class ExercicioControleFluxoFor {
    public static void main(String[] args) {
        //Imprima todos os numeros pares de 0 até 100000
        int valor = 100000;
        for (int i = 0; i <= valor; i++) {
            //Impares acrescentar o sinal de diferente if(i%2!=0)
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}
