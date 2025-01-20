import java.util.*;
public class avg_of_3nums{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		System.out.println("Enter third number");
		int num3=sc.nextInt();
		System.out.println("Average is: " + ((num1+num2+num3)/3));
	}
}