package e_oop;

public class Static {
	
	static int var;
	
	public static void main(String[] args) {
		Human 철수 = new Human();
		Human 영희 = new Human();
		
		철수.saveMoney(100000);
		영희.saveMoney(200000);
		
		
		철수.saveDateMoney(200000);
		영희.saveDateMoney(-200000);
		
		System.out.println("문자열 입력>");
		String str = ScanUtil.nextLine();
		
		System.out.println(str);
		
		System.out.println("숫자 입력>");
		int num = ScanUtil.nextInt();
		System.out.println(num);
	}
	
}


class Human{
	int account;
	
	void saveMoney(int money){
		account += money;
		System.out.println("통장잔고 : " + account);
	}
	
	static int dateAccount;
	
	void saveDateMoney(int money){
		dateAccount += money;
		System.out.println("통장잔고 : " + dateAccount);
	}
}