package method;

public class Fibonachi {
	
	public static int factorial(int n) {
		int result = 0;
		if(n == 1) {
			result = 1;
		}else {
			result = n * factorial(n-1);
		}
		
		return result;
	}

	public static void main(String[] args) {
		int res = factorial(4);
		System.out.println("4! => " + res);
	}

}
