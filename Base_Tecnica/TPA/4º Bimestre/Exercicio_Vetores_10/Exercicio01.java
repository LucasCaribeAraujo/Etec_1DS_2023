import java.util.Scanner;
public class Exercicio01 {
  public static void main(String[] args) {
    final int QUANT_LER = 20;
    Scanner scan = new Scanner(System.in);

    int[] vetorA = new int[QUANT_LER];
    int[] vetorB = new int[QUANT_LER];

    int indexPares = 0;
    int indexImpares = QUANT_LER - 1;

    for (int i = 0; i <= (QUANT_LER - 1); i++) {
      System.out.printf("digite o %dº numero: ", (i+1));
      vetorA[i] = scan.nextInt();

      if ((vetorA[i] % 2 == 0)) {
        vetorB[indexPares] = vetorA[i];
        indexPares++;
      } else {
        vetorB[indexImpares] = vetorA[i];
        indexImpares--;
      }
    }
    
    System.out.println("valores de B (impares): ");
    
    for (int i=indexImpares; i<=19; i++) {
      System.out.print(vetorB[i] + " ");
    }
    System.out.println("\n");
    System.out.println("valores de B (pares): ");
    
    for (int i=0; i<=indexPares - 1; i++) {
      System.out.print(vetorB[i] + " ");
    }
    System.out.println("\n");
    System.out.println("FIM DO PROGRAMA");

    scan.close();
  }
}
