import java.util.Scanner;
public class PesoIdeal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Qual sua altura em metros?");
        double altura = input.nextDouble();

        double pesoIdeal = (62.1 * altura)- 44.7;

        System.out.println("seu peso ideal:"+ pesoIdeal);
        input.close();
    }
    
}
