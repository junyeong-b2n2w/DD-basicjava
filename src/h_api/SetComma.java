package h_api;

import java.util.Scanner;

public class SetComma {

	public static void main(String[] args) {

		// 숫자를 입력받아 입력받은 숫자에 3자리 마다 ,를 붙여 출력해 주세요.

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력해 주세요 > ");
		String input = sc.nextLine();

		String comma = "";

		// // 뒤에서부터
		// for (int i = input.length(); 0 <= i ; i= i-3){
		// if(i-3 <= 0){
		// comma = input.substring(0,i) + comma;
		// }else{
		// comma = "," + input.substring(i-3,i) + comma;
		// }
		//
		//
		//
		// }
		//
		// 앞에서부터
		int reminder = input.length() % 3;

		comma = input.substring(0, reminder);
		for (int i = reminder; i < input.length() - reminder; i = i + 3) {
			if (i == 0) {
				comma = input.substring(i, i + 3);
			} else {
				comma = comma + "," + input.substring(i, i + 3);
			}
		}

		System.out.println(comma);
	}

}
