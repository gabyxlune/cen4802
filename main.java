
public class main {

	public static int fib(int n) {
		
		if(n<= 1)
			return n;
		else
			return fib(n-1) + fib(n-2);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int n = 10;
		
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + fib(n));

	}

}
