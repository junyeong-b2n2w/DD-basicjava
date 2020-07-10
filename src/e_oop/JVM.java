package e_oop;

public class JVM {

	public static void main(String[] args) {
	
		/*
		 * 
//		 */
//		1. 프로그램 실행시 STATIC 멤버가 저장된다
//		main(), classVar, classMethod() 가 저장됨
//		2. main()이 실행되어 CallStack에 저장됨
		
		System.out.println(classVar);
//		3. System 클래스의 out이 MethodArea에 저장됨
//		4. println()이 호출되어 CallStack에 저장됨
//		5. println()이 classVar를 출력후 CallStack에서 삭제됨
		
		classMethod();
//		6. classMethod()가 호출되어 CallStack에 저장됨
//		7. instanceVar는 메모리에 존재하지 않기 때문에 사용할 수 없음
//		8. println()이 호출되어 CallStack에 저장됨
//		9. println()이 호출되어 classVar를 출력 후 CallStack에서 삭제됨
//		10. ClassMethod()의 실행이 종료되어 CallStack에서 삭제됨
		
		JVM jvm = new JVM();

		
		
//		11. JVM객체가 Heap에 저장됨
//		12. jvm변수가 CallStack에 생성되고 JVM객체의 주소가 저장됨
		
		System.out.println(jvm.instanceVar);
//		13. println()이 호출되어 CallStack에 저장됨
//		14. println()이 호출되어 instanceVar를 출력 후 CallStack에서 삭제됨
		
		
		jvm.instanceMethod();
//		15. instanceMethod()가 호출되어 CallStack에 저장됨
//		16. println()이 호출되어 CallStack에 저장됨
//		17. println()이 호출되어 instanceVar를 출력 후 CallStack에서 삭제됨
//		18. println()이 호출되어 CallStack에 저장됨
//		19. println()이 호출되어 classVar를 출력 후 CallStack에서 삭제됨
//		20. instanceMethod()의 실행이 종료되어 CallStack에서 삭제됨
		
		jvm = null;
//		21. jvm변수에 null이 저장됨
//		22. 어디에서도 주소를 참조하지 않는 JVM객체는 GarbageCollector에 의해 삭제됨

		
	} // 메인 종료
//	23. main() 메소드 종료되어 CallStack에서 삭제가 된다.
//	24. 프로그램이 종료되고 MethodArea의 데이터가 삭제됨

	
	int instanceVar;
	static int classVar;
	
	void instanceMethod(){
		System.out.println(instanceVar);
		System.out.println(classVar);
	}
	
	static void classMethod(){
//		System.out.println(instanceVar); // 아직 메모리에 올라가지 않은 상태
		System.out.println(classVar);
	}
	
}
