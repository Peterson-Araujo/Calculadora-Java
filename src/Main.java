import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num1, num2, result;
        byte operacao;

        System.out.println("Em caso de números quebrados, utilize o ponto (.)");
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();

        System.out.print("Digite qual o número da operação que deseja realizar \n 1 - Soma \n 2 - Subtração \n 3 - Divisão \n 4 - Multiplicação\n");
        operacao = sc.nextByte();

        switch (operacao) {
           case 1:
               result = num1 + num2;
               System.out.println("A soma entre " + num1 + " e " + num2 + " é: " + result);
               break;

           case 2:
               result = num1 - num2;
               System.out.println("A subtração entre " + num1 + " e " + num2 + " é: " + result);
               break;

           case 3:
               result = num1 / num2;
               System.out.println("A divisão entre " + num1 + " e " + num2 + " é: " + result);
               break;

           case 4:
               result = num1 * num2;
               System.out.println("A soma multiplicação " + num1 + " e " + num2 + " é: " + result);
               break;

           default:
               System.out.println("O tipo de operação não é válido!");
               break;
        }

        sc.close();
    }
}