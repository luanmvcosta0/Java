import java.util.Scanner;

public class AletarandoVariavelJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite o tipo do pagamento [1 = a vista / 2 = a prazo]: ");
        Integer tipoPagamento = scanner.nextInt();

        boolean pagamentoAVista = tipoPagamento.equals(1);

        double juros = 0.0;

        if (!pagamentoAVista) {
            juros = 10.0;
        }

        Double acrescimo = valorProduto * juros / 100;

        Double valorTotal = acrescimo + valorProduto;

        System.out.println(valorTotal);

        scanner.close();
    }

}
