#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>

#define MAX_STUDENTS 384 // set a constant for the maximum number of students
#define MAX_LINES 142	 // set a constant for the maximum length of a line

// My Info
#define MYNAME "myname"
#define MYID "myid"

#pragma region Functions Prototypes

// File Functions
void readCardsFile();
void readAnswersFile();
void writeGradesFile();
void writeStatsFile();

// Output Functions
void printFile();
void printStructOrganized();
void searchStudent();

// calculations
void calculateGrades();
void getstat();
void getAverageGrades();
void getMinMaxGrades();
void getCountofAandB();
void getRightAnswersCount();
void getEasiestAndHardestQuestions();
void getRank();

// User Experience Functions
void waitingMessage(int sleepTime, char messgebefore[], char messgeafter[]);
void enteringMessage();
void exitMessage();
void functionName(char functionName[]);
void mainMenu();

// coloring
void setColor(int color);

#pragma endregion

// global structures
typedef struct
{
	char studentName[21]; // 20 characters plus null terminator
	char studentTC[12];	  // 11 characters plus null terminator
	char studentID[10];	  // 9 characters plus null terminator
	char bookletType;	  // only 1 character is needed 'A' or 'B'
	char answers[101];	  // 100 characters plus null terminator
	int rank;			  // rank of the student after sorting
	int grade;			  // grade of the student after calculations

} student;

// global variables
char keyA[51];
char keyB[51];

// Statistics
int average, max, min, countA, countB, countofAandB;
int correctAnswersForA[50], correctAnswersForB[50];
int hardestQuestionIndexA = 0, hardestQuestionIndexB = 0, easiestQuestionIndexA = 0, easiestQuestionIndexB = 0;

student students[MAX_STUDENTS]; // array of students
int studentsCount = 0;			// number of students in the array

#pragma region File Functions
void readCardsFile()
{
	FILE *cardsTXT;

	cardsTXT = fopen("Cards.txt", "r"); // open the file in reading mode

	if (cardsTXT == NULL) // if the file is not found
	{
		printf("Error reading file\n");
		return;
	}

	char line[MAX_LINES];

	int i = 0;

	while (fgets(line, MAX_LINES, cardsTXT) != NULL)
	{
		// read cards.txt and store them in students struct
		if (sscanf(line, "%20[^\t]%11[^\t]%9[^\t]%c%100[^\n]",
				   students[i].studentName,
				   students[i].studentTC,
				   students[i].studentID,
				   &students[i].bookletType,
				   students[i].answers) == 5)
		{
			studentsCount++;
			i++;
		}
	}

	fclose(cardsTXT);
}
void readAnswersFile()
{
	FILE *answersTXT;
	answersTXT = fopen("AnswerKeys.txt", "r");
	if (answersTXT == NULL)
	{
		printf("Error reading file\n");
		return;
	}
	char line[MAX_LINES];

	// read first line
	fgets(line, MAX_LINES, answersTXT);
	sscanf(line, "%*c%s", keyA); // Skips the first character and copies the rest

	// read second line
	fgets(line, MAX_LINES, answersTXT);
	sscanf(line, "%*c%s", keyB); // Skips the first character and copies the rest

	fclose(answersTXT);
}
void printFile()
{
	functionName("Print A File");

	Sleep(1000);
	int userInput = 0;
	FILE *cardsTXT;
	FILE *answersTXT;
	char line[MAX_LINES];

	answersTXT = fopen("AnswerKeys.txt", "r");
	cardsTXT = fopen("Cards.txt", "r");

	if (cardsTXT == NULL || answersTXT == NULL) // if the one of the files is not found
	{
		printf("Error reading file\n");
		return;
	}

	printf("1: Cards.txt \n2: AnswerKeys.txt \nWhich file do you want to print? ");

	scanf("%d", &userInput);
	switch (userInput)
	{
	case 1:
		while (fgets(line, MAX_LINES, cardsTXT) != NULL)
		{
			Sleep(5);
			printf("%s", line);
		}
		break;
	case 2:
		while (fgets(line, MAX_LINES, answersTXT) != NULL)
		{
			Sleep(5);
			printf("%s", line);
		}
		printf(" \n");
		break;
	default:
		printf("Invalid input\n\n");
		return;
		break;
	}
	printf("\n");
	fclose(cardsTXT);
	fclose(answersTXT);
}
void printStructOrganized()
{
	functionName("Print Organized Data");

	Sleep(1000);

	int userInput = 0;
	int i = 0;

	printf("1: Students Struct \n2: AnswerKeys \nWhich file do you want to print? ");
	scanf("%d", &userInput);

	switch (userInput)
	{
	case 1:
		while (i < studentsCount)
		{
			printf("Rank: %d, TC: %s, ID: %s, Name %s, Grade: %d, Booklet : %c, Answers: %s\n",
				   students[i].rank,
				   students[i].studentTC,
				   students[i].studentID,
				   students[i].studentName,
				   students[i].grade,
				   students[i].bookletType,
				   students[i].answers);
			Sleep(5);
			i++;
		}
		break;
	case 2:
		printf("Key A: %s\nKey B: %s\n", keyA, keyB);
		break;
	default:
		printf("Invalid input\n\n");
		return;
		break;
	}
	printf("\n");
}
void writeGradesFile()
{
	waitingMessage(1000, "Writing Grades", "Grades.txt created in the current directory");

	// Open the file for writing
	FILE *gradesTXT = fopen("Grades.txt", "w");
	if (gradesTXT == NULL)
	{
		printf("Error opening file for writing.\n");
		return;
	}

	// Write sorted grades and student details to the file
	fprintf(gradesTXT, "Rank TC          ID        Name                Grade\n");
	for (int i = 0; i < studentsCount; i++)
	{
		fprintf(gradesTXT, "%03d  %s %s %s %02d\n",
				students[i].rank,
				students[i].studentTC,
				students[i].studentID,
				students[i].studentName,
				students[i].grade);
	}
	fclose(gradesTXT);
}
void writeStatsFile()
{
	waitingMessage(1000, "Writing Statistics", "Statistics written to Stats.txt in the current directory");
	// Open the file for writing
	FILE *statsTXT = fopen("Stats.txt", "w");
	if (statsTXT == NULL)
	{
		printf("Error opening file for writing.\n");
		return;
	}

	// Write the statistics to the file

	fprintf(statsTXT, "Average: %d\n", average);
	fprintf(statsTXT, "Min: %d, Max: %d\n", min, max);
	fprintf(statsTXT, "Count of A booklets: %d, Count of B booklets: %d, Count of all boklets: %d\n", countA, countB, countofAandB);

	fprintf(statsTXT, "----------------------------------------\n");
	fprintf(statsTXT, "              For Booklet A:            \n");
	fprintf(statsTXT, "            Ques          NoC            \n");

	// print all questions and their correct answers count for booklet A
	for (int i = 0; i < 50; i++)
	{
		fprintf(statsTXT, "            %03d           %03d\n", i + 1, correctAnswersForA[i]);
	}

	// print hardest and easiest questions for booklet A
	fprintf(statsTXT, "            Hardest QuNo: %03d\n", hardestQuestionIndexA + 1);
	fprintf(statsTXT, "            Easiest QuNo: %03d\n", easiestQuestionIndexA + 1);
	fprintf(statsTXT, "----------------------------------------\n");
	fprintf(statsTXT, "              For Booklet B:            \n");
	fprintf(statsTXT, "            Ques          NoC            \n");
	// print all questions and their correct answers count for booklet A
	for (int i = 0; i < 50; i++)
	{
		fprintf(statsTXT, "            %03d           %03d\n", i + 1, correctAnswersForB[i]);
	}

	// print hardest and easiest questions for booklet A
	fprintf(statsTXT, "            Hardest QuNo: %03d\n", hardestQuestionIndexB + 1);
	fprintf(statsTXT, "            Easiest QuNo: %03d\n", easiestQuestionIndexB + 1);
	fprintf(statsTXT, "----------------------------------------\n");

	fclose(statsTXT);
}
void calculateGrades()
{
	for (int i = 0; i < studentsCount; i++)
	{
		int currentGrade = 0; // Initialize currentGrade to 0 for each student

		if (students[i].bookletType == 'A')
		{
			for (int j = 0; j < 50; j++)
			{
				if (students[i].answers[j] == keyA[j])
				{
					currentGrade += 2; // each question have 2 points
				}
			}
		}
		else
		{
			for (int j = 0; j < 50; j++)
			{
				if (students[i].answers[j] == keyB[j])
				{
					currentGrade += 2;
				}
			}
		}
		students[i].grade = currentGrade; // Assign the calculated grade to the student's grade
	}
}
void getstat()
{
	getAverageGrades();
	getMinMaxGrades();
	getCountofAandB();
	getRightAnswersCount();
	getEasiestAndHardestQuestions();
	getRank();
}
void getRank()
{
	// Sorting students by grade in descending order
	for (int i = 0; i < studentsCount - 1; i++)
	{
		for (int j = i + 1; j < studentsCount; j++)
		{
			if (students[i].grade < students[j].grade)
			{
				// Swap grades and corresponding student data
				student tempStudent = students[i];
				students[i] = students[j];
				students[j] = tempStudent;
			}
		}
	}

	// Assign ranks after sorting
	for (int i = 0; i < studentsCount; i++)
	{
		students[i].rank = i + 1;
	}
}
void getAverageGrades()
{
	// get the average of the grades
	average = 0;
	for (int i = 0; i < studentsCount; i++)
	{
		average += students[i].grade;
	}
	average /= studentsCount;
}
void getMinMaxGrades()
{
	// get max and min
	max = students[0].grade;
	min = students[0].grade;
	for (int i = 0; i < studentsCount; i++)
	{
		if (students[i].grade > max)
		{
			max = students[i].grade;
		}
		if (students[i].grade < min)
		{
			min = students[i].grade;
		}
	}
}
void getCountofAandB()
{
	// get count of A and B booklets
	for (int i = 0; i < studentsCount; i++)
	{
		if (students[i].bookletType == 'A')
		{
			countA++;
		}
		else
		{
			countB++;
		}
	}
	countofAandB = countA + countB;
}
void getRightAnswersCount()
{
	// Count correct answers for each question in both booklets
	for (int i = 0; i < studentsCount; i++)
	{
		if (students[i].bookletType == 'A')
		{
			for (int j = 0; j < 50; j++) // Assuming each booklet has 50 questions
			{
				if (students[i].answers[j] == keyA[j])
				{
					correctAnswersForA[j]++;
				}
			}
		}
		else if (students[i].bookletType == 'B')
		{
			for (int j = 0; j < 50; j++) // Assuming each booklet has 50 questions
			{
				if (students[i].answers[j] == keyB[j])
				{
					correctAnswersForB[j]++;
				}
			}
		}
	}
}
void getEasiestAndHardestQuestions()
{

	int hardestQuestionsForA = correctAnswersForA[0], easiestQuestionsForA = correctAnswersForA[0],
		hardestQuestionsForB = correctAnswersForB[0], easiestQuestionsForB = correctAnswersForB[0];

	// Find the hardest and easiest questions for each booklet
	for (int i = 0; i < 50; i++)
	{
		// Booklet A
		if (correctAnswersForA[i] < hardestQuestionsForA)
		{
			hardestQuestionsForA = correctAnswersForA[i];
			hardestQuestionIndexA = i; // Save index of the hardest question
		}
		if (correctAnswersForA[i] > easiestQuestionsForA)
		{
			easiestQuestionsForA = correctAnswersForA[i];
			easiestQuestionIndexA = i;
		}

		// Booklet B
		if (correctAnswersForB[i] < hardestQuestionsForB)
		{
			hardestQuestionsForB = correctAnswersForB[i];
			hardestQuestionIndexB = i;
		}
		if (correctAnswersForB[i] > easiestQuestionsForB)
		{
			easiestQuestionsForB = correctAnswersForB[i];
			easiestQuestionIndexB = i;
		}
	}
}
void searchStudent()
{
	functionName("Search Student");

	// Clear input buffer
	while (getchar() != '\n')
		;

	printf("You can search only by ID: ");
	char searchedContent[100];
	scanf("%[^\n]", searchedContent);

	// Clear input buffer
	while (getchar() != '\n')
		;

	for (int i = 0; i < studentsCount; i++)
	{
		// Check if search matches full ID
		if (strcmp(students[i].studentID, searchedContent) == 0)
		{
			printf("Found a matching student:\n\n");
			printf("Rank: %d\n", students[i].rank);
			printf("TC: %s\n", students[i].studentTC);
			printf("ID: %s\n", students[i].studentID);
			printf("Name: %s\n", students[i].studentName);
			printf("Grade: %d\n\n", students[i].grade);

			break; // exit the loop afte rfirst match
		}
		// If no match is found after the loop completes
		if (i == studentsCount - 1)
		{
			printf("No student found matching: %s\n", searchedContent);
		}
	}
}

#pragma endregion

int main()
{
	readCardsFile();
	readAnswersFile();
	calculateGrades();
	getstat();
	mainMenu();

	return 0;
}

#pragma region User Experience Functions
void mainMenu()
{
	enteringMessage();
	int userInput = 0;
	do
	{
		Sleep(1000); // wait for 1 second
		setColor(3); // Set color to Aqua
		char mainMenu[6][100] =
			{
				"1: Print Certain File",
				"\n2: Print Data Organized",
				"\n3: Write Grades"
				"\n4: Write Stats"
				"\n5: Search Student",
				"\n6: Exit",
			};

		for (int i = 0; i < 6; i++)
		{
			Sleep(100); // delay make it look like animation
			printf("%s", mainMenu[i]);
		}

		Sleep(1000); // wait for 1 second

		setColor(2); // Set color to Green

		printf("\nPlease enter your choice: ");
		scanf("%d", &userInput);

		switch (userInput)
		{
		case 1:
			printFile();
			break;
		case 2:
			printStructOrganized();
			break;
		case 3:
			writeGradesFile();
			break;
		case 4:
			writeStatsFile();
			break;
		case 5:
			searchStudent();
			break;
		case 6:
			exitMessage();
			break;
		default:
			printf("Invalid input\n\n");
			break;
		}

	} while (userInput != 6);
}
void waitingMessage(int sleepTime, char messgebefore[], char messgeafter[])
{
	setColor(14); // Set color to Yellow
	printf("%s", messgebefore);
	for (int i = 1; i <= 3; i++)
	{
		printf(".");
		Sleep(sleepTime);
	}
	printf("\r%s\n\n", messgeafter);
}

void enteringMessage()
{
	setColor(2); // Set color to Green
	printf("Welcome To The Project Number 1!\n");
	printf("This project is done by %s, ID : %s\n\n", MYNAME, MYID);
	Sleep(1000); // wait for 1 second
}
void exitMessage()
{
	waitingMessage(300, "Exiting", "Thanks for using this program!");
	setColor(7); // reset color
	exit(1);
}
void functionName(char functionName[])
{
	setColor(3); // Set color to Aqua
	printf("-------------------------------------------------------\n");
	printf("       %s\n", functionName);
	printf("-------------------------------------------------------\n\n");
	Sleep(1000); // wait for 1 second
	setColor(2); // Set color to Green
}

void setColor(int color) // Coloring
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