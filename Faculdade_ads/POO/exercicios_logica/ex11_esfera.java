import java.util.Scanner;

public class ex11_esfera {
        public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        final double PI = 3.14159;

        double volume, raio;

        System.out.print("Digite o raio da esfera: ");
        raio = leitor.nextDouble();

        volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);

        System.out.printf("O volume da esfera é: %.3f%n", volume);

        leitor.close();
    }
}