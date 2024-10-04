package poo.veiculos;

public class main {

    public static void main(String[] args) {
        Veiculos veiculos = new Veiculos("Carro", "Onix", 2020);
        System.out.println("Tipo do veículo: " + veiculos.tipoVeiculo + "  ||  " + "Nome do veículo: " + veiculos.nomeVeiculo + "  ||  " + "Ano do veículo: " + veiculos.ano);

        Veiculos veiculos2 = new Veiculos("Moto", "XRE", 2015);
        System.out.println("Tipo do veículo: " + veiculos2.tipoVeiculo + "  ||  " + "Nome do veículo: " + veiculos2.nomeVeiculo + "  ||  " + "Ano do veículo: " + veiculos2.ano);

    }

}
