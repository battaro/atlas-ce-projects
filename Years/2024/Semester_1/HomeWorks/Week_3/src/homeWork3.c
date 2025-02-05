#include <stdio.h>

#include <stdlib.h>
#include <windows.h>
#include <stdbool.h>
#define GREEN "\033[32m" // color to green
#define RESET "\033[0m"	 // reset color
#define RED "\e[0;31m"

#pragma region Functions Prototypes

// coloring
void colorToGreen();
void colorToRed();
void resetColor();

// Clock Functions
void ClockStatus(int maxTime, int sleepTime, bool isCountdown, bool isTheClock);
void Countdown();
void Stopwatch();
void TheClock();

// main functions
void mainfunction();
void main();

// User Experience Functions
void progressBar(char messageBefore[1000], char messageAfter[1000], int sleepTime);
void ExitTheProgram();

#pragma endregion

#pragma region Clock Functions
void Countdown()
{
	colorToGreen();
	int maxTime = 0;									 // in seconds
	printf("Set maximum time in seconds (0 - 86400): "); // 86400 seconds = 24 hour

	scanf("%d", &maxTime); // Read the time from the user

	// Check if the time is within the valid range
	if (maxTime < 0 || maxTime > 86400)
	{
		printf("The time should be between 0 and 86400.\n");
		return;
	}

	// Start the countdown
	ClockStatus(maxTime, 1, true, false);
}
void Stopwatch()
{
	colorToGreen();										 // color to green
	int maxTime = 0;									 // in seconds
	printf("Set maximum time in seconds (0 - 86400): "); // 86400 seconds = 24 hour

	scanf("%d", &maxTime); // Read the time from the user

	// Check if the time is within the valid range
	if (maxTime < 0 || maxTime > 86400)
	{
		printf("The time should be between 0 and 86400.\n");
		return;
	}

	// Start the stopwatch
	ClockStatus(maxTime, 1, false, false);
}

void TheClock()
{
	colorToGreen();
	int maxTime = 86400;				  // 24 hours in seconds
	ClockStatus(maxTime, 1, false, true); // Start the clock
}

void ClockStatus(int maxTime, int sleepTime, bool isCountdown, bool isTheClock)
{
	progressBar("Analyzing...", "Your option is valid, clock started", 1);
	// Initialize variables
	int seconds, minutes, hours;

	if (isCountdown && !isTheClock)
	{
		while (maxTime >= 0)
		{
			seconds = maxTime % 60;		   // Get seconds
			minutes = (maxTime / 60) % 60; // Get minutes
			hours = (maxTime / 3600) % 24; // Get hours

			// Print the time with a format of 00:00:00
			// `\r` used to overwrite the previous line
			printf("\r%0.2d:%0.2d:%0.2d", hours, minutes, seconds);
			Sleep(sleepTime);
			maxTime -= 10; // Decrease time by 10 for fast debugging
		}
	}
	else if (isTheClock)
	{
		int currentTime = 72000; // start from 20:00:00 to get the clock to 00:00:00 fast
		while (true)			 // Infinite loop to keep the clock running for 24 hours
		{
			seconds = currentTime % 60;
			minutes = (currentTime / 60) % 60;
			hours = (currentTime / 3600) % 24;

			printf("\r%0.2d:%0.2d:%0.2d", hours, minutes, seconds);
			Sleep(sleepTime);

			currentTime += 10; // Increase time by 10 for fast debugging

			// Reset after 24 hours (86400 seconds)
			if (currentTime >= 86400)
			{
				currentTime = 0; // Reset to 00:00:00
			}
		}
	}
	else
	{
		int currentTime = 0; // start from 00:00:00
		while (currentTime <= maxTime)
		{
			seconds = currentTime % 60;
			minutes = (currentTime / 60) % 60;
			hours = (currentTime / 3600) % 24;

			printf("\r%0.2d:%0.2d:%0.2d", hours, minutes, seconds);
			Sleep(sleepTime);
			currentTime += 10; // Increase time by 10 for fast debugging
		}
	}

	colorToRed(); // color to red
	printf("\nTime's up!\n");
	resetColor(); // reset color
}

#pragma endregion

#pragma region Main Functions
void mainfunction()
{
	while (1) // Infinite loop to show menu after each option but exit
	{
		resetColor(); // reset color
		// Menu choices
		char choices[5][100] =
			{
				"1. Set a timer (countdown)\n",
				"2. Set a stopwatch (count up)\n",
				"3. Set a normal clock (reset after 24 hours main task)\n",
				"4. Exit\n"
				"----------------------------------\n"};

		// Display choices
		for (int i = 0; i < 5; i++)
		{
			printf("%s", choices[i]);
			Sleep(100); // do some cool animation
		}

		// Get user choice
		int choice = 0;
		printf("Enter your choice: ");
		scanf("%d", &choice);

		// Validate user choice
		switch (choice)
		{
		case 1:
			Countdown();
			break;
		case 2:
			Stopwatch();
			break;
		case 3:
			TheClock();
			break;
		case 4:
			ExitTheProgram(); // Exit option will break out of the infinite loop
			break;
		default:
			printf("Invalid choice. Try again.\n");
			break;
		}

		printf("\n\n"); // Add some space before showing the menu again
	}
}

void main()
{
	mainfunction();
}

#pragma endregion

#pragma region User Expirence

void ExitTheProgram()
{
	progressBar("Exiting...", "Thank you for using the program", 1);

	resetColor();
	exit(1);
}

void progressBar(char messageBefore[1000], char messageAfter[1000], int sleepTime)
{
	colorToRed(); // color to red
	int i = 0;
	while (i <= 100)
	{
		// Print progress bar with message before and %
		printf("\r%s %d%%", messageBefore, i);
		Sleep(sleepTime);
		i++;
	}

	colorToGreen();
	// Print message after
	printf("\n%s\n", messageAfter);
}

void colorToRed()
{
	printf(RED);
}

void colorToGreen()
{
	printf(GREEN);
}
void resetColor()
{
	printf(RESET);
}

#pragma endregion

#pragma region Notes
/*
Goal (according to the Doctor's notes):

	Write a C program to disply a clock type timer on the screen starting from 00:00:00 till 23:59:59 and then restart from begining.
	You may use the sleep(1) function to cause a 1 second delay in the loop.
*/

/*
  Program Notes:

	- This program provides three clock-based functionalities: a countdown timer, a stopwatch, and a 24-hour clock that resets after reaching 23:59:59.
	- More details README.md file

  Additional Notes:
	-Here is the link to my Home Works Folder on Google Drive: https://drive.google.com/drive/u/5/folders/11g7-FlkmqQiGyGJTDr-Qp9RUJFsGopP1
	It should automatically sync all my homework.
	-My github repository link: https://github.com/battaro/atlas-ce-projects
*/
#pragma endregion