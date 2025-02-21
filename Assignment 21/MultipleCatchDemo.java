import java.util.*;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index: ");
        try {
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } finally {
            scanner.close();
        }
    }
}
