#include <stdio.h>

int indiceV(int A[], int n, int v){

	//condição do for garante que de A[0] até i-1 código irá idetificar corretamente se v foi encontrado
	for(int i = 0; i<n; i++){
		if(A[i] == v){
			return i;
		}

	}
	//se não foi retornado no for, não está presente no Array, garante que retornará -1 (como null) como pede o exercício
	return -1;



}


int main(){

	int A[5] = {1,2,3,4,5};
	int n = 5;
	int v = 4;
	int x = indiceV(A, n, v);
	printf("indice: %d \n", x);


}
