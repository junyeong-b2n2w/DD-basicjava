package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}

		System.out.println(Arrays.toString(arr));

//		printRank(arr); // 석차구하기
		
		
//		selectSort(arr);
		
//		bubbleSort(arr);
		
		insertSort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static void insertSort(int[] arr) {
		int i, j;
		for (i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > temp) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = temp;
		}
	}
	

	//flag => 한번도 바뀌지 않으면 이미 정렬된것
	private static void bubbleSort(int[] arr) {      

		for (int i = 0; i<arr.length -1 ; i++){
			boolean flag = false;
			for (int j = 0; j < arr.length - i-1; j++){
				if(arr[j+1] < arr[j]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					flag = true;
				}
			}
			if(!flag) { break;}
		}
		
	}

	private static void selectSort(int[] arr) {
		
		
		for(int i = 0; i< arr.length-1; i++){
			int min = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] <arr[min]){ min = j;}               //min < i 
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			
		}
		
	}

	private static void printRank(int[] arr) {
		int[] rank = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {	rank[i]++;	}
				
			}
		}
		for (int i = 0; i< arr.length; i++){
		System.out.println(arr[i] + " : " + rank[i]+"등");
		}
	}

}
