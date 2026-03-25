#include <stdio.h>
#include <string.h>


void merge(int A[], int ini, int meio, int fim){

	int i = ini;
	int j = meio+1;
	int k = 0;

	int B[fim-ini+1];


	while(i<=meio && j<=fim){
	
		if(A[i]<A[j]){
			B[k] = A[i];
			i++;
			k++;
		}else{
			B[k] = A[j];
			j++;
			k++;
		}
	
	}	
	while(i<=meio){
		B[k] = A[i];
		i++;
		k++;
	}
	while(j<=fim){
		B[k] = A[j];
		j++;
		k++;
	}

	for(int d = 0; d<k; d++){
		A[ini+d] = B[d];

	}




}

void mergeSort(int A[], int ini, int fim){


	int meio = (fim+ini)/2;

	for(int i = 0; i<8; i++){
		printf("%d ", A[i]);
	} 
	puts("");
	
	if(fim>ini){

		mergeSort(A, ini, meio);

		mergeSort(A, meio+1, fim);
	}

	merge(A, ini, meio, fim);


}




int main (){

	int A[8] = {3, 41, 52, 26, 38, 57, 9, 49};
	int ini = 0;
	int fim = 7;
	
	for(int i = 0; i<8; i++){
		printf("%d ", A[i]);
	} 
	puts("");
	
	mergeSort(A, ini, fim);

	for(int i = 0; i<8; i++){
		printf("%d ", A[i]);
	} 
	puts("");
}
