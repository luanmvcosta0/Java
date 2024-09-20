package Exemplos;

import java.util.Scanner;

public class Vetors1Dimencao {

    public static void main(String[] args) {

        String[] cardapio = new String[] {"Calabresa", "Queijo", "Frango", "Portuguesa"};

        System.out.println("Escolha o sabor: ");

        for (int i = 0; i < cardapio.length ; i++) {
            System.out.println("[" + i + "]" + cardapio[i]);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero referente ao sabor: ");
        Integer saborEscolhido = scanner.nextInt();

        System.out.println("O seu sabor escolhido foi: " + cardapio[saborEscolhido]);

        scanner.close();

    }

}
