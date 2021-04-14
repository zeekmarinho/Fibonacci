package teste;

import java.util.Scanner;

import entidade.Fibonacci;

public class Teste {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número para análise se ele se encontra na sequencia de Fibonacci");
		int n = sc.nextInt();
		Fibonacci.sequencia(n);
		sc.close();
		
	}

}
