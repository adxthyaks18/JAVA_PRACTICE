package classworks;

abstract class Shape {
 
 abstract void numberOfSides();

 
 void sumOfAngles(int sides) {
     int sum = (sides - 2) * 180;
     System.out.println("Sum of interior angles: " + sum + " degrees");
 }
}

class Rectangle extends Shape {
 private final int sides = 4;

 @Override
 void numberOfSides() {
     System.out.println("Shape: Rectangle");
     System.out.println("Number of sides: " + sides);
     sumOfAngles(sides);
     System.out.println("------------------------------------");
 }
}


class Triangle extends Shape {
 private final int sides = 3;

 @Override
 void numberOfSides() {
     System.out.println("Shape: Triangle");
     System.out.println("Number of sides: " + sides);
     sumOfAngles(sides);
     System.out.println("------------------------------------");
 }
}


class Hexagon extends Shape {
 private final int sides = 6;

 @Override
 void numberOfSides() {
     System.out.println("Shape: Hexagon");
     System.out.println("Number of sides: " + sides);
     sumOfAngles(sides);
     System.out.println("------------------------------------");
 }
}


public class ShapeDemo {
 public static void main(String[] args) {
     
     Shape shape;

     shape = new Triangle();
     shape.numberOfSides();

     shape = new Rectangle();
     shape.numberOfSides();

     shape = new Hexagon();
     shape.numberOfSides();
 }
}
