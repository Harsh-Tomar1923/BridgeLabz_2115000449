import java.util.*;
import java.io.*;


class ReadUserInputFromConsole{


	public static void main(String[] args){
	
	
		try{
			BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
			FileWriter f1 = new FileWriter("./outputFile.txt");
			
			String input = b1.readLine();
			System.out.println(input);
			
			f1.write(input);
			System.out.println("File written successfully");
			
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}

}

