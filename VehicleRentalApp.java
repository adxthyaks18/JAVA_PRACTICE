package classworks;
import java.util.Scanner;

interface Displayable {
 void showDetails(int days);
}

abstract class Vehicle {
 protected int vehicleId;
 protected String vehicleName;
 protected double rentalPricePerDay;

 public Vehicle(int vehicleId, String vehicleName, double rentalPricePerDay) {
     this.vehicleId = vehicleId;
     this.vehicleName = vehicleName;
     this.rentalPricePerDay = rentalPricePerDay;
 }

 abstract double calculateRentalAmount(int days);

 
 public void displayVehicleDetails() {
     System.out.println("Vehicle ID           : " + vehicleId);
     System.out.println("Vehicle Name         : " + vehicleName);
     System.out.println("Rental Price / Day   : Rs. " + rentalPricePerDay);
 }
}


class Car extends Vehicle implements Displayable {

 public Car(int vehicleId, String vehicleName, double rentalPricePerDay) {
     super(vehicleId, vehicleName, rentalPricePerDay);
 }

 @Override
 double calculateRentalAmount(int days) {
     double total = rentalPricePerDay * days;
    
     if (days > 5) {
         total = total - (0.10 * total);
     }
     return total;
 }

 @Override
 public void showDetails(int days) {
     displayVehicleDetails();
     System.out.println("Days Rented          : " + days);
     System.out.println("Total Rental Amount  : Rs. " + calculateRentalAmount(days));
     System.out.println("-----------------------------------------");
 }
}


class Bike extends Vehicle implements Displayable {

 public Bike(int vehicleId, String vehicleName, double rentalPricePerDay) {
     super(vehicleId, vehicleName, rentalPricePerDay);
 }

 @Override
 double calculateRentalAmount(int days) {
     double total = rentalPricePerDay * days;
   
     if (days > 3) {
         total = total - (0.05 * total);
     }
     return total;
 }

 @Override
 public void showDetails(int days) {
     displayVehicleDetails();
     System.out.println("Days Rented          : " + days);
     System.out.println("Total Rental Amount  : Rs. " + calculateRentalAmount(days));
     System.out.println("-----------------------------------------");
 }
}


public class VehicleRentalApp {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     
     Car car = new Car(101, "Honda City", 2000.0);
     Bike bike = new Bike(201, "Royal Enfield", 500.0);

     System.out.print("Enter number of rental days for Car: ");
     int carDays = scanner.nextInt();

     System.out.print("Enter number of rental days for Bike: ");
     int bikeDays = scanner.nextInt();

     System.out.println("\n========== RENTAL SUMMARY ==========\n");

     
     car.showDetails(carDays);
     bike.showDetails(bikeDays);

     scanner.close();
 }
}
