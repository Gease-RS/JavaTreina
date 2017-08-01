public class ControleFluxoCinco {
    public static void main(String[] args) {
        int idade = 20;
        String status;
        //status = idade < 18 ? <true> : <false> ; (operador ternario)
        status = idade < 18 ? "Não adulto" : "adulto";
        System.out.println(status);
    }
}
