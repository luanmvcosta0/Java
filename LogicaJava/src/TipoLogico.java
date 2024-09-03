import java.util.Scanner;

public class TipoLogico {

    public static void main(String[] args) {

        Boolean variavelVerdadeira = true;
        System.out.println("Variavel verdadeira: " + variavelVerdadeira);

        Boolean variavelFalsa = false;
        System.out.println("Variavel falsa: " + variavelFalsa);

        System.out.println("--------------------------------------------------------");



        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        Integer idade = scanner.nextInt();

        Boolean podeTirarCarteira = idade >= 18;

        //System.out.println("Pode tirar carteira? " + podeTirarCarteira);

        if (podeTirarCarteira) {
            System.out.println("Sim, ele pode tirar carteira de motorista!");
        } else {
            System.out.println("Não, porque ele é menor de idade!");
        }

    }

}
