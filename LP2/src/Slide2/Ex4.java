package Slide2;

import java.util.Scanner;

/* 4. Leia o valor do salário de uma pessoa e um percentual de aumento.
Depois, mostre o novo salário com o aumento aplicado. */

public class Ex4{
	
	public static void main(String [] args) {
		
		double salario;
		String aumento;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu salário: ");
		
		salario = teclado.nextDouble();
		
		System.out.println("Digite a porcentagem de aumento (ex '20%) :   ");
		
		aumento = teclado.next();
		
		String limpa = aumento.replace("%", "").replace(",",".");
		
		double porcentagem = Double.parseDouble(limpa);
		
		System.out.printf("Seu novo salario sera igual a R$%.2f \n", salario * ((porcentagem/100)+1));
		
		teclado.close();
		
		
		//abaixo, código antigo, não funcionando caso usuário digite "%".
		
		/*
		 
		float salario;
		float aumento;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o seu salário");
		
		salario = teclado.nextFloat();
		
		System.out.println("Digite a porcentagem de aumento (ex '20'%) :   ");
		
		aumento = teclado.nextFloat();
		
		System.out.printf("Seu novo salario sera igual a R$%.2f \n", salario * ((aumento/100)+1));
		
		*/
		
	}
	
	
}