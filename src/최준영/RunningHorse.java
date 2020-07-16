package 최준영;

import java.util.Scanner;

public class RunningHorse {


    public static void runningHorse(Player p) {

        Clear.clearMethod();
        Clear.horesMethod();
        Clear.horesMethod();

        int[][] horse = new int[6][2];


        int playerChoice = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("경마 게임에 오신걸 환영합니다.");

        System.out.println("게임 설명을 들으려면 2번을 눌러주세요");

        int input = Integer.parseInt(sc.nextLine());

        if (input == 2) {
            System.out.println("경마 게임 설명  : 말 6마리가 달립니다");
            System.out.println("1등말 번호를 골라주시면 상금을 획득합니다");
            System.out.println("베팅 금액의 5배");
        }

        System.out.println("게임 시작");
        System.out.print("베팅금을 입력해주세요 >");

        int betting = Integer.parseInt(sc.nextLine());
        //가진돈보다 많은지 확인하는 로직
        if (p.money < betting) {
            System.out.println("가지고 있는돈이 베팅금보다 적습니다.");
            System.out.println("현재 잔액 : " + p.money);
        } else {
            p.money -= betting;

            System.out.println("1~6번 말중에 이길 것 같은말 번호를 입력해 주세요");

            playerChoice = Integer.parseInt(sc.nextLine());

            System.out.println("1번말이 달립니다 🎠");
            horse[0][0] = eachHorseRunning(1);

            System.out.println("2번말이 달립니다 🎠");
            horse[1][0] = eachHorseRunning(2);

            System.out.println("3번말이 달립니다 🎠");
            horse[2][0] = eachHorseRunning(3);

            System.out.println("4번말이 달립니다 🎠");
            horse[3][0] = eachHorseRunning(4);

            System.out.println("5번말이 달립니다 🎠");
            horse[4][0] = eachHorseRunning(5);

            System.out.println("6번말이 달립니다 🎠");
            horse[5][0] = eachHorseRunning(6);

            for(int i = 0 ; i < horse.length; i++){
                horse[i][1] = 1;
                for (int j = 0 ; j < horse.length; j++){
                    if(horse[i][0] > horse[j][0]) horse[i][1] = horse[i][1] + 1;
                }
            }

//            System.out.println(Arrays.toString(horse[0]));
//            System.out.println(Arrays.toString(horse[1]));
//            System.out.println(Arrays.toString(horse[2]));
//            System.out.println(Arrays.toString(horse[3]));
//            System.out.println(Arrays.toString(horse[4]));
//            System.out.println(Arrays.toString(horse[5]));




            if (horse[playerChoice-1][1] == 1 ) {
                System.out.println("축하합니다 경마 게임에서 승리하셨습니다!");
                System.out.println("베팅금의 5배인" + betting * 5 + "를 얻으셨습니다.");
                p.money += betting * 5;
            } else {
                System.out.println("안타깝습니다 경마 게임에서 지셨습니다ㅠㅠ");

                Clear.sleepMethod(1000);
            }
        }
    }
    static public int eachHorseRunning(int horseNumber) {
        int totalRuntime = 0;
        int runtime = 0;

        for(int i = 0 ; i < 50; i++){
            for (int k =0 ; k < 150; k++){
                System.out.print("\b");
            }
            System.out.print(horseNumber+"번말  | ");
            runtime =  (int)(Math.random()*100);
            totalRuntime += runtime;
            for(int j = 0 ; j < i; j++){
                System.out.print("==");
            }
            System.out.print("🎠");
            try{
                Thread.sleep(runtime);
            }catch (InterruptedException e){

            }



        }
        System.out.println(" " + totalRuntime + "ms");
        return totalRuntime;
    }

//       static public int eachHorseRunning(int horseNumber) {
//            int totalRuntime = 0;
//            int runtime = 0;
//            System.out.print(horseNumber+"번말  | ");
//            for(int i = 0 ; i < 50; i++){
//                runtime =  (int)(Math.random()*100);
//                totalRuntime += runtime;
//                try{
//                    Thread.sleep(runtime);
//                }catch (InterruptedException e){
//
//                }
//
//                System.out.print("==");
//                System.out.print("🎠");
//
//
//            }
//            System.out.println(" " + totalRuntime + "ms");
//            return totalRuntime;
//        }

}

