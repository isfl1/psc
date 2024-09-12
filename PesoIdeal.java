import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("informe seu sexo digite 1 para mulher ou 2 para homem:");
        int sexo = sc.nextInt();

    


    System.out.print("informe sua altura em metros:");
    double altura = sc.nextDouble();


    Double pesoIdeal;

    if (sexo == 1 ){
        pesoIdeal = (62.1* altura)- 44.7;
    }

    else if (sexo == 2){
        pesoIdeal = (72.7* altura)-58;


    }

    else {
        System.out.println("sexo invalido");

        sc.close();
        return;

    }

  


   System.out.printf("O seu peso ideal e:%.2f kg\n", pesoIdeal);

   sc.close();


}

}

