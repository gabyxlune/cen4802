
public class main {

	
	/** method that calculates Fibonacci sequence, uses n as param 		
	* @author Gabriela Fundora
	* @param n gets called in main method, used to implement the placement of fibonacci sequence   
	* @return n or fibSeq(n-1) + fibSeq(n-2), depending on the numerical value of n
	*
	**/
	
	public static int fibSeq(int n) {   						
		if(n <= 1)																				
			return n;	/** Only valid for the first two placements of fibonacci sequence **/
		else
			return fibSeq(n-1) + fibSeq(n-2);
		
	}
	
	
	
	public static void main(String[] args) {
		int n = 10;		/** Passing 10 into argument **/
		
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibSeq(n));	/** Outputs the values and text **/

	}

}
