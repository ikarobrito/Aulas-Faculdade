import java.util.Scanner;

public class ex4_ProdutoSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int A, B, PROD;

        System.out.println("Digite o primeiro número: ");
        A = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        B = leitor.nextInt();

        PROD = A * B;

        System.out.printf("PROD = " + PROD);
    
        leitor.close();
    }
}
