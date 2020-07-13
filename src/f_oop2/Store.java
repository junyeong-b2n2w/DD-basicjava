package f_oop2;

public class Store {

	public static void main(String[] args) {
		Desktop d1 = new Desktop("3성 컴퓨터", 100000);
		Desktop d2 = new Desktop("금성 컴퓨터", 100000);
		
		AirCon ac1 = new AirCon("3성 에어컨", 200000);
		AirCon ac2 = new AirCon("금성 에어컨", 200000);
		
		Projecter pj1 = new Projecter("3성 프로젝터", 150000);
		Projecter pj2 = new Projecter("금성 프로젝터", 150000);
		
		Customer c = new Customer();
		
		System.out.println(d1.getInfo());
		System.out.println(d2.getInfo());
		c.buy(d1);
	
		
		System.out.println(ac1.getInfo());
		System.out.println(ac2.getInfo());
		c.buy(ac1);
		
		System.out.println(pj1.getInfo());
		System.out.println(pj2.getInfo());
		c.buy(pj2);
		
		
		c.showItem();
		
	}
	
}

class Product{
	String name; // 이름
	int price; // 가격
	
	public Product(String name, int price) {
	this.name = name;
	this.price = price;
	}
	
	//상품의 정보를 반환하는 메소드
	String getInfo(){
		return name + "(" + price + "원)";
	}
}

class Desktop extends Product{
	
	Desktop(String name, int price) {
		super(name, price);
	}
	
	void programming(){
		System.out.println("프로그램을 만듭니다.");
	}
	
}


class AirCon extends Product{
	
	AirCon(String name, int price) {
		super(name, price);
	}
	
	void setTemperature(){
		System.out.println("온도를 설정합니다");
	}
	
}


class Projecter extends Product{
	
	Projecter(String name, int price) {
	super(name, price);
	}
	
	void showProject(){
		System.out.println("화면을 보여줍니다");
	}
}

class Customer{
	int money = 1000000;
	Product[] item = new Product[100];
	
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("잔돈이 부족하다");
			return;
		}
		
		money -= p.price;
		
		for(int i = 0; i < item.length; i++){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.getInfo() + "를 구매했다.");
	}
	
	void showItem(){
		System.out.println("===========장바구니===========");
		for(int i = 0; i< item.length; i++){
			if(item[i] == null){
				break;
			}else{
				System.out.println(item[i].getInfo());
			}
		}
		System.out.println("==========================");
	}
	
}