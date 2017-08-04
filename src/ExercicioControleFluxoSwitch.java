public class ExercicioControleFluxoSwitch {
    public static void main(String[] args) {
        //Crie um switch que dado um valor de 1 a 7
        //Considerando 1 domingo imprima se é dia util ou final de semana
        byte dia = 5;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("fds");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
        }
    }
}
