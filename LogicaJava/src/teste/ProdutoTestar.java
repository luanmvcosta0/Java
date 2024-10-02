package teste;

public class ProdutoTestar {

    public static void main(String[] args) {

        //contrutor padrão:
        Produto p1 = new Produto();
        p1.nome = "Camiseta";
        p1.marca = "Adidas";
        p1.valor = 395;

        //contrutor de dois parametros:
        Produto p2 = new Produto("Caneta vermelha", "FabreCastel");
        p2.valor = 2.50f;

        //contrutor de tres parametros:
        Produto p3 = new Produto("Sapato", "Nike", 600);


        //objeto p1
        System.out.println("Nome: " + p1.nome + " | Marca: " + p1.marca + " | Valor: " + p1.valor);

        //objeto p2
        System.out.println("Nome: " + p2.nome + " | Marca: " + p2.marca + " | Valor: " + p2.valor);

        //objeto p3
        System.out.println("Nome: " + p3.nome + " | Marca: " + p3.marca + " | Valor: " + p3.valor);
    }

}
