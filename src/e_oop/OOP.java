package e_oop;



public class OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SampleClass sc = new SampleClass();
		
		System.out.println(sc.field);
		
		sc.method1();
		
		String returnValue = sc.method2(11232);
		System.out.println(returnValue);

		System.out.println();
		
		ClassMaker cm = new ClassMaker();
		
		cm.method1();
		System.out.println(cm.method2());
		cm.method3(1234);
		System.out.println(cm.method4(5, 6));
		
	}

}
