package Slide2;

/* 17. Leia um número inteiro n e mostre todos os divisores de n. */

import java.util.Scanner;

public class Ex17{
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o seu número: ");
		
		n = teclado.nextInt();
		
		for(int i = 1; i<n; i++) {
			if(n%i==0) {
				System.out.printf("%d ", i);
			}
			
		}
		
		teclado.close();
		
	}
	
}

