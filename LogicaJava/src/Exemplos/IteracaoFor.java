package Exemplos;

public class IteracaoFor {

    public static void main(String[] args) {

        /*for (int i = 0; i < 5; i++) {
            System.out.println("Uma frase qualquer.");
        }*/

        /*Double[] carrinhoDeCompras = new Double[]{50.0, 60.0, 100.0} ;
        Double total = 0.0;

        for (int i = 0; i < carrinhoDeCompras.length; i++) {
            total = total + carrinhoDeCompras[i];
        }

        System.out.println("Total: " + total);*/

        for (int i = 0; i <10; i++) {

            if (i == 5) {
                break;
            }
            System.out.println("Iteração: " + i);
        }

    }

}
