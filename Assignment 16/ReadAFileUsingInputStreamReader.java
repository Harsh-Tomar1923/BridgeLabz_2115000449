import java.io.*;
import java.util.*;

class ReadAFileUsingInputStreamReader{

	public static void main(String[] args){
		try{
			FileInputStream f1 = new FileInputStream("LinearAndBinarySearch.java");
			InputStreamReader i1 = new InputStreamReader(f1);
			BufferedReader b1 = new BufferedReader(i1);
		
			while(true){
			
				String str = b1.readLine();
				if(str == null)
					break;
				System.out.println(str);
			
			}
			f1.close();
			i1.close();
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