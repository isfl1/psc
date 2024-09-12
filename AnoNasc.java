import java.util.Scanner;
public class AnoNasc {
    public static void main(String[]args){
       Scanner input = new Scanner (System.in);


       System.out.println("Digite o ano de nascimento:");
        int anoNascimento = input.nextInt();

        System.out.println("informe o ano atual:");
        int anoAtual = input.nextInt();

        System.out.println("Sua idade é: " + (anoAtual - anoNascimento));


        System.out.println("digite o ano futuro:");
        int anoFuturo = input.nextInt();

        System.out.println("Sua idade sera:"+(anoFuturo-anoNascimento));

        input.close();

        


    }

    
}