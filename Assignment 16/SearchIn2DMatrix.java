import java.util.*;

class SearchIn2DMatrix{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] matrix = new int[n][m];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				matrix[i][j] = sc.nextInt();
		
		}
		
		int target = sc.nextInt();
		
		System.out.println(binarySearch(matrix, target));
	}
	
	public static boolean binarySearch(int[][] matrix, int target){
		
		int row = 0;
		int column = matrix[0].length-1;
	
		while(row < matrix.length && column >= 0){
		
			if(matrix[row][column] == target)
				return true;
			
			if(matrix[row][column] < target)
				row++;
			else
				column--;
		
		}
		return false;
	}

}