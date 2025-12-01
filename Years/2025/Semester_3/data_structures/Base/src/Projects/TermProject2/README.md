# Data Structures - Term Project 2
**Student:** Saif (battar)  
**Course:** Data Structures  
**Instructor:** Dr. Adam  
**Due Date:** December 2nd Tuesday by 23:59

---

## Project Description
- It's almost the same project for Projects\TermProject
- The goal is to find **Shortest Path** from the entrance to the exit, if it exists.

---

##  How It Works
1. Reads the maze from `maze.txt` and stores it in a 2D `char` array.
2. Uses a **custom Queue** (`MyQueue` and `QueueNode`) to perform **Breadth-First Search (BFS)**.
3. Keeps track of **visited cells** to avoid revisiting.
4. When the exit is reached, prints all coordinates `(x, y)` of the successful path from entrance to exit as the shortest path from the  ```parentX and parentY```.

---

---

## How to Run
1. Put `mazeSolver2.java` and `maze.txt` in the same folder (be sure that the code matches the path).
2. Compile and run:
   ```bash
   javac mazeSolver2.java
   java mazeSolver2

3. Output example:
```
Entrance at: (0,1)
Exit at: (14,13)

Shortest Path:
(0,1) (1,1) (1,2) (1,3) (1,4) (2,4) (3,4) (4,4) (5,4) (5,5)
(5,6) (6,6) (7,6) (7,5) (7,4) (7,3) (8,3) (9,3) (9,4) (9,5)
(9,6) (9,7) (9,8) (9,9) (9,10) (8,10) (7,10) (7,11) (7,12)
(7,13) (8,13) (9,13) (10,13) (11,13) (12,13) (13,13) (14,13) 

Found a solution, path from start to exit printed

```
Created with effort and brain working © 2025 Saif (battar)
Copied my code? Then I’ll copy your destiny !!!
