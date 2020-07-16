package 최준영;

import java.util.Scanner;

public class HolJak {





        public static void holJak(Player p) {

            Clear.clearMethod();
            Clear.holjakMethod();
            Clear.holjakMethod();
            int holjakDealer = 0;
            Scanner sc = new Scanner(System.in);

            System.out.println("\t홀짝 게임에 오신걸 환영합니다.");

            System.out.println("\t게임 설명을 들으려면 2번을 눌러주세요");

            int input = Integer.parseInt(sc.nextLine());

            if(input == 2 ){
                System.out.println("\t 홀짝게임 설명  : 베팅한 돈의 두배");
                Clear.sleepMethod(2000);
            }
            Clear.clearMethod();
            Clear.holjakMethod();
            Clear.holjakMethod();
            System.out.print("\t베팅금을 입력해주세요 >");

            int betting  = Integer.parseInt(sc.nextLine());
            //가진돈보다 많은지 확인하는 로직
            if(p.money < betting){
                System.out.println("\t가지고 있는돈이 베팅금보다 적습니다.");
                System.out.println("\t현재 잔액 : " + p.money);
            } else {
                p.money -= betting;

                System.out.println("\t딜러가 젓가락을 던졌습니다.");
                holjakDealer = ((int)(Math.random() * 99)+1) % 2;


                System.out.print("\t홀수인지 짝수인지 골라주세요 (홀수 1, 짝수 2) >");
                input = Integer.parseInt(sc.nextLine());

                if (input == holjakDealer + 1){
                    Clear.flashMethod();
                    System.out.println("\t축하합니다 정답을 맞추셨습니다!");
                    System.out.println("\t베팅금의 2배인" + betting *2 + "를 얻으셨습니다.");
                    Clear.flashMethod();
                    p.money += betting*2;
                }else{
                    System.out.println("\t안타깝습니다 정답을 틀리셨습니다ㅠㅠ");

                }
            }











        }


    }



