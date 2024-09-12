import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("De a temperatura em celcius");
        double celcius = input.nextDouble();

       double fahrenheit = (celcius* 1.8)+32;

        System.out.println("a temperatura em fahrenheit sera:"+fahrenheit);


        input.close();

    }
    
}
