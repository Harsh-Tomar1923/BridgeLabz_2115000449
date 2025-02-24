import java.lang.reflect.*;

class Person {
    private int age = 25;

    public int getAge() {
        return age;
    }


}

public class PrivateField {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);
        field.set(p, 30);
        System.out.println("Modified Age: " + field.get(p));
    }
}