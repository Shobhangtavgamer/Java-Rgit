import java.util.Scanner;

interface CurrencyConverter {
 double convertCurrency(double amount, String fromCurrency, String toCurrency);
}

public class currency {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     final double USD_TO_INR = 95.39;
     final double INR_TO_USD = 1 / USD_TO_INR;

     System.out.print("Enter amount: ");
     double amount = sc.nextDouble();
     sc.nextLine(); 
     System.out.print("Enter source currency: ");
     String from = sc.nextLine().toUpperCase();
     System.out.print("Enter target currency: ");
     String to = sc.nextLine().toUpperCase();
     CurrencyConverter converter = new CurrencyConverter() {
         public double convertCurrency(double amt, String src, String tgt) {
             if (src.equals("USD") && tgt.equals("INR")) {
                 return amt * USD_TO_INR;
             } else if (src.equals("INR") && tgt.equals("USD")) {
                 return amt * INR_TO_USD;
             } else if (src.equals(tgt)) {
                 return amt; 
             } else {
                 System.out.println("Unsupported currency conversion.");
                 return 0.0;
             }
         }
     };
     double result = converter.convertCurrency(amount, from, to);
     System.out.printf("Converted %.2f %s to %.2f %s\n", amount, from, result, to);
 }
}