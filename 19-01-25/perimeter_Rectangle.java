import java.util.*;
public class perimeter_Rectangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		int len=sc.nextInt();
		System.out.println("Enter the width of rectangle");
		int wid=sc.nextInt();
		System.out.println("Perimeter of rectangle is: " + (2*(len+wid)));
	}
}