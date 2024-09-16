package ProgramasCriados;

import java.util.Scanner;

public class CalculoBonusFuncionario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a meta de faturamento anual da empresa: ");
        Double metaFaturamentoAnual = scanner.nextDouble();

        System.out.print("Digite o faturamento real da empresa neste ano: ");
        Double metaFaturamentoAtual = scanner.nextDouble();

        System.out.println("Digite a media salarial dos funcionarios: ");
        Double metaSalarioFuncionarios = scanner.nextDouble();

        Double oitentaPorCentoDeMeta = (metaFaturamentoAnual * 80) / 100;
        Boolean bateuAMeta = metaFaturamentoAtual >= metaFaturamentoAnual;
        Boolean faturouPeloMenosOitentaPorCento = metaFaturamentoAtual >= oitentaPorCentoDeMeta;

       /* Boolean funcionarioGanhamBonus = metaFaturamentoAtual >= metaFaturamentoAnual ;
        Double bonusFuncionario = metaSalarioFuncionarios * 2;*/

        scanner.close();

    }

}
