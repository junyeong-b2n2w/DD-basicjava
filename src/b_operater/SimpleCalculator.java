package b_operater;

import java.util.Scanner;

public class SimpleCalculator {
	
	public static void main(String[] args) {
	// 두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어 주세요.
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 숫자 : ");
		double num1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("연산자 :");
		String oper = sc.nextLine();
		
		System.out.println("둘 숫자 : ");
		double num2 = Double.parseDouble(sc.nextLine());
		
		System.out.println(oper.equals("+") ? num1 + num2 : oper.equals("-") ? num1 - num2 : oper.equals("*") ? num1 * num2 : oper.equals("/") ? num1 / num2 : oper.equals("%") ? num1 % num2 : "연산자가 잘못되었다");
		
	}
}
