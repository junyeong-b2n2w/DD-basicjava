package 최준영;

import java.io.*;

public class Player {

    String name;
    int money;

    Player(String name){
        this.money = 200000;
        this.name = name;
    }

    void showMoney(){
        Clear.clearMethod();
        Clear.flashMethod();
        Clear.flashMethod();
        System.out.println();
        System.out.println("💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵   가진 돈   💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵💵");
        System.out.println("\t\t" + name  +"님");
        System.out.println("\t\t💵 : " + money);
        System.out.println();
        Clear.flashMethod();
        Clear.flashMethod();



    }

    void saveStatus() throws IOException {
        PrintWriter pw = new PrintWriter(name+".txt");
        pw.print(money);
        pw.close();
        System.out.println("상태 저장중 입니다..");
        Clear.sleepMethod(500);
        System.out.println("저장 완료");
        System.exit(0);
    }

    void roadStatus(String userName) throws IOException {
        FileReader fr = new FileReader(userName + ".txt");
        BufferedReader br = new BufferedReader(fr);
        money = Integer.parseInt(br.readLine());

    }

}
