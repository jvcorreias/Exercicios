package Slide2;

import java.util.Scanner;

/* 5. Leia a massa e a altura de uma pessoa. Calcule e mostre o Índice de
Massa Corporal (IMC), usando a fórmula: IMC = massa ÷ (altura²) */

public class Ex5{
	
	public static void main(String [] args) {
		
		float massa;
		float altura;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a massa em kg: ");
		
		massa = teclado.nextFloat();
		
		System.out.println("Digite a altura em metros: ");
		
		altura = teclado.nextFloat();
		
		System.out.printf("O IMC é %.2f: \n", massa / (altura*altura));
		
		teclado.close();
		
	}
	
	
}