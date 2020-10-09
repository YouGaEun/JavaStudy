package method;

import java.util.Scanner;

public class CmInch {
	
	public static double toCm(double a) {
		double cm = a * 2.54;
		return cm;
	}
	
	public static double toInch(double a) {
		double inch = a / 2.54;
		return inch;
	}
	
	public static int toWidth(int w, int h) {
		int width = (w * h) / 2;
		return width;
	}

	public static void main(String[] args) {
		System.out.println("변환하려는 inch를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		
		double result = toCm(num1);
		System.out.println(num1 + "inch => " + result + "cm");
		
		sc.nextLine();
		System.out.println("삼각형의 밑변의 길이, 높이를 입력하세요.");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int width = toWidth(w, h);
		System.out.println("삼각형의 면적 : " + width);
	}

}
