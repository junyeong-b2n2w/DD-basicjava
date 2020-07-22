package i_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList  sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
//		list.add("abc");
		list.add(20);
		System.out.println(list.add(30));
	
		System.out.println(list);
		
		list.add(1, 40);
		System.out.println(list);
		
//		list.add(7,50);
		
		Integer before = list.set(2, 50);
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));
		System.out.println(list);
		
		Integer integer = list.get(2);
		System.out.println(integer);
		
//		for(int i = 0 ; i < list.size(); i++){
//			System.out.println(i + " : " + list.get(i));
//			
//			list.remove(i);
//		}
		
		
		for ( int i = list.size()-1 ; 0<=i ; i--){
			System.out.println(i + " : " + list.get(i));
			list.remove(i);
		}
		System.out.println();

//		System.out.println("---");
//		for( int i : list){
//			System.out.println(i);
//			
//		}
	
		int sum =0;
		double avg =0;
		
		for (int i = 0; i< 10; i++ ){
			list.add( (int)((Math.random()*100)+1));
			sum = sum + list.get(i);
		}
		
		avg = (double)sum / list.size();
		System.out.println(list);
		System.out.println("합 : " + sum );
		System.out.println("평 : " + avg );
		
		
		int max = list.get(0);
		int min = list.get(0);
		for(int i=0; i< list.size(); i++){
			if(max < list.get(i)){ max= list.get(i); }
			if(list.get(i) < min){ min = list.get(i); }
		
		}
		
		System.out.println("max : "+max + " / " + "min :"+min);
		
//		ArrayList<Integer> sortedList = new ArrayList<>();
//		
//		for (int i = 0; i < list.size(); i++){
//			for (int j = 0 ; j < i ; j ++){
//				
//			
//			if(sortedList.size() == 0) { sortedList.add(list.get(i));}
//			else if(list.get(i) > sortedList.get(i-1)){
//				sortedList.add(i ,list.get(i));
//			}else if(list.get(i) <= sortedList.get(i-1)){
//				sortedList.add(i-1, list.get(i));
//			}
//			}
//		}
//		
//		System.out.println(sortedList);
	
	
		for (int i = 0; i < list.size()
				; i++){
			for (int j = 0 ; j < i ; j ++){
				if(list.get(i) < list.get(j)){
					int temp = list.set(i, list.get(j));
					list.set(j, temp);
					}
				}
			}
		System.out.println(list);
		
		
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		
		list2.add(list);
		
		list = new ArrayList<>();
		list.add(30);
		list.add(40);
		list2.add(list);

		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++){
			ArrayList<Integer> li = list2.get(i);
			for (int j = 0; j< li.size(); j++){
				System.out.print(li.get(j) + "\t");
			}
			System.out.println();
		}
	}


}
