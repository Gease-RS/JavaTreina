public class OperadoresAtribuicao {
    public static void main(String[] args) {
        // =, -=. +=, *=, /=, %=
        int salario = 1800;
        //salario = salario + 1000;
        //salario += 1000;
        //salario *= 1.1; (Salario acrescido 10%)
        salario = salario + (int) (salario * 0.1);
        System.out.println(salario);
    }
}
