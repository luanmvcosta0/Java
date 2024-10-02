package teste;

public class CarroTestar {

    public static void main(String[] args) {

        Carro c1 = new Carro();

        c1.nome = "Onix";
        c1.marca = "Chevrolet";
        c1.ano = 2020;
        c1.velocidade = 60;

        c1.acelerar(10);

        System.out.println("Velocidade: " + c1.velocidade + "km/h");

        c1.freiar(30);

        System.out.println("Velocidade: " + c1.velocidade + "km/h");
    }

}
