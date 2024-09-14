package ProgramasCriados;

import java.util.Scanner;

public class PassouConcurso {

    static final Double NOTA_DESCLASSIFICATORIA_GERAL = 150.0;
    static final Double NOTA_MINIMA = 60.0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota na prova de Portugues: ");
        Double notaProvaPortugues = scanner.nextDouble();

        System.out.print("Digite sua nota na prova de Matematica: ");
        Double notaProvaMatematica = scanner.nextDouble();

        Double notaTotal = notaProvaPortugues + notaProvaMatematica;

        Boolean estaAcimaDoMinimoEmPortugues = notaProvaPortugues >= NOTA_MINIMA;
        Boolean estaAcimaDoMinimoEmMatematica = notaProvaMatematica >= NOTA_MINIMA;

        Boolean temNotaPraPassar = notaTotal >= NOTA_DESCLASSIFICATORIA_GERAL;

        Boolean passou = estaAcimaDoMinimoEmPortugues && estaAcimaDoMinimoEmMatematica && temNotaPraPassar;

        if (passou) {
            System.out.println("Parabens, voce passou no Concurso!");
        } else {
            System.out.println("Infelizmente voce não passou no Concurso.");
        }

        scanner.close();

    }

}
