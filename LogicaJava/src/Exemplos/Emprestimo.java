package Exemplos;

public class Emprestimo {

    public static void main(String[] args) {

        Double emprestimo = 4000.0;
        Double movimentacaoMedia = 2000.0;

        Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia *2) >= emprestimo;
        Boolean aContaTemTempoSuficienteDeAbertura = true;
        Boolean temNomeLimpo = true;

        Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor && aContaTemTempoSuficienteDeAbertura && temNomeLimpo;

        if (liberarEmprestimo) {
            System.out.println("Pode liberar emprestimo.");
        } else {
            System.out.println("Não pode liberar o emprestimo");
        }

    }

}
