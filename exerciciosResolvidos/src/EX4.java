import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        String[] cidades = {"São Paulo", "Rio", "Curitiba", "Salvador", "Fortaleza"};

        for (String cidade : cidades) {
            System.out.println(cidade.toUpperCase());
        }

        sc.close();

    }
}
