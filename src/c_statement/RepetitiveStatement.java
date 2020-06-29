package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "번째 반복");

		}

		int sum = 0;

		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;

		System.out.println(sum);

		sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		for (int i = 100; i >= 1; i--) {
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

		sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);

		sum = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println(sum);

		for (int i = 1; i <= 9; i++) {

			System.out.println("2 * " + i + " = " + i * 2);

		}

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + i * j + "\t" );
			}
			System.out.println();
		}
		
		
		int a = 1;
		int count=0;
		while(a < 1000){
			a *=2;
			count+=1;
			System.out.println(count + " : " +a);
		}
		
		int answer = (int)(Math.random() *100 ) +1;
		int input = 0;
		Scanner sc = new Scanner(System.in);
		
//		do{
//			System.out.println("1~100 사이의 숫자를 입력해주세요 >");
//			input = Integer.parseInt(sc.nextLine());
//			
//			if(answer < input){
//				System.out.println(input + "보다 작습니다.");
//			}else if(input < answer){
//				System.out.println(input + "보다 큽니다");
//			}else{
//				System.out.println("정답입니다.");
//			}
//		}while(input != answer);
//		
//		
		//이름붙은 반복문
		
		outer : for(int i = 2; i<= 9 ; i++){
			for (int j =1; j<= 9; j++){
				if(j == 5){
					break;              //가장 가까운 반복문 하나를 빠져나간다.
//					break outer;		//outer라는 이름의 반복문을 빠져나간다.
//					continue;			// 가장가까운 반복문의 현재 반복회차르 빠져나간다.
//					continue outer;		// outer라는 이름의 현재 반보회차를 빠져나간다
				}
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		
		
		for (int i=1; i<=3;i++){
			for (int j=1; j<=5; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=1; i<=5;i++){
			for (int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		for (int i=1; i<=5;i++){
			for (int j=5; j>=i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=1; i<=5;i++){
			for (int k=4; k>=i ; k--){
				System.out.print(" ");
			}
			
			for (int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i=1; i<=5;i++){
			for (int k=4; k>=i ; k--){
				System.out.print(" ");
			}
			
			for (int j=1; j<=i; j++){
				System.out.print("*");
			}
			for (int l =1; l<=i-1; l++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
