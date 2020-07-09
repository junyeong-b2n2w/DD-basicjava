package e_oop;

public class VariableInit {
	
	// 명시적 초기화
	int var = 10;
	static int staticVar = 20;

	
	// 초기화 블럭
	{
		var =30;
	}
	
	
	static {
		staticVar = 40;
		
	}
	
	// 생성자
	
	VariableInit(){
		var = 50;
		//staticVar = 60;
		//좋은 방법이 아니다
	}
	
	public static void main(String[] args) {
		Init i = new Init();
		i.a = 10;
		i.b = 20;
		i.c = 30;
		
		Init i2 = new Init();
		i2.a = 40;
		i2.b = 50;
		i2.c = 60;
		
		
		Init i3 = new Init(70,80,90);

		new Init();
		
		Init gimbap = new Init(99,9454,942329);
		
		System.out.println(gimbap.a); 
		System.out.println(gimbap.b); 
		System.out.println(gimbap.c); 
		
		ClassMaker2 cm = new ClassMaker2(11);
		
		System.out.println(cm.instanceVar1);
		
		ClassMaker2 cm2 = new ClassMaker2(2321);
		
		System.out.println(cm2.instanceVar1);
	}
	
}


class Init{
	
	int a;
	int b;
	int c;
	
	Init(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	Init(){
		this(10,20,30);
		// 생성자에서 다른 생성자를 호출할때 사용
		
	}
}
