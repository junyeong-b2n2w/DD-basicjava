package e_oop.game;

public class Character {

	String name;  //이름
	int maxHP; //최대체력
	int maxMP; //최대마나
	int hp; //체력
	int mp; //마나
	int att; // attack pwer
	int def; // def pwr
	int level; // level
	int exp; // 경험치
	Item[] items; // 보유 아이템

	
	Character(String name, int hp,int mp, int att, int def) {
		this.name = name; 
		this.maxHP= hp; 
		this.maxMP= mp; 
		this.hp = this.maxHP;
		this.mp = this.maxMP;
		this.att = att;   
		this.def = def; 
		this.level = 1;
		this.exp = 0; 
		this.items = new Item[10]; // 보유 아이템
		
		
	}
	
	void showInfo(){
		System.out.println("======================================");
		System.out.println("------------------상태-----------------");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level + "("+ exp +"/100)");
		System.out.println("체력 : " + maxHP);
		System.out.println("마나 : " + maxMP);
		System.out.println("공격 : " + att);
		System.out.println("방어 : " + def);
		System.out.println("----------------아이템-----------------");
		
		for(int i=0; i< items.length; i++){
			if(items[i] != null){
				System.out.println(items[i].itemInfo());
			}
		
		}
		
		System.out.println("======================================");
		
	}
	
	
	void attack(Monster m){
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp = m.hp < damage ? m.hp - m.hp : m.hp - damage;
		System.out.println(name + "가 공격으로 " + m.name + "에게 "
				+ damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 HP : " + m.hp);
	}
	
	void getExp(int exp){
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		this.exp += exp;
		while(100 <= this.exp){
			levelUp();
			this.exp -= 100;	
		}
	}

	void levelUp() {
		level++;
		maxHP += 10;
		maxMP += 5;
		att += 2;
		def += 2;
		hp = maxHP;
		mp = maxMP;
		System.out.println("LEVEL UP!!");
	}
	
	void getItem(Item item){
		System.out.println(item.name + "을 획득하였습니다");
		for(int i = 0 ; i<items.length; i++){
			if(items[i] == null){
				items[i] = item;
				break;
			}
		}
		maxHP += item.hp;
		maxMP += item.mp;
		att += item.att;
		def += item.def;
	}
	
	
}

