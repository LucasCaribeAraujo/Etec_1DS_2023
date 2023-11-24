import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetorA =new int[10];
        int valorVerificar = 5;

        for(int i=0; i<=(vetorA.length - 1); i++) {
            System.out.printf("digite o %dº numero", i+1);
            vetorA[i] = ler.nextInt();
        }

        boolean estaNoVetor = false;

        for(int atual : vetorA) {
            if(atual == valorVerificar) {
                estaNoVetor = true;
            }
        }

        System.out.print("o valor está no vetor? ");
        System.out.println(estaNoVetor ? "Sim" : "Não");

        ler.close();
    }

}
