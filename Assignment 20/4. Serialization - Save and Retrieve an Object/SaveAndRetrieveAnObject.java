import java.util.*;
import java.io.*;

class SaveAndRetrieveAnObject {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException{
	
		FileOutputStream fos = new FileOutputStream("t.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Employee e1 = new Employee(1, "Kushagra Sharma", "Java Developer", 1000000);
		Employee e2 = new Employee(2, "Naman Agarwal", "Java Developer", 1000000);
		Employee e3 = new Employee(3, "Nikhil Agrawal", "Fullstack Developer", 1500000);
		Employee e4 = new Employee(4, "Vedansh Gautam", "Testing", 2000000);
		List<Employee> input = new ArrayList<>();
		
		input.add(e1);
		input.add(e2);
		input.add(e3);
		input.add(e4);
		
		
		oos.writeObject(input);
		
		oos.flush();
		
		oos.close();
		
		
		FileInputStream fis = new FileInputStream("t.tmp");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		@SuppressWarnings("unchecked")
		List<Employee> output = (List<Employee>)ois.readObject();
		
		for(int i=0;i<output.size();i++)
			output.get(i).display();
	}



}