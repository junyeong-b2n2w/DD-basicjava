package a_variable;

import java.util.Scanner;

public class testtest {

	public static void main(String[] args) {
		
		//자신의 이름을 저장할 변수를 선언해주세요.
		String myName;
		
		//위에서 선언한 변수를 초기화 하기위해 이륾을 입력받아 주세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요 >");
		myName = sc.nextLine();
		
		//자신의 나이를 저장할 변수를 선언해 주세요
		int myAge;
		
		//위에서 선언한 변수를 초기화 하기위해 나이를 입력받아 주세요.
		System.out.println("나이를 입력해주세요 >");
		myAge = Integer.parseInt(sc.nextLine());
		
		System.out.println("이름 :" + myName + " / 나이 : " + myAge);
	}

}

