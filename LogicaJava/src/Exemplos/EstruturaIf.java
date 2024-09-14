package Exemplos;

public class EstruturaIf {

    public static void main(String[] args) {

        Boolean movimentaPeloMenosMetadeDoValor = true;
        Boolean aContaTemTempoSuficienteDeAbertura = true;
        Boolean temNomeLimpo = true;

        Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor && aContaTemTempoSuficienteDeAbertura && temNomeLimpo;

        if (liberarEmprestimo) {
            System.out.println("Sim, pode liberar o empréstimo.");
        } else {
            System.out.println("Não pode liberar o empréstimo.");
        }

    }

}
