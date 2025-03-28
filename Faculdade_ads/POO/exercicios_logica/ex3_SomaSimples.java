import java.util.Scanner;

public class ex3_SomaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, SOMA;

        System.out.print("Digite o primeiro número: ");
        A = scanner.nextInt(); 

        System.out.print("Digite o segundo número: ");
        B = scanner.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA); 

        scanner.close();
    }
}

