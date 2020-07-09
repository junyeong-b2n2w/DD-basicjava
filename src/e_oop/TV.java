package e_oop;

public class TV {

	boolean power; // 전원
	int channel;   // 채널
	int volume;    // 음량
	
	
	// 메소드 해당 변수 조작 전원 1개 / 채널 (숫자, 위,아래)3개 / 음량 2개
	
	
	TV(){
		this.power = false;
		this.volume = 50;
		this.channel = 1;
	}
	
	boolean tvPowerOnOff(boolean power){
		System.out.println( power? "tv가 꺼졋습니다" : "tv가 켜졌습니다");
		return this.power = !power;
	}
	
	int tvChannelNum(int channel){
		System.out.println("채널을 " +channel + "로 변경합니다");
		return this.channel = channel;
	}
	
	int tvChannelUp(){
		
		if (channel == 100){
			channel = 0;}
			channel++;
			System.out.println("채널을 " +(channel) + "로 변경합니다");
			
		
		return this.channel;
	}
	
	int tvChannelDown(){
		if (channel == 1){ channel = 101;}
				channel--;
		System.out.println("채널을 " +(channel) + "로 변경합니다");
		return this.channel;
	}
	
	int tvVolumeUp(){
		
		if (volume >= 100){ volume = 100;
		System.out.println("볼륨을 " +(volume) + "로 변경합니다");
		}else {
			volume++;
			System.out.println("볼륨을 " +(volume) + "로 변경합니다");
			}
		return this.volume;
	}
	
	int tvVolumeDown(){
		if (volume <= 0){ volume = 0;
		System.out.println("볼륨을 " +(volume) + "로 변경합니다");
		}else {
			volume--;
			System.out.println("볼륨을 " +(volume) + "로 변경합니다");
			}
		return this.volume;
	}
	
	
	public static void main(String[] args) {
		
		
		TV tv1 = new TV();
	
		tv1.tvPowerOnOff(tv1.power);
		tv1.tvPowerOnOff(tv1.power);
		
		tv1.tvChannelNum(99);
		tv1.tvChannelUp();
		tv1.tvChannelUp();
		tv1.tvChannelUp();
		tv1.tvChannelUp();
		tv1.tvChannelUp();
		tv1.tvChannelNum(3);
		tv1.tvChannelDown();
		tv1.tvChannelDown();
		tv1.tvChannelDown();
		tv1.tvChannelDown();
		tv1.tvChannelDown();
		
		tv1.tvVolumeDown();
		tv1.tvVolumeDown();
		tv1.tvVolumeDown();
		tv1.tvVolumeDown();
		tv1.tvVolumeDown();
		tv1.tvVolumeDown();
		tv1.tvVolumeDown();
		tv1.tvVolumeDown();
		tv1.tvVolumeDown();
		tv1.tvVolumeUp();
		tv1.tvVolumeUp();
		tv1.tvVolumeUp();
		tv1.tvVolumeUp();
		tv1.tvVolumeUp();
		tv1.tvVolumeUp();
		tv1.tvVolumeUp();
		
	}
}

