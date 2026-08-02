//non restoring division using user input and first show number conversion to binary and then show the division process of all step 
//shl with Ac,Q SC
import java.util.Scanner;
public class nrd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Dividend (Q): ");
        int dividend = sc.nextInt();
        System.out.print("Enter Divisor (M): ");
        int divisor = sc.nextInt();
        int n = Integer.toBinaryString(dividend).length();

        String Q = String.format("%" + n + "s", Integer.toBinaryString(dividend)).replace(' ', '0');
        String M = String.format("%" + n + "s", Integer.toBinaryString(divisor)).replace(' ', '0');
        String AC = "0".repeat(n);
        System.out.println("\nInitial Values:");
        System.out.println("AC: " + AC + " Q: " + Q + " M: " + M + " SC: " + n);

        for (int i = 0; i < n; i++) {
            String combined = AC + Q;
            combined = combined.substring(1) + "0"; 
            AC = combined.substring(0, n);
            Q = combined.substring(n);

            System.out.println("\nStep " + (i + 1) + " - After SHL:");
            System.out.println("AC: " + AC + " Q: " + Q);

            int acVal = Integer.parseInt(AC, 2);
            int mVal = Integer.parseInt(M, 2);
            acVal = acVal - mVal;
            
            String acBin = Integer.toBinaryString(acVal);
            if (acBin.length() > n) acBin = acBin.substring(acBin.length() - n);
            AC = String.format("%" + n + "s", acBin).replace(' ', '0');

            if (acVal < 0) {
                Q = Q.substring(0, Q.length() - 1) + "0";
                acVal = acVal + mVal;

                acBin = Integer.toBinaryString(acVal);
                if (acBin.length() > n) acBin = acBin.substring(acBin.length() - n);
                AC = String.format("%" + n + "s", acBin).replace(' ', '0');
                System.out.println("AC < 0 → Q0 = 0, Restoring AC");
            } else {
                Q = Q.substring(0, Q.length() - 1) + "1";
                System.out.println("AC ≥ 0 → Q0 = 1");
            }
            System.out.println("AC: " + AC + " Q: " + Q + " SC: " + (n - i - 1));
        }
        int finalQuotient = Integer.parseInt(Q, 2);
        int finalRemainder = Integer.parseInt(AC, 2);
        System.out.println("\nFinal Quotient (Q): " + Q + " (Decimal: " + finalQuotient + ")");
        System.out.println("Final Remainder (AC): " + AC + " (Decimal: " + finalRemainder + ")");
    }
}




