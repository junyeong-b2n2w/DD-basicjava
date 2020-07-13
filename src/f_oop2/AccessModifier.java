package f_oop2;

public class AccessModifier {

	public String publicVar = "public : 접근제한 없음";
	protected String protectedVar = "protected : 같은패키지, 상속받은 클래스";
	String defaultVar = "deafult 같은 패키지에서만 접근가능";
	private String privateVar = "private 클래스 내에서만 접근가능";
	
	
	public void publicMethod(){
		System.out.println(publicVar);
	}
	
	protected void protectedMethod() {
		System.out.println(protectedVar);
	}
	
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	
	private void privateMethod() {
		System.out.println(privateVar);
	}
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
		
		Time t = new Time();
		
		t.setHour(126312365);
		t.setMiniute(-4651);
		t.setSecond(165161);
	
		System.out.println(t.getTime());
		t.clock();
		
	}
}
