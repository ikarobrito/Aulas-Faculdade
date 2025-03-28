import java.util.Scanner;

public class ex14_consumo {
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int distanciaPercorrida;
    float combustivel, consumo;

    System.out.println("Digite a distância percorrirrida em km:");
    distanciaPercorrida = leitor.nextInt();

    System.out.println("Digite o valor gasto com combustível em Reais: ");
    combustivel = leitor.nextFloat();

    consumo = distanciaPercorrida / combustivel;

    System.out.printf(" KM/L %.3f\n", consumo);

    leitor.close();
}
    
}
