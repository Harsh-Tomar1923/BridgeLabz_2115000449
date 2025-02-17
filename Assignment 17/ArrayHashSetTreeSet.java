import java.util.*;

class ArrayHashSetTreeSet{

	public static void main(String[] args){
	
		executionTime(1000, 500);
		executionTime(100000, 50000);
		executionTime(1000000, 500000);
	
	
	}
	public static void executionTime(int n, int target){
		
		int[] arr = new int[n];
		HashSet<Integer> hs = new HashSet<>();
		TreeSet<Integer> ts = new TreeSet<>();
		
		for(int i=0;i<n;i++){
			arr[i] = i+1;
			hs.add(i+1);
			ts.add(i+1);
		}
		
		long ini = System.nanoTime();
		for(int i=0;i<arr.length;i++){
			if(arr[i] == target)
				break;
		}
		System.out.println("Time taken by array to search target in size "+n+" is :"+(System.nanoTime()-ini)/1000000.0+" milli seconds");
		
		ini = System.nanoTime();
		hs.contains(target);
		System.out.println("Time taken by HashSet to search target size "+n+" is :"+(System.nanoTime()-ini)/1000000.0+" milli seconds");
		
		ini = System.nanoTime();
		ts.contains(target);
		System.out.println("Time taken by TreeSet to search target size "+n+" is :"+(System.nanoTime()-ini)/1000000.0+" milli seconds");
	}



}