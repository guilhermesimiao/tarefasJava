import java.util.ArrayList;
import java.util.Scanner;

public class Tarefas {

    public static boolean voltarAoMenu (Scanner scan){

        char resposta;
        do {
            System.out.println("Deseja voltar ao menu? (s/n)");
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


}

