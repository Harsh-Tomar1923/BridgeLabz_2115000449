package Inheritence;

class Animal{
    private String name;
    private int age;
    void makeSounds(){
        System.out.println("Animal makes sounds");
    }
}
class Dog extends Animal{
    void makeSounds(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    void makeSounds(){
        System.out.println("Cat meows");
    }
}
class Bird extends Animal{
    void makeSounds(){
        System.out.println("Bird voice");
    }
}

public class AnimalHierarchy{
    public static void main(String[] args) {
        Animal dg = new Dog();
        Animal ct = new Cat();
        Animal bd = new Bird();
        dg.makeSounds();
        ct.makeSounds();
        bd.makeSounds();
    }
}