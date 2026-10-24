import java.util.Scanner;

interface TemperatureConverter {
    double celsiusToFahrenheit(double celsius);
    double fahrenheitToCelsius(double fahrenheit);
}
public class temperature{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        TemperatureConverter converter = new TemperatureConverter() {
            public double celsiusToFahrenheit(double c) {
                return (c * 9 / 5) + 32;
            }
            public double fahrenheitToCelsius(double f) {
                return (f - 32) * 5 / 9;
            }
        };
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double fResult = converter.celsiusToFahrenheit(celsius);
        double cResult = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(celsius + "°C = " + fResult + "°F");
        System.out.println(fahrenheit + "°F = " + cResult + "°C");
    }
}