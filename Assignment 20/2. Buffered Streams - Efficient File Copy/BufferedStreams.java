import java.io.*;


class BufferedStreams{

	public static void main(String[] args){
	
		try{
			int size = 4*1024;
		
			FileInputStream fi = new FileInputStream("100mbfile.txt");
			FileOutputStream fo = new FileOutputStream("./Outputfile2.txt");
		
			BufferedInputStream bi = new BufferedInputStream(fi, size);
			BufferedOutputStream bo = new BufferedOutputStream(fo, size);
			
			
			long ini = System.nanoTime();
			int inp = 0;
			while((inp = fi.read()) != -1){
			
				fo.write((char)inp);
			
			}
			
			System.out.println("Time taken to read and write file by Buffer Streams : "+(System.nanoTime()-ini)/1000000.0+" nano seconds");
			
			ini = System.nanoTime();
			inp = 0;
			while((inp = bi.read()) != -1){
			
				bo.write((char)inp);
			
			}
			
			System.out.println("Time taken to read and write file by File Streams : "+(System.nanoTime()-ini)/1000000.0+" nano seconds");
			
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e){
			System.out.println(e);
		}
	
	}
	


}