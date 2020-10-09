package method;

import java.util.Scanner;

public class Grade {
	public static String getGrade(int dealCnt, int overdueCnt) {
		String result = "";
		if(dealCnt >= 20 && overdueCnt <= 0) {
			result = "우수회원";
		}else {
			result = "일반회원";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("거래횟수와 연체횟수를 입력하세요.");
		int dealCnt = sc.nextInt();
		int overdueCnt = sc.nextInt();
		
		String result = getGrade(dealCnt, overdueCnt);
		System.out.println(result);
	}

}
