package ProgramasCriados;

import java.util.Scanner;

public class PodeAposentar {

    public static void main(String[] args) {

        final Integer IDADE_MINIMA_PARA_SE_APOSENTAR = 55;
        final Integer TEMPO_MINIMO_CONTRIBUICAO_PREVIDENCIA = 25;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        Integer idade = scanner.nextInt();

        System.out.print("Tempo de contribuição para previdencia: ");
        Integer tempoDeContribuicaoPrevidencia = scanner.nextInt();

        Boolean temIdadeParaSeAposentar = idade >= IDADE_MINIMA_PARA_SE_APOSENTAR;
        Boolean tempoDeContribuicaoDePrevidenciaSuficiente = tempoDeContribuicaoPrevidencia >= TEMPO_MINIMO_CONTRIBUICAO_PREVIDENCIA;
        Boolean podeSeAposentar = temIdadeParaSeAposentar && tempoDeContribuicaoDePrevidenciaSuficiente;

        if (podeSeAposentar) {
            System.out.print("Parabens, voce pode se aposentar!");
        } else {
            System.out.println("Voce não pode se aposentar!");
        }

    }

}
