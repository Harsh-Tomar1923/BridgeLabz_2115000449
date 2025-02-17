import java.util.*;

class FirstAndLastOccurrence{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		int target = sc.nextInt();
		
		System.out.println("First occurence is : "+firstOccurence(arr, target));
		System.out.println("Last occurrence is : "+lastOccurence(arr, target));
	}
	
	public static int firstOccurence(int[] arr, int target){
	
		int low = 0, high = arr.length-1;
		int first = -1;
		
		while(low <= high){
			
			int mid = (low+high)/2;
			
			if(arr[mid] == target){
				first = mid;
				high = mid - 1;
			}
			else if(arr[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		
		}
		
		return first;
	
	}
	public static int lastOccurence(int[] arr, int target){
	
		int low = 0, high = arr.length-1;
		int last = -1;
		
		while(low <= high){
			
			int mid = (low+high)/2;
			
			if(arr[mid] == target){
				last = mid;
				low = mid + 1;
			}
			else if(arr[mid] < target)
				low = mid + 1;
			else
				high = mid - 1;
		
		}
		
		return last;
	
	}

}