import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = {7.5, 8.0, 6.5, 9.0, 5.5};
        double soma = 0;
        int acimaDaMedia = 0;

        for (double n : notas) soma += n;
        double media = soma / notas.length;

        System.out.println();
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

        for (double n : notas) {
            if (n > media) acimaDaMedia++;
        }
            System.out.println("Acima da média: " + acimaDaMedia);

        sc.close();
    }
}