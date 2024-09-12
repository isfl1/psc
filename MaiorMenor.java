import java.util.Scanner;

public class MaiorMenor {
    
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);

        //pegar o dois numeros
        System.out.print( "Digite o primeiro numero:");
        int numero1 = sc.nextInt();
        System.out.print(   "Digite o segundo numero:");
        int numero2 = sc.nextInt();

        //compara os dois numeros
        
        if (numero1 > numero2){
        System.out.println("O maior numero e:"+ numero1);
        System.out.println("O menor numero e:"+ numero2);

        } else if (numero2 > numero1){
        System.out.println("o maior numero e o:"+ numero2);
        System.out.println("o menor numero e o:"+ numero1);

        } else {
            System.out.println("os dois numeros sao iguais");
        }

        sc.close();
    } 
}






    

  