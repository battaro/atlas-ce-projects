#include <stdio.h>
void writeNames();

int main()
{
  writeNames();
  return 0;
}
void writeNames()
{
  char myname[50] = "myname";
  char studentnumber[50] = "myid";
  char section[50] = "mysection";
  char prof[50] = "dr. myprof";
  char myTA[50] = "dr. myTA";

  printf("ID: %s\n", studentnumber);
  printf("Full Name: %s\n", myname);
  printf("Course Section: %s\n", section);
  printf("Professor: %s\n", prof);
  printf("Lab Teaching Assistant: %s\n", myTA);
}

/*
  Program Notes:
  This program prints the following details:
  - The student's full name and ID number
  - The course section number
  - The professor's name
  - The lab teaching assistant's name

  The function `writeNames()` encapsulates the logic for printing the information,
  making the code modular and easier to maintain.

  here is my homeworks Google Drive link: https://drive.google.com/drive/u/5/folders/11g7-FlkmqQiGyGJTDr-Qp9RUJFsGopP1
  it should be automatically sync my all homeworks
*/
