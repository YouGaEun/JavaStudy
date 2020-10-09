package method;

import java.util.Scanner;

public class GetYear {
	
	public static String getYear(int year) {
		String result = "";
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			result = "윤년";
		}else {
			result = "평년";
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("연도를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		String result = getYear(year);
		System.out.println(year + " => " + result);
		
	}

}
