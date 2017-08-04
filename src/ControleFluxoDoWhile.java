public class ControleFluxoDoWhile {
    public static void main(String[] args) {
        int contador = 11;
        while(contador < 10){
            System.out.println(++contador);
        }

        do{
            System.out.println("dentro do while");
        }while(contador < 10);

    }
}