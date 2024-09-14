package ProgramasCriados;

import java.util.Scanner;

public class CalcularValoTroco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade passada pelo Cliente: ");
        Double valorPassadoPeloCliente = scanner.nextDouble();

        Double troco = valorPassadoPeloCliente - valorProduto;

        System.out.println("Troco necessario: " + troco);

        scanner.close();
    }

}
