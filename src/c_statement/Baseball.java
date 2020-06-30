package c_statement;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		// 숫자야구

		// 목표 숫자 세팅
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int str = 0;
		int ball = 0;
		int out = 0;

		//초기화
		num1 = (int) (Math.random() * 9) + 1;
		num2 = (int) (Math.random() * 9) + 1;
		num3 = (int) (Math.random() * 9) + 1;
		
		
		while (num1 == num2) {
			num2 = (int) (Math.random() * 9) + 1;
		}

		while (num1 == num3 || num2 == num3) {
			num3 = (int) (Math.random() * 9) + 1;
		}

//		System.out.println(num1 + " " + num2 + " " + num3);

		Scanner sc = new Scanner(System.in);

		while (str != 3) {

			str = 0;
			ball = 0;
			out = 0;

			System.out.println("첫숫자 >");
			int get1 = Integer.parseInt(sc.nextLine());
			System.out.println("둘숫자 >");
			int get2 = Integer.parseInt(sc.nextLine());
			System.out.println("셋숫자 >");
			int get3 = Integer.parseInt(sc.nextLine());

			//get1 검증?
			if (num1 == get1) {
				str++;
			} else if (num1 == get2 || num1 == get3) {
				ball++;
			} else {
				out++;
			}
			// get2 검증 
			if (num2 == get2) {
				str++;
			} else if (num2 == get1 || num2 == get3) {
				ball++;
			} else {
				out++;
			}
			// get3 검증
			if (num3 == get3) {
				str++;
			} else if (num3 == get2 || num3 == get1) {
				ball++;
			} else {
				out++;
			}

			System.out.println("str :" + str + " / " + "ball :" + ball + " / "
					+ "out :" + out);
		}

	}
}
