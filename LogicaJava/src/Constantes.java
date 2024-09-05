import java.util.Scanner;

public class Constantes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int idadeMinimaParaTirarCarteira = 18;  // a palavra final faz o codigo ser uma constante, ou seja, ela não pode mudar.

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        boolean podeTirarCarteira = idade >= idadeMinimaParaTirarCarteira;

        if (podeTirarCarteira) {
            System.out.println("Sim, ele pode tirar a carteira de habilitação.");
        } else {
            System.out.println("Não, ele não pode tirar a carteira de habilitação.");
        }

        scanner.close();
    }

}
