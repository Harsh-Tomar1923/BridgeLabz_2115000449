package oops2;

public class Circle {
    private double radius;

    //default constructor
    public Circle(){
        this.radius=1.0;
    }
    //parameterised constructor
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
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.area();

        Circle c2=new Circle(4.0);
        c2.area();
    }
}
