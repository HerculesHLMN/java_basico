import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] valor = { 10, 20, 30, 40, 50};

        System.out.println();
        for (int i = valor.length - 1; i >= 0; i--) {
            System.out.printf(valor[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}
