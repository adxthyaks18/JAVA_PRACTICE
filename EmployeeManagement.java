package mod2;
import java.util.Scanner;

class Employee {
    String name, address;
    int age;
    long mob;
    float sal;

    void print_Salary() {
        System.out.println("Salary: " + sal);
    }
}

class Officer extends Employee {
    String spl;

    void print_Specialization() {
        System.out.println("Specialization: " + spl);
    }
}

class Manager extends Employee {
    String dep;

    void print_Dept() {
        System.out.println("Department: " + dep);
    }
}

public class EmployeeManagementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Officer officer = new Officer();
        System.out.print("Enter Officer's Name: ");
        officer.name = sc.nextLine();
        System.out.print("Enter Address: ");
        officer.address = sc.nextLine();
        System.out.print("Enter Age: ");
        officer.age = sc.nextInt();
        System.out.print("Enter Mobile: ");
        officer.mob = sc.nextLong();
        System.out.print("Enter Salary: ");
        officer.sal = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter Specialization: ");
        officer.spl = sc.nextLine();

        Manager manager = new Manager();
        System.out.print("Enter Manager's Name: ");
        manager.name = sc.nextLine();
        System.out.print("Enter Address: ");
        manager.address = sc.nextLine();
        System.out.print("Enter Age: ");
        manager.age = sc.nextInt();
        System.out.print("Enter Mobile: ");
        manager.mob = sc.nextLong();
        System.out.print("Enter Salary: ");
        manager.sal = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter Department: ");
        manager.dep = sc.nextLine();

        System.out.println("\n--- Officer Details ---");
        System.out.println("Name: " + officer.name);
        System.out.println("Address: " + officer.address);
        System.out.println("Age: " + officer.age);
        System.out.println("Mobile: " + officer.mob);
        officer.print_Salary();
        officer.print_Specialization();

        System.out.println("\n--- Manager Details ---");
        System.out.println("Name: " + manager.name);
        System.out.println("Address: " + manager.address);
        System.out.println("Age: " + manager.age);
        System.out.println("Mobile: " + manager.mob);
        manager.print_Salary();
        manager.print_Dept();

        sc.close();
    }
}