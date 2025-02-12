package protectedkeyword;
class Animal {
    protected String name;

    protected void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    Animal animal = new Animal();
    void setAnimalName(String newName) {
        animal.name = newName; // Accessing protected member in a class of the same package
    }

    void makeAnimalSound() {
        animal.makeSound(); // Accessing protected method in a class of the same package
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name=""; // Setting the name using protected member
        dog.makeAnimalSound(); // Accessing the protected method
        System.out.println("Animal name: " + dog.animal.name); // Accessing the protected variable
    }
}
