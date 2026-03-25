#include <stdio.h>
#include <string.h>


void insertion(int A[], int n){

	for(int i = 1; i<n; i++){
		//"selecionando" valor atual a ordenar, valores de 0a até i-1 estão ordenados
		int temp = A[i];

		int j = i-1;
		
		for(int p = 0; p<n; p++){
		
		printf("%d", A[p]);
		}
		printf("\ntemp: %d \n", temp);

		//A cada vez que o while chega ao fim, os valores de 0 até i-1 estão mantido corretamente ordenados
		while(j>=0 && A[j]<temp){
			A[j+1] = A[j];
			j--;	
			for(int p = 0; p<n; p++){
			
			printf("%d", A[p]);
			}
			printf("\ntemp: %d \n", temp);


		}
		A[j+1] = temp;
	
	}

	
}


int main (void){

	int A[5] = {1,2,3,4,5};
	int n = 5;

	insertion(A, n);

	//por se tratar de um procedimento, não há retorno, então o loop abaixo imprime os elementos como garantia visual de que está corretamente ordenado
	for(int p = 0; p<n; p++){
		
		printf("%d", A[p]);

	}
	puts("\n");
}
