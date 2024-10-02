package teste;

public class Carro {

    //atributos
    String nome;
    String marca;
    int ano;
    int velocidade;

    //métodos
    void acelerar(int acelacao) {
        velocidade+= acelacao;
    }

    void freiar(int reduzir) {
        velocidade -= reduzir;
    }

    void buzinar() {
        System.out.println("BiBiBiBiBiBi");
    }

}
