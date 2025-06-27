import java.util.ArrayList;
import java.util.Scanner;

public class Tarefas {

    public static boolean voltarAoMenu (Scanner scan){

        char resposta;
        do {
            System.out.println("\nDeseja voltar ao menu? (s/n)");
            resposta = scan.next().toLowerCase().charAt(0);

            if (resposta == 's') {
                return true;
            } else if (resposta == 'n') {
                return false;
            } else {
                System.out.println("Opção inválida");
            }
        }while(true);
    }

    public static void exibirLista (ArrayList<String> lista){
        for(int i = 0; i < lista.size(); i++) {
            System.out.println("Tarefa " + (i + 1) + ": " + lista.get(i));
        }
    }

    public static void removePosicao(ArrayList<String> lista, Scanner scan) {

        int posicao;
        posicao = scan.nextInt();

        if(posicao >= 1 && posicao <= lista.size()) {
            lista.remove(posicao - 1);
            System.out.println("Modificaçao realizada! ");
        }else {
            System.out.println("Valor inválido, nenhuma tarefa foi alterada! ");
        }
    }

    public static void criaTarefa(ArrayList<String> lista, Scanner scan){

        int posicao;
        posicao = scan.nextInt() - 1;

        if(posicao >= 0 && posicao <= lista.size()) {
            System.out.println("Tarefa atual: " + lista.get(posicao));
            System.out.println("Escreva a nova tarefa: ");
            lista.set(posicao, scan.next());

        }else {
            System.out.println("Valor inválido, nenhuma tarefa foi alterada!");
        }
    }
}

