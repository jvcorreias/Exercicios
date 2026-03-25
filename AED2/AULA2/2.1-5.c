#include <stdio.h>
#include <math.h>
#include <string.h>

void somaBin(int A[], int B[], int C[], int n){

	int temp = 0;

	for(int i = n-1; i>=0; i--){
		if(A[i] + B[i] + temp <= 1){
			C[i+1] = A[i] + B[i] + temp;
			temp = 0;
		}else if(A[i] + B[i] + temp == 2){
			C[i+1] = 0;
			temp = 1;

		}else if(A[i] + B[i] + temp == 3){
			C[i+1] = 1;
			temp = 1;
		}
		
	
	}
	C[0] = temp;

}


int main (){


	int A[4] = {1,1,0,1};
	int B[4] = {0,1,0,0};
	int C[5];
	int n = 4;
	somaBin(A, B, C, n);
	
	for(int i = 0; i<n+1; i++){
		printf("%d ", C[i]);

	}
	puts(" ");
}
