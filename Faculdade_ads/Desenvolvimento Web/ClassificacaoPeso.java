import java.util.Scanner;

public class soma_a_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê um número inteiro

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble(); // Lê um número decimal

        System.out.print("Digite sua altura: ");
        float altura = scanner.nextFloat(); // Agora usando float

        System.out.print("Você gosta de Java? (true/false): ");
        boolean gostaDeJava = scanner.nextBoolean(); // Lê um booleano

        System.out.println("\nResumo:");
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Gosta de Java? " + gostaDeJava);

        scanner.close();
    }
}
