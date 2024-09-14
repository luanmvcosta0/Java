package ProgramasCriados;

import java.util.Scanner;

public class ProdutoDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        int quantidadeProduto = scanner.nextInt();

        double subtotal = valorProduto * quantidadeProduto;

        boolean quantidadeMaiorOuIgualDez = quantidadeProduto >=10;

        double percentualDesconto = 0.0;

        if (quantidadeMaiorOuIgualDez) {
            percentualDesconto = 10.0;
        }

        double desconto = subtotal * percentualDesconto / 100;

        double valorTotalDesconto = subtotal - desconto;

        System.out.println("Valor total: " + valorTotalDesconto);

        scanner.close();
    }

}
