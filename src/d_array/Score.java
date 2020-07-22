package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
			/*
			 * 우리반 모두의 국어 영ㅇ ㅓ수학 사회 과학 오라클 자바 점수를
			 * 0~100 까지 랜덤생성해주시고 아래와 같이추력해주세요
			 */

		String[] name = {"강지원","김동민", "김동희", "김민지","김용진","김인혁", "김진용","박범영","박병규","배현태","심민규","여인욱",
			"이나정","이승민","이영섭","이윤혜","이지향","임정혁","임형묵","장성보","정선영","정회립","차경석","최준영","허지영"};
		
		
		
		int[][] scores = new int[25][7];   //[학생수][과목수]
		int[] sum = new int[scores.length]; // 합계
		double[] avg = new double[scores.length]; // 평균
		int[] rank = new int[scores.length]; // 석차
		int[] sub_sum = new int[7]; // 과목별 총점
		double[] sub_avg = new double[7]; // 과목별 평균
		
		// for 점수 랜덤 지정 + 개인합계, 과목별 총점,평균 구하기
		for(int i=0; i< scores.length; i++){
			for(int j=0; j< scores[i].length; j++){
				scores[i][j] = (int)(Math.random() *101);
				sum[i] += scores[i][j];
				rank[i] = 1;
				sub_sum[j] += scores[i][j];
			}
			avg[i] = Math.round((sum[i] / (double)scores[i].length)*100) / 100.00;
			
			
		
	}
		//석차구하기
		for(int i=0; i< sum.length; i++){
			for(int j=0; j<sum.length; j++){
				if(sum[i]<sum[j]){rank[i]++;}
			}
		}
		// 과목 평균 구하기
		for(int i = 0; i< sub_avg.length; i++){
				sub_avg[i] = Math.round((sub_sum[i] / (double)scores.length)*100) / 100.00;
		}
		// 출력 하기

		System.out.printf("이름\t 국어\t 영어\t 수학\t 사회\t 과학\t ORACLE\t Java\t 합계\t 평균\t 석차\n");
//		for (int i = 0 ; i<scores.length; i++){
//			System.out.printf("%s\t", name[i]);
//			for(int j = 0; j< scores[i].length; j++){
//				System.out.printf("%d\t",scores[i][j]);	
//			}
//			System.out.printf("%d\t", sum[i]);
//			System.out.printf("%f\t", avg[i]);
//			System.out.printf("%d\n", rank[i]);
//		}

		
		// 석차료 정렬
		for(int sortrank = 1 ; sortrank<scores.length+1; sortrank++){
			
		for (int i = 0 ; i<scores.length; i++){
			if(rank[i] == sortrank){
			System.out.printf("%s\t", name[i]);
			for(int j = 0; j< scores[i].length; j++){
				System.out.printf("%d\t",scores[i][j]);	
			}
			System.out.printf("%d\t", sum[i]);
			System.out.print(avg[i]+"\t");
			System.out.printf("%d\n", rank[i]);
		}
			}
		}
		
		// 과목별 합 , 평균 출력
		System.out.printf("과목합계\t");
		for(int j = 0; j< sub_sum.length; j++){
			System.out.printf("%d\t",sub_sum[j]);	
		}
		System.out.println();

		System.out.printf("과목평균\t");
		for(int j = 0; j< sub_avg.length; j++){
			System.out.print(sub_avg[j]+"\t");	
		}

		
		
		
		
}
	}
