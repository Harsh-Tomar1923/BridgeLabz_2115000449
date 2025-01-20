import java.util.*;
public class celcius_to_Fahrenheit{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temp in celcius");
		int cel=sc.nextInt();
		System.out.println("Temp in Fahrenheit will be: " + ((cel*9/5)+32));
	}
}