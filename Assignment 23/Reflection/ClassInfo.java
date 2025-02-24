import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInfo {
    public static void main(String[] args) throws ClassNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter class name: ");
        String className = sc.nextLine();
        Class<?> clazz = Class.forName(className);
        System.out.println("Methods: ");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method.getName());
        }
        System.out.println("Fields: ");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field.getName());
        }
        System.out.println("Constructors: ");
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            System.out.println(constructor.getName());
        }

        sc.close();
    }
}