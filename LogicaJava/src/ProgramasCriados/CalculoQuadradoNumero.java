package ProgramasCriados;

import java.util.Scanner;

public class CalculoQuadradoNumero {

    public static void main(String[] args) {

        System.out.println("'Calculando o quadrado de um número'");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Double numeroUsuario = scanner.nextDouble();

        Double calculoAoQuadrado = numeroUsuario * numeroUsuario;

        System.out.println("Seu numero ao quadrado da este resultado: " + calculoAoQuadrado);

        scanner.close();
    }

}
