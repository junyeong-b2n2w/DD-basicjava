package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
//		quiz1(); // 거스름돈 동전 갯수
		
//		quiz2(); // 그래프 그리기
		
//		quiz3(); // 같은 숫자는 싫어
		
		quiz4(); // 나누어 떨어지는 숫자배열
	}

	private static void quiz4() {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()* 100 ) +1;
		}
		
		/*
		 * 2~5 사이의 랜덤한 수로 나누어 떨어지느 숫자로만 이루어진 배열을 정렬하여 출력해주세요
		 * 5
		 * [5, 10, 15, 20 ,25]
		 * */
		
		// 나눠질 수 정하기
		int divider = ((int)(Math.random()* 4 ) +2);
		System.out.println(divider);
		
		int count = 0;
		int[] result = new int[100];
		
		//나누어 떨어지는 수 감별
		for(int i = 0; i< arr.length; i++){
			if(arr[i] % divider == 0){
				result[count++] = arr[i];
			}
		}
		
		
		//출력 배열 칸수 줄이기
		int[] counted_result = new int[count];
		for(int i = 0; i< count;i++){
			counted_result[i] = result[i];
		}
		
		
		// 버블 정렬
		for (int i = 0; i<counted_result.length -1 ; i++){
			boolean flag = false;
			for (int j = 0; j < counted_result.length - i-1; j++){
				if(counted_result[j+1] < counted_result[j]){
					int temp = counted_result[j+1];
					counted_result[j+1] = counted_result[j];
					counted_result[j] = temp;
					flag = true;
				}
			}
			if(!flag) { break;}
		}
		
		System.out.println(Arrays.toString(counted_result));
	}

	private static void quiz3() {
		int[] arr = new int[10];
		for(int i = 0; i< arr.length; i++){
			arr[i] = (int)(Math.random()* 5 ) +1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = new int[10];
		int j;
		int count=0;
		for (int i = 0; i < arr.length; i++){
			boolean flg = false;
			for (j = 0 ; j < arr2.length  ; j++){
				if(arr[i] == arr2[j]){
					flg = true;
				}
				
		}
			if(!flg){
				arr2[count++] = arr[i];
				}
		}
		
		int[] final_arr = new int[count];
		
		for(int i= 0 ; i< count; i++){
		final_arr[i] = arr2[i] ;
		}
		System.out.println(Arrays.toString(final_arr));

	}

	private static void quiz2() {
		int[] arr = new int[20];
		int[] pop = new int[5];
		for (int i = 0; i< arr.length; i++){
			arr[i] = (int)(Math.random()* 5 ) +1;
			pop[arr[i]-1]++; 
		}
		for (int i = 0 ; i < pop.length; i++){
			System.out.print(i+1 + " :" );
			for (int j = 0; j < pop[i]; j++){
				System.out.print("*");
			}
			System.out.println(" " + pop[i] );
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

	private static void quiz1() {
		int money = (int)(Math.random()* 500 ) *10;
		
		int[] coin = {500, 100, 50 ,10};
		System.out.println("거스름돈 : " + money);
		int[] change = new int[coin.length];
		for(int i = 0; i< coin.length; i++){
			change[i] = money / coin[i];
			money %= coin[i];
			System.out.println(coin[i] + "원 : " + change[i] + "개");
		}
		
	
		
	}

}
