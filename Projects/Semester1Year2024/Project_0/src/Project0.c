#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <time.h>
#include <unistd.h>
#include <windows.h>

#pragma region Function Prototypes
// function prototypes

// 2d array functions
void FillTable(int numbers[8][8]);
void PrintTable(int numbers[8][8]);
void ColumnSum(int numbers[8][8]);
void RowSum(int numbers[8][8]);
void NewTableZero_Nine(int numbers[8][8]);
void DigitCounter(int numbers[8][8]);
void DigitCounterInTable(int numbers[8][8]);
void DigitCounterInTableCompressed(int numbers[8][8]);
void MaxOf2x2(int numbers[8][8]);
void SearchTable(int numbers[8][8]);

// User experience
void progressBar(int sleepTime);
void WelcomeScreen();
void FunctionsInfo(char functions[100]);
void StepsList();

// coloring
void SetColor(int color);

#pragma endregion

#pragma region 2d Array Functions
void FillTable(int numbers[8][8]) // step 1.1
{
	// fill the 2d array with random numbers
	for (int i = 0; i < 8; i++)
	{
		for (int j = 0; j < 8; j++)
		{
			numbers[i][j] = rand() % 10; // generate a random number between 0 and 9
		}
	}
}
void PrintTable(int numbers[8][8]) // step 1.2
{
	FunctionsInfo("Print Table");

	// print the 2d array
	for (int i = 0; i < 8; i++)
	{
		Sleep(50); // delay for 0.05 seconds
		for (int j = 0; j < 8; j++)
		{
			printf("%d ", numbers[i][j]);
		}
		printf("\n");
	}
	printf("\n");
}
void RowSum(int numbers[8][8]) // step 2
{
	FunctionsInfo("Row Sums");
	for (int i = 0; i < 8; i++)
	{
		int result = 0; // reset the result because we are in a new row
		for (int j = 0; j < 8; j++)
		{
			result = result + numbers[i][j];
		}
		printf("Sum of numbers in row %d is %d\n", i + 1, result);
		Sleep(50);
	}
	printf("\n");
}
void ColumnSum(int numbers[8][8]) // step 3
{
	FunctionsInfo("Column Sums");

	for (int i = 0; i < 8; i++)
	{
		int result = 0; // reset the result because we are in a new column
		for (int j = 0; j < 8; j++)
		{
			result += numbers[j][i];
		}
		Sleep(50);
		printf("Sum of numbers in column %d is %d\n", i + 1, result);
	}
	printf("\n");
}
void NewTableZero_Nine(int numbers[8][8]) // step 4
{
	FunctionsInfo("New Table 0-9");
	int zeroNineTable[8][8];

	// make a copy of the 2d array
	for (int i = 0; i < 8; i++)
	{
		for (int j = 0; j < 8; j++)
		{
			zeroNineTable[i][j] = numbers[i][j];
		}
	}

	for (int i = 0; i < 8; i++)
	{
		for (int j = 0; j < 8; j++)
		{
			// if the number is greater than 4 replace it with 9
			if (zeroNineTable[i][j] > 4)
			{
				zeroNineTable[i][j] = 9;
			}

			// if the number is less than 4 replace it with 0
			else
			{
				zeroNineTable[i][j] = 0;
			}
		}
	}

	// print the new table
	for (int i = 0; i < 8; i++)
	{
		Sleep(50);
		for (int j = 0; j < 8; j++)
		{
			printf("%d ", zeroNineTable[i][j]);
		}
		printf("\n");
	}

	printf("\n");
}
void DigitCounter(int numbers[8][8]) // step 5
{
	FunctionsInfo("Digit Counter");
	int numCounter;

	// here number counter will count how many times a number appears in the table
	for (int i = 0; i <= 9; i++) // 0 - 9
	{
		numCounter = 0; // reset the number counter

		// go through the 2d array row by row and column by column
		for (int j = 0; j < 8; j++)
		{
			for (int k = 0; k < 8; k++)
			{
				if (numbers[j][k] == i)
				{
					numCounter++; // increase the number counter
				}
			}
		}

		printf("Number %d occurs %d times\n", i, numCounter);
		Sleep(50);
	}

	printf("\n");
}
void DigitCounterInTable(int numbers[8][8]) // step 6
{

	FunctionsInfo("Digit Counter In Table");

	int numCounter[10] = {0}; // Array to store counts of digits 0-9
	int maxCount = 0;

	// Count occurrences of each digit (0-9) in the 2D array
	for (int j = 0; j < 8; j++)
	{
		for (int k = 0; k < 8; k++)
		{
			numCounter[numbers[j][k]]++; // Increment the count for this digit
			if (numCounter[numbers[j][k]] > maxCount)
			{
				maxCount = numCounter[numbers[j][k]]; // Track the maximum count
			}
		}
	}

	// print x or spaces to align the table according to the maximum count
	for (int i = maxCount; i > 0; i--)
	{
		Sleep(20);
		printf("%2d ", i); // print the count in decreasing i use %2d to be sure it's 2 digits long
		for (int j = 0; j < 10; j++)
		{
			if (numCounter[j] >= i) // if the count is greater than or equal to the current row number
			{
				printf("X "); // Print 'X' if the count is greater than or equal to the current row number
			}
			else
			{
				printf("  "); // if its not, print spaces to align the table
			}
		}
		printf("\n");
	}

	// Print the bottom row with the numbers 0-9
	printf("   "); // Align with the first part
	for (int j = 0; j <= 9; j++)
	{
		Sleep(20);
		printf("%d ", j);
	}
	printf("\n");

	printf("\n");
}

void DigitCounterInTableCompressed(int numbers[8][8]) // step 7
{

	FunctionsInfo("Digit Counter In Table Compressed");

	int numCounter[10] = {0};	// Array to store counts of digits 0-9
	int SumNumCounter[5] = {0}; // array to store the count compressed like : count of 0 + count of 1 ....
	int maxCount = 0, maxSum = 0;

	// Count occurrences of each digit (0-9) in the 2D array
	for (int j = 0; j < 8; j++)
	{
		for (int k = 0; k < 8; k++)
		{
			numCounter[numbers[j][k]]++; // Increment the count for this digit
			if (numCounter[numbers[j][k]] > maxCount)
			{
				maxCount = numCounter[numbers[j][k]]; // Track the maximum count
			}
		}
	}

	for (int i = 0; i < 5; i++)
	{
		SumNumCounter[i] = numCounter[2 * i] + numCounter[2 * i + 1]; // count of 0 + count of 1 ....

		// calculate the maximum count in the array
		if (SumNumCounter[i] > maxSum)
		{
			maxSum = SumNumCounter[i];
		}
	}

	// print x or spaces to align the table according to the maximum count
	for (int i = maxSum; i > 0; i--)
	{
		Sleep(20);
		printf("%2d ", i); // print the count in decreasing i use %2d to be sure it's 2 digits long
		for (int j = 0; j < 5; j++)
		{
			if (SumNumCounter[j] >= i) // if the count is greater than or equal to the current row number
			{
				printf("X "); // Print 'X' if the count is greater than or equal to the current row number
			}
			else
			{
				printf("  "); // Otherwise, print spaces to align the table
			}
		}
		printf("\n");
	}

	// Print the bottom row with the numbers 0-9
	printf("   "); // Align with the first part
	for (int j = 1; j <= 9; j += 2)
	{
		Sleep(20);
		printf("%d ", j);
	}
	printf("\n");

	printf("\n");
}

void MaxOf2x2(int numbers[8][8])
{

	FunctionsInfo("Max Of 2x2");

	int max[4][4] = {0}; // new 4x4 to store the max of each 2x2
	for (int row = 0; row < 8; row += 2)
	{
		for (int col = 0; col < 8; col += 2)
		{
			int currentMax = numbers[row][col]; // start with the first number

			// go through the 2x2 grid
			for (int i = 0; i < 2; i++)
			{
				for (int j = 0; j < 2; j++)
				{
					if (numbers[row + i][col + j] > currentMax)
					{
						currentMax = numbers[row + i][col + j];
					}
				}
			}
			max[row / 2][col / 2] = currentMax;
		}
	}

	// print the 4x4 matrix
	for (int i = 0; i < 4; i++)
	{
		Sleep(50);
		for (int j = 0; j < 4; j++)
		{
			printf("%d ", max[i][j]);
		}
		printf("\n");
	}

	printf("\n");
}

void SearchTable(int numbers[8][8])
{

	FunctionsInfo("Search Table");

	printf("Please enter a 2x2 grid to search closest in table: \n");
	int search2x2[2][2];
	int closest2x2[2][2];
	scanf("%d %d\n%d %d", &search2x2[0][0], &search2x2[0][1], &search2x2[1][0], &search2x2[1][1]);


	//simple Error checking
	if (search2x2[0][0] > 9 || search2x2[0][1] > 9 || search2x2[1][0] > 9 || search2x2[1][1] > 9 || search2x2[0][0] < 0 || search2x2[0][1] < 0 || search2x2[1][0] < 0 || search2x2[1][1] < 0)
	{
		SetColor(4); // set color to Red
		printf("Invalid input, please try again\n\n");
		return;
	}
	// clear buffer
	while (getchar() != '\n')
		;

	// variables to track the closest 2x2 grid
	int MaxDifference = 36;
	int bestRow = 0;
	int bestCol = 0;

	// main algorithm
	for (int row = 0; row < 8; row += 2)
	{
		for (int col = 0; col < 8; col += 2)
		{
			int currentDifference = 0;
			// Compare the 2x2 grid with the search 2x2
			for (int i = 0; i < 2; i++)
			{
				for (int j = 0; j < 2; j++)
				{
					// Calculate the AD of the 2x2
					int difference = abs(search2x2[i][j] - numbers[row + i][col + j]);
					currentDifference += difference;
				}
			}
			if (currentDifference < MaxDifference)
			{
				MaxDifference = currentDifference;
				bestRow = row;
				bestCol = col;
			}
		}
	}

	printf("According to the table and the SAD algorithm, the most closest 2x2 grid is: \n");
	for (int i = 0; i < 2; i++)
	{
		Sleep(100);
		for (int j = 0; j < 2; j++)
		{
			printf("%d ", numbers[bestRow + i][bestCol + j]);
		}
		printf("\n");
	}

	printf("\n");
}

#pragma endregion

void myFunction()
{
	WelcomeScreen(); // show the welcome screen
	StepsList(); // Start the program
}

int main()
{
	srand(time(NULL)); // seed the random number generator
	myFunction(); // call the main function

	SetColor(4); // set color to Red

	printf("You have pressed the exit button the program will close soon\n");
	Sleep(1000); // delay for 1 second

	SetColor(7); // reset color
	printf("Thank you very much for using Project 0!\n");

	return 0;
}

#pragma region User Experience

void progressBar(int sleepTime)
{
	SetColor(14); // set color to Yellow
	int i = 0;
	while (i <= 100)
	{
		printf("\r%s %d%%", "Loading: ", i);
		Sleep(sleepTime);
		i++;
	}
	printf("\n");
}
void WelcomeScreen()
{
	SetColor(2);
	printf("====================================\n");
	printf("  Welcome To The Project Number 0!\n");
	printf("====================================\n\n");

	Sleep(1000);
}
void FunctionsInfo(char StepName[100])
{
	progressBar(5);
	SetColor(3); // Set color to Aqua
	printf("--------------------------------------------------\n");
	printf("       %s\n", StepName);
	printf("--------------------------------------------------\n\n");
	SetColor(2); // Set color to Green
}

void StepsList()
{
	int numbers[8][8]; // Main 2d array

	int step = 0; // user input
	FillTable(numbers);
	do
	{

		Sleep(1000); // wait for 0.1 seconds
		SetColor(3); // set color to Aqua
		char mySteps[10][100] =
			{
				"Step 1: Print the Filled Table",
				"Step 2: Find the sum of each row",
				"Step 3: Find the sum of each column",
				"Step 4: New table 9-0 Table",
				"Step 5: Find the count of each number",
				"Step 6: Find the count of each number and put it in the table",	 // see the docuemnt file for more information
				"Step 7: Find the count of each number in the table but compressed", // see the docuemnt file for more information
				"Step 8: Find the max of each 2x2 grid",
				"Step 9: Search the closest 2x2 grid",
				"Any number else to exit",
			};

		for (int i = 0; i < 10; i++)
		{
			Sleep(100);
			printf("%s\n", mySteps[i]);
		}
		printf("\n");

		Sleep(1000); // wait for 1 second

		SetColor(2); // set color to Green
		printf("Which step would you like to see? ");

		scanf("%d", &step);

		switch (step)
		{
		case 1:
			PrintTable(numbers);
			break;
		case 2:
			RowSum(numbers);
			break;
		case 3:
			ColumnSum(numbers);
			break;
		case 4:
			NewTableZero_Nine(numbers);
			break;
		case 5:
			DigitCounter(numbers);
			break;
		case 6:
			DigitCounterInTable(numbers);
			break;
		case 7:
			DigitCounterInTableCompressed(numbers);
			break;
		case 8:
			MaxOf2x2(numbers);
			break;
		case 9:
			SearchTable(numbers);
			break;
		}
	} while (step >= 1 && step <= 10);
}

#pragma region Coloring

// Handling colors for the console
void SetColor(int color)
{
	HANDLE hConsole = GetStdHandle(STD_OUTPUT_HANDLE);
	SetConsoleTextAttribute(hConsole, color);

	/*
		Black	0
		Blue	1
		Green	2
		Aqua	3
		Red		4
		Purple	5
		Yellow	6
		White	7
		Gray	8
		LightB	9
		LightG	10
		LightA	11
		LightR	12
		LightP	13
		LightY	14
		BrightW	15
	*/
}
#pragma endregion

#pragma endregion