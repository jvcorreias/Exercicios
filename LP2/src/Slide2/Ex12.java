package Slide2;

/* 12. Leia os três lados de um triângulo e mostre se ele é equilátero, isósceles ou
escaleno. */

import java.util.Scanner;

public class Ex12{
	
	public static void main(String [] args) {
		
		float l1, l2, l3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o comprimento do primeiro lado: ");
		
		l1 = teclado.nextFloat();
		
		System.out.println("Digite o comprimento do segundo lado: ");
		
		l2 = teclado.nextFloat();
		
		System.out.println("Digite o comprimento do terceiro lado: ");
		
		l3 = teclado.nextFloat();
	
		if(l1 == l2 && l2 == l3) {
			System.out.println("Triangulo Equilatero.");
			
		}else if(l1==l2 || l2==l3 || l3==l1) {
			System.out.println("Triangulo Isosceles.");
			
		}else {
			System.out.println("Triangulo Escaleno.");
			
		}
		
		teclado.close();
	}
	
	
	
}