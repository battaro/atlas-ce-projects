#include <stdlib.h>
#include <stdio.h>
#include "mylib.h" //include header file
#include <math.h>

// create a pointer array to store the solution
float *Quadratic(float *a, float *b, float *c) // three input parameters
{
	float *Solution = (float *)malloc(sizeof(float) * 2); // array of the solution that will be returned
	float discr = (*b * *b) - (4 * *a * *c);			  // discriminant

	// check if discriminant is negative
	if (discr < 0)
	{
		// if negative, no real roots
		printf("no real roots\n");
		free(Solution); // free the pointer array
		return NULL;
	}

	// if discriminant is positive
	// calculate x1 and x2
	Solution[0] = (-*b + discr) / (2 * *a); // x1
	Solution[1] = (-*b - discr) / (2 * *a); // x2

	return Solution; // return the pointer array
}