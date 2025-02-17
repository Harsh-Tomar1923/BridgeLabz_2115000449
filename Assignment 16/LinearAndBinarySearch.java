import java.util.*;

class LinearAndBinarySearch{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		int target = sc.nextInt();
		
		System.out.println("First missing positive integer is : "+firstMissing(arr));
		
		System.out.println("Index of the target element is : "+binarySearch(arr, target));
	
	}
	
	public static int firstMissing(int[] arr){
		
		int arr2[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			int ind = arr[i]-1;
			if(ind>=0 && ind<arr.length){
				arr2[ind] = -1;
			}
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr2[i] >= 0)
				return i+1;
		}
		
		return -1;
	
	}
	
	public static int binarySearch(int[] arr, int target){
		
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
			hm.put(arr[i], i);
		
		Arrays.sort(arr);
		
		int low = 0, high = arr.length-1;
		
		while(low<=high){
			
			int mid = high - (high - low)/2;
				
			if(arr[mid] == target)
				return hm.get(arr[mid]);
			else if(arr[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
		
	}

}