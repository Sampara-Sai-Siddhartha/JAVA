// Animal class
class Animal {
    // Method to make a sound
    void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}

// Cat subclass extending Animal
class Cat extends Animal {
    // Override makeSound method to bark
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal genericAnimal = new Animal();

        // Call makeSound method of Animal
        System.out.println("Calling makeSound method of Animal:");
        genericAnimal.makeSound();

        // Create an instance of Cat
        Cat myCat = new Cat();

        // Call makeSound method of Cat (which overrides Animal's makeSound)
        System.out.println("\nCalling makeSound method of Cat:");
        myCat.makeSound();
    }
}
