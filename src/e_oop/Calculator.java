package e_oop;

public class Calculator {

	//5개의 메소드 4칙연산 2개파라미터 결과값리턴
	
	double plus(double paramdouble1,double paramdouble2 ){
		return paramdouble1 + paramdouble2;
	}
	
	double minus(double paramdouble1,double paramdouble2 ){
		return paramdouble1 - paramdouble2;
	}
	long multiply(double paramdouble1,double paramdouble2 ){
		return  (long)(paramdouble1) * (long)paramdouble2;
	}
	double divid(double paramdouble1,double paramdouble2 ){
		return paramdouble1 / paramdouble2;
	}
	double reminder(double paramdouble1,double paramdouble2 ){
		return paramdouble1 % paramdouble2;
	}
	
}
