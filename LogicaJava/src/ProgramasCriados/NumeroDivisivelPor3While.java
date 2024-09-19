package ProgramasCriados;

public class NumeroDivisivelPor3While {

    public static void main(String[] args) {

        final Integer DIVISOR = 3;

        Integer[] numeros = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int i = 0;
        while (i < numeros.length) {
            Integer numero = numeros[1];
            Integer divisivelPorTres = numero % DIVISOR;

            if (divisivelPorTres.equals(0)) {
                System.out.println("Número: " + numero + " é divisivel por 3.");
            }

            i++;
        }

    }

}
