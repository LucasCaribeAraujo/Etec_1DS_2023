import java.util.Random;
public class Exercicio05 {
  public static void main(String[] args) {
    

    int[] vetorA = new int[5];
    int[] vetorB = new int[5];
    
    Random random = new Random();
    
    for(int i=0; i<=(vetorA.length - 1); i++){
      vetorA[i] = random.nextInt() % 50;
    }
    
    for(int i=0; i<=(vetorA.length - 1); i++){
      int result = 1;
        
      System.out.printf("%d! = ", vetorA[i]);
              
      for(int c=vetorA[i]; c>0; c--){
        result *= c;
        System.out.printf("%d", c);
        
        System.out.print(c != 1 ? " x " : "");
      }
      
      vetorB[i] = result;
      System.out.printf(" = %d%n", result);
    }
    
    
  }
}
