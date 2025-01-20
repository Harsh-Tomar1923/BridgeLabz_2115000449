import java.util.*;
public class power_calculation{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base");
		int a=sc.nextInt();
		System.out.println("Enter the power");
		int b=sc.nextInt();
		System.out.println("Answer will be: " + pow(a,b));
	}
	public static int pow(int a,int b){
		return b==0?1: a*pow(a,b-1);
	}
}