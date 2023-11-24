
import java.util.Random;


public class Exercicio02 {

  public static void main(String[] args) {
    int[][] matriz = new int[3][3];
    
    Random random = new Random();
    
    for(int i=0; i<=matriz.length-1; i++){
        for(int j=0; j<= matriz[i].length-1; j++){
        	matriz[i][j] = random.nextInt() % 50;
        }
      }
    
    int menor=matriz[0][0];
    int maior = matriz[0][0];
    
    for(int i=0; i<=matriz.length-1; i++){
        for(int j=0; j<= matriz[i].length-1; j++){
        	if(matriz[i][j] <= menor) {
        		menor = matriz[i][j];
        	}
        	
        	if(matriz[i][j] >= maior) {
        		maior = matriz[i][j];
        	}
        }
      }
    
    for(int i=0; i<=matriz.length-1; i++){
    	   System.out.print("[");
    	     for(int j=0; j<= matriz[i].length-1; j++){
    	       System.out.print(matriz[i][j] == matriz[i][matriz[i].length -1] ? matriz[i][j] : matriz[i][j] + ", ");
    	     }
    	     System.out.println("]");
    	   }
    
    System.out.printf("O maior � %d %n e o menor valor �: %d",maior, menor);
  }

}
/*
b) Criar uma matriz de 3x3 de inteiros, que deverá ser preenchida aleatoriamente. Fazer 
uma busca que indique o maior e o menor valor da matriz e qual a posição em que ele 
está (qual a sua linha e coluna)
*/