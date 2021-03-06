package codingChallenges_Nov23;

public class ascendingConsecutive {

	static public void main(String[] args) {
		
		//test cases for ascending and consecutive
		
		System.out.println(ascendingConsecutive("223344"));
		ascendingConsecutive("223344");
		ascendingConsecutive("333444");
		ascendingConsecutive("3322");
		ascendingConsecutive("445");
		
	}
	
	/*
	 * the primary goal is to test strings base of ascending order
	 * of the numbers inside the string as well as to test if the numbers are
	 * Consecutive
	 * 
	 * basic rules:
	 * - number must be in ascending order to test positively
	 * - example 11, 22 = true
	 * - example 22, 11 = false
	 * 
	 * - numbers must also be consecutive to test positively
	 * - example 11, 22 = true
	 * - example 11, 222 = false
	 * - numbers can vary in digits but must be consecutive ie. no odd numbers
	 * 
	 * - if a number doesn't path both it fails
	 */
	
	static public Boolean ascendingConsecutive(String numbers){
		boolean ascCon = false;
		
		char[] array = numbers.toCharArray();
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - 1; i++) {
				
				if(i != j) {
					
					if(array[i]%2 == 0) {
						return ascCon = true;
					} else {
						return ascCon = false;
					}
					
				} else {
					
					return ascCon = false;
					
				}
			}
			
		}
		
		return ascCon;
		
	}
	
	
}
