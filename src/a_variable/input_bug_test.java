package a_variable;

import java.util.Scanner;

public class input_bug_test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		System.out.println("int 입력>");
//		int nextInt = sc.nextInt();
//		System.out.println(nextInt);
//		System.out.println("뮨자열 입력>");
//		String nextLine = sc.nextLine();
//		System.out.println(nextLine);
//		System.out.println("입력끝");
//이렇게 하면 nextInt에 숫자만 가져가고 엔터를 넘기는 버그로 인해 다음 문자열 입력이 자동으로 패스됨
// 숫자 입력받을땐 아래 방법으로
		
		System.out.println("int 입력>");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println(number);
	}

}
