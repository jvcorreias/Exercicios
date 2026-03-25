package Slide2;

/*11. Leia um número real x e mostre-o arredondado. Se a parte decimal for menor
que 0.5, arredonde para baixo; se for maior ou igual a 0.5, arredonde para cima.*/

import java.util.Scanner;

public class Ex11{
	
	public static void main (String [] args) {
		
		double n;
		
		Scanner teclado  = new Scanner(System.in);
		
		System.out.println("Digite o numero a ser arredondado: ");
		
		n = teclado.nextDouble();
		
		//casting separando parte inteira em n2
		int n2 = (int) n;
		
		if(n-n2>=0.5) {
			System.out.printf("%d", n2+1);
		
		}else {
			System.out.printf("%d", n2);
		}
		
		teclado.close();
		
		
		
		
	}
	
}