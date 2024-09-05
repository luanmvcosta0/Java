import java.util.Scanner;

public class PassouDeAnoConstante {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double NOTA_MEDIA_PARA_PASSAR_DE_ANO = 70;   // se coloca constante escrita desta forma, é um padrão.

        System.out.print("Digite sua nota: ");
        double nota = scanner.nextDouble();

        boolean passouDeAno = nota >= NOTA_MEDIA_PARA_PASSAR_DE_ANO;

        if (passouDeAno) {
            System.out.print("Parabens, voce passou de ano!");
        } else {
            System.out.print("Voce reprovou!");
        }

    }

}
