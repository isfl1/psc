import java.util.Scanner;

public class Imc {


    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Qual seu peso em kg?");
    double peso = sc.nextDouble();

    System.out.print("Qual sua altura em metros?");
    Double altura = sc.nextDouble();

    double imc = peso/Math.pow(altura, 2);
    String situacao;

    if (imc < 20){
    situacao="Abaixo do peso";
    }

  else if (imc >= 20 && imc < 25){
   situacao="peso normal";
  }
  else if (imc >= 25 && imc < 30){
       situacao="sobre peso";
  }
  else if (imc >=30 && imc <40 ){
   situacao="obeso";

  }
 else {
    situacao= "obeso morbido";
 }



 System.out.printf("Seu IMC é %.2f e a sua situação é: %s%n", imc, situacao);




sc.close();
    }
    
}
