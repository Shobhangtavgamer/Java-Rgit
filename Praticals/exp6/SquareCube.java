import java.util.Scanner;

public class SquareCube {
    abstract static class CalculationTool {
        abstract double square(double n);
        abstract double cube(double n);
        abstract double squareRoot(double n);
    }

    static class NumberMath extends CalculationTool {
        @Override
        double square(double n) {
            return n * n;
        }

        @Override
        double cube(double n) {
            return n * n * n;
        }

        @Override
        double squareRoot(double n) {
            if (n < 0) {
                throw new IllegalArgumentException("Cannot compute square root of a negative number");
            }
            return Math.sqrt(n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = scanner.nextDouble();

        NumberMath math = new NumberMath();
        System.out.println("Square    = " + math.square(n));
        System.out.println("Cube      = " + math.cube(n));
        System.out.println("Square    = " + math.squareRoot(n));
    }
}
