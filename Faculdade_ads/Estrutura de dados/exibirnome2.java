import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita que o usuário digite seu nome
        System.out.print("Digite seu nome: ");
        
        // Lê o nome digitado pelo usuário
        String nome = scanner.nextLine();
        
        // Exibe o nome digitado pelo usuário
        System.out.println("O nome digitado é: " + nome);
        
        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
