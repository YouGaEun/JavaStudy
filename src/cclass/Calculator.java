package cclass;

import java.util.Scanner;

class CalculatorTest{
	public double add(double a, double b) {
		return a + b;
	}
	public double substract(double a, double b) {
		return a - b;
	}
	public double multiply(double a, double b) {
		return a * b;
	}
	public double divide(double a, double b) {
		return a / b;
	}
}

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 실수를 입력하세요.");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		CalculatorTest ct = new CalculatorTest();
		
		double result = ct.add(a, b);
		
		System.out.println("a = " + a + "b = " + b);
		System.out.println("a + b = " + result);
		System.out.println("a - b = " + ct.substract(a, b));
		System.out.println("a * b = " + ct.multiply(a, b));
		System.out.println("a / b = " + ct.divide(a, b));
		
	}

}
