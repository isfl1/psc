import java.util.Scanner;
public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);   
        System.out.print("Digite um número positivo: ");
        int numero = input.nextInt();

        // Verifica se o número é positivo
        if (numero > 0) {
            // Calcula o quadrado e o cubo do número
            int quadrado = numero * numero;

            int cubo = numero * numero * numero;

            // Calcula a raiz quadrada e a raiz cúbica do número
            double raizQuadrada = Math.sqrt(numero);
            double raizCubica = Math.cbrt(numero);

            // Mostra os resultados
            System.out.println("Número ao quadrado = " + quadrado);
            System.out.println("Número ao cubo = " + cubo);
            System.out.printf("Raiz quadrada: %.2f%n", raizQuadrada);
            System.out.printf("Raiz cúbica: %.2f%n", raizCubica);
        } else {
            System.out.println("Por favor, insira um número positivo.");
        }

        input.close();
    }
        
        
    }
    

