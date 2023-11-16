public class Exercicio04 {
    public static void main(String[] args) {

        int[] vetorA = new int[11];

        int resultPotencia = 0;

        for (int i = 0; i <= (vetorA.length - 1); i++) {

            for (int c = 1; c <= i; c++) {
                resultPotencia = resultPotencia * 2;
            }

            vetorA[i] = resultPotencia;

            resultPotencia = 1;
        }

        for (int atual : vetorA) {
            System.out.println(atual);
        }
    }
}

