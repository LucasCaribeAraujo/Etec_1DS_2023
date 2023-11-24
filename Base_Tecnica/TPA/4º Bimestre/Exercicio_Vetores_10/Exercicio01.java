import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        final int QUANT_LER = 20;
        Scanner ler = new Scanner(System.in);

        int[] vetorA = new int[QUANT_LER];
        int[] vetorB = new int[QUANT_LER];

        int indexPares = 0;
        int indexImpares = QUANT_LER - 1;

        for (int i = 0; i <= (QUANT_LER - 1); i++) {
            System.out.printf("digite o %dº numero: ", (i+1));
            vetorA[i] = ler.nextInt();

            if ((vetorA[i] % 2 == 0)) {
                vetorB[indexPares] = vetorA[i];
                indexPares++;
            } else {
                vetorB[indexImpares] = vetorA[i];
                indexImpares--;
            }
        }

        System.out.println("valores de B: ");

        for (int atual : vetorB) {
            System.out.println(atual);
        }

        System.out.println("FIM DO PROGRAMA");
        ler.close();
    }
}
