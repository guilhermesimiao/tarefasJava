/**
 * Programa de Gerenciamento de Tarefas

 * Este programa permite ao usuário:
 * - Informar quantas tarefas deseja adicionar;
 * - Inserir as tarefas manualmente;
 * - Escolher se deseja exibir as tarefas cadastradas;
 * - Decidir se deseja apagar alguma tarefa;
 * - Informar quantas tarefas deseja apagar e quais posições deseja limpar;
 * - Ver novamente a lista de tarefas, já com as alterações aplicadas.

 * As tarefas apagadas são substituídas pelo texto "APAGADA".
 * O programa trata entradas inválidas com mensagens de aviso e repetições de perguntas.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tarefasQuantidade = 0;
        boolean teste = false;
        int quantosApagar = 0;

        while (!teste) {

            System.out.println("Quantas tarefas deseja adicionar? ");
            if (scan.hasNextInt()) {
                tarefasQuantidade = scan.nextInt();
                teste = true;

            } else {
                System.out.println("Valor inválido");
                scan.next();
            }
        }

        String[] vetorTarefa = new String[tarefasQuantidade];
        scan.nextLine();

        for (int i = 0; i < tarefasQuantidade; i++){
            System.out.print("Escreva sua tarefa: \n");
                vetorTarefa[i] = scan.nextLine();
        }

        System.out.println("Deseja exibir as tarefas registradas? (s/n)");
            char exibirTarefa = scan.next().charAt(0);

        if(exibirTarefa != 's'){
            System.out.println("Obrigado, até mais!");

        }else {
            System.out.println("Suas tarefas");

            for (int i = 0; i < vetorTarefa.length; i++){
                System.out.println("Tarefa "+(i + 1) + "º - " + vetorTarefa[i]);
            }

            System.out.println("Deseja apagar alguma tarefa? (s/n)");
                char opcaoApagar = scan.next().charAt(0);

            if(opcaoApagar != 's'){
                System.out.println("Obrigado, até mais!");

            }else {

                while (teste) {
                    System.out.println("Qantas tarefas deseja apagar? ");
                    if (scan.hasNextInt()) {
                        quantosApagar = scan.nextInt();
                        teste = false;

                    } else {
                        System.out.println("Valor inválido");
                            scan.next();

                    }

                    for (int i = 0; i < quantosApagar; i++) {
                        System.out.println("Digite a posição da tarefa para apagar (1 a " + vetorTarefa.length + "):");
                            int pos = scan.nextInt();

                        if (pos >= 1 && pos <= vetorTarefa.length) {
                            vetorTarefa[pos - 1] = "APAGADA";
                        } else {
                            System.out.println("Posição inválida, ignorando.");
                        }
                    }
                }

                System.out.println("Deseja exibir as tarefas registradas? (s/n)");
                exibirTarefa = scan.next().charAt(0);

                if(exibirTarefa != 's'){
                    System.out.println("Obrigado, até mais!");

                }else {
                    System.out.println("Suas tarefas");

                    for (int i = 0; i < vetorTarefa.length; i++) {
                        System.out.println("Tarefa " + (i + 1) + "º - " + vetorTarefa[i]);
                    }
                }
            }
        }
    }
}