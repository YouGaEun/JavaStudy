package cclass;

import java.util.Scanner;

class Rectangle{
	int w;
	int h;
	
	public int findArea() {
		return w * h;
	}
	
	public int findGirth() {
		return (w + h) * 2;
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		System.out.println("사각형의 가로, 세로를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		Rectangle rt = new Rectangle();
		rt.w = w;
		rt.h = h;
		
		int area = rt.findArea();
		System.out.println("사각형의 넓이 : " + area);
		System.out.println("사각형의 둘레 : " + rt.findGirth());
	}

}
