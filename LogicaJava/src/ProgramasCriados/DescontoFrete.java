package ProgramasCriados;

import java.util.Scanner;

public class DescontoFrete {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do seu produto: ");
        Double valorProduto = scanner.nextDouble();

        Boolean precisaCobrarFrete = valorProduto < 100;

        Double valorFinal = valorProduto;

        if (precisaCobrarFrete) {
            valorFinal += 15.0;
        }

        System.out.println("O valor final do seu item fica: " + valorFinal);

    }

}