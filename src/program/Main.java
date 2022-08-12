package program;

/*
beecrowd | 1153 - Fatorial Simples

Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

Entrada
A entrada contém um valor inteiro N (0 < N < 13).

Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int soma = n;
		int total = n;

		for (int i = 1; i < n; i++) {
			
			soma -= 1;
			total *= soma;
		}
		
		System.out.println(total);
		sc.close();
	}
}