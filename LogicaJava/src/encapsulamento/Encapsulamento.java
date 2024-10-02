package encapsulamento;

public class Encapsulamento {

    public static void main(String[] args) {

        /*Cliente cliente = new Cliente();
        cliente.nome = "Luan";
        cliente.telefone = "81 99830-7047";

        System.out.println("Nome cliente: " + cliente.nome);*/


        Cliente cliente = new Cliente();

        cliente.setNome("Luan Costa");
        cliente.setTelefone("81998307047");

        System.out.println("Nome cliente: " + cliente.getNome());

    }

}
