import java.util.Scanner;

public class ex1_SomaAB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, X;

        System.out.print("Digite o primeiro número: ");
        A = scanner.nextInt(); 

        System.out.print("Digite o segundo número: ");
        B = scanner.nextInt();

        X = A + B;

        System.out.println("X = " + X); 

        scanner.close();
    }
}
