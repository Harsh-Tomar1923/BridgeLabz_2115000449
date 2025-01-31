package oops2;

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }

    public static void main(String[] args) {
        Student student1 = new Student(98, "Harsh", 8.5);
        student1.displayStudentDetails();

        // Accessing and modifying CGPA using public methods
        student1.setCGPA(9.0);
        System.out.println("Updated CGPA: " + student1.getCGPA());
    }
}
