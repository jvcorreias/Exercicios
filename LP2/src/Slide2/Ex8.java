package Slide2;

/* 8. Leia um número inteiro n e mostre se ele é par ou ímpar. */

import java.util.Scanner;

public class Ex8{
	
	public static void main(String [] agrs) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o numero a ser verificado: ");
		
		n = teclado.nextInt();
		
		if(n%2 == 0) {
			System.out.println("O numero é par");
			
		}else {
			System.out.println("O numero é impar");
			
		}
		
		teclado.close();
		
	}
	
}