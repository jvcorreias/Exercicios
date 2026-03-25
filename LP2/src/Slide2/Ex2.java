package Slide2;

import java.util.Scanner;

/*
2. Leia dois números inteiros e mostre na tela a soma, a subtração, a
multiplicação e a divisão entre eles.
*/

public class Ex2{
	
	public static void main(String [] args) {
		
		int a;
		float b;
		
		Scanner teclado  = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número das operações: ");
		
		a = teclado.nextInt();
		
		System.out.println("Digite o segundo número das operações: ");
		
		b = teclado.nextFloat();
		
		System.out.printf("Soma: %.2f, Subtração: %.2f, Multiplicação: %.2f, Divisão: %.2f \n", a+b, a-b, a*b, a/b);
		
		teclado.close();
		
	}
	
}