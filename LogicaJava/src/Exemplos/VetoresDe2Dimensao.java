package Exemplos;

public class VetoresDe2Dimensao {

    public static void main(String[] args) {

        Double[] faturamentoJaneiro = new Double[] { 1500.0, 2000.0, 1800.0 };
        Double[] faturamentoFevereiro = new Double[] { 2300.0, 1900.0, 1250.0 };
        Double[] faturamentoMarco = new Double[] { 4300.0, 2900.0, 3050.0 };

        Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFevereiro, faturamentoMarco };

        /*System.out.println("Faturamento do dia 1 de Janeiro: " + faturamentoAnual[0][0]);
        System.out.println("Faturamento do dia 3 de Feveriro: " + faturamentoAnual[1][2]);*/

        for (int i = 0; i < faturamentoAnual.length; i++) {
            System.out.println("Mes: " + (i + 1));

            Double[] mes = faturamentoAnual[i];

            for (int y = 0; y < mes.length; i++) {
                Double dia = mes[y];
                System.out.println("Dia " + (y + 1) + ": " + dia);
            }
        }

    }

}
