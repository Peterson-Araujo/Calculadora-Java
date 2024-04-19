import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, soma;
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();
        System.out.println();

        soma = num1 + num2;
        System.out.print("A soma entre " + num1 + " e " + num2 + " é " + soma);
    }
}