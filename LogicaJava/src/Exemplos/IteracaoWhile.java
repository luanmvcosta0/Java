package Exemplos;

public class IteracaoWhile {

    public static void main(String[] args) {

       /* for (int i = 0; i < 10; i++) {
            System.out.println("texto qualquer");
        }*/

        int i = 0;
        while (i < 10) {
            if(i == 5) {
                System.out.println("Vai parar");
                break;
            }
            System.out.println(i + ": Texto qualquer");
            i++;
        }

    }

}
