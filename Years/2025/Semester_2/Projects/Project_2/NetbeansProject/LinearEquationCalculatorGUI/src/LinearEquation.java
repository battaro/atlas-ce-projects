public class LinearEquation {
    // Private data fields, i represent them as constants because they won't change
    private final double a, b, c, d, e, f;

    // Constructor to initialize the data fields 
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Methods to get the values of the data fields
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // This method must return true if the equation has a solution, false otherwise
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    // This method will calculate and return x value
    public double getX() {
        if (!isSolvable()) {
            // NaN = Not a Number (will be returned if the equation is not solvable)
            return Double.NaN;
        }
        return (e * d - b * f) / (a * d - b * c); // formula to calculate x 
    }

    // This method will calculate and return y value
    public double getY() {
        if (!isSolvable()) {
            return Double.NaN;
        }
        return (a * f - e * c) / (a * d - b * c);
    }
}

