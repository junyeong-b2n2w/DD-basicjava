package c_statement;

import java.util.Scanner;

public class ConditonalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;

		if (a == 1) {
			System.out.println("a가 1인경우");
		} else if (a == 2) {
			System.out.println("a가 2인경우");
		} else if (a == 3) {
			System.out.println("a가 3인경우");
		} else {
			System.out.println("그외의경우");
		}

		if (a < 10) {
			System.out.println("a가 10보다 작다");
		}
		if (a < 20) {
			System.out.println("a가 20보다 작다");
		}
		int score = 50;
		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		score = 80;

		String grade = null;

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else if (score >= 50) {
			grade = "E";
		} else {
			grade = "F";
		}
		System.out.println(grade);

		score = 67;
		grade = null;

		if (score >= 90) {
			grade = "A";
			if (97 <= score) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}
		} else if (score >= 80) {
			grade = "B";
			if (87 <= score) {
				grade += "+";
			} else if (score <= 83) {
				grade += "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if (77 <= score) {
				grade += "+";
			} else if (score <= 73) {
				grade += "-";
			}
		} else if (score >= 60) {
			grade = "D";
			if (67 <= score) {
				grade += "+";
			} else if (score <= 63) {
				grade += "-";
			}
		} else {
			grade = "F";
		}

		System.out.println(score + "점은 " + grade);

		a = 1;
		switch (a) {
		case 1:
			System.out.println("a가 1인경우");
			break;
		case 2:
			System.out.println("a가 2인경우");
			break;
		default:
			System.out.println("case 가 아닌경우");
		}

		String b = "a";
		switch (b) {
		case "a":
			System.out.println("b가 \"a\"인경우");
			break;
		case "b":
			System.out.println("b가 \"b\"인경우");
			break;
		case "c":
			System.out.println("b가 \"c\"인경우");
			break;
		default:
			System.out.println("b가 case가 아닌경우");
		}

		int month = 1;
		String season = null;

		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		}
		System.out.println(month + "월은 " + season + "입니다");

		score = 100;
		grade = null;

		switch (score / 10) {
		case 10:
			grade = "만점";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}

		System.out.println(score + "점은 " + grade);

		Scanner sc = new Scanner(System.in);

		// System.out.print("숫자를 입력해주세요 > ");
		// // int zero = Integer.parseInt(sc.nextLine());
		//
		// if (zero == 0){
		// System.out.println("해당 숫자는 0 입니다.");
		// }else{
		// System.out.println("해당 숫자는 0이 아닙니다.");
		// }
		//
		// int input = Integer.parseInt(sc.nextLine());
		//
		// if (input % 2 == 0){
		// System.out.println("짝");
		// }else{
		// System.out.println("홀");
		// }
		//

		System.out.print("첫번쨰 숫자 를 입력해주세요 > ");
		int input1 = Integer.parseInt(sc.nextLine());
		System.out.print("두번쨰 숫자 를 입력해주세요 > ");
		int input2 = Integer.parseInt(sc.nextLine());
		System.out.print("세번쨰 숫자 를 입력해주세요 > ");
		int input3 = Integer.parseInt(sc.nextLine());

//		int sum = input1 + input2 + input3;
//		double avg = (double) sum / 3;
//
//		if (avg >= 90) {
//			grade = "A";
//		} else if (avg >= 80) {
//			grade = "B";
//		} else if (avg >= 70) {
//			grade = "C";
//		} else if (avg >= 60) {
//			grade = "D";
//		} else if (avg >= 50) {
//			grade = "E";
//		} else {
//			grade = "F";
//		}
//		System.out.printf("총점은 %d, 평균은 %.2f로 등급은 %s 입니다", sum, avg, grade);

		int temp;
		
//		if (input1 > input2){
//			temp = input1;
//			input1 = input2;
//			input2 = temp;
//		}
//		if(input1 > input3){
//			temp = input1;
//			input1 = input3;
//			input3 = temp;
//		}
//		if(input2 > input3){
//			temp = input2;
//			input2 = input3;
//			input3 = temp;
//		}
		
		 if (input1 > input2){
		 temp = input1;
		 input1 = input2;
		 input2 = temp;
		 }
		 if(input2 > input3){
			 temp = input2;
			 input2 = input3;
			 input3 = temp;
			 }
		 if (input1 > input2){
			 temp = input1;
			 input1 = input2;
			 input2 = temp;
			 }
		
//		
		System.out.println(input1+ " " + input2+ " " + input3);
		
	}

}
