package b_operater;

public class ComparingOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		boolean b = 10 < 20;
		System.out.println(b);
		
		b = 10 <= 20 - 15;
		System.out.println(b);
		
		
		String str1 = "abc";
		String str2 = "abc";
		
		b = str1 == str2;
		System.out.println(b);
		
		b = !str1.equals(str2);
		System.out.println(b);
		
		
		System.out.println("-------");
		int x = 1;
		int y = 15;
		
		boolean result;
		
		result = x > y;
		System.out.println(result);
		result = x <= y;
		System.out.println(result);
		result = x+5 == y;
		System.out.println(result);
		result = x % 3 == 0;
		System.out.println(result);
		result = y % 2 != 0;
		System.out.println(result);
		result = x != 3 * y;
		System.out.println(result);
		result = "병수".equals("데이터");
		System.out.println(result);
		result = !"기본형".equals("참조형");
		System.out.println(result);
	}

}
