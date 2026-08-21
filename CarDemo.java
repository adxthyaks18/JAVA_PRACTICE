package mod2;
class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void showModel() {
        System.out.println("Model: " + model);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model 3");

         //car.model = "Civic";       
        // System.out.println(car.model); 

        car.showModel(); 
    }
}