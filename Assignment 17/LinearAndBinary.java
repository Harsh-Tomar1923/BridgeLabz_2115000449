import java.util.*;

class LinearAndBinary{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		executionTime(1000, 999);
		executionTime(10000, 9999);
		executionTime(1000000, 99999);
	}
	
	public static void executionTime(int size, int target){
		
		
		int[] arr = new int[size];
		
		for(int i=0;i<arr.length;i++)
			arr[i] = i+1;
		
		long ini = System.nanoTime();
		
		binarySearch(arr, target);
		
		System.out.println("Time taken for binary search on a dataset of "+size+" elements is : "+(System.nanoTime()-ini)/1000000.0+" milli seconds");
		
		ini = System.nanoTime();
		
		linearSearch(arr, target);
		
		System.out.println("Time taken for linear search on a dataset of "+size+" elements is : "+(System.nanoTime()-ini)/1000000.0+" milli seconds");
		
	}
	
	public static boolean binarySearch(int[] arr, int target){
	
		int low = 0, high = arr.length-1;
		while(low <=high){
			
			int mid = (low+high)/2;
			
			if(arr[mid] == target)
				return true;
			else if(arr[mid] > target)
				high = mid - 1;
			else 
				low = mid + 1;
		}
		return false;
		
	}
	
	public static boolean linearSearch(int[] arr, int target){
		
		for(int i=0;i<arr.length;i++){
		
			if(arr[i] == target)
				return true;
		
		}
		return false;
	
	}
}