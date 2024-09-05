import java.util.Scanner;

public class PassouDeAnoConstante {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double notaMediaParaPassarDeAno = 70;

        System.out.print("Digite sua nota: ");
        double nota = scanner.nextDouble();

        boolean passouDeAno = nota >= notaMediaParaPassarDeAno;

        if (passouDeAno) {
            System.out.print("Parabens, voce passou de ano!");
        } else {
            System.out.print("Voce reprovou!");
        }

    }

}
