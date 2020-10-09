package method;

public class Recursive {
	
	public static int fibonachi(int num) {
		int result = 0;
		
		if(num == 0) {
			result = 0;
		}else if(num == 1) {
			result = 1;
		}else {
			result = fibonachi(num - 2) + fibonachi(num - 1);
		}
		return result;
	}

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			int num = fibonachi(i);
			System.out.print(num);
			if(i != 9) System.out.print(", ");
		}
	}

}
