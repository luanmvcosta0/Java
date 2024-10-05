package poo.veiculos;

public class main {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Carro", "Onix", 2020);
        System.out.println("Tipo do veículo: " + veiculo.tipoVeiculo + "  ||  " + "Nome do veículo: " + veiculo.nomeVeiculo + "  ||  " + "Ano do veículo: " + veiculo.ano);

        Veiculo veiculo2 = new Veiculo("Moto", "XRE", 2015);
        System.out.println("Tipo do veículo: " + veiculo2.tipoVeiculo + "  ||  " + "Nome do veículo: " + veiculo2.nomeVeiculo + "  ||  " + "Ano do veículo: " + veiculo2.ano);


        veiculo.acelerar();

    }

}
