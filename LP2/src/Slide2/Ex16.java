package Slide2;

/* 16. Leia um número inteiro n e mostre os números de 0 até n, caso n seja positivo. Se
n for negativo, mostre de n até 0. */

import java.util.Scanner;

public class Ex16{
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o seu numero: ");
		
		n = teclado.nextInt();
		
		if(n>0) {
			for(int i = 0; i<=n; i++) {
				System.out.printf("%d ", i);
				
			}
		}else {
			for(int i = n; i<=0; i++) {
				System.out.printf("%d ", i);
				
			}
		}
		
		teclado.close();
		
	}
	
	
}