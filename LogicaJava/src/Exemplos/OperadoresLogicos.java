package Exemplos;

public class OperadoresLogicos {

    public static void main(String[] args) {

        Boolean carrinhoMaiorQue100 = false;
        Boolean periodoDePromocao = true;
        Boolean jaFezCompraNaLoja = false;
        Boolean pagamentoAVista = true;

        //Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;

        //Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;

        Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;

        if (aplicarDesconto) {
            System.out.println("Sim, pode aplicar o desconto.");
        } else {
            System.out.println("Não aplique o desconto.");
        }



    }

}
