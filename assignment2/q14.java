import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary, gross_salary;

    void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        emp_id = scanner.nextInt();
        System.out.print("Enter Employee Name: ");
        emp_name = scanner.next();
        System.out.print("Enter Basic Salary: ");
        basic_salary = scanner.nextDouble();
    }

    void calculateGrossSalary() {
        gross_salary = basic_salary + (0.1 * basic_salary) + (0.2 * basic_salary);
    }

    void displayDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Gross Salary: " + gross_salary);
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.acceptDetails();
        emp.calculateGrossSalary();
        emp.displayDetails();
    }
}
