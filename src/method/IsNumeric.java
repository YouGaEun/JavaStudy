package method;

import java.util.Scanner;

public class IsNumeric {
	public static boolean isNumeric(String value) {
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i = 0; i < value.length(); i++) {
			ch = value.charAt(i);
			
			if(!(ch >= '0' && ch < '9')) {
				isNumber = false;
				break;
			}
		}
		
		return isNumber;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
		String val = sc.nextLine();
		
		boolean bool = isNumeric(val);
		if(bool) {
			System.out.println("숫자입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
		
		if(isNumeric(val)) {
			System.out.println("숫자입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
	}

}
