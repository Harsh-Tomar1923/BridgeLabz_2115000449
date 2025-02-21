import java.io.*;

class Employee implements Serializable{

	int id;
	String name;
	String department;
	int salary;
	
	Employee(int id, String name, String department, int salary){
		
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		
	}
	
	public void display(){
		
		System.out.println("Employee id is : "+this.id);
		System.out.println("Employee name is : "+this.name);
		System.out.println("Employee department is : "+this.department);
		System.out.println("Employee salary is : "+this.salary);
		System.out.println();
		
	}


}