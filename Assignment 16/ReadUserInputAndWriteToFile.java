import java.io.*;
import java.util.*;

class ReadUserInputAndWriteToFile{

	public static void main(String[] args){
		try{
			InputStreamReader i1 = new InputStreamReader(System.in);
			BufferedReader b1 = new BufferedReader(i1);
		
			FileWriter writer = new FileWriter("name.txt");
			
			System.out.println("Enter any text : ");
			String str = b1.readLine();
			
			writer.write(str);
			
			i1.close();
			writer.close();
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