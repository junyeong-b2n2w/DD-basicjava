package f_oop2;

public class Time {

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if(0 <= hour && hour < 23){
		this.hour = hour;
		}else if(hour < 0){
			this.hour = hour * -1 % 24;
		}else
			this.hour = hour % 24;
		}
	

	public int getMiniute() {
		return miniute;
	}

	public void setMiniute(int miniute) {
		if(0 <= miniute && miniute < 59){
		this.miniute = miniute;
	}else if(miniute < 0){
		this.miniute = miniute * -1 % 60;
	}else this.miniute = miniute % 60;
	}
		

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(0 <= second && second < 59){
		this.second = second;
	}else if(second < 0){
		this.second = second * -1 % 60;
	}else this.second = second % 60;
	}
	private int hour;
	private int miniute;
	private int second;
	
	String getTime(){
		return hour + ":" + miniute + ":" + second; 
	}
	
	void clock(){
		while(true){
			System.out.println(getTime());
			stop(1000);
			setSecond(second +1); 
		}
	}
	
	private void stop(int interval){
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
