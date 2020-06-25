package b_operater;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b = 5 < 10 && 15 % 2 == 0 || 0 >= 5;
		
		System.out.println(b);
		
		int x = 45;
		int y = 13;
		
		boolean bb;
		
		bb = x > y && x < 10;
		System.out.println(bb);
		
		bb = x % 2 == 0 && x % y == 0;
		System.out.println(bb);
		
		bb = x % 3 == 0 || x % 5 == 0;
		System.out.println(bb);
		
	}

}
