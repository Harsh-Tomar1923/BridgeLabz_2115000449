import java.io.*;
import java.util.*;

class WordCountInAFile{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		int c = 0;
	
		try{
			FileReader f1 = new FileReader("LinearAndBinarySearch.java");
			BufferedReader b1 = new BufferedReader(f1);
		
			while(true){
			
				String str = b1.readLine();
				if(str == null)
					break;
				
				String str2 = "";
				for(int i=0;i<str.length();i++){
					if((str.charAt(i) >='a' && str.charAt(i)<='z')||(str.charAt(i) >='A' && str.charAt(i)<='Z'))
						str2 += str.charAt(i);
					else{
						if(str2.equals(word))
							c++;
						str2 = "";
					}
				}
				if(str2.equals(word))
					c++;
			
			}
			f1.close();
			b1.close();
			System.out.println("Number of occurrences of word "+word+" is : "+c);
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}
	}


}