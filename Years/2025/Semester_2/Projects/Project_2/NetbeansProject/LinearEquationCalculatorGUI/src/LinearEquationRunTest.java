
import java.util.Scanner;

public class LinearEquationRunTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Solve a system of linear equations");
            System.out.println("2. Find the intersection of two line segments");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = 0;
            if (input.hasNextInt()) {
                choice = input.nextInt();
            } else {
                System.out.println("Invalid input! Please enter a valid number (1, 2, or 3).");
                input.next(); // Clear input buffer
                continue;
            }

            if (choice == 1) {
                solveLinearEquation(input);
            } else if (choice == 2) {
                findIntersection(input);
            } else if (choice == 3) {
                System.out.println("Thanks for using this program");
                break;
            } else {
                System.out.println("Invalid option. Please select 1, 2, or 3.");
            }
        }

        input.close();
    }

    // Function to solve a system of linear equations
    public static void solveLinearEquation(Scanner input) {

        double a, b, c, d, e, f;
        System.out.println("Enter values for a, b, c, d, e, and f:");

        a = getDoubleInput(input, "a");
        b = getDoubleInput(input, "b");
        c = getDoubleInput(input, "c");
        d = getDoubleInput(input, "d");
        e = getDoubleInput(input, "e");
        f = getDoubleInput(input, "f");

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        // Check if the equation is solvable and display the result
        if (!equation.isSolvable()) {
            System.out.println("The equation has no solution.");
        } else {
            double x = equation.getX();
            double y = equation.getY();
            System.out.println("The solution is: ");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }

    // Function to find the intersection of two line segments
    public static void findIntersection(Scanner input) {

        double a, b, c, d, e, f;

        System.out.println("Enter the endpoints for the first line segment (x1, y1, x2, y2): ");
        double x1 = getDoubleInput(input, "x1");
        double y1 = getDoubleInput(input, "y1");
        double x2 = getDoubleInput(input, "x2");
        double y2 = getDoubleInput(input, "y2");

        System.out.println("Enter the endpoints for the second line segment (x3, y3, x4, y4): ");
        double x3 = getDoubleInput(input, "x3");
        double y3 = getDoubleInput(input, "y3");
        double x4 = getDoubleInput(input, "x4");
        double y4 = getDoubleInput(input, "y4");

     
        //Calculate the coefficients
        a = y1 - y2;
        b = -(x1 - x2);  
        e = a * x1 + b * y1;

        c = y3 - y4;
        d = -(x3 - x4);  
        f = c * x3 + d * y3;

        // New object from LinearEquation class to find the intersection points
        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        // Check if the lines are solvable and display the result
        if (equation.isSolvable()) {
            double intersectionX = equation.getX();
            double intersectionY = equation.getY();
            System.out.printf("The intersection point is: (%.3f, %.3f)%n", intersectionX, intersectionY);
        } else {
            System.out.println("The two line segments do not intersect.");
        }
    }

    public static double getDoubleInput(Scanner input, String varName) {
        double value;
        while (true) {
            System.out.print("Enter value for " + varName + ": ");
            if (input.hasNextDouble()) {
                value = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid number for " + varName + ".");
                input.next(); 
            }
        }
        return value;
    }
}
