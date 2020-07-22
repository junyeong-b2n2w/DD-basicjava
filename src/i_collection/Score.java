package i_collection;

import java.util.ArrayList;

public class Score {

	public static void main(String[] args) {
	
		ArrayList<ArrayList<Integer>> score = new ArrayList<>();
		
		ArrayList<String> name = new ArrayList<>();
		
		name.add("강지원");
		name.add("김동민");
		name.add("김동희");
		name.add("김민지");
		name.add("김용진");
		name.add("김인혁");
		name.add("김진용");
		name.add("박범영");
		name.add("박병규");
		name.add("배현태");
		name.add("심민규");
		name.add("여인욱");
		name.add("이나정");
		name.add("이승민");
		name.add("이영섭");
		name.add("이윤혜");
		name.add("이지향");
		name.add("임정혁");
		name.add("임형묵");
		name.add("장성보");
		name.add("정선영");
		name.add("정회립");
		name.add("차경석");
		name.add("최준영");
		name.add("허지영");
	
		ArrayList<String> subject = new ArrayList<>();
		
		subject.add("국어");
		subject.add("영어");
		subject.add("수학");
		subject.add("사회");
		subject.add("과학");
		subject.add("ORACLE");
		subject.add("Java");
		
		
		ArrayList<Integer> sum = new ArrayList<>();
		ArrayList<Integer> rank = new ArrayList<>();
		ArrayList<Double> avg = new ArrayList<>();
		ArrayList<Integer> sub_sum = new ArrayList<>();
		ArrayList<Double> sub_avg = new ArrayList<>();
		
		for ( int i = 0 ; i < subject.size(); i++){
			sub_sum.add(0);
		}
		
		for ( int i = 0 ; i< name.size(); i++){
			score.add(new ArrayList<Integer>());
			rank.add(1);
			sum.add(0);
			for (int j = 0 ; j< subject.size(); j++){
				score.get(i).add((int)(Math.random() *101));
				sum.set(i, sum.get(i)+ score.get(i).get(j));
				sub_sum.set(j , sub_sum.get(j) + score.get(i).get(j));
			}
			avg.add( (double) (Math.round( ((double)sum.get(i) / subject.size()) *100 ) / 100.00) ); 
		}
		
		for (int i = 0; i< sub_sum.size(); i++){
			sub_avg.add((double) (Math.round( ((double)sub_sum.get(i) / name.size()) *100 ) / 100.00));
		}
		
//		System.out.println(name.size());
//		System.out.println(subject.size());
//		System.out.println(rank);
//		System.out.println(score.size());
//		System.out.println(sum.size());
//		System.out.println(avg.size());
		
		
		for(int i = 0; i< sum.size(); i++){
			for(int j = 0; j < sum.size(); j++){
				if(sum.get(i) < sum.get(j)){rank.set(i, rank.get(i)+1);}
			}
		}
		
		
		// 상단바 출력부
		
		System.out.print("이름\t");
		for(int i =0 ; i < subject.size(); i++){
			System.out.print(subject.get(i)+"\t");
		}
		System.out.println("합계\t평균\t석차\t");
		
		// 중간
		
		for(int sortrank = 1 ; sortrank<score.size()+1; sortrank++){
		for(int i = 0; i < name.size(); i++){
			if(sortrank == rank.get(i)){
			
			System.out.print(name.get(i)+"\t");
			for(int j = 0 ; j < subject.size(); j++){
				System.out.print(score.get(i).get(j)+"\t");
			}
			System.out.println(sum.get(i)+"\t"+avg.get(i)+"\t"+rank.get(i));
			}
		
		   }
		}
		// 하단
		System.out.print("과목합계\t");
		for (int i = 0; i < sub_sum.size(); i++){
			System.out.print(sub_sum.get(i)+"\t");
		}
		System.out.println();
		
		System.out.print("과목평균\t");
		for (int i = 0; i < sub_avg.size(); i++){
			System.out.print(sub_avg.get(i)+"\t");
		}
		System.out.println();
		
	}

}
