import java.util.*;

class RotatedSortedArray{

	public static void main(String[] args){
	
		int[] arr = {5,6,7,8,9,10,1,2,3};
		
		int min = binarySearch(arr);
		
		System.out.println(min);
	
	}
	
	public static int binarySearch(int[] arr){
		
		int low = 0, high = arr.length-1;
		
		while(low < high){
			
			int mid = (low+high)/2;
			
			if(arr[mid] > high)
				low = mid+1;
			else
				high = mid;
		}
		
		return arr[low];
		
	}
	
	

}