import java.util.Scanner;
public class Exercicio4 {
	 public static void main(String[] args) {
		
		 // Scanner 
		 
		 Scanner in = new Scanner (System.in);
		 
		 // Variaveis 
		 
		 int contador = 0, n, valor1 = 0, valor2 = 1;
		 
		 // While
		 
		 System.out.println("Até que valor a sequencia deve ir?");
		 
		 n = in.nextInt();
		 
		 while (contador!=n) {
			 System.out.print(valor1 + ", ");
			 
			 int novoValor = valor1 + valor2;
			 valor1 = valor2;
			 valor2 = novoValor;
			 
			 contador++;
		 }
		 
		 in.close();
	}
}
