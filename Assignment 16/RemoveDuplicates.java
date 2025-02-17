import java.util.*;

class RemoveDuplicates{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		HashSet<Character> hs = new HashSet<>();
		StringBuilder stb1 = new StringBuilder();
		
		for(int i=0;i<str.length();i++){
		
			if(!hs.contains(str.charAt(i))){
				stb1.append(str.charAt(i)+"");
				hs.add(str.charAt(i));
			}
			
		}
		
		str = stb1.toString();
		System.out.println(str);
		
	}


}