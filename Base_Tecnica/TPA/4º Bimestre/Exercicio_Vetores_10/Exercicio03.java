public class Exercicio03 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] vetorA = new int[10];

    for (int i = 0; i < (vetorA.length - 1); i++) {
      System.out.printf("digite o %dº valor: ", i+1);
      vetorA[i] = scan.nextInt();

      int contador = 0;

      for (int c = 1; c <= vetorA[i]; c++) {
        if (vetorA[i] % c == 0) {
          contador++;
        }
     }
        if (contador == 2) {
          System.out.println("É primo");
        } else if (contador != 2 || vetorA[i] < 1) {
          System.out.println("Não é primo");
        }
      
    }
    
    scan.close();
  }
}
