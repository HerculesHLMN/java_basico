import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] m = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "	");
            }
            System.out.println();
        }

        int diag = 0;
        for (int i = 0; i < m.length; i++) {
            diag += m[i][i];
        }
        System.out.println();
        System.out.println("Diagonal: " + diag);

        sc.close();
    }
}
