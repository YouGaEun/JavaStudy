package method;

import java.util.Scanner;

public class BigAndNameoji {
	
	public static int BigNum(int a, int b) {
		int c = 0;
		if(a > b) {
			c = a;
		}else {
			c = b;
		}
		
		return c;
	}
	
	public static int rest(int a, int b) {
		int c = a % b;
		return c; 
	}

	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = BigNum(num1, num2);
		System.out.println("더 큰 수는 " + result);
		
		Scanner sc2 = new Scanner(System.in);
		sc.hasNextLine();
		for(;;) {
			System.out.println("두 수를 입력하세요.");
			num1 = sc2.nextInt();
			num2 = sc2.nextInt();
			
			if(num1 == 0 || num2 == 0) break;
			
			int result2 = rest(num1, num2);
			System.out.println("나머지 연산 결과 : " + num1 + "%" + num2 + "=" + result2);
		}
		
	}

}
