package metodoInstancia;

public class MetodoInstaancia {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Luan";
        cliente.ultimoNome = "Costa";
        cliente.telefone = "81 99830-7047";
        cliente.email = "luanmvcosta@gmail.com";

        System.out.println("Nome cliente: " + cliente.exibirNomeCompleto() + " " + "DDD: " + cliente.obterDDD());

        /*exibirNomeCompleto(cliente);*/
    }

   /* static String exibirNomeCompleto(Cliente cliente) {
        System.out.println("O seu nome completo é: " + cliente.primeiroNome + " " + cliente.ultimoNome);
        return null;
    }*/

}
