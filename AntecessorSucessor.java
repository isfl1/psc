import java.util.Scanner;

public class AntecessorSucessor {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita que o usuário insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        // Calcula o antecessor, sucessor, dobro e metade do número
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        int dobro = numero * 2;
        double metade = numero / 2.0;

        // Exibe os resultados
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);
        System.out.println("Dobro: " + dobro);
        System.out.printf("Metade: %.2f%n", metade);

        input.close();
    
}

  }
