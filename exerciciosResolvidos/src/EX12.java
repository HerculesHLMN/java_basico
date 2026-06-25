import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] v = { 64, 25, 12, 22, 11 };

        System.out.println();
        System.out.print("Antes:  ");
        for (int n : v) System.out.print(n + " ");

        for (int i = 0; i < v.length - 1; i++) {
            int iMin = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[iMin]) iMin = j;
            }
            int temp = v[i];
            v[i]    = v[iMin];
            v[iMin] = temp;
        }

        System.out.println();
        System.out.print("Depois: ");
        for (int n : v) System.out.print(n + " ");
        System.out.println();

        sc.close();
    }
}
