package e_oop.homework;

import java.util.Arrays;

public class Professer {

	public static void main(String[] args) {
		Student st = new Student();
		
		String[] homework = st.getHomework();
		System.out.println(Arrays.toString(homework));
		st.play("게임");
		st.play("밥먹");
		st.play("게임");
		
		String report1 = st.doingHomework(homework[0]);
		st.play("유툽");
		st.play("게임");
		st.play("친구");
		String report2 = st.doingHomework(homework[1]);
		
		System.out.println("과제완료 !! :  " + report1 + "," + report2);
		
		
		
	}
	
}
