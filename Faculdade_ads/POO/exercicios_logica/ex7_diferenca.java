import java.util.Scanner;

public class ex7_diferenca {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int A, B, C, D, DIFERENCA;

        System.out.println("Digite o valor de A: ");
        A = leitor.nextInt();

        System.out.println("Digite o valor de B: ");
        B = leitor.nextInt();

        System.out.println("Digite o valor de C: ");
        C = leitor.nextInt();

        System.out.println("Digite o valor de D: ");
        D = leitor.nextInt();

        DIFERENCA = (A * B) - (C * D);

        System.out.println("DIFERENCA: " + DIFERENCA);

        leitor.close();
    }
}
