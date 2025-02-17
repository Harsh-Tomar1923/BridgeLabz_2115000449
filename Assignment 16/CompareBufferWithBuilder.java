import java.util.*;

class CompareBufferWithBuilder{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		StringBuilder stb1 = new StringBuilder();
		StringBuffer stb2 = new StringBuffer();
		
		long ini = System.nanoTime();
		
		for(int i=0;i<1000000;i++){
			stb1.append(str);
		}
		
		System.out.println("Execution Time for String Builder is : "+(System.nanoTime()-ini)+" nano seconds");
		
		ini = System.nanoTime();
		
		for(int i=0;i<1000000;i++){
			stb2.append(str);
		}
		
		System.out.println("Execution Time for String Buffer is : "+(System.nanoTime()-ini)+" nano seconds");
	
	}

}