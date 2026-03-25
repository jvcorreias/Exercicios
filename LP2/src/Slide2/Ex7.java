package Slide2;

import java.util.Scanner;

/* 7. Leia dois números reais e mostre qual é o maior e qual é o menor. */

public class Ex7{
	
	public static void main(String [] args) {
		
		double a, b;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		
		a = teclado.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		
		b = teclado.nextDouble();
		
		if(a>b) {
			System.out.printf("Maior: %f, Menor: %f \n", a, b);
			
		}else if(a == b) {
			System.out.println("Os valores são iguais.");
		}
		else {
			System.out.printf("Maior: %f, Menor: %f \n", b, a);
			
		}
		
		teclado.close();
		
		
	}
	
	
}