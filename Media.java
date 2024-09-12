import java.util.Scanner;
public class Media {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota:");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota:");
        double nota2 = sc.nextDouble();

        double media  = (nota1 + nota2) /2;

        System.out.println("A media da nota e de:"+media);

        if (media <7){
            System.out.println("Reprovado" + media);
    

        }

        else {
            System.out.println("Aprovado");

        }


        sc.close();
    }
    
}
