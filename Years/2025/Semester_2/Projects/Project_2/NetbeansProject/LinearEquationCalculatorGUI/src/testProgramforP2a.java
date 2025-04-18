import java.util.*;
public class testProgramforP2a
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter values for a, b, c, d, e, and f:");
        System.out.print("a: "); double a = input.nextDouble();
        System.out.print("b: "); double b = input.nextDouble();
        System.out.print("c: "); double c = input.nextDouble();
        System.out.print("d: "); double d = input.nextDouble();
        System.out.print("e: "); double e = input.nextDouble();
        System.out.print("f: "); double f = input.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (!equation.isSolvable()) {
            System.out.println("The equation has no solution.");
        } else {
            double x = equation.getX();
            double y = equation.getY();
            System.out.println("The solution is: ");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        input.close();
    }
}