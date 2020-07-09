package e_oop.homework;

public class Student {

	
	
	String[] getHomework(){
		System.out.println("오늘 과제 내주시나요?..");
		
		return new String[]{"SQL과제", "java 과제"};
	}
	
	
	String doingHomework(String homework){
		System.out.println("과제하는중 ... " + homework);
	return homework + " 레포트";
	}
	
	
	void play(String what){
		System.out.println(what + "하고 노는중");
	}
	
	
}
