package e_oop;

public class Tester {
	public static void main(String[] args) {
	
	Calculator ca = new Calculator();
	
	double result1 = ca.plus(123456, 654321); 
	double result2 = ca.multiply(result1, 123456);
	double result3 = ca.divid(result2, 123456);
	double result4 = ca.minus(result3, 654321);
	double result5 = ca.reminder(result4, 123456);


	System.out.println(777777*123456 /123456);
	System.out.println(result2);
	System.out.println(result3);
	System.out.println(result4);
	System.out.println(result5);
}
}