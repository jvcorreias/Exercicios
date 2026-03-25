package Slide2;

import java.util.Scanner;

/* 3. Leia um valor em segundos e mostre esse tempo no formato h:m:s
(horas, minutos e segundos). */

public class Ex3{
	
	public static void main(String [] args) {
		
		int seg;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu valor em segundos: ");
		
		seg = teclado.nextInt();
		
		int horas = seg/(60*60);
		int minutos = (seg - (horas * 3600))/60; 
		seg = seg - (horas * 3600) - (minutos * 60);
		
		System.out.printf("Seus segundos correspondem a: %02d:%02d:%02d", horas, minutos, seg);
		
		teclado.close();
		
	}
	
	
	
}