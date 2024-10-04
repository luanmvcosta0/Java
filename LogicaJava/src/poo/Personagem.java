package poo;

public class Personagem {

    //atributos
    private String nome;
    private String poder;
    private String tipoArma;
    private int forca;
    private int agilidade;
    private int estamina;


    //construtors
    Personagem() {
        this.nome = "";
        this.poder = "";
        this.tipoArma = "";
        this.forca = 0;
        this.agilidade = 0;
        this.estamina = 0;
    }

    Personagem(String nome, String poder, String tipoArma, int forca, int agilidade, int estamina) {
        this.nome = nome;
        this.poder = poder;
        this.tipoArma = tipoArma;
        this.forca = forca;
        this.agilidade = agilidade;
        this.estamina = estamina;
    }


    //metodos
    public void correr() {
        System.out.println("Corra!");
    }

    public void setNome() {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }


    //main
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        personagem.setNome();

    }

}
