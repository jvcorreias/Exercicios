package Slide2;

/* 10. Leia um número n, verifique e mostre se ele está dentro do intervalo entre 100 e
999.*/
import java.util.Scanner;

public class Ex10{
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double n;
		
		System.out.println("Digite o valor do seu numero: ");
		
		n = teclado.nextDouble();
		
		if (n>=100 && n<=999) {
			System.out.printf("%f pertence ao intervalo de 100 e 999 (inclusive) \n", n);
		}else {
			System.out.printf("%f não pertence ao intervalo de 100 e 999 (inclusive) \n", n);
		}
		
		teclado.close();
		
		
	}
	
}