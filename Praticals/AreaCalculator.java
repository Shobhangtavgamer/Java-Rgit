import java.util.Scanner;

class AreaCalculator {

    // Area of Circle
    void area(double radius) {
        double area = Math.PI * radius * radius;
        System.out.printf("Area of Circle = %.2f\n", area);
    }

    // Area of Rectangle
    void area(double length, double width) {
        double area = length * width;
        System.out.printf("Area of Rectangle = %.2f\n", area);
    }

    // Area of Triangle
    void area(double base, double height, int triangle) {
        double area = 0.5 * base * height;
        System.out.printf("Area of Triangle = %.2f\n", area);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AreaCalculator obj = new AreaCalculator();

        System.out.println("  Area Calculator using Method Overloading ");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter Radius: ");
                double radius = sc.nextDouble();
                obj.area(radius);
                break;

            case 2:
                System.out.print("Enter Length: ");
                double length = sc.nextDouble();

                System.out.print("Enter Width: ");
                double width = sc.nextDouble();

                obj.area(length, width);
                break;

            case 3:
                System.out.print("Enter Base: ");
                double base = sc.nextDouble();

                System.out.print("Enter Height: ");
                double height = sc.nextDouble();

                obj.area(base, height, 1);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}