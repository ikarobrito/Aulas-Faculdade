import java.util.Scanner;

public class ex12_area {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        double areaA, areaB, alturaC, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        final double pi = 3.14159;

        System.out.println("Digite um valor para A: ");
        areaA = leitor.nextDouble();

        System.out.println("Digite um valor para B: ");
        areaB = leitor.nextDouble();

        System.out.println("Digite um valor para C: ");
        alturaC = leitor.nextDouble();

        areaTriangulo = (areaA * alturaC)/2;
        areaCirculo = pi * Math.pow(alturaC, 2);
        areaTrapezio = ((areaA + areaB) * alturaC) /2;
        areaQuadrado = areaB * areaB;
        areaRetangulo = areaA * areaB;


        System.out.printf("Triângulo: %.3f\n", areaTriangulo);
        System.out.printf("Circulo: %.3f\n", areaCirculo);
        System.out.printf("Trapézio: %.3f\n", areaTrapezio);
        System.out.printf("Quadrado: %.3f\n", areaQuadrado);
        System.out.printf("Retângulo: %.3f\n", areaRetangulo);

        leitor.close();
    }

}
