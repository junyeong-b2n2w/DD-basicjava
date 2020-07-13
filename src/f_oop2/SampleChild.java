package f_oop2;

public class SampleChild extends SampleParent{

	void childMethod(){
		System.out.println(var);
		System.out.println(method(7,13));
		
	
		
	}
	@Override
	int method(int a, int b){
		return a-b;
	}
	
	int var ;
	
	void test(double var){
		System.out.println(var);
		System.out.println(this.var);
		System.out.println(super.var);
		
		System.out.println(this.method(10, 5));
		System.out.println(super.method(10, 5));
	}
	
	
	public SampleChild() {
		super();		
	}
	
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		
		
		SampleParent sp = new SampleChild();
//		SampleChild2, SampleChild3 이 있다면
//		sp = SampleChild2();
//		sp = SampleChild2();
		
		sc = (SampleChild)sp;
		sp = (SampleParent)sc;
//		자식 -> 부모로 갈때 형변환 생략 가능
	
//		SampleChild sc2 = (SampleChild)new SampleParent();
		
		
		System.out.println(sp.var);
		System.out.println(sp.method(10, 20));
//		sp.childMethod(); //사용불가
//		sp.test();        //사용불가
	}
	
}
