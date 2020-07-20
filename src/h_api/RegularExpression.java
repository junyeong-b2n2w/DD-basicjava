package h_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		
		/*
		 
		^		뒷문자로시작
		$ 		앞문자로 종료
		.		임의의 문자(줄바꿈제외)
		*  		앞문자0개이상
		+	 	앞문자 1개이상
		?		앞문자가 없거나 1개
		[] 		문자의 집합이나 범위([a-z]:a부터 z까지 , [^a-z] : a부터z가 아닌것)
		{}		앞문자의 개수 ({2}:2개, {2,4} 2개이상 4개이하 {2, } 2개이상)
		()		그룹화 ( 1개의 문자처럼 인식)
		|		OR연산
		\s 		공백, 탭, 줄바꿈
		\S 		공백, 탭, 줄바꿈이 아닌문자
		\w 		알파벳이나 숫자
		\W 	 	알파벳이나 숫자가 아닌문자
		\d  	숫자
		\D	 	숫자가 아닌 문자
		(?i) 	뒷문자의 대소문자 구분 안함
		\		정규표현식에서 사용되는 특수문자 표현
		
		*/
		
//		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";  // 자바에서 역슬레쉬 하나를 표현하기 위해 \\ 함
//		String regex = ".*";
//		
//		Pattern p = Pattern.compile(regex);
//		
//		Matcher m = p.matcher(str);
//		
//		System.out.println(m.matches());
		
		
		// ID 전화번호 , 이메일 주소의 유효성을 검사하는 정규표현식을 만들어주세요
		// ID 5-20 영소문자 숫자 - _ 만가능
		String regexId = "[a-z0-9-_]{5,20}";
//		String regexPhone = "[0-9]{11}";
		String regexPhone = "01[0-9]{1}-[0-9]{3,4}-[0-9]{4}";
		
//		String regexEmail = "[a-zA-Z0-9-_\\.]{5,20}+@[a-zA-Z0-9]+\\.[a-zA-z\\.]+";
		String regexEmail = "[a-zA-Z0-9-_\\.]{5,20}+@[a-zA-Z0-9]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";
		
		Pattern p_id = Pattern.compile(regexId);
		Pattern p_phone = Pattern.compile(regexPhone);
		Pattern p_email = Pattern.compile(regexEmail);
		
		String id = "abcde-_1234567890123";
		String phone = "015-978-1152";
		String email = "junyeon_.-gb2n2w@nave119r.co.kr";
		Matcher m_id = p_id.matcher(id);
		Matcher m_phone = p_phone.matcher(phone);
		Matcher m_email = p_email.matcher(email);
		
		System.out.println(m_id.matches());
		System.out.println(m_phone.matches());
		System.out.println(m_email.matches());
		
		
		
	}
}
