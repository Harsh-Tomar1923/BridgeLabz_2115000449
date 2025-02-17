import java.util.*;

class Concatenate{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] arr = new String[n];
		
		for(int i=0;i<n;i++)
			arr[i] = sc.next();
		
		StringBuffer stb1 = new StringBuffer();
		
		for(int i=0;i<n;i++)
			stb1.append(arr[i]+" ");
		
		String str = stb1.toString();
		System.out.println(str);
	
	}

}