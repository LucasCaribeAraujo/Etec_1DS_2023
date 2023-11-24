import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		//Scanner
		
		Scanner in = new Scanner (System.in);
		
		//variaveis
		
		int resposta = 1, n;
		
		// Programa
		
		System.out.println("Informe o valor a qual deve ser multiplicado");
		n = in.nextInt();
		
		// While
		
		while (n!=1) {
				resposta = resposta *n;
		n = n-1;
		}
		
		System.out.println("O valor final é " + resposta);
		
		in.close();
	}
}
