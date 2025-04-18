
import java.util.*;

public class testProgramforP2b {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a, b, c, d, e, f;
        System.out.println("Enter the endpoints for the first line segment (x1, y1, x2, y2): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.println("Enter the endpoints for the second line segment (x3, y3, x4, y4): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

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
            System.out.printf("The intersection point is: (%.3f, %.3f)", intersectionX, intersectionY);
        } else {
            System.out.println("The two line segments do not intersect.");
        }
    }
}
