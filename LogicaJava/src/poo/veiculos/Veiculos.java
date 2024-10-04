package poo.veiculos;

public class Veiculos {

    //atributos
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
    public Veiculos(String tipoVeiculo, String nomeVeiculo, int ano) {
        this.tipoVeiculo = tipoVeiculo;
        this.nomeVeiculo = nomeVeiculo;
        this.ano = ano;
    }

}
