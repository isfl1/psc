import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor de X: ");
        double X = scanner.nextDouble();

        System.out.print("Digite o valor de Y: ");
        double Y = scanner.nextDouble();

        System.out.print("Digite o valor de Z: ");
        double Z = scanner.nextDouble();

        // Verificação se os valores podem formar um triângulo
        if (X + Y > Z && X + Z > Y && Y + Z > X) {
            System.out.println("Os valores podem formar um triângulo.");
        } else {
            System.out.println("Os valores não podem formar um triângulo.");
        }

        scanner.close();
    }
}