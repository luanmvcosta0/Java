package ProgramasCriados;

import java.util.Scanner;

public class SwitchDiaDaSemana {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero referente ao dia da semana: ");
        Integer diaDaSemana = scanner.nextInt();

        String numeroDiaDaSemana = null;

        switch (diaDaSemana) {
            case 1: numeroDiaDaSemana = "Domingo";
                break;
            case 2: numeroDiaDaSemana = "Segunda-Feira";
                break;
            case 3: numeroDiaDaSemana = "Terça-Feira";
                break;
            case 4: numeroDiaDaSemana = "Quata-Feira";
                break;
            case 5: numeroDiaDaSemana = "Quinta-Feira";
                break;
            case 6: numeroDiaDaSemana = "Sexta-Feira";
                break;
            case 7: numeroDiaDaSemana = "Sábado";
                break;
            default:
                System.err.println("Digite um numero válido");
                System.exit(1);
        }

        System.out.println("O dia da semana selecionado é: " + numeroDiaDaSemana);

        scanner.close();

    }

}
