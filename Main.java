package zoo;
class Animal {
    String species; 

    Animal(String species) {
        this.species = species;
    }

    void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Polar Bear");

        System.out.println("Accessing species directly: " + myAnimal.species);
        myAnimal.displaySpecies();

    }
}