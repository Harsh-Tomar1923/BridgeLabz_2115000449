import java.util.*;

class StringConcatenationPerformance{

	public static void main(String[] args){
		
		String str = "";
		StringBuilder stb1 = new StringBuilder();
		StringBuffer stb2 = new StringBuffer();
		
		long ini = System.nanoTime();
		for(int i=0;i<1000;i++)
			str += "hello";
		System.out.println("Time taken by String to concatenate 1000 strings is : "+(System.nanoTime()-ini)/1000000.0+" milli seconds");
		
		ini = System.nanoTime();
		for(int i=0;i<1000;i++)
			stb1.append("hello");
		System.out.println("Time taken by String Builder to concatenate 1000 strings is : "+(System.nanoTime()-ini)/1000000.0+" milli seconds");
		
		ini = System.nanoTime();
		for(int i=0;i<1000;i++)
			stb2.append("hello");
		System.out.println("Time taken by String Buffer to concatenate 1000 strings is : "+(System.nanoTime()-ini)/1000000.0+" milli seconds");
		
		
		ini = System.nanoTime();
		for(int i=0;i<10000;i++)
			str += "hello";
		System.out.println("Time taken by String to concatenate 10000 strings is : "+(System.nanoTime()-ini)/1000000.0+" milli seconds");
		
		ini = System.nanoTime();
		for(int i=0;i<10000;i++)
			stb1.append("hello");
		System.out.println("Time taken by String Builder to concatenate 10000 strings is : "+(System.nanoTime()-ini)/1000000.0+" milli seconds");
		
		ini = System.nanoTime();
		for(int i=0;i<10000;i++)
			stb2.append("hello");
		System.out.println("Time taken by String Buffer to concatenate 10000 strings is : "+(System.nanoTime()-ini)/1000000.0+" milli seconds");
		
		
		ini = System.nanoTime();
		for(int i=0;i<1000000;i++)
			str += "hello";
		System.out.println("Time taken by String to concatenate 1000000 strings is : "+(System.nanoTime()-ini)/1000000.0+" milli seconds");
		
		ini = System.nanoTime();
		for(int i=0;i<1000000;i++)
			stb1.append("hello");
		System.out.println("Time taken by String Builder to concatenate 1000000 strings is : "+(System.nanoTime()-ini)/1000000.0+" milli seconds");
		
		ini = System.nanoTime();
		for(int i=0;i<1000000;i++)
			stb2.append("hello");
		System.out.println("Time taken by String Buffer to concatenate 1000000 strings is : "+(System.nanoTime()-ini)/1000000.0+" milli seconds");
		
	}
	

}