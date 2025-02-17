import java.util.*;
import java.io.*;

class LargeFileReadingEfficiency{

	public static void main(String[] args){
	
		exectionTime("1mbfile.txt");
		exectionTime("100mbfile.txt");
		exectionTime("500mbfile.txt");
	
	}
	
	public static void exectionTime(String path){
		
		try{
			FileReader f1 = new FileReader(path);
		
			FileInputStream fi1 = new FileInputStream(path);
			InputStreamReader i1 = new InputStreamReader(fi1);
			
			long ini = System.nanoTime();
			int inp = -1;
			while((inp = f1.read()) != -1 ){}
		
			System.out.println("Time taken for the execution of File Reader for file "+path+" is : "+(System.nanoTime()-ini)/1000000.0+" milli seconds");
		
			ini = System.nanoTime();
			while((inp = i1.read()) != -1){}
		
			System.out.println("Time taken for the execution of InputStreamReader is for file "+path+" is : "+(System.nanoTime()-ini)/1000000.0+" milli seconds");
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}
		
		
		
	}


}