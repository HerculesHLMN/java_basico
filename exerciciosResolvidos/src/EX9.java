import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] valor = { 12, 5, 33, 7, 28, 14, 9 };
        int alvo = 28;
        int posicao = -1;

        for (int i = 0; i < valor.length; i++) {
            if (valor[i] == alvo) {
                posicao = i;
                break;
            }
        }

        System.out.println();
        System.out.println(posicao == -1 ? "Não encontrado" : "Encontrado em posição [" + posicao + "]");

        sc.close();
    }
}
