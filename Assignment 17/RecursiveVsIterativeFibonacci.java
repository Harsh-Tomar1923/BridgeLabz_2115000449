import java.util.*;

class RecursiveVsIterativeFibonacci{

	public static void main(String[] args){
	
		executionTime(10);
		executionTime(30);
		executionTime(50);
	
	}

	public static void executionTime(int n){
	
		long ini = System.nanoTime();
		
		System.out.println(iterative(n));
		System.out.println("Time taken for the execution of iterative fibonacci for value : "+n+" is : "+(System.nanoTime()-ini)/1000000.0+" milli seconds");
	
		ini = System.nanoTime();
		System.out.println(recursive(n));
		System.out.println("Time taken for the execution of recursive fibonacci for value : "+n+" is : "+(System.nanoTime()-ini)/1000000.0+" milli seconds");
	
	}
	
	public static int iterative(int n){
		
		int a=0, b=1;
		for(int i=2;i<=n;i++){
			int c = a+b;
			a = b;
			b = c;
		}
		return b;
	
	}
	
	public static int recursive(int n){
		
		if(n == 1 || n == 0)
			return n;
		
		return recursive(n-1)+recursive(n-2);
	
	}


}