package  com.saudeparatodos;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Boolean sair = false;
        
        while (!sair) {
        System.out.print("Digite o número do comando desejado (ou 'help' para ver os comandos disponíveis): ");
        String opcao = sc.nextLine();

      
        switch (opcao.toLowerCase()) {
            case "help":
                help(); // Chama o método para o comando 1
                break;
            case "2":
                perfilConta(); // Chama o método para o comando 2
                break;
            case "3":
                accountLogin(); // Chama o método para o comando 3
                break;
            case "4":
                agendamentos(); // Chama o método para o comando 4
                break;
            case "5":
                calendario(); // Chama o método para o comando 5
                break;
            case "sair":
                sair = true; // sair da opçao selecionada
                break;
            default:
                System.out.println("Comando inválido");
        }

    }
}

    // Métodos para cada comando
    public static void help() {
     
        String[] comandos = {
            "Comandos Disponiveis ",
            "1-Help     retorna comandos disponiveis",
            "2-Perfil/Conta     retorna area do seu perfil e dados da suaconta",
            "3-Acount/Login     retorna vc para area de conta e login",
            "4-Agendamentos     retorna vc para area medica de exames, consultas e operaçoes medicas ja marcadas",
            "5-Calendario       retorna vc para seu calendario de eventos ja marcados no app"
    };
     //exibe um ecra na cor vermelha para o menu de comados
     System.out.println("\u274c"+ "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" +"\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" +"\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" +"\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c"+ "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" +"\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" +"\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" +"\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c");
   
    // Exibir os comandos disponíveis
    for (String comando : comandos) {
        System.out.println(comando);
    }
     //exibe um ecra na cor vermelha para o menu de comados  
     System.out.println("\u274c"+ "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" +"\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" +"\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" +"\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c"+ "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" +"\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" +"\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" +"\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c" + "\u274c");

    }

    public static void perfilConta() {
        System.out.println("Area do perfil e dados da conta:");
        // Lógica para exibir dados do perfil/conta
    }

    public static void accountLogin() {
        System.out.println("Area de conta e login:");
        // Lógica para área de conta/login
    }

    public static void agendamentos() {
        System.out.println("Area medica de agendamentos:");
        // Lógica para área de agendamentos médicos
    }

    public static void calendario() {
        System.out.println("Calendario de eventos:");
        // Lógica para exibir calendário de eventos
    }

}

