import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i <= (vetorA.length - 1); i++) {
            System.out.print("digite o " + (i + 1) + "° numero: ");
            vetorA[i] = ler.nextInt();
        }

        for (int atual : vetorA) {
            for (int i = 0; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", atual, i, (atual * i));
            }
            System.out.println("--------------------");
        }
        ler.close();
    }
}
