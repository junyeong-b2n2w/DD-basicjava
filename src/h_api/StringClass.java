package h_api;

import java.util.Arrays;

public class StringClass {
	public static void main(String[] args) {
		
		boolean equals = "문자열".equals("문자열");
		System.out.println(equals);
		
		String str1 = "문자열";
		String str2 = null;
		System.out.println(str1.equals(str2));
//		System.out.println(str2.equals(str1));
		//null이 있을수 있는 변수를 앞에두지 않는다;
		
		String str = "12345";
		int length = str.length();
		for (int i = 0 ; i < length; i++){
			char charAt = str.charAt(i);
			System.out.println(charAt);
		}
		
		String rev = "";
		for(int i = str.length()-1; 0<= i; i--){
			rev += str.charAt(i);
			}
		System.out.println(rev);
		
		str = "0123456789";
		
		String sub1 = str.substring(3); // 3번 인덱스부터 잘ㄹ라서 반환
		System.out.println(sub1);
		String sub2 = str.substring(5,8); // 5번 인덱스부터 8번까지 잘ㄹ라서 반환
		System.out.println(sub2);
		String sub3 = str.substring(str.length()-5,str.length()-3); //  뒤에서 5번 인덱스부터 3번까지 잘ㄹ라서 반환
		System.out.println(sub3);
		
		str = "수박 오렌지 귤 블루베리";
		int index = str.indexOf("오렌지"); // 오렌지의 시작 인덱스를 반환
		System.out.println(index);
		index = str.indexOf("뀰지"); // 없는경우 -1 반환하나 봄 
		System.out.println(index);
		
		
		
		String[] menu = {
				"수박 20000원",
				"오렌지 100000원",
				"귤 500원",
				"블루베리 3000원"
		};
		
		//메뉴의 이름만 가져오고 싶은 경우
		for(int i = 0; i<menu.length; i++){
			String name = menu[i].substring(0, menu[i].indexOf(" ")); // 공백전까지 인덱스를 받아서 이름에 저장
			System.out.println(name);
			int price = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ")+1 , menu[i].length()-1));
			System.out.println(price);
		}
		
	
		str = "abcd";
		
		boolean contains = str.contains("c");
		System.out.println(contains);
		
		// 오렌지가 몇번 인덱스에 있는지 찾기
		for (int i = 0; i< menu.length; i++){
			if(menu[i].contains("오렌지")){
				System.out.println("오렌지는 " + i +"번 인덱스에 있습니다.");	
			}
		}
		
		str = "a/b/c";
		
		String[] split = str.split("/");
		System.out.println(Arrays.toString(split));
		
		for(int i = 0; i< menu.length; i++){
			split = menu[i].split(" ");
			System.out.println("메뉴명 : " + split[0] + " / 가격 : " + split[1]);
		}
		
		str =  " 문자열 ";
		
		String trim = str.trim();
		System.out.println("["+str+"] -> ["+trim+"]");
		
		//사용자의 실수로 아이디나 비밀번호의 앞뒤에 공백이들어가는것을 방지하기 위해 사용할 수 있다.
		String id = " myid";
		String password = "mypassword ";
		System.out.println(id);
		System.out.println(password);
		System.out.println(id.trim());
		System.out.println(password.trim());
		
		
		int number = 10;
		str = number + "";
		str = String.valueOf(number);
		System.out.println(str);
		
		
		
	}
}
