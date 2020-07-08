package e_oop.restaurant;

public class Alba {

	//메서드 알바가할일 (보스가 알바에게 시킨일)
	//파라미터 : 일을하기위해서 (보스-> 알바)에게 주는것
	//리턴타입 : 일을하고 난 후 돌려주는것 (알바 -> 보스)
	
	
	//주문받기 위해 필요한것? 없음
	// 주문받은후 보스에게 줄것? 주문서
	String[] getOrder(){
		System.out.println("주문하시겠습니까?");
		return new String[]{"짜장면","탕수육"};
	}
	
	//서빙하기 위해 필요한것? 음식
	// 서빙후 보스에게 줄것? 없음
	void serve(String[] foods){
		System.out.println("맛있게드세요");
	}
	
	//계산하기 위해 필요한것? 계산서
	//계산후 보스에게 줄것? 없음
	void pay(String[] order){
		System.out.println("2만원입니다. 안녕히 가세요");
	}
	
}
