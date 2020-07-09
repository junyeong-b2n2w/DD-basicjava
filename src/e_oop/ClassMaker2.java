package e_oop;


public class ClassMaker2 {
	
	int instanceVar1 = 1000;
	
	{
		instanceVar1 = 200;
	}
	
	ClassMaker2(int instanceVar1){
		this.instanceVar1 = instanceVar1;
	}
	
	ClassMaker2(){
		this(411000);
	}
	
	public static void main(String[] args) {
		
		ClassMaker2 cm1 = new ClassMaker2();
	
		System.out.println(cm1.instanceVar1);
		System.out.println(cm1.instanceVar1);

		
		
	}
}
