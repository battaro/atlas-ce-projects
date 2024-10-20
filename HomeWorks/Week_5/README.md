# Quadratic Equation Solver

## Overview

This C program solves quadratic equations of the form ax^2 + bx + c = 0. It calculates the roots (x1 and x2) of the equation using the quadratic formula.

## Features

1. **Solves Quadratic Equations**: Calculates both roots of a quadratic equation.
2. **Handles Complex Roots**: Detects when the equation has no real roots.
3. **Custom Library**: Uses a custom library (`mylib`) for the core calculation.
4. **Dynamic Memory Allocation**: Utilizes dynamic memory allocation for the solution array.

## How to Use

When you run the program, you'll be prompted to:

1. Enter the value of a (coefficient of x^2)
2. Enter the value of b (coefficient of x)
3. Enter the value of c (constant term)

## Code Structure

### Files:

- `main.c`: Contains the main function and user interface.
- `mylib.c`: Implements the quadratic equation solving function.
- `mylib.h`: Header file for the custom library.

### Main Functions:

- `main()` in `main.c`: Handles user input and output.
- `Quadratic()` in `mylib.c`: Implements the quadratic formula algorithm.

## Quadratic Formula Algorithm

The program uses the standard quadratic formula to solve the equation:

x = [-b ± √(b^2 - 4ac)] / (2a)

Where:
- a, b, and c are the coefficients in the quadratic equation ax^2 + bx + c = 0
- √ represents the square root

The discriminant (b^2 - 4ac) is calculated to determine the nature of the roots:
- If discriminant > 0: Two distinct real roots
- If discriminant = 0: One real root (repeated)
- If discriminant < 0: No real roots (complex roots)

## Notes

- The program uses dynamic memory allocation for the solution array.
- It properly handles cases where there are no real roots.
- The solution is returned as a pointer to a float array.

## Compilation and Running

To compile the program, use a C compiler such as GCC:

```
gcc main.c mylib.c -o "programname.exe"
```

To run the program:

```
./quadratic_solver
```

## Additional Resources

- [Quadratic Formula on Wikipedia](https://en.wikipedia.org/wiki/Quadratic_formula)
- [Complex Roots of Quadratic Equations](https://www.mathsisfun.com/algebra/quadratic-equation-complex-roots.html)

### Github Repo : 
- [My public GITHUB repo](https://github.com/battaro/atlas-ce-projects)