    
import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número total de eleitores
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        // Solicita o número de votos para o primeiro candidato
        System.out.print("Digite o número de votos do primeiro candidato: ");
        int votosCandidato1 = scanner.nextInt();

        // Solicita o número de votos para o segundo candidato
        System.out.print("Digite o número de votos do segundo candidato: ");
        int votosCandidato2 = scanner.nextInt();

        // Calcula o total de votos válidos
        int votosValidos = votosCandidato1 + votosCandidato2;

        // Calcula o número de votos nulos
        int votosNulos = totalEleitores - votosValidos;

        // Calcula os percentuais
        double percentualCandidato1 = (votosCandidato1 * 100.0) / totalEleitores;
        double percentualCandidato2 = (votosCandidato2 * 100.0) / totalEleitores;
        double percentualVotosNulos = (votosNulos * 100.0) / totalEleitores;

        // Exibe os resultados
        System.out.printf("Percentual de votos do primeiro candidato: %.2f%%%n", percentualCandidato1);
        System.out.printf("Percentual de votos do segundo candidato: %.2f%%%n", percentualCandidato2);
        System.out.printf("Percentual de votos nulos: %.2f%%%n", percentualVotosNulos);

        scanner.close();
    }
}
