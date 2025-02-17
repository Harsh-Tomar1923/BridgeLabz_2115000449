import java.util.*;

class WordSearch{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		List<String> l1 = new ArrayList<>();
		
		while(true){
			System.out.println("Enter a sentence : (or type end to quit adding)");
			String sentence = sc.nextLine();
			
			
			if(sentence.equals("end"))
				break;
			
			l1.add(sentence);
			
		
		}
		
		System.out.println("Enter the target word : ");
		String target = sc.next();
		
		boolean found = false;
		
		for(int i=0;i<l1.size();i++){
		
			StringBuilder str = new StringBuilder("");
			
			for(int j = 0;j<l1.get(i).length();j++){
				if(l1.get(i).charAt(j) != ' ')
					str.append(l1.get(i).charAt(j));
				else{
					if(str.toString().equals(target)){
						System.out.println(l1.get(i));
						found = true;
						break;
					}
					str.setLength(0);
				}
					
			}
			if(str.toString().equals(target)){
				System.out.println(l1.get(i));
				found = true;
				break;
			}
			if(found)
				break;
		
		}
		if(!found)
			System.out.println("Cannot find the given word");
		
	
	}


}