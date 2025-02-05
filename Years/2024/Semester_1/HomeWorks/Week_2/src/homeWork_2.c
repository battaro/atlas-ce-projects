#include <stdio.h>
#include <stdlib.h>

#define GREEN "\033[32m" // color to green
#define RESET "\033[0m"	 // reset color

#pragma region Functions Prototypes

void Print(char charToPrint, int repeatCount);
void PrintNewlines(int count);
void PrintTabs(int count);
void PrintSpaces(int count);
void mainfunction(int height, int lineCount);

#pragma endregion

#pragma region Main Functions

void Print(char charToPrint, int repeatCount)
{
	// print char
	for (int i = 0; i < repeatCount; i++)
	{
		printf("%c", charToPrint);
	}
}
void PrintSpaces(int count)
{
	// spaces
	Print(' ', count);
}
void PrintNewlines(int count)
{
	// newlines
	Print('\n', count);
}
void PrintTabs(int count)
{
	// tabs
	Print('\t', count);
}

void mainfunction(int height, int lineCount)
{
	printf(GREEN); // color to green

	PrintNewlines(7); // Print 7 new lines
	PrintTabs(2);	  // Print 2 tabs

	Print('I', lineCount); // Print the specified number of I's in the first line

	for (int i = 0; i < height; i++)
	{
		// print 1 newline and 2 tabs after each 'I' or 'III'
		PrintNewlines(1);
		PrintTabs(2);

		int subtractspace = (lineCount <= 7) ? 0 : 1;		// Subtract 1 space if the line count is less than or equal to 7
		int numberofspaces = lineCount / 2 - subtractspace; // Calculate the number of spaces to print

		PrintSpaces(numberofspaces);

		// Print 'I' or 'III' depending on the line count
		if (lineCount <= 7)
		{
			Print('I', 1);
		}
		else
		{
			Print('I', 3);
		}
	}

	// Print 1 newline and 2 tabs
	PrintNewlines(1);
	PrintTabs(2);

	Print('I', lineCount); // Print the specified number of I's in the second line

	PrintNewlines(7); // Print 7 new lines
}
#pragma endregion

int main()
{

	printf("Write the height of the letter I. The conditions (1-50): ");
	int height = 0;
	scanf("%d", &height); // Read the height from the user

	// Check if the height is within the valid range
	if (height < 1 || height > 50)
	{
		printf("The height should be between 1 and 50.\n");
		exit(1); // Exit the program
	}

	printf("Enter the number of I's line \"the first and the second lines \", the conditions (3-90, odd number): ");
	int lineCount = 0;
	scanf("%d", &lineCount); // Read the count for the `I` repetitions in the first and second lines from the user

	// Check if the lineCount is within the valid range and is odd
	if (lineCount < 3 || lineCount > 90 || lineCount % 2 == 0)
	{
		printf("The line count should be an odd number between 3 and 90.\n");
		exit(1); // Exit the program
	}

	mainfunction(height, lineCount); // Call the main function

	printf(RESET); // reset color
	return 0;
}

/*
  Program Notes:

	-This program generates a stylized representation of the letter 'I' based on user-defined
	parameters: height (1-50) and line count (3-90, odd numbers only).
	-More details README.md file


  Additional Notes:
	-Here is the link to my Home Works Folder on Google Drive: https://drive.google.com/drive/u/5/folders/11g7-FlkmqQiGyGJTDr-Qp9RUJFsGopP1
	It should automatically sync all my homework.
	-My github repository link: https://github.com/battaro/atlas-ce-projects
*/
