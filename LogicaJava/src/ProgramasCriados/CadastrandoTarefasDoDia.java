package ProgramasCriados;

import java.util.Scanner;

public class CadastrandoTarefasDoDia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] tarefasDoDia = new String[5];

        for (int i = 0; i < tarefasDoDia.length; i++) {
            System.out.print("Tarefa " + i + ": ");
            tarefasDoDia[i] = scanner.nextLine();
        }

        System.out.print("Suas tarefas são: ");
        for (int i = 0; i < tarefasDoDia.length; i++) {
            System.out.println(i + ": " + tarefasDoDia[i]);
        }

        scanner.close();

    }

}