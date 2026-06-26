import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        String cadastro;

        double lanche;
        double bebida;
        double total;
        double desconto;
        double totalFinal;
        double valorPago;

        System.out.println();
        System.out.print("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.print("Digite o valor do lanche: R$ ");
        lanche = sc.nextDouble();
        System.out.print("Digite o valor da bebida: R$ ");
        bebida = sc.nextDouble();

        sc.nextLine();

        System.out.println();
        System.out.print("Aluno possui cadastro? (S/N): ");
        cadastro = sc.nextLine();
        System.out.print("Digite o valor pago: R$ ");
        valorPago = sc.nextDouble();

        total = lanche + bebida;

        if (cadastro.equals("S") || cadastro.equals("s")) {
            desconto = total * 0.10;
        } else {
            desconto = 0;
        }

        totalFinal = total - desconto;

        System.out.println("\nResumo da Compra\n");
        System.out.println("Aluno: " + nome);
        System.out.printf("Total sem desconto: R$ %.2f%n", total);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Total final: R$ %.2f%n", totalFinal);
        System.out.printf("Valor pago: R$ %.2f%n", valorPago);

        if (valorPago > totalFinal) {
            System.out.printf("Troco: R$ %.2f%n", valorPago - totalFinal);
        } else if (valorPago == totalFinal) {
            System.out.println("Pagamento exato. Não há troco.");
        } else {
            System.out.println("Pagamento insuficiente.");
            System.out.printf("Faltam R$ %.2f%n", totalFinal - valorPago);
        }

        sc.close();
    }
}

