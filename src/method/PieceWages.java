package method;

import java.util.Scanner;

public class PieceWages {
	
	public static double findPieceWages(int qty, int sellPrice) {
		double pieceWages = 0;
		
		if(qty >= 200) {
			pieceWages = sellPrice * 0.3;
		}else if(qty >= 100) {
			pieceWages = sellPrice * 0.2;
		}else {
			pieceWages = sellPrice * 0.1;
		}
		
		return pieceWages;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("판매수량, 판매금액을 입력하세요.");
		int qty = sc.nextInt();
		int sellPrice = sc.nextInt();
		
		double pieceWages = findPieceWages(qty, sellPrice);
		System.out.println("성과급 : " + pieceWages);
	}

}
