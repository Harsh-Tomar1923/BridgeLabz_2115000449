import java.util.*;
public class cal_SI{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount");
		int pr=sc.nextInt();
		System.out.println("Enter the rate of interest");
		int rt=sc.nextInt();
		System.out.println("Enter the time in years");
		int tm=sc.nextInt();
		System.out.println("Simple Interest: " + ((pr*rt*tm)/100));
	}
}