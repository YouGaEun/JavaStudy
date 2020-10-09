package method;

import java.util.Scanner;

public class HollJjack {
	
	public static String getOdd(int num) {
		String result = "";
		if(num % 2 == 0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		String result = getOdd(num);
		System.out.println(num + " => " + result);
		
	}

}
