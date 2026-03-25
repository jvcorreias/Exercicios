package Slide2;

import java.util.Scanner;

/*
1. Leia o nome de uma pessoa e a sua idade. Depois, mostre uma
mensagem como: “Maria tem 20 anos”. */

public class Ex1{
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nome;
		int idade;
		
		
		System.out.println("Qual é o seu nome?");
		
		nome = teclado.nextLine();
		
		System.out.println("Qual a sua idade? ");
		
		idade = teclado.nextInt();
		
		System.out.printf("%s tem %d anos. \n", nome, idade);
		
		teclado.close();

		
	}
	
	
}

