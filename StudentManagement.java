package mod2;
import java.util.Scanner;

class Students {
    String name, course;
    int rollNo;

    void setDetails(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class StudentAccount extends Students {
    double collegeFee;

    void setFee(double collegeFee) {
        this.collegeFee = collegeFee;
    }

    void displayFee() {
        System.out.println("College Fee: " + collegeFee);
    }
}

class Hosteller extends StudentAccount {
    double hostelFee, messFee;

    void setHostelDetails(double hostelFee, double messFee) {
        this.hostelFee = hostelFee;
        this.messFee = messFee;
    }

    void displayAll() {
        System.out.println("\n--- HOSTELLER DETAILS ---");
        displayDetails();
        displayFee();
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);
        double total = collegeFee + hostelFee + messFee;
        System.out.println("Total Fee: " + total);
    }
}

class DayScholar extends StudentAccount {
    double busFee;

    void setBusFee(double busFee) {
        this.busFee = busFee;
    }

    void displayAll() {
        System.out.println("\n--- DAY SCHOLAR DETAILS ---");
        displayDetails();
        displayFee();
        System.out.println("Bus Fee: " + busFee);
        double total = collegeFee + busFee;
        System.out.println("Total Fee: " + total);
    }
}

public class StudentManagementDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hosteller h = new Hosteller();
        System.out.print("Enter Hosteller's Name: ");
        String hName = sc.nextLine();
        System.out.print("Enter Roll No: ");
        int hRoll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        String hCourse = sc.nextLine();
        h.setDetails(hName, hRoll, hCourse);

        System.out.print("Enter College Fee: ");
        h.setFee(sc.nextDouble());
        System.out.print("Enter Hostel Fee: ");
        double hostelFee = sc.nextDouble();
        System.out.print("Enter Mess Fee: ");
        double messFee = sc.nextDouble();
        h.setHostelDetails(hostelFee, messFee);
        sc.nextLine();

        DayScholar d = new DayScholar();
        System.out.print("Enter Day Scholar's Name: ");
        String dName = sc.nextLine();
        System.out.print("Enter Roll No: ");
        int dRoll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        String dCourse = sc.nextLine();
        d.setDetails(dName, dRoll, dCourse);

        System.out.print("Enter College Fee: ");
        d.setFee(sc.nextDouble());
        System.out.print("Enter Bus Fee: ");
        d.setBusFee(sc.nextDouble());

        h.displayAll();
        d.displayAll();

        sc.close();
    }
}