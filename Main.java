
import java.util.Scanner;

//crie um hello world
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo a imersao Java");
        // System.out.println("Filme Matrix");


        int dataDeLancamento = 1999;
        double avalicacao = 4.5;
        boolean incluidoNoPlanoBasico = true;
        String nome = "Matrix";
        String sinopse = """
                O melhor filme do final do milenio
                """;

        double mediaDeAvaliacaoDoUsuario = 0;

        System.out.println("Filme: "+ nome);
        System.out.println(dataDeLancamento);
        System.out.println(avalicacao);
        System.out.println(incluidoNoPlanoBasico);

        double avalicacaoMedia = (4.8 + 4.5 + 3) / 3;
        System.out.println("Avaliação Média de Matrix: " + avalicacaoMedia);

        if (dataDeLancamento > 2023) {
            System.out.println("Filme popular no momento");
        } else {
            System.out.println("Filme retrô que vale pena a ver novamente");
        }
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Coloque a nota que você dá para o filme Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaDeAvaliacaoDoUsuario = mediaDeAvaliacaoDoUsuario + notaMatrix;
        }
        System.out.println("A média da nota do filme Matrix, calculada pelos usuários é: " + mediaDeAvaliacaoDoUsuario / 3);
    }
}