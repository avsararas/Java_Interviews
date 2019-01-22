
public class NumSequence {

public static void main(String[] args) {
		
		System.out.println(getSquence(4, 4));
	}

/*
 * num1 and num2
 * num1 is first number that will be multiplied by 2 
 * num2 is how many numbers to display
 */
	
	public static String getSquence(int num1, int num2) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1 ; i <= num2 ; i ++) {
			num1 = num1*2;
			sb.append(num1+ ", ");
		}
		
		return sb.toString();
				
	}

}
