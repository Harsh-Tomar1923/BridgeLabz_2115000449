import java.io.*;
import java.util.*;

class ReadAFileUsingFileReader{

	public static void main(String[] args){
		try{
			FileReader f1 = new FileReader("LinearAndBinarySearch.java");
			BufferedReader b1 = new BufferedReader(f1);
		
			while(true){
			
				String str = b1.readLine();
				if(str == null)
					break;
				System.out.println(str);
			
			}
			f1.close();
			b1.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}


}