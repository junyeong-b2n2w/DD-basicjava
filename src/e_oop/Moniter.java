package e_oop;

import java.util.Scanner;

public class Moniter {

	boolean power;
	int[] rgbColor = new int[3];
	int bright;

	final int MAX_RGB = 255;
	final int MIN_RGB = 0;
	final int MAX_BRIGHT = 100;
	final int MIN_BRIGHT = 1;

	Moniter() {
 		power = false;
		rgbColor = new int[]{128,128,128};
		bright = 50;

	}

	boolean moniterPowerOnOff(boolean power) {
		System.out.println(power ? "moniter가 꺼졋습니다" : "moniter가 켜졌습니다");
		return this.power = !power;
	}

	void moniterColorRed(int red) {
		if (power) {
			if (MIN_RGB <= red && red <= MAX_RGB) {

				this.rgbColor[0] = red;
				System.out.println("red : " + red);
			} else {
				System.out.println("빨강색이 표현색범위를 넘어섭니다.");
			}
		}
	}

	void moniterColorGreen(int green) {
		if (power) {
			if (MIN_RGB <= green && green <= MAX_RGB) {

				this.rgbColor[1] = green;
				System.out.println("green : " + green);
			} else {
				System.out.println("초록색이 표현색범위를 넘어섭니다.");
			}
		}
	}

	void moniterColorBlue(int blue) {
		if (power) {
			if (MIN_RGB <= blue && blue <= MAX_RGB) {

				this.rgbColor[2] = blue;
				System.out.println("blue : " + blue);
			} else {
				System.out.println("파란색이 표현색범위를 넘어섭니다.");
			}
		}
	}

	void moniterBrightUp() {
		if (power) {
			if (bright < MAX_BRIGHT) {

				this.bright++;
			}
			System.out.println("밝기 : " + bright);
		}

	}

	void moniterBrightDown() {
		if (power) {
			if (bright > MIN_BRIGHT) {
				this.bright--;
			}
			System.out.println("밝기 : " + bright);

		}
	}

	public static void main(String[] args) {
		Moniter myMoniter = new Moniter();

		Scanner sc = new Scanner(System.in);
		int color;

		if (!myMoniter.power) {
			System.out.println("모니터를 킬까요? (y / n)");
			String input = sc.nextLine();
			if (input.equals("y")) {
				myMoniter.moniterPowerOnOff(myMoniter.power);

				outer: while (true) {
					System.out.println("무엇을 조작할까요?");
					System.out.println("1. 밝기 올리기");
					System.out.println("2. 밝기 내리기");
					System.out.println("3. 빨강");
					System.out.println("4. 초록");
					System.out.println("5. 파랑");
					System.out.println("0. 종료");
					int inputNum = Integer.parseInt(sc.nextLine());
					switch (inputNum) {
					case 1:
						myMoniter.moniterBrightUp();
						break;
					case 2:
						myMoniter.moniterBrightDown();
						break;
					case 3:
						System.out.println("빨강 값을 입력해주세요 > ");
						color = Integer.parseInt(sc.nextLine());
						myMoniter.moniterColorRed(color);
						break;
					case 4:
						System.out.println("초록 값을 입력해주세요 > ");
						color = Integer.parseInt(sc.nextLine());
						myMoniter.moniterColorGreen(color);
						break;
					case 5:
						System.out.println("파랑 값을 입력해주세요 > ");
						color = Integer.parseInt(sc.nextLine());
						myMoniter.moniterColorBlue(color);
						break;
					case 0:
						myMoniter.moniterPowerOnOff(myMoniter.power);
						break outer;
					default:
						System.out.println("입력이 잘못되었습니다");
						break;
					}

				}

			} else {
				System.out.println("프로그램 종료");
			}

		
			
		} 

	}
}
