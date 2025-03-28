import java.util.Scanner;

public class ex6_media2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float A, B, C, MEDIA;

        System.out.println("Digite a primeira nota: ");
        A = leitor.nextFloat();

        System.out.println("Digite a segunda nota: ");
        B = leitor.nextFloat();

        System.out.println("Digite a terceira nota: ");
        C = leitor.nextFloat();

        MEDIA = (A * 2 + B * 3 + C * 5) / (2 + 3 + 5);

        System.out.printf("O valor da média é: %.2f\n", MEDIA);

        leitor.close();
        }
    }

