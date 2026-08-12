package mod1;
import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    void displayEmployee() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details of Employee 1");
        System.out.print("ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Salary: ");
        double sal1 = sc.nextDouble();

        sc.nextLine();

        System.out.println("\nEnter details of Employee 2");
        System.out.print("ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Salary: ");
        double sal2 = sc.nextDouble();

        Employee e1 = new Employee(id1, name1, sal1);
        Employee e2 = new Employee(id2, name2, sal2);

        System.out.println("\nEmployee 1 Details");
        e1.displayEmployee();

        System.out.println("\nEmployee 2 Details");
        e2.displayEmployee();

        sc.close();
    }
}