package Slide2;

import java.util.Scanner;

/* 6. Leia as notas de ap1 e ap2, calcule a média do aluno e mostre
“Aprovado” se média for ≥ 7, senão mostre “Reprovado”. */

public class Ex6{
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float ap1, ap2, media;
		
		System.out.println("Digite a nota ap1: ");
		
		ap1 = teclado.nextFloat();
		
		System.out.println("Digite a nota ap2: ");
		
		ap2 = teclado.nextFloat();
		
		media = (ap1 + ap2) / 2;
		
		System.out.printf("Sua nota final foi %.2f. \n", media);
		
		if (media >= 7) {
			System.out.println("Resultado: Aprovado");
			
		}else if(media>=4) {
			System.out.println("Resultado: Prova final");
			
		}else {
			System.out.println("Resultado: Reprovado");
			
		}
		
		
		teclado.close();
		
	}
	
	
	
}