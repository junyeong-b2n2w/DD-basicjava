package h_api;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		
		Integer iw = new Integer(20);
		
		System.out.println(Integer.TYPE + " / " + Integer.SIZE + "bit");
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		int parseInt = Integer.parseInt("20");
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(new Integer(10));
		
		list.add(10);  // 오토박싱
		
		Integer integer = list.get(0);
		int i = list.get(0);   //  언박싱
		
		
		
		
		
		
	}
	
}
