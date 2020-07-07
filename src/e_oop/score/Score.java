package e_oop.score;

public class Score {

	public static void main(String[] args) {

		Student[] students = new Student[10];

		
		for (int i = 0; i < students.length; i++) {
			// 객체 생성,
			Student student = new Student();

			student.name = "학생" + (i + 1);
			student.rank = 1;
			student.kor = (int) (Math.random() * 101);
			student.eng = (int) (Math.random() * 101);
			student.math = (int) (Math.random() * 101);

			students[i] = student;

		}

		// 점수 합계, 평균
		for (int i = 0; i < students.length; i++) {
			students[i].sum = students[i].math + students[i].eng
					+ students[i].kor;
			students[i].avg = Math.round((float) (students[i].sum / 3.0) * 100) / 100.0;
		}
		// 석차
		for (int i = 0; i < students.length; i++) {
			students[i].rank = 1;
			for (int j = 0; j < students.length; j++) {
				if (students[i].sum < students[j].sum) {
					students[i].rank++;
				}
			}
		}

		// 출력
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균\t등수");

		// for (int sortrank = 1; sortrank<students.length+1; sortrank++){
		//
		// for(int i=0; i<students.length; i++){
		// if(students[i].rank == sortrank){
		// System.out.println(students[i].name + "\t"
		// + students[i].kor + "\t"
		// + students[i].math + "\t"
		// + students[i].eng + "\t"
		// + students[i].sum + "\t"
		// + students[i].avg + "\t"
		// + students[i].rank);
		// }
		// }
		// }

		//정렬

		for (int i = 0; i<students.length -1 ; i++){
			boolean flag = false;
			for (int j = 0; j < students.length - i-1; j++){
				if(students[j+1].rank < students[j].rank){
					Student temp = students[j+1];
					students[j+1] = students[j];
					students[j] = temp;
					flag = true;
				}
			}
			if(!flag) { break;}
		}
		
		
		
		for (int i = 0; i < students.length; i++) {

			System.out.println(students[i].name + "\t" + students[i].kor + "\t"
					+ students[i].math + "\t" + students[i].eng + "\t"
					+ students[i].sum + "\t" + students[i].avg + "\t"
					+ students[i].rank);

		}

	}
}
