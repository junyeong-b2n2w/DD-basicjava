package i_collection.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class Board {
	

	static ArrayList<HashMap<String, Object>> board = new ArrayList<>();
	
	public Board() {
		
	}

	public static void main(String[] args) {
		
		
		/* 게시판 
		 * 조회, 등록, 수정, 삭제
		 * 
		 * 게시글 클래스 생성자 (해쉬맵) 
		 * 
		 * 글번호( static ) (키 : num , 값:int)
		 * 제목  (키 : title , 값: string) 
		 * 날짜  (키 : date, 값 : date)
		 * 작성자  (키 : author , 값 : string)
		 * 내용 (키 : , 내용:string)
		 * 
		 * 컬럼 : 번호, 제목, 내용, 작성자, 작성일
		 * 
		 * 클래스 - 메인(게시글목록)
		 * 조회 arrayList for arrlist-size()
		 * 
		 * 등록   수정  삭제
		 * 
		 * 메소드- 조회 foreach
		 * 
		 * 메소드- 등록 arrlist.add(hash map) - > pk를 늘려줘야되네
		 * 
		 * 메소드 -수정 arrlist.set(pk__hash map)
		 * 
		 * 멧두 -삭제  arrlist.remove((pk))  -- //다시확인
		 * ㅋ
		 * 클래스 아티클 - 
		 *
		 * 
		 */
		 
		Scanner sc = new Scanner(System.in);
		//게시판 생성
		new Board();

		//테스트용 게시글
//		boardArticleAdd("title1아몰랑","아 몰랑");
//		boardArticleAdd("title2몰라몰라","아 몰랑2");
//		boardArticleAdd("title3모륵세","아 몰랑3");
		
		int input;
		
		  while(true){
	           
			  	System.out.println("----------------------------------------------------------------------------------");
				System.out.println("번호\t제목\t\t\t\t\t\t\t작성자\t작성일");
				System.out.println("----------------------------------------------------------------------------------");
				
				// 게시글 출력
				for (HashMap<String, Object> eachlist :board) {
					System.out.println(eachlist.get("num")+ "\t" +eachlist.get("title")
							+ "\t" + eachlist.get("author") + "\t" + eachlist.get("date"));
					
				}

				//선택지 보기
				System.out.println("----------------------------------------------------------------------------------");
				System.out.println("1.게시글 보기\t 2.등록\t3.삭제\t4.종료");
				
			
				input = Integer.parseInt(sc.nextLine());
			  
	            switch(input){
	                case 1:
	                	System.out.print("보고싶은 게시글 번호를 입력해주세요 >");
	                	input = Integer.parseInt(sc.nextLine());
	                	boardArticleShow(input);
	                    break;
	                case 2:
	                	System.out.print("새로 등록할 글 제목을 입력해주세요 >");
	                	String title = sc.nextLine();
	                	System.out.print("새로 등록할 글 내용을 입력해주세요 >");
	                	String text = sc.nextLine();
	                	boardArticleAdd(title, text);
	                  
	                    break;
	                case 3:
	                	System.out.print("삭제할 게시글 번호를 입력해주세요 >");
	                	input = Integer.parseInt(sc.nextLine());
	                	boardArticleRemove(input);
	                    break;
	                case 4:
	                	System.exit(0);
	                    break; 
	              
	                case 0:
	               
	                    break;
	            }

	        }//
		
		
		   
		
	
}
		
		
	
	
	static void boardArticleRemove(int delNum){ 
		int saveDelNum=0;
		for (HashMap<String, Object> eachlist: board) {
				if((int)eachlist.get("num")==delNum){
					break;
				}
				saveDelNum++;
				}
		board.remove(saveDelNum);
	
		
 }
	
	static void boardArticleAdd(String title, String text){
		board.add(new BoardArticle(title, text).boardArticle);
	}
	
	
	static void boardArticleShow(int showNum){
		Scanner sc = new Scanner(System.in);
		int input = 0;
		for (HashMap<String, Object> eachlist: board) {
			
				if((int)eachlist.get("num")==showNum){
					
					System.out.println("----------------------------------------------------------------------------");
					System.out.println("제목  \t:" + eachlist.get("title") );
					System.out.println("글번호  \t:" + eachlist.get("num") );
					System.out.println("작성자  \t:" + eachlist.get("author") );
					System.out.println("작성시간  \t:" + eachlist.get("date") );
					System.out.println("----------------------------------------------------------------------------");
					System.out.println(eachlist.get("text"));
					System.out.println("----------------------------------------------------------------------------");

				}
				
				}
		
		System.out.println("1.수정 \t 2.돌아가기");
		input= Integer.parseInt(sc.nextLine());
		if(input==1){
			boardArticleEdit(showNum);
		}else{
			return;
		}
		
	}
	
	
	static void boardArticleEdit(int showNum){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 글 제목을 입력해주세요 >");
		String title = sc.nextLine();
		
		System.out.print("수정할 글 내용을 입력해주세요 >");
		String text = sc.nextLine();
		
		int input = 0;
		for (HashMap<String, Object> eachlist: board) {
				if((int)eachlist.get("num")==showNum){
					
					// 업데이트 구문
					eachlist.put("title", title);
					eachlist.put("text", text);
					
				}
		}
		
	}
	
	
}
