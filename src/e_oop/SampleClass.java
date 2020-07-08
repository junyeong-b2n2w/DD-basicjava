package e_oop;

public class SampleClass {

	int field;
	
	public static void main(String[] args) {
			int local = 10;                // 지역변수
	

	}

	
	
	void method1(){
		System.out.println("파라미터도 리턴타입도 없는 메서드");
	}
	
	String method2(int parameter){
		return parameter + "를 받아 명령을 수행하고 결과물을 리턴하는 메서드";
	}
	
	void flowTest1(){
		System.out.println("flowTest1시작: 1");
		flowTest3();
		System.out.println("flowTest1종료: 6");
	}
	
	void flowTest2(){
		System.out.println("flowTest2시작: 3");
		System.out.println("flowTest2종료: 4");
	}
	
	void flowTest3(){
		System.out.println("flowTest3시작: 2");
		flowTest2();
		System.out.println("flowTest3종료: 5");
	}
}
