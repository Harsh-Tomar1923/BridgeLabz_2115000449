import java.util.*;
public class vol_cylinder{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of cylinder");
		int rad=sc.nextInt();
		System.out.println("Enter the height of cylinder");
		int hit=sc.nextInt();
		System.out.println("Volume of cylinder is: " + (3.14*rad*rad*hit));
	}
}