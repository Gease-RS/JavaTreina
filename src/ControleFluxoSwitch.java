public class ControleFluxoSwitch {
    public static void main(String[] args) {
        byte dia = 5;
        // tipos que podem ser usadas com switch char, int, byte, short, enum e String
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sábado");
                break;
        }
        // Diferença entre '' e "" char só aceita '', String ""
        char sexo = 'F';
        switch (sexo) {
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
