package teste;

public class Aluno {

    //atributos
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if(idade > 0 && idade < 130) {
            this.idade = idade;
            System.out.println("Idade cadastrada.");
        } else {
            System.err.println("Erro! Idade invalida.");
        }
    }

    public int getIdade() {
        return idade;
    }

}
