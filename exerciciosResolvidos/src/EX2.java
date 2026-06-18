import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] valor = { 5, 3, 8, 1, 9, 4, 7 };

        System.out.println("\nPrimeiro: " + valor[0]);
        System.out.println("Último: " + valor[valor.length - 1]);
        System.out.println("Central: " + valor[valor.length/ 2]);

        sc.close();

    }
}
