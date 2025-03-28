import java.util.Scanner;

public class ex10_calculosimples {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    int codigo, quantidadeItens1, quantidadeItens2;
    double valorItem1, valorItem2, calculo;

    System.out.println("Digite o código do item: ");
    codigo = leitor.nextInt();

    System.out.println("Digite a quantidade de itens: ");
    quantidadeItens1 = leitor.nextInt();
    
    System.out.println("Digite o valor do primeiro item: ");
    valorItem1 = leitor.nextDouble();

    System.out.println("Digite o código do item: ");
    codigo = leitor.nextInt();

    System.out.println("Digite a quantidade de itens: ");
    quantidadeItens2 = leitor.nextInt();
    
    System.out.println("Digite o valor do segundo item: ");
    valorItem2 = leitor.nextDouble();

    calculo = (quantidadeItens1 * valorItem1) + (quantidadeItens2 * valorItem2);

    //System.out.println(codigo);
    System.out.printf("Valor a pagar: R$ %.2f", calculo);

    leitor.close();
    }
}
