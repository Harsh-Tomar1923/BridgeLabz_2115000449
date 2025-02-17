import java.util.*;
import java.io.*;

class CompareAll{

	public static void main(String[] args){
	
		String str1 = "hello";
		
		StringBuilder stb1 = new StringBuilder();
		StringBuffer stb2 = new StringBuffer();
		
		long ini = System.nanoTime();
		
		for(int i=0;i<1000000;i++){
			stb1.append(str1);
		}
		
		System.out.println("Execution Time for String Builder is : "+(System.nanoTime()-ini)+" nano seconds");
		
		ini = System.nanoTime();
		
		for(int i=0;i<1000000;i++){
			stb2.append(str1);
		}
		
		System.out.println("Execution Time for String Buffer is : "+(System.nanoTime()-ini)+" nano seconds");
	
		
		try{
			FileReader f1 = new FileReader("100mbfile.txt");
			BufferedReader b1 = new BufferedReader(f1);
			
			FileInputStream fi1 = new FileInputStream("100mbfile.txt");
			InputStreamReader i1 = new InputStreamReader(fi1);
			BufferedReader b2 = new BufferedReader(i1);
			
			int c1 = 0,c2 = 0;
			ini = System.nanoTime();
			while(true){
			
				String str = b1.readLine();
				if(str == null)
					break;
				
				for(int i=0;i<str.length();i++){
					if(str.charAt(i) == ' ')
						c1++;
				}
			
			}
			System.out.println("Word count is "+c1);
			System.out.println("Time of execution for File Reader is "+(System.nanoTime()-ini)+" nano seconds");
			
			ini = System.nanoTime();
			while(true){
			
				String str = b2.readLine();
				if(str == null)
					break;
				
				for(int i=0;i<str.length();i++){
					if(str.charAt(i) == ' ')
						c2++;
				}
			
			}
			System.out.println("Word count is "+c2);
			System.out.println("Time of execution for InputStreamReader is "+(System.nanoTime()-ini)+" nano seconds");
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}
		
	}

}