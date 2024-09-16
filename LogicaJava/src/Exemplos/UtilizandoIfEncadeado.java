package Exemplos;

import java.util.Scanner;

public class UtilizandoIfEncadeado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        Double peso = scanner.nextDouble();

        Boolean pesoLeve = (peso > 45) && (peso <= 60);
        Boolean pesoMedio = (peso > 60) && (peso <= 90);
        Boolean pesoPesado = peso > 90;

        if (pesoLeve) {
            System.out.println("O lutador é peso leve.");
        } else if (pesoMedio) {
            System.out.println("O lutador é peso medio.");
        } else if (pesoPesado) {
            System.out.println("O lutador é peso pesado.");
        } else {
            System.out.println("O lutador não se encaixa em categoria alguma.");
        }


        scanner.close();
    }

}
