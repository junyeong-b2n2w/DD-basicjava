package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		int[][] arr2 ;
		int[][][] arr3;
		
		int arr4[][] = new int[][]{{1,2,3},{4,5,6}};
		int[] arr5[] = { {1,2,3},
						 {4,5,6},
						 {7,8,9}};
		int[][] arr6 = new int[3][];
		arr6[0] = new int[3];
		arr6[1] = new int[5];
		arr6[2] = new int[10];
		
		int[][] arrlen = new int[4][4];
		System.out.println(arrlen[0].length);
		
		
		for(int i = 0; i< arr4.length; i++){
			for(int j = 0; j< arr4[i].length; j++){
				System.out.println(arr4[i][j]);
			}
		}
		
		int[][] scores = new int[3][5];   //[학생수][과목수]
		int[] sum = new int[scores.length]; // 합계
		double[] avg = new double[scores.length]; // 평균
		for(int i=0; i< scores.length; i++){
			for(int j=0; j< scores[i].length; j++){
				scores[i][j] = (int)(Math.random() *101);
				sum[i] += scores[i][j];
			}
			System.out.println(Arrays.toString(scores[i]));
			avg[i] = sum[i] / (double)scores[i].length;
		}
		
		for(int i =0 ; i< scores.length; i++){
			
		
		System.out.println("학생" + (i+1) + "번 총점 :" + sum[i] +" 평균 : "+ avg[i] );
		 
	}
	}

}

