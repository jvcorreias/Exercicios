package Slide2;

/* 14. Leia um caractere op representando uma operação aritmética (+, -, *, /) e dois
números reais a e b. Mostre a expressão */

import java.util.Scanner;

public class Ex14{
	
	public static void main(String [] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		char op;
		
		double a, b;
		
		System.out.println("Digite o operador a ser usado (+, -, *, /): ");
		
		op = teclado.next().charAt(0);
		
		System.out.println("Digite o primeiro numero: ");
		
		a  = teclado.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		
		b  = teclado.nextDouble();
		
		
		switch(op) {
		
		case '+':
			System.out.printf("A expresssao sera: %.2f %c %.2f = %.2f \n", a, op, b, a+b);
			break;
				
		case '-':
			System.out.printf("A expresssao sera: %.2f %c %.2f = %.2f \n", a, op, b, a-b);
			break;
			
		case '*':
			System.out.printf("A expresssao sera: %.2f %c %.2f = %.2f \n", a, op, b, a*b);
			break;
			
		case '/':
			System.out.printf("A expresssao sera: %.2f %c %.2f = %.2f \n", a, op, b, a/b);
			break;
			
		default:
			System.out.printf("Operador invalido.");
			
		}
		
		teclado.close();
		
		
	}
	
	
}

