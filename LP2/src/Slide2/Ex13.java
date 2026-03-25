package Slide2;

/* 13. Leia um número inteiro de 1 a 7 e mostre o dia da semana correspondente (1 =
Domingo, 2 = Segunda, ..., 7 = Sábado). Utilize a estrutura switch-case para
resolver. */

import java.util.Scanner;

public class Ex13{
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int dia;
		
		System.out.println("Digite o numero do dia da semana (1 a 7): ");
		
		dia = teclado.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;	
		case 6:
			System.out.println("Sexta!");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Valor inválido");
		
		}
		
		teclado.close();
		
	}
	
}