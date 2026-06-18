import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] valor = {3, 7, 1, 9, 4, 6, 2, 8, 5};

        System.out.println();
        for (int i = 1; i < valor.length; i += 2){
            System.out.println("valor[" + i + "] = " + valor[i]);
        }

        sc.close();
    }
}
