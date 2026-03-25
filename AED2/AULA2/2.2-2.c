#include <stdio.h>
#include <string.h>


void selection(int A[], int n){
	
	for(int i = 0; i<n-1; i++){
		int min = i;
		int j = i+1;
		
		for(int c = 0; c<n; c++){
			printf("%d ", A[c]);
		}
		puts(" ");


		for(j; j<n; j++){
			if(A[min]>A[j]){
				min = j;

			}

		}
		int temp = A[i];
		A[i] = A[min];
		A[min] = temp;



	}


}


int main (){

	int A[5] = {5,4,3,2,1};
	int n = 5;
	selection(A, n);

	for(int i = 0; i<n; i++){
		printf("%d ", A[i]);
	}
	puts(" ");
}	
