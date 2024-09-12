import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("qual o valor do salario minimo:");
        double salarioMinimo = input.nextDouble();

        System.out.println("Valor que o funcionario recebe:");
        double salarioFuncionario = input.nextDouble();


        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

        System.out.printf("O funcionário ganha %.2f salários mínimos.%n", quantidadeSalariosMinimos);

        input.close();

    }
    
}
