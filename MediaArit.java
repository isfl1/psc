import java.util.Scanner;
public class MediaArit {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Informe o primeiro numero:");
    int numero1 = input.nextInt();

    System.out.print("informe o segundo numero:");
    int numero2 = input.nextInt();

    int soma = numero1 + numero2;


    System.out.println("A media aritmetica entre os dois numeros e:"+soma/2);
    
    input.close();

    } 
}
