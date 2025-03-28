import java.util.Scanner;

public class ex13_maior {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    int num1, num2, num3, maiorAB, maiorFinal;

    System.out.println("Digite o primeiro número: ");
    num1 = leitor.nextInt();

    System.out.println("Digite o segundo número: ");
    num2 = leitor.nextInt();
    
    System.out.println("Digite o terceiro número: ");
    num3 = leitor.nextInt();

    maiorAB = (num1 + num2 + Math.abs(num1 - num2)) / 2;
    maiorFinal = (maiorAB + num3 + Math.abs(maiorAB - num3)) / 2;

    System.out.println(maiorFinal + " Eh o maior");
    leitor.close();
}
}