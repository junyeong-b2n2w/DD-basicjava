package 최준영;

import java.util.Scanner;

public class DiceGame {


    public static void diceGame(Player p) {
        Clear.clearMethod();
        Clear.diceMethod();
        Clear.diceMethod();
        int dealerDice1 = 0;
        int playerDice1 = 0;
        int dealerDice2 = 0;
        int playerDice2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("주사위 게임에 오신걸 환영합니다.");

        System.out.println("게임 설명을 들으려면 2번을 눌러주세요");

        int input = Integer.parseInt(sc.nextLine());

        if (input == 2) {

            System.out.println(" 주사위 게임 설명  : 딜러와 플레이가 돌아가며 주사위를 던집니다 2배");
            System.out.println(" 총 2번을 져서 나온 주사위의 합이 높은사람이 이깁니다.");
            System.out.println(" 같을 경우 딜러가 승리합니다.");
            Clear.sleepMethod(3000);
        }

        Clear.clearMethod();
        Clear.diceMethod();
        Clear.diceMethod();
        System.out.println("게임 시작");
        System.out.print("베팅금을 입력해주세요 >");

        int betting = Integer.parseInt(sc.nextLine());
        //가진돈보다 많은지 확인하는 로직
        if (p.money < betting) {
            System.out.println("가지고 있는돈이 베팅금보다 적습니다.");
            System.out.println("현재 잔액 : " + p.money);
        } else {
            p.money -= betting;


            dealerDice1 = 1 + ((int) (Math.random() * 60) + 1) % 6;
            playerDice1 = 1 + ((int) (Math.random() * 60) + 1) % 6;
            System.out.println("딜러가 주사위를 던졌습니다 ");
            System.out.print("딜러 첫번째 주사위 : " + dealerDice1 + "\t");
            DiceGame.printDice(dealerDice1);
            System.out.println(p.name+"님이 주사위를 던졌습니다 ");
            System.out.print(p.name + "님 첫번째 주사위 : " + playerDice1 + "\t");
            DiceGame.printDice(playerDice1);

            dealerDice2 = 1 + ((int)(Math.random() * 60) + 1) % 6;
            playerDice2 = 1 + ((int)(Math.random() * 60) + 1) % 6;
            System.out.println("딜러가 주사위를 던졌습니다 ");
            System.out.print("딜러 두번째 주사위 : " + dealerDice2 + "\t");
            DiceGame.printDice(dealerDice2);
            System.out.println(p.name+"님이 주사위를 던졌습니다 ");
            System.out.print(p.name + "님 두번째 주사위 : " + playerDice2 + "\t");
            DiceGame.printDice(playerDice2);

            if (dealerDice1 + dealerDice2 < playerDice1 + playerDice2) {
                Clear.flashMethod();
                System.out.println("축하합니다 주사위 게임에서 승리하셨습니다!");
                System.out.println("베팅금의 2배인" + betting * 2 + "를 얻으셨습니다.");
                Clear.flashMethod();
                p.money += betting * 2;
            } else {
                System.out.println("안타깝습니다 주사위 게임에서 지셨습니다ㅠㅠ");

            }

            Clear.sleepMethod(2000);
        }


    }

    static void printDice(int dice){
        for(int i =0; i<dice; i++){
            System.out.print("🎲");
        }
        System.out.println();
    }
}

