import java.util.Scanner;
public class Gorjeta {
public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Digite o valor gasto pelo cliente: R$ ");
        double valorGasto = input.nextDouble();

        // Calcula a gorjeta de 10%
        double gorjeta = valorGasto * 0.10;

        // Mostra o valor da gorjeta
        System.out.printf("A gorjeta de 10%% é: R$ %.2f%n", gorjeta);

        input.close();


}    
}
