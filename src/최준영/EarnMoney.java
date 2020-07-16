package 최준영;

import java.util.Scanner;

public class EarnMoney {

    public static void earnMoney(Player p){
        Clear.clearMethod();
        Clear.flashMethod();
        Clear.flashMethod();
        String[] texts = new String[7];

        texts[0] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, " +
                "quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
        texts[1] = "Through three cheese trees three free fleas flew.";
        texts[2] = "Any noise annoys an oyster, but a noisy noise annoys an oyster most.";
        texts[3] = "He threw three free throws";
        texts[4] = "Cheap Sheep Sock Shops Seek to Stock Sheep Chopsticks";
        texts[5] = "Rarely leary, Larry’s reeling when Larry rear-ends Rory’s lorry";
        texts[6] = "We surely shall see the sun shine soon";


        Clear.clearMethod();
        Clear.flashMethod();
        Clear.flashMethod();
        System.out.println("\t전당포에 오신걸 환영합니다.");
        System.out.println("\t전당포에선 영어 타자 연습을 통해 돈을 벌 수 있습니다.");
        System.out.println("\t똑같이 따라 치면 5000원을 획득합니다.");

        Clear.flashMethod();
        int typeNumber = ((int)(Math.random()*100) +1 )%6;


        Scanner sc = new Scanner(System.in);

        System.out.println(texts[typeNumber]);
        String typing = sc.nextLine();

        if(texts[typeNumber].equals(typing)){
            System.out.println("타자를 완벽하게 쳐서 5000원을 획득하셨습니다");
            p.money += 5000;

        }else{
            System.out.println("타자를 틀리셨습니다.");
        }


    }
}
