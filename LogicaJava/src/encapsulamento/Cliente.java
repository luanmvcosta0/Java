package encapsulamento;

public class Cliente {

    String nome;

//    String primeiroNome;
//    String segundoNome;

    String telefone;

    String getNome() {
        return nome;
    }

    String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    String getTelefone() {
        return telefone;
    }

    String setTelefone(String number) {
        return telefone;
    }

    void setTelefonee(String telefone) {
        this.telefone = telefone;
    }

}
