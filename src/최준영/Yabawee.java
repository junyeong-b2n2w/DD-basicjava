package 최준영;

import java.util.Scanner;

public class Yabawee {


    public static void yabawee(Player p) {
        Clear.clearMethod();

        Clear.yabaMethod();
        Clear.yabaMethod();
        int yabaweeDealer = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("야바위 게임에 오신걸 환영합니다.");

        System.out.println("게임 설명을 들으려면 2번을 눌러주세요");

        int input = Integer.parseInt(sc.nextLine());

        if (input == 2) {
            System.out.println(" 야바위게임 설명  : 딜러가 컵을 섞으면 컵을 골라주시면 됩니다 3배");
            Clear.sleepMethod(2000);
        }

        Clear.clearMethod();
        Clear.yabaMethod();
        Clear.yabaMethod();
        System.out.print("베팅금을 입력해주세요 >");

        int betting = Integer.parseInt(sc.nextLine());
        //가진돈보다 많은지 확인하는 로직
        if (p.money < betting) {
            System.out.println("가지고 있는돈이 베팅금보다 적습니다.");
            System.out.println("현재 잔액 : " + p.money);
        } else {
            p.money -= betting;

            System.out.println("딜러가 컵을 섞었습니다 >");
            yabaweeDealer = ((int) (Math.random() * 99) + 1) % 3;

//            System.out.print(coinGameDealer);
            System.out.print("몇 번 컵인지 골라주세요 (1, 2, 3) >");

            input = Integer.parseInt(sc.nextLine());

            if (input == yabaweeDealer + 1) {
                Clear.flashMethod();
                System.out.println("축하합니다 정답을 맞추셨습니다!");
                System.out.println("베팅금의 3배인" + betting * 3 + "를 얻으셨습니다.");
                Clear.flashMethod();
                p.money += betting * 3;
            } else {
                System.out.println("안타깝습니다 정답을 틀리셨습니다ㅠㅠ");

            }
        }


    }

}