package Slide2;

/* 15. Leia um número inteiro n e mostre os números de 1 até n em ordem decrescente. */

import java.util.Scanner;

public class Ex15{
	
	public static void main (String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite seu numero: ");
		
		n = teclado.nextInt();
		
		for(int i = n; i>0; i--) {
			System.out.printf("%d ", i);
			
		}
		
		teclado.close();
		
		
	}
	
}