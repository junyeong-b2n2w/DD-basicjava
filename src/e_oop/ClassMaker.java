package e_oop;

public class ClassMaker {

	int fieldVar1=15;
	
	void method1(){
		System.out.println(fieldVar1);
	}
	
	int method2(){
		return fieldVar1;
	}
	
	void method3(int paramInt){
		System.out.println(paramInt);
	}
	
	int method4(int paramInt1, int paramInt2){
		return paramInt1 * paramInt2;
	}
}
