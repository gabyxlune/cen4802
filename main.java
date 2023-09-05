
public class main {

	public static int fibSeq(int n) {
		
		if(n<= 1)
			return n;
		else
			return fibSeq(n-1) + fibSeq(n-2);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int n = 10;
		
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibSeq(n));

	}

}
