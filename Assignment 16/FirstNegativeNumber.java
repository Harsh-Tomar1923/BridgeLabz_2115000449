import java.util.*;

class FirstNegativeNumber{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Index of First Negative element is : "+linearSearch(arr));
		
	}
	
	public static int linearSearch(int[] arr){
	
		for(int i=0;i<arr.length;i++){
			if(arr[i] < 0)
				return i;
		}
		
		return -1;

	}
	
	


}