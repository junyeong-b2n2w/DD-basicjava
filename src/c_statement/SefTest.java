package c_statement;

import java.util.Scanner;

public class SefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 탄수화물 중독 테스트 프로그램  체크박스
		

		int count=0;
		String answer="";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아침 먹은 날 오히려 배고프다(Y / N)");
		answer = sc.nextLine();
		if (answer.equals("Y")){count += 1;}
		System.out.print("단맛 나는 후식을 즐긴다. (Y / N)");
		answer = sc.nextLine();
		if (answer.equals("Y")){count += 1;}
		System.out.print("스트레스를 받으면 먹고싶다. (Y / N)");
		answer = sc.nextLine();
		if (answer.equals("Y")){count += 1;}
		System.out.print("식사 후 졸립고 나른하다.(Y / N)");
		answer = sc.nextLine();
		if (answer.equals("Y")){count += 1;}
		System.out.print("주3회 이상 밀가루 음식을 먹는다.(Y / N)");
		answer = sc.nextLine();
		if (answer.equals("Y")){count += 1;}
		System.out.print("잡곡밥보다는 흰쌀밥이 좋다.(Y / N)");
		answer = sc.nextLine();
		if (answer.equals("Y")){count += 1;}
		System.out.print("작은 일에도 짜증이 난다.(Y / N)");
		answer = sc.nextLine();
		if (answer.equals("Y")){count += 1;}
		System.out.print("가족 중에 비만인 사람이 있다.(Y / N)");
		answer = sc.nextLine();
		if (answer.equals("Y")){count += 1;}
		System.out.print("습관적으로 야식을 먹는다. (Y / N)");
		answer = sc.nextLine();
		if (answer.equals("Y")){count += 1;}
		System.out.print("배불리 먹어도 금방 배고프다.(Y / N)");
		answer = sc.nextLine();
		if (answer.equals("Y")){count += 1;}
		
		if (count <= 3){
			System.out.println("탄수화물 중독에 걸릴 위험이 있는 정도");
		}else if(4 <= count && count <= 6){
			System.out.println("탄수화물 중독 위험");
		}else{
			System.out.println("탄수화물 중독");
		}
	}

}
