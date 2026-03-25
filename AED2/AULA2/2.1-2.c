#include <stdio.h>

int somaArray(int A[], int n){
	int soma = A[0];
	//A variável soma contém os valores somados do Array no intervalo [0 - i-1]
	for(int i = 1; i<n; i++){

		soma += A[i];

	}
	//soma += A[i] garante que a cada iteração a variável soma guardará o valor correto
	return soma;
	//ao retornar a variável, a função garante que o valor esperado será retornado

}

int main(void){

	int A[5] = {1,2,3,4,5};
	int num = 5;
	int x = somaArray(A,num);
	printf("Soma: %d \n", x);

}
