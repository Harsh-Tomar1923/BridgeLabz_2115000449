import java.lang.reflect.*;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

public class DynamicMethod {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter method name: ");
        String methodName = sc.nextLine();
        MathOperations obj = new MathOperations();
        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        System.out.println("Result: " + method.invoke(obj, 5, 3));

        sc.close();
    }
}