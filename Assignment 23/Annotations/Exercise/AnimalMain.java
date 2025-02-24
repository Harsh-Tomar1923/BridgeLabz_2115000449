class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class AnimalMain {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.makeSound();
    }
}