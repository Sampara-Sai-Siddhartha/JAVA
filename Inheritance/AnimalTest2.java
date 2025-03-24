// Animal class
class Animal {
    // Method to move
    void move() {
        System.out.println("Animal is moving");
    }
}

// Cheetah subclass extending Animal
class Cheetah extends Animal {
    // Override move method for Cheetah
    @Override
    void move() {
        System.out.println("Cheetah is running");
    }
}

public class AnimalTest2 {
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal genericAnimal = new Animal();

        // Call move method of Animal
        System.out.println("Calling move method of Animal:");
        genericAnimal.move();

        // Create an instance of Cheetah
        Cheetah myCheetah = new Cheetah();

        // Call move method of Cheetah (which overrides Animal's move)
        System.out.println("\nCalling move method of Cheetah:");
        myCheetah.move();
    }
}
