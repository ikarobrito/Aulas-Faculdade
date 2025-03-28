import java.util.Scanner;

public class ex9_salariobonus {
        public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        double salarioFixo, vendasVendedor, valorTotal;
        final Double comissao = 0.15;

        System.out.println("Digite seu nome: ");
        nome = leitor.next();

        System.out.println("Digite seu salário: " );
        salarioFixo = leitor.nextDouble();

        System.out.println("Digite o valor das vendas: ");
        vendasVendedor = leitor.nextDouble();

        valorTotal = (vendasVendedor * comissao) + salarioFixo;

        System.out.println("Nome: " + nome);
        System.out.printf("TOTAL = %.2f", valorTotal);

        leitor.close();
        
    }
}
