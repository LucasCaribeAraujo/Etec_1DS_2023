public class Exercicio04 {

  public static void main(String[] args) {

    double[] vetorA = new double[11];

    double resultPotencia = 2;

    for (int i = 0; i <= (vetorA.length - 1); i++) {
      if(i==0){
        resultPotencia = Math.pow(resultPotencia, 2);
      } else{
        resultPotencia = Math.pow(resultPotencia,vetorA[i-1]);
      }
      
      vetorA[i] = resultPotencia;
    }

    for (double atual : vetorA) {
      System.out.println(atual);
    }
  }
}
