package f_oop2;

public class SampleParent {

	/* 
	 * 
	 */
	
	
	String var;
	{
		var = "초기화블럭은 물려주지 않는다";
	}
	
	public SampleParent() {
		var = "생성자도 물려주지 않는다"; 
			
	}
	
	int method(int a, int b){
		return a+b;
	}
	
}

