package ExerciciosInternet;

import java.util.Scanner;

public class ExercicioLerValores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da letra A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor da letra B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor da letra C: ");
        int C = scanner.nextInt();

        int somaAEB = A + B;
        System.out.print("A soma de A + B é igual a: " + somaAEB);

        if (somaAEB < C) {
            System.out.println("A soma do A e B é menor que a letra C.");
        } else {
            System.out.println("A soma do A e B é não é menor que a letra C.");
        }

        scanner.close();

    }

}
