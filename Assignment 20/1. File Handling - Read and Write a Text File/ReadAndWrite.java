import java.io.*;


class ReadAndWrite{
	public static void main(String[] args){
		try{
			
			FileInputStream fi = new FileInputStream("Inputfile.txt");
			FileOutputStream fo = new FileOutputStream("./Outputfile.txt");
			
			int inp = 0;
			while((inp = fi.read()) != -1){
			
				fo.write((char)inp);
			
			}
			System.out.println("File read and written successfully");
		
		}
		catch(FileNotFoundException e){
			
			System.out.println("Cannot find the source file");
			
		}
		catch(IOException e){
			
			System.out.println(e);
			
		}


	}

}