package method;

import java.util.Scanner;

public class Gender {
	public static String getGender(int gender) {
		String result = "";
		if(gender == 1 || gender == 3) {
			result = "남자";
		}else if(gender == 2 || gender == 4) {
			result = "여자";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 성별을 입력하세요.(1,2,3,4)");
		int gender = sc.nextInt();
		
		String result = getGender(gender);
		System.out.println(gender + " => " + result);
	}

}
