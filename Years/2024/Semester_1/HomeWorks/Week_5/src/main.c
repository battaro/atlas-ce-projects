#include <stdio.h>
#include <stdlib.h>
#include "mylib.h" //include header file

int main()
{
	// local variables ax ^2 , bx, c
	float a, b, c;
	printf("Enter the value of a : ");
	scanf("%f", &a);
	printf("Enter the value of b : ");
	scanf("%f", &b);
	printf("Enter the value of c : ");
	scanf("%f", &c);

	// returning quadratic solution in my pointer array x1 = s[0] , x2 = s[1]
	float *_Solution = Quadratic(&a, &b, &c);

	// checking if solution is not null
	if (_Solution != NULL)
	{
		printf("x1 = %f\n", _Solution[0]);
		printf("x2 = %f\n", _Solution[1]);
	}
}
/*
Goal (this HW is optional these are my notes):

	-Write a C program that calculate x1,x2 of a quadratic equation ax^2 + bx + c = 0.
	-You must use the pointers and your own library function.

Program Notes:
	-This Program will use the Quadratic function to calculate x1 and x2 of a quadratic equation ax^2 + bx + c = 0.
	-more details README.md file

Additional Notes:
	-Here is the link to my Home Works Folder on Google Drive: https://drive.google.com/drive/u/5/folders/11g7-FlkmqQiGyGJTDr-Qp9RUJFsGopP1
	it should automatically sync all my homework.
	-My github repository link: https://github.com/battaro/atlas-ce-projects
*/