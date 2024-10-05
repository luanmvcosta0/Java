package poo.veiculos;

public class Veiculo {

    //Atributos
    public String tipoVeiculo;
    public String nomeVeiculo;
    public int ano;


    public String getTipoVeiculo() {
        return this.tipoVeiculo;
    }

    public void setTipoVeiculo() {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getNomeVeiculo() {
        return this.nomeVeiculo;
    }

    public void setNomeVeiculo() {
        this.nomeVeiculo = nomeVeiculo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno() {      //na teoria não preciso criar pois não se muda o ano do veiculo
        this.ano = ano;
    }


    //Construtor
    public Veiculo(String tipoVeiculo, String nomeVeiculo, int ano) {
        this.tipoVeiculo = tipoVeiculo;
        this.nomeVeiculo = nomeVeiculo;
        this.ano = ano;
    }


    //Metodos
    public void acelerar() {
        System.out.println("Acelere.");
    }

    public void freiar() {
        System.out.println("Freie.");
    }

    public void buzinar() {
        System.out.println("BiBiBiBiBiBiBiBi");
    }

}
