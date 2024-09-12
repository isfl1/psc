import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = input.nextInt();

        // Imprime a tabuada de 1 a 10
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d X %d = %d%n", numero, i, resultado);
        }

        input.close();
    }
    
}
