import java.util.Scanner;

public class TriangleValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Triangle Validator =====");
        System.out.print("Enter first side: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter second side: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter third side: ");
        double side3 = sc.nextDouble();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0
                || side1 + side2 <= side3
                || side1 + side3 <= side2
                || side2 + side3 <= side1) {
            System.out.println("\nThe sides do not form a valid triangle.");
        } else {
            String triangleType;

            if (side1 == side2 && side2 == side3) {
                triangleType = "Equilateral";
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                triangleType = "Isosceles";
            } else {
                triangleType = "Scalene";
            }

            double semiPerimeter = (side1 + side2 + side3) / 2;
            double area = Math.sqrt(semiPerimeter
                    * (semiPerimeter - side1)
                    * (semiPerimeter - side2)
                    * (semiPerimeter - side3));

            System.out.println("\nThe sides form a valid triangle.");
            System.out.println("Triangle type: " + triangleType);
            System.out.printf("Area: %.2f%n", area);
        }

        sc.close();
    }
}
