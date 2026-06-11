import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = { 10, 20, 30, 40, 50 };

        System.out.println();

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        sc.close();

    }
}
