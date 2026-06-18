import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] quad = new int[5];


        System.out.println();
        for (int i = 0; i < quad.length; i++) {
            quad[i] = i * i;
        }

        for (int n : quad) {
            System.out.print(n + " ");  // 0 1 4 9 16
        }

        System.out.println();
        sc.close();

    }
}
