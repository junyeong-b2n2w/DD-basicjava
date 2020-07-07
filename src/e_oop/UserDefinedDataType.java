package e_oop;

public class UserDefinedDataType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
	 Student student;
		
	 student = new Student();
	 
	 
	 student.name = "홍길동";
	 student.kor = 80;
	 
	 System.out.println(student);
	 
	 
	}

}

class Student{
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
}