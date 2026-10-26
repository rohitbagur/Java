class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override //overriding the function makeSound()
    void makeSound() {
        System.out.println("The dog barks");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.makeSound();
        myDog.makeSound();
    }
}