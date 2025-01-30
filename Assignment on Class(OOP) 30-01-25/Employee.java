package Class_Assignment;

public class Employee {
    private String name;
    private int id;
    private int salary;

    //constructor
    public Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //method to display the details
    public void displayDetails(){
        System.out.println("Name of the Employee is: "+this.name);
        System.out.println("Id of the Employee is: "+this.id);
        System.out.println("Salary of the Employee is: "+this.salary);
    }
}
