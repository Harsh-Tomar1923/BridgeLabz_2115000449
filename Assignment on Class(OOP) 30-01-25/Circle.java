package Class_Assignment;

public class Circle {
    private double radius;

    //constructor
    public Circle(double radius){
        this.radius=radius;
    }

    //getter and setter methods
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double rad){
        this.radius=rad;
    }


    //methods
    public void area(){
        double ar=(double)(3.14*this.radius*this.radius);
        System.out.println("Area of the circle is: "+ar);
    }
    public void circumference(){
        double cr=(double)(2*3.14*this.radius);
        System.out.println("Circumference of the circle is: "+cr);
    }
}
