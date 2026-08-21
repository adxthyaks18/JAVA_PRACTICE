package zoo;
class Employee {
    protected int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    protected void showSalary() {
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {

    Manager(int salary) {
        super(salary);
    }

    void display() {
        System.out.println("Salary: " + salary);
        showSalary();
    }
}
class EmployeeDemo {
    public static void main(String[] args) {

        Manager m = new Manager(50000);

        System.out.println("Salary: " + m.salary);
        m.showSalary();
    }
}
