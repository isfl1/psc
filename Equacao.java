import java.util.Scanner;
public class Equacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("qual o valor de a?");
        double a = input.nextDouble();
        System.out.println("de o valor de b");
        double b = input.nextDouble();
        System.out.println("de o valor de c ");
        double c = input.nextDouble();

        double delta = b * b - 4 * a * c;
        
         double raiz1 = (-b + Math.sqrt(delta)) / (2*a);
         double raiz2 = (-b - Math.sqrt(delta)) / (2*a);


         System.out.printf("A primeira raiz é: %.2f%n", raiz1);
         System.out.printf("A segunda raiz é: %.2f%n", raiz2);

            input.close();

    }
    
}
