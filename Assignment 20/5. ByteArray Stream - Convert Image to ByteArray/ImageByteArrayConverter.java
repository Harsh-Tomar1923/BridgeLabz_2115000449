import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class ImageByteArrayConverter {
    
	public static byte[] imageToByteArray(String imagePath) throws IOException {
    	ByteArrayOutputStream baos = new ByteArrayOutputStream();
    	try (FileInputStream fis = new FileInputStream(imagePath)) {
        	byte[] buffer = new byte[1024];
        	int bytesRead;
        	while ((bytesRead = fis.read(buffer)) != -1) {
            	baos.write(buffer, 0, bytesRead);
        	}
    	}
    	return baos.toByteArray();
	}

	public static void byteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
    	try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
         	FileOutputStream fos = new FileOutputStream(outputPath)) {
        	byte[] buffer = new byte[1024];
        	int bytesRead;
        	while ((bytesRead = bais.read(buffer)) != -1) {
            	fos.write(buffer, 0, bytesRead);
        	}
    	}
	}

	public static boolean compareFiles(String file1, String file2) throws IOException {
    	byte[] file1Bytes = Files.readAllBytes(new File(file1).toPath());
    	byte[] file2Bytes = Files.readAllBytes(new File(file2).toPath());
    	return Arrays.equals(file1Bytes, file2Bytes);
	}

	public static void main(String[] args) {
    	String inputImagePath = "input.jpg";
    	String outputImagePath = "output.jpg";

    	try {
       	 
        	byte[] imageBytes = imageToByteArray(inputImagePath);

        	byteArrayToImage(imageBytes, outputImagePath);

        	if (compareFiles(inputImagePath, outputImagePath)) {
            	System.out.println("Success: The images are identical!");
        	} else {
            	System.out.println("Error: The images are not identical!");
        	}
    	} catch (IOException e) {
        	System.err.println("An error occurred: " + e.getMessage());
    	}
	}
}

