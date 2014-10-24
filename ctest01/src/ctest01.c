/*
 ============================================================================
 Name        : ctest01.c
 Author      : 
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(void) {
/*	int i = 20;
//	float f = 3.14f;
	int* p = &i;
	*p = 30;

	printf("i = %d", i);
	printf("i의 주소= %x", p);*/
    /*int i;
	int scores[5];
	scores[0] = 100;
	scores[1] = 90;
	scores[2] = 80;
	scores[3] = 70;
	scores[4] = 60;
	for (i = 0; i <5; i++){
		printf("%d => %d\n",i,scores[i]);*/
	int scores[5];
	int*p = &scores[0];

	*p=100;

        *(p+1)=90;
        *(p+2)=80;
        *(p+3)=70;
        *(p+9)=60;
        p[1]=66;
		int i;
		for (i = 0; i <10; i++){
			printf("@@ %d => %d\n",i,*(p+i));
	}
}
