import java.util.Scanner;
public class MediaDe3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite a primeira nota:");
        double nota1 = sc.nextDouble();
         
        System.out.print("Digite a segunda nota:");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota:");
        double nota3 = sc.nextDouble();

            double media = (nota1+nota2+nota3)/3;
            System.out.println("A media e de:" + media);

            if  (media >=0 &&  media <3){
                System.out.println("reprovado");
            }

             else if (media >=3 && media <7){
                System.out.println("Exame");

            }

            else if(media >7 && media <=10){
                System.out.println("Aprovado");

            }
             else {
                System.out.println("nota invalida");
             }



        
         

        sc.close();
    }
    
}
