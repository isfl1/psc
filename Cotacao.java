import java.util.Scanner;
public class Cotacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("qual a cotacao do dolar?");
        double cotacaoDolar = input.nextDouble();

        System.out.println("quanto voce tem em dolar?");
        double valorDolar = input.nextDouble();

        System.out.println("Voce tera em reais o total de R$"+(valorDolar*cotacaoDolar));

        input.close();



    }
    
}
