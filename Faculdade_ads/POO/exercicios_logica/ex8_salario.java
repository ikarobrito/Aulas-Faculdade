import java.util.Scanner;

public class ex8_salario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numFunc, horasTrab;
        float valorHora, salario;

        System.out.println("Digite o número do funcionário: ");
        numFunc = leitor.nextInt();

        System.out.println("Digite o salário do funcionário: ");
        valorHora = leitor.nextFloat();

        System.out.println("Digite as horas trabalhadas do funcionário: ");
        horasTrab = leitor.nextInt();

        salario = valorHora * horasTrab; 

        System.out.println("NUMERO = " + numFunc);
        System.out.printf("SALARIO = R$ %.2f\n", salario);

        leitor.close();
}
}