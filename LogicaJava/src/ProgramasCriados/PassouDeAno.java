package ProgramasCriados;

import java.util.Scanner;

public class PassouDeAno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = scanner.nextDouble();

        boolean passouDeAno = nota >= 70;

        if (passouDeAno) {
            System.out.println("Parabens, voce passou de ano!");
        } else {
            System.out.println("Voce foi reprovado!");
        }

        scanner.close();

    }

}
