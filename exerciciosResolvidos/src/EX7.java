import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = { 7.5, 8.0, 6.5, 9.0, 5.5};

        double soma = 0;

        for (double nota : notas) soma += nota;

        double media = soma / notas.length;


    }
}
