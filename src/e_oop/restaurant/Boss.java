package e_oop.restaurant;

import java.util.Arrays;

public class Boss {

	public static void main(String[] args) {
		Alba alba = new Alba();
		
		String[] order =alba.getOrder();
		System.out.println(Arrays.toString(order));
		
		System.out.println("요리만드는중 -- 완성");
		String[] foods = order;
		
		alba.serve(foods);
		
		alba.pay(order);

	}

}
