# Project Number 1 : Student Exam Grading and Analysis

- This is my second project at the university!
- This is a simple program that help getting results and statistics from s file that have been generated before using mark reader to the computer in `Cards.txt`

## Features

- Reading student information from `Cards.txt`.
- Reading answer keys from `AnswerKeys.txt`.
- Calculating grades for each student.
- Writing `Grades.txt` grades file.
- Writing `Stat.txt` statistics file.
- Enteractive Console With coloring.
- Searching for student grade by ID.

## Important Notes

- You may encounter issues if you try running the project with Git Bash or other terminals outside of Windows Terminal or Command Prompt.
- Don't Change anything in the `AnswerKeys.txt` and `Cards.txt`

## How to use

1. Run the program using gcc or any other compiler.
2. Prompt a number of any section you want.
3. exit the program.

## Code Structure

- The code is well-organized using `region` for each section in the C code
- `main()` here the program starts
- There is only 2 functions can write a file `writeGradesFile()` and `writeStatsFile()`
- User experience region is for coloring and mainmenu functions

## Most Complicated Idea

The `sscanf` function parses a tab-separated line of text and extracts data into the `students[i]` structure. The format string specifies:

- `%20[^\t]:` Reads up to 20 characters for `studentName`.
- `%11[^\t]:` Reads up to 11 characters for `studentTC`.
- `%9[^\t]:` Reads up to 9 characters for `studentID`.
- `%c:` Reads a single character for `bookletType`.
- `%100[^\n]:` Reads up to 100 characters for `answers`.

The `== 5` ensures all 5 fields were successfully extracted. The expected input format is `[Name]\t[TC]\t[ID]\t[Type][Answers].` Parsing fewer fields indicates an input error thats why you should not change the `Cards.txt` file.

## Conclusion

This project simplifies processing exam data, providing accurate grading and statistics. It demonstrates practical C programming skills and emphasizes well-structured, efficient, and user-friendly code.

### Github Repo :
- [My public GITHUB repo](https://github.com/battaro/atlas-ce-projects)
