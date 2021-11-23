package codingChallenges_Nov23;

public class squareMatrix {
	
	static public void main(String[] args) {
		
		//below are test cases for square challenge
		square(3);
		square(2);
		square(6);
		
	}
	
	/*
	 * the goal of this is to develop a matrix by using a single digit to develop
	 * the height and length, as well fill in the matrix with said digit
	 * 
	 * example: digit equals 2
	 * [
	 * 	[2, 2]
	 * 	[2, 2]
	 * ]
	 * 
	 * 
	 */
	static public void square(int digit) {
		
		int [][] matrix = new int [digit][digit];
		
		System.out.println("[");
		
		for(int x = 0; x < matrix.length; x++) {
			
			
			System.out.print("[");
			
			for(int y = 0; y < matrix.length; y++) {
				
				matrix[x][y] = digit;
				
				
				System.out.print(matrix[x][y] + " ");
				
			}
			
			System.out.println("]");
			
		}
		
		System.out.println("\t" + "]");
		
	}
	
}
