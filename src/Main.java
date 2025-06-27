import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList <String> lista = new ArrayList<>();

        //menu
        int[] menu = new int[6];
        boolean teste = true;

        while (teste) {
            System.out.println("Selecione uma opçao: ");

            for (int i = 0; i < menu.length; i++) {
                menu[i] = i;

                if (menu[i] == 0) {
                    System.out.print("[" + i + "]" + " - SAIR\n");

                } else if (menu[i] == 1) {
                    System.out.print("[" + i + "]" + " - Criar Tarefas\n");
                } else if (menu[i] == 2) {
                    System.out.print("[" + i + "]" + " - Exibir Tarefas\n");

                } else if (menu[i] == 3) {
                    System.out.print("[" + i + "]" + " - Editar Tarefas\n");

                } else if (menu[i] == 4) {
                    System.out.print("[" + i + "]" + " - Concluir Tarefas\n");

                } else if (menu[i] == 5) {
                    System.out.print("[" + i + "]" + " - Excluir Tarefas\n");


                }
            }
            int escolhaUser = scan.nextInt();

            switch (escolhaUser) {
                case 0:
                    System.out.println("Salvando Informações...\nDados Salvos, Até mais!");
                    teste = false;
                    break;

                case 1:
                    System.out.println("Escreva sua tarefa: ");
                        lista.add(scan.next());
                    teste = Tarefas.voltarAoMenu(scan);
                    break;

                case 2:
                    System.out.println("Exibindo tarefas...\n");
                    Tarefas.exibirLista(lista);
                    teste = Tarefas.voltarAoMenu(scan);
                    break;

                case 3:
                    System.out.println("Escolha a tarefa que deseja editar: ");
                    Tarefas.exibirLista(lista);
                    Tarefas.criaTarefa(lista, scan);
                    Tarefas.exibirLista(lista);
                    teste = Tarefas.voltarAoMenu(scan);
                    break;

                case 4:
                    Tarefas.exibirLista(lista);
                    Tarefas.removePosicao(lista, scan);
                    System.out.println("Parabéns, tarefa concluida!");
                    teste = Tarefas.voltarAoMenu(scan);
                    break;

                case 5:
                    System.out.println("Escolha a tarefa que deseja excluir: ");
                    Tarefas.exibirLista(lista);
                    Tarefas.removePosicao(lista, scan);
                    System.out.println("Tarefa removida. ");
                    teste = Tarefas.voltarAoMenu(scan);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}