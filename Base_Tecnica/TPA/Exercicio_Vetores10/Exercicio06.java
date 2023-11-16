import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        final int TAMANHO_ARRAY = 5;

        // LEITURA DOS 2 VETORES
        List<Integer> vetorA = new ArrayList<>();
        List<Integer> vetorB = new ArrayList<>();
        List<Integer> vetorC = new ArrayList<>();


        for (int i = 0; i <= (TAMANHO_ARRAY - 1); i++) {
            System.out.printf("Digite o %dº numero do vetor A: ", i + 1);
            vetorA.add(ler.nextInt());

            System.out.printf("Digite o %dº numero do vetor B: ", i + 1);
            vetorB.add(ler.nextInt());
        }

        for(Integer valor : vetorA){
            if(vetorB.contains(valor) && vetorC.contains(valor) == false){
                vetorC.add(valor);
            }
        }

        System.out.println("Os valores que tem intersecção são: ");
        for(Integer valor : vetorC){
            System.out.print(valor);
        }

        ler.close();
    }
}
