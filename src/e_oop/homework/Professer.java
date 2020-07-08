package e_oop.homework;

import java.util.Arrays;

public class Professer {

	public static void main(String[] args) {
		Student st = new Student();
		
		String[] homework = st.getHomework();
		System.out.println(Arrays.toString(homework));
		st.play("게임");
		st.play("게임");
		st.play("게임");
		
		st.doingHomework(homework);
		st.play("게임");
		st.play("게임");
		st.play("게임");
		st.doingHomework(homework);
		
		
		
	}
	
}
