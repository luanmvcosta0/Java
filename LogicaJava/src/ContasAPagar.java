import java.util.Scanner;

public class ContasAPagar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite abaixo os valores gastos com: ");

        Double total = 0.0;

        System.out.print("Conta de Luz: ");
        total += scanner.nextDouble();

        System.out.print("Conta de água: ");
        total += scanner.nextDouble();

        System.out.print("Conta de telefone: ");
        total += scanner.nextDouble();

        System.out.print("Escola do filho(a): ");
        total += scanner.nextDouble();

        System.out.print("Fatura do cartão: ");
        total += scanner.nextDouble();

        System.out.print("Gasto com supermercado: ");
        total += scanner.nextDouble();

        System.out.println("A soma das suas contas deu: " + total);

        scanner.close();
    }

}
