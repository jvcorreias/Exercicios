package Slide2;

/* 9. Leia a quantidade de kWh consumidos e o valor de cada kWh.
Calcule o valor da conta. Se o consumo for menor que 150 kWh,
aplique 10% de desconto. Mostre o valor da conta final */

import java.util.Scanner;


public class Ex9{
	
	public static void main(String [] args) {
		
		float consumo, valor, conta;
		
		Scanner teclado =  new Scanner(System.in);
		
		System.out.println("Digite a quantidade de KWh consumidos: ");
		
		consumo = teclado.nextFloat();
		
		System.out.println("Digite o valor do KWh: ");
		
		valor = teclado.nextFloat();
	
		conta = consumo * valor;
		
		if(consumo < 150) {
			System.out.printf("Conta final: R$%.2f \n", (conta*0.9));
		}else {
			System.out.printf("Conta final: R$%.2f \n", conta);
		}
		
		teclado.close();
	
	}
}