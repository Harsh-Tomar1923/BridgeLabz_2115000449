import java.util.*;

class ReverseAString{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		StringBuilder st1 = new StringBuilder();
		
		st1.append(str);
		
		str = st1.reverse().toString();
		
		System.out.println(str);
	}


}