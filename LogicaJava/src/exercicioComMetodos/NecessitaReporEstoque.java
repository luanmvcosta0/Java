package exercicioComMetodos;

public class NecessitaReporEstoque {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Mouse";
        produto.quantidadeEstoque = 10;

        nomeProduto(produto);
        quantidadeNoEstoque(produto);
        /*eNecessarioReporEstoque(produto);*/
    }


    static void nomeProduto(Produto produto) {
        System.out.println("Nome do produto: " + produto.nome);
    }

    static void quantidadeNoEstoque(Produto produto) {
        System.out.println("Quantidade no estoque: " + produto.quantidadeEstoque);
    }

    /*static Boolean eNecessarioReporEstoque(Produto produto) {
        if (produto.quantidadeEstoque < produto.QUANTIDADE_MINIMA_ESTOQUE) {
            return true;
        }

    }*/

}