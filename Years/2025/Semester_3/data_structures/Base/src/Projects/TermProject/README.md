# Data Structures - Term Project 1
**Student:** Saif (battar)  
**Course:** Data Structures  
**Instructor:** Dr. Adam  
**Due Date:** November 9, Sunday, 23:59

---

## Project Description
This project implements a **maze solver** using a **stack data structure** (custom linked-list implementation).  
The program reads a 15×15 maze from a file (`maze.txt`), where:

- `'1'` represents **walls**
- `'0'` represents **open paths**

The maze has:
- **One entrance** on the **top row**
- **One exit** on the **bottom row**

The goal is to find **one valid path** from the entrance to the exit, if it exists.

---

##  How It Works
1. Reads the maze from `maze.txt` and stores it in a 2D `char` array.
2. Uses a **custom stack** (`StackLL` and `CharNode`) to perform **Depth-First Search (DFS)**.
3. Keeps track of **visited cells** to avoid revisiting.
4. **Backtracks** when reaching dead ends using stack pop operations.
5. When the exit is reached, prints all coordinates `(x, y)` of the successful path from entrance to exit.

---

---

## How to Run
1. Put `mazeSolver.java` and `maze.txt` in the same folder.
2. Compile and run:
   ```bash
   javac mazeSolver.java
   java mazeSolver

3. Output example:
```Entrance found at: (0,1)
(0,1) (1,1) (1,2) (1,3) (1,4) (2,4) (3,4) (4,4) (5,4) (5,5) (5,6)
(4,6) (3,6) (2,6) (1,6) (1,7) (1,8) (1,9) (1,10) (1,11) (1,12) (1,13)
(2,13) (3,13) (4,13) (5,13) (5,12) (5,11) (5,10) (6,10) (7,10) (7,11)
(7,12) (7,13) (8,13) (9,13) (10,13) (11,13) (12,13) (13,13) (14,13)
Found a solution, path from start to exit printed
```
Created with effort and brain working © 2025 Saif (battar)
Copied my code? Then I’ll copy your destiny !!!
