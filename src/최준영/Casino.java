package 최준영;

import java.io.IOException;
import java.util.Scanner;

public class Casino {

static Player p;



    public static void main(String[] args) throws IOException {

        Clear.flashMethod();
        Clear.flashMethod();
        Clear.flashMethod();
        System.out.println("\t 카지노에 오신걸 환영합니다.");
        System.out.print("\t 생년월일을 입력해주세요(8자리) > ");



        Scanner sc = new Scanner(System.in);
        int birthday = Integer.parseInt(sc.nextLine());
        if(birthday > 20000101){
            for (int i = 0 ;i < 50; i++) {
                System.out.print("❌");
            }
            System.out.println();
            System.out.println("\t미성년자는 카지노에 입장할 수 없습니다.");
            System.out.println("\t강제퇴장 합니다");
            for (int i = 0 ;i < 50; i++) {
                System.out.print("❌");
            }
            System.out.println();
            Clear.sleepMethod(2000);
            System.exit(0);
        }



        System.out.print("\t 카지노를 이용해 보신적이 있으신가요? (y , n)> ");
        String reEnter = sc.nextLine();


        System.out.print("\t 이름을 입력해주세요 > ");
        String name = sc.nextLine();
        if(reEnter.equals("y")){
            p = new Player(name);
            p.roadStatus(name);
        }else {
            p = new Player(name);
        }

        new Casino().enterCasino();

    }

    void enterCasino() throws IOException {

        Scanner sc= new Scanner(System.in);
        int input = 0;
        while(true){
            Clear.clearMethod();
            Clear.flashMethod();
            System.out.println("\t카지노에 오신걸 환영합니다.");
            System.out.println("\t1. 내 지갑 보기");
            System.out.println("\t2. 동전 앞뒷면 맞추기 (배율 2배)");
            System.out.println("\t3. 홀짝 맞추기 (배율 2배)");
            System.out.println("\t4. 야바위 (배율 3배)");
            System.out.println("\t5. 주사위 게임 (배율 2배)");
            System.out.println("\t6. 경마장 (배율 5배)");
            System.out.println("\t7. 전당포");
            System.out.println("\t0. 저장하고 나가기");
            Clear.flashMethod();
            input = Integer.parseInt(sc.nextLine());

            switch(input){
                case 1:
                    p.showMoney();
                    Clear.sleepMethod(2000);
                    break;
                case 2:
                    CoinGame.coinGame(p);
                    Clear.sleepMethod(2000);
                    break;
                case 3:
                    HolJak.holJak(p);
                    Clear.sleepMethod(2000);
                    break;
                case 4:
                    Yabawee.yabawee(p);
                    Clear.sleepMethod(2000);
                    break;
                case 5:
                    DiceGame.diceGame(p);
                    Clear.sleepMethod(2000);
                    break;
                case 6:
                    RunningHorse.runningHorse(p);
                    Clear.sleepMethod(2000);
                    break;
                case 7:
                    EarnMoney.earnMoney(p);
                    Clear.sleepMethod(2000);
                    break;
                case 0:
                    p.saveStatus();
                    Clear.sleepMethod(2000);
                    break;
            }

        }

    }
}