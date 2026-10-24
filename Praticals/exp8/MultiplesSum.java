import java.util.Scanner;

public class MultiplesSum {
    public static int sumOfMultiples(int limit) {
        int sum = 0;
        for (int i = 1; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int limit = sc.nextInt();
        int result = sumOfMultiples(limit);
        System.out.println("Sum of multiples of 3 or 5 below " + limit + " is: " + result);
    }
}