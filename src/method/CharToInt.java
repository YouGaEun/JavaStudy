package method;

import java.io.IOException;
import java.util.Scanner;

public class CharToInt {
	public static int charToInt(char ch) {
		int result = ch - 48; // ch - '0'
		
		return result;
	}

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("0~9 사이의 숫자를 입력하세요.");
		char ch = (char)System.in.read();
		int result = charToInt(ch);
		System.out.println(ch + " => " + result);
		System.out.println(result + " * 100 = " + result * 100);
	}

}
