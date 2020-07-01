
package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에ㅐ 저장해서 사용하는 것이다.
		 * - 참조형 타입이다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경 할 수 없다.
		 */
		
		int[] array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5];
		//배열 초기화시 기본값이 저장된다. 
		
		array = new int[]{1, 2, 3, 4, 5};
		
//		array = {1, 2, 3, 4, 5}; 
		//선언과 초기화를 동시에 해야한다.
		int[] array2 = {1, 2, 3, 4, 5};
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("합계 : " + sum);
		
		//10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
		int[] array3;
		array3 = new int[10];
		
		//배열의 모든 인덱스에 1~100사이의 랜더만 값을 저장해주세요.
		
		for(int i=0; i < array3.length; i++){
			array3[i] = (int)(Math.random() *100) +1;
			System.out.println(array3[i]);	
		}

		sum = 0;
		for(int i=0; i < array3.length; i++){
			sum += array3[i];
			
		}
		double avg = sum / (double)array3.length;
		System.out.println(sum +" " + avg);
		
		
		System.out.println(Arrays.toString(array3));
		
		int min = array3[0];
		int max = array3[0];
		for(int i=0 ; i < array3.length; i++){
			if(array3[i] < min ){
				min = array3[i];
			}
			if(array3[i] > max){
				max = array3[i];
			}
		}

		
		System.out.println(Arrays.toString(array3));
		
		
		
		int [] shuffle = new int[10];
		
		for (int i =0; i < shuffle.length; i++){
			shuffle[i] = i + 1;
		}
		
		System.out.println(Arrays.toString(shuffle));
		
		int temp;
		
		
		int ran;
		for (int i = 1; i <=  (int)(Math.random()*100) +10 ; i++){
			ran = (int)(Math.random() * shuffle.length);
			temp = shuffle[0];
			shuffle[0] = shuffle[ran];
			shuffle[ran] = temp;
		}
		System.out.println(Arrays.toString(shuffle));
		
//		
		int[] ran500 = new int[10];
		
		for (int i =0; i< 500 ;i++  ){
			ran = (int)(Math.random()*10)+1;
			ran500[ran - 1] += 1;
			
		}
		System.out.println(Arrays.toString(ran500));
		for (int i = 0; i < ran500.length; i++){
			System.out.println((i+1) +" = " +ran500[i]);
		}
		

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("최소값 : >");
		int i_min = Integer.parseInt(sc.nextLine());
		System.out.println("최대값 : >");
		int i_max = Integer.parseInt(sc.nextLine());
		System.out.println("반복횟수 : >");
		int i_rep = Integer.parseInt(sc.nextLine());

		int[] input_array = new int[i_max - i_min + 1];

		for (int i = 0; i < i_rep; i++) {
			int random = (int) (Math.random() * (i_max - i_min + 1)) + i_min;
			input_array[random - i_min] += 1;
		}
		System.out.println(Arrays.toString(input_array));
		for (int i = 0; i < input_array.length; i++) {
			System.out.println((i_min + i) + " = " + input_array[i]);
		}
		
		
		
		
		
		
//		// 버블정렬
//		temp = 0;
//		
//		for (int i = 0 ; i< array3.length-1 ; i++){
//			for (int n = 0; n < array3.length-(i+1); n++){
//				if(array3[n] > array3[n+1]){
//					temp = array3[n];
//					array3[n] = array3[n+1];
//					array3[n+1] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(array3));
//		
//		
		// 선택정렬
		
//		temp = 0;
//		for (int i = 0 ; i< array3.length-1 ; i++){
//		for (int n = 0; n < array3.length-(i+1); n++){
//			if(array3[i] > array3[n+1]){
//				min = n+1;
//			}
//		}
//		if(array3[i] > array3[min]){
//		temp = array3[i];
//		array3[i] = array3[min];
//		array3[min] = temp;
//		}
//	}
//		System.out.println(Arrays.toString(array3));
		
		
		
		
		
	}
}

