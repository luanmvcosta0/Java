package primeiraClasse;

public class PrimeiraClasse {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Smartphone";
        produto.precoUnitario = 500.0;
        produto.quantidade = 15;

        exibirNomeDoProduto(produto);
        exibirQuantidadeEmEstoque(produto);
        exibirPrecoDoProduto(produto);
    }

    static void exibirNomeDoProduto(Produto produto) {
        System.out.println("Nome do produto: " + produto.nome);
    }

    static void exibirQuantidadeEmEstoque(Produto produto) {
        System.out.println("Quantidade em estoque:" + produto.quantidade);
    }

    static void exibirPrecoDoProduto(Produto produto) {
        System.out.println("Nome do produto: " + produto.precoUnitario);
    }

}
