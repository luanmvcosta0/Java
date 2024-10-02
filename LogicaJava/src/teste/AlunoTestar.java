package teste;

public class AlunoTestar {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        //aluno1.nome = "Luan";

        aluno1.setNome("Luan");

        System.out.println("Nome do aluno: " + aluno1.getNome());

        aluno1.setIdade(20);

        System.out.println("Idade do aluno: " + aluno1.getIdade());


    }

}
