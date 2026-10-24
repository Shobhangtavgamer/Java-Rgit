import java.util.Scanner;

interface Worker {
    double calculateBonus();
    void generateReport();
    void manageProject();
}

class Manager implements Worker {
    String name, address;
    double salary;
    Manager(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    public double calculateBonus() {
        return salary * 0.25;
    }
    public void generateReport() {
        System.out.println("Performance Report for Manager");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Bonus: ₹" + calculateBonus());
    }
    public void manageProject() {
        System.out.println(name + " is leading strategic initiatives.");
    }
}

class Developer implements Worker {
    String name, address;
    double salary;
    Developer(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    public double calculateBonus() {
        return salary * 0.10;
    }
    public void generateReport() {
        System.out.println("Performance Report for Developer");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Bonus: ₹" + calculateBonus());
    }
    public void manageProject() {
        System.out.println(name + " is building backend systems.");
    }
}

class Programmer implements Worker {
    String name, address;
    double salary;
    Programmer(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    public double calculateBonus() {
        return salary * 0.10;
    }
    public void generateReport() {
        System.out.println("Performance Report for Programmer");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Bonus: ₹" + calculateBonus());
    }
    public void manageProject() {
        System.out.println(name + " is writing optimized code.");
    }
}

class GeneralEmployee implements Worker {
    String name, address;
    double salary;
    GeneralEmployee(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    public double calculateBonus() {
        return salary * 0.10;
    }
    public void generateReport() {
        System.out.println("Performance Report for Employee");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Bonus: ₹" + calculateBonus());
    }
    public void manageProject() {
        System.out.println(name + " is managing a general project.");
    }
}
public class company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter role (Manager/Developer/Programmer): ");
        String role = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        Worker emp;
        switch (role.toLowerCase()) {
            case "manager": emp = new Manager(name, address, salary); break;
            case "developer": emp = new Developer(name, address, salary); break;
            case "programmer": emp = new Programmer(name, address, salary); break;
            default: emp = new GeneralEmployee(name, address, salary);
        }
        System.out.println("\nEmployee Details:");
        emp.generateReport();
        emp.manageProject();
    }
}