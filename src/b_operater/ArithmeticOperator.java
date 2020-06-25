package b_operater;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = 10 + 20 - 30 * 40 / 50 % 60; 
		
		result = 10 % 4;
		System.out.println(result);
		
		
		result = 1 + 1;
		System.out.println("+ : " + result);
		result = 1 - 1;
		System.out.println("- : " + result);
		result = 1 * 1;
		System.out.println("* : " + result);
		result = 1 / 1;
		System.out.println("/ : " + result);
		result = 1 % 1;
		System.out.println("% : " + result);
		
	    result = result + 3;
	    System.out.println(result);
	    
	    result += 3;
	    System.out.println(result);
	    
	    
	    //result = result + 10;
	    result += 10;
	    
	    
	    //reuslt = result -2 * 3;
	    result =4;
	    result -= 2 * 3;
	    System.out.println(result);
	    
	    //result = result % 5;
	    result %= 5;
	    
	    int i = 1;
	    System.out.println(++i);
	    System.out.println(i++);
	    System.out.println(--i);
	    System.out.println(i--);
	    
	    
	    int _int = 10;
	    double _double = 3.14;
	    double result2 = _int + _double;
	    System.out.println(result2);
	    
	    byte _byte = 5;
	    short _short = 10;
	    int result3 = _byte + _short; // int보다 작은 타입은 int로 형변환 된다
	    System.out.println(result3);
	    
	    byte b = 127;
	    b++;
	    System.out.println(b);	  
	    b--;
	    System.out.println(b);  // 127
	    
	    
	    long kkk = ((long)(123456 + 654321) * (long)123456 / 123456 - 654321) % 123456;
	    
	    System.out.println(kkk);
	    
	    int num1 = 100;
	    int num2 = 200;
	    int num3 = 302;
	    
	    System.out.println("합 : " + (num1 + num2 + num3) + " 평균 : " + Math.round(((float)(num1 + num2 + num3)/3.0)));
	    
	    
	    System.out.println((int)Math.random()*100 + 1 );
	    
	  
	    		
	}

}
