import java.util.Scanner;

public class TrocaVariaveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário insira os valores das variáveis A e B
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        // Exibe os valores originais
        System.out.println("Valores originais:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // Troca os valores de A e B usando uma variável temporária
        int temp = A;
        A = B;
        B = temp;

        // Exibe os valores após a troca
        System.out.println("Valores após a troca:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        scanner.close();
    }
}

