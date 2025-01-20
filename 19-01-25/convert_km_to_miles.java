import java.util.*;
public class convert_km_to_miles{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter distance in km");
		int km=sc.nextInt();
		System.out.println("Distance in miles is: " + (km*0.621371));
	}
}