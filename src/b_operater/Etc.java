package b_operater;

import java.util.Scanner;

public class Etc {
	public static void main(String[] args) {
	
//		System.out.println(10 | 15);
//		System.out.println(10 & 15);
		
//		int x = 10;
//		int y = 20;
//		int result = x < y ? x : y;
//		System.out.println(result);
//
//		int regNo = 3;
//		String gender = (regNo == 1) ? "남자" : ((regNo == 2)? "여자" : "확인불가");
//		System.out.println("당신의 성별은 " + gender + "입니다.");
//		
//		//2개의 숫자를 입력받고 둘중 더 큰 숫자를 출력해 주세요.
//		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫번째 숫자 : ");
//		int a = Integer.parseInt(sc.nextLine());
//		System.out.println("두번째 숫자 : ");
//		int b = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(a > b ? a : b);
		
		System.out.println("숫자를 입력하세요 : ");
		int inGender = Integer.parseInt(sc.nextLine());
		
		System.out.println((inGender == 1 || inGender == 3 )? "남자" : ((inGender == 2 || inGender == 4) ? "여자" : "확인불가"));
	
	}
}
