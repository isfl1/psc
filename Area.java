import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("qual o valor da  area diagonal maior?");
        double diagonalMaior = input.nextDouble();
        System.out.println("qual o valor da diagonal menor?");
        double diagonalMenor =  input.nextDouble();

        double area = diagonalMaior * diagonalMenor;

        System.out.println("o valor da area e:"+(area)/2);

        input.close();

    }
    
}
