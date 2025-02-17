import java.util.*;

class PeakElement{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		System.out.println(peakSearch(arr));
	
	}
	
	public static int peakSearch(int[] arr){
		
		int low = 0, high = arr.length-1;
		
		while(low<=high){
			
			int mid = (low+high)/2;
			
			if((mid-1) > 0 && (mid+1) < arr.length && arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1])
				return arr[mid];
			
			if(mid-1<0 || mid+1>=arr.length)
				return arr[mid];
			
			else if(mid+1<arr.length && arr[mid]<arr[mid+1])
				low = mid+1;
			
			else 
				high = mid-1;
			
		}
	
		return -1;
	}

}