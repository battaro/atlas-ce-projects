#include <stdio.h>
#include <string.h>
#include <ctype.h>

// Functions for coloring
#pragma region Coloring

void setColorGreen()
{
	printf("\033[32m"); // Green color
}

void setColorRed()
{
	printf("\033[31m"); // Red color
}

void resetColor()
{
	printf("\033[0m"); // Reset to default color
}

#pragma endregion

// Ceaser cipher function
void caesarCipher(char UserSentence[], int shiftvalue)
{
	int length = strlen(UserSentence); // Get the length of the sentence

	// Loop through each character in the certain sentence that user entered
	for (int i = 0; i < length; i++)
	{
		// Check if the character is alphabetic
		// If not, leave it as it is

		// More info about ASCII table and how it works in README.md

		// Handle uppercase letters
		if (UserSentence[i] >= 'A' && UserSentence[i] <= 'Z')
		{
			UserSentence[i] = 'A' + ((UserSentence[i] - 'A' + (shiftvalue % 26) + 26) % 26);
		}
		if (UserSentence[i] >= 'a' && UserSentence[i] <= 'z')
		{
			UserSentence[i] = 'a' + ((UserSentence[i] - 'a' + (shiftvalue % 26) + 26) % 26);
		}
	}
}

int main()
{
	char input[200]; // To store the user's input with maximum 200 characters

	int shiftvalue; // To store the user's shiftvalue

	char choice; // To store the user's choice to exit the program

	// Infinite loop to keep running the program until the user presses 'e'
	do
	{
		printf("Enter a sentence to cipher: ");
		fgets(input, sizeof(input), stdin); // Get the user's input with spaces allowed

		// Remove the trailing newline character from fgets if present
		input[strcspn(input, "\n")] = 0;

		printf("Enter a shiftvalue (positive to encrypt, negative to decrypt, zero for no change): ");
		scanf("%d", &shiftvalue);

		getchar(); // To consume the newline character left by scanf()

		// Call the caesarCipher function
		caesarCipher(input, shiftvalue);

		setColorGreen();
		printf("Output: %s\n", input);
		resetColor();

		printf("Do you want to continue? (any other key to continue) (E to exit): ");
		scanf("%c", &choice);
		choice = toupper(choice);

		// Clear the input buffer
		int c;
		while ((c = getchar()) != '\n')
		{
		}

	} while (choice != 'E');

	// Set text color to red for exit message
	setColorRed();
	printf("Program exited.\n");
	resetColor();

	return 0;
}

#pragma region Notes
/*
Goal (according to the Doctor's notes):

	-Write a C program that ciphers and deciphers a user-provided string using the Caesar cipher technique.
	-The program will prompt the user to enter a string and then to enter a shiftvalue. Based on the shiftvalue, the program will display the modified string as follows:
		If the shiftvalue is zero, the string will be printed unchanged.
		If the shiftvalue is positive, the string will be encrypted by adding the shiftvalue value to the ASCII code of each character in the string.
		If the shiftvalue is negative, the string will be decrypted by subtracting the absolute value of the shiftvalue from the ASCII code of each character in the string.
	-We assume that the user will input a string without any whitespace and provide a reasonable value for the shiftvalue.

Program Notes:

	- This Program will use the caesarCipher algorithm to encrypt and decrypt a certain user-provided string based on the shiftvalue provided by the user.
	- More details README.md file

Additional Notes:
	-Here is the link to my Home Works Folder on Google Drive: https://drive.google.com/drive/u/5/folders/11g7-FlkmqQiGyGJTDr-Qp9RUJFsGopP1
	it should automatically sync all my homework.
	-My github repository link: https://github.com/battaro/atlas-ce-projects
*/
#pragma endregion