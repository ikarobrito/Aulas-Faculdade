import java.util.Scanner;

public class ex5_media1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float A, B, MEDIA;

        System.out.println("Digite a primeira nota: ");
        A = leitor.nextFloat();

        System.out.println("Digite a segunda nota: ");
        B = leitor.nextFloat();

        MEDIA = (A +B) /2;

        System.out.printf("O valor da média é: %.5f\n", MEDIA);

        leitor.close();
        }
    }
