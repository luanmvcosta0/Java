import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso em Kg: ");
        Double peso =  scanner.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        Double altura = scanner.nextDouble();

        Double IMC = peso / (altura * altura);

        System.out.println("Seu IMC é: " + IMC);

        scanner.close();
    }

}
