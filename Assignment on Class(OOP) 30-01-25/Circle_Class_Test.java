package Class_Assignment;

public class Circle_Class_Test {
    public static void main(String[] args) {

        //creating object
        Circle c1=new Circle(4);

        //calling the method
        c1.area();
        c1.circumference();
        System.out.println(c1.getRadius());
    }
}
