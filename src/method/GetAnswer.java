package method;

import java.util.Scanner;

public class GetAnswer {
	public static int getAnswer() {
		int answer = (int)(Math.random()*100+1);
		return answer;
	}
	
	public static int getAnswer2(int start, int end) {
		int answer = (int)(Math.random()*(end - start +1) + start);
		return answer;
	}

	public static void main(String[] args) {
		int answer = getAnswer2(1, 100);
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			System.out.println("1~100 사이의 정수를 입력하세요.");
			int num = sc.nextInt();
			
			if(num == answer) {
				System.out.println("정답입니다!");
				break;
			}
			
			if(i == 3) {
				System.out.println("실패! 다음 기회에! 정답은 " + answer);
			}else {
				if(num > answer) {
					System.out.println("너무 큽니다. 좀 더 작은 수를 입력하세요.");
				}else {
					System.out.println("좀 더 큰 수를 입력하세요.");
				}
			}
		}
	}

}
