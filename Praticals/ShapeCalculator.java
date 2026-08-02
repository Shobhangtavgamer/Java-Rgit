import java.util.Scanner;

public class ShapeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Shape Calculator =====");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                // Circle
                System.out.print("\nEnter Radius: ");
                double radius = sc.nextDouble();

                double circleArea = Math.PI * radius * radius;
                double circumference = 2 * Math.PI * radius;
                double diameter = 2 * radius;

                System.out.println("\n----- Circle Details -----");
                System.out.printf("Radius         : %.2f%n", radius);
                System.out.printf("Diameter       : %.2f%n", diameter);
                System.out.printf("Area           : %.2f%n", circleArea);
                break;

            case 2:
                // Rectangle
                System.out.print("\nEnter Length: ");
                double length = sc.nextDouble();

                System.out.print("Enter Width: ");
                double width = sc.nextDouble();

                double rectArea = length * width;
                double perimeter = 2 * (length + width);
                double diagonal = Math.sqrt(length * length + width * width);

                System.out.println("\n----- Rectangle Details -----");
                System.out.printf("Area           : %.2f%n", rectArea);
                System.out.printf("Perimeter      : %.2f%n", perimeter);
                break;

            case 3:
                // Equilateral Triangle
                System.out.print("\nEnter Side: ");
                double side = sc.nextDouble();

                double triPerimeter = 3 * side;
                double triArea = (Math.sqrt(3) / 4) * side * side;

                System.out.println("\n----- Triangle Details -----");
                System.out.printf("Side           : %.2f%n", side);
                System.out.printf("Perimeter      : %.2f%n", triPerimeter);
                System.out.printf("Area           : %.2f%n", triArea);
                break;

            default:
                System.out.println("\nInvalid Choice!");
        }

        sc.close();
    }
}