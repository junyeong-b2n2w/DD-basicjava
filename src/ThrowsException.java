import java.io.IOException;


public class ThrowsException {

	public static void main(String[] args) {

		
		try {
			method();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		method2();
		
		
	}

	private static void method2() {
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void method() throws Exception{
		throw new IOException();
	}
	
	

}
