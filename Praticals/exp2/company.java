import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee {
    int empId;
    String empName;
    double empSalary;
    double grossSalary;

    void getInfo(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    void calculateGrossSalary() {
        double da = empSalary * 0.10;
        double hra = empSalary * 0.07;
        grossSalary = empSalary + da + hra;
    }

    void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + empSalary);
        System.out.println("DA (10%): " + (empSalary * 0.10));
        System.out.println("HRA (7%): " + (empSalary * 0.07));
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class company {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Employee ID: ");
        int empId = Integer.parseInt(br.readLine());

        System.out.print("Enter Employee Name: ");
        String empName = br.readLine();

        System.out.print("Enter Employee Salary: ");
        double empSalary = Double.parseDouble(br.readLine());

        Employee emp = new Employee();
        emp.getInfo(empId, empName, empSalary);
        emp.calculateGrossSalary();
        emp.displayDetails();
    }
}