package 최준영;

public class Clear {

    static void clearMethod(){
        for(int i =0; i< 50 ; i++){
            System.out.println();
        }
    }

    static void flashMethod(){
        for(int i = 0 ; i< 50 ; i++){
            System.out.print("💵");
        }
        System.out.println();
    }


    static void diceMethod(){
        for(int i = 0 ; i< 50 ; i++){
            System.out.print("🎲");
        }
        System.out.println();
    }

    static void horesMethod(){
        for(int i = 0 ; i< 50 ; i++){
            System.out.print("🎠");
        }
        System.out.println();
    }

    static void holjakMethod(){
        for(int i = 0 ; i< 50 ; i++){
            System.out.print("🔢");
        }
        System.out.println();
    }

    static void yabaMethod(){
        for(int i = 0 ; i< 50 ; i++){
            System.out.print("🥛");
        }
        System.out.println();
    }

    static void sleepMethod(int milsec){
        try{
        Thread.sleep(milsec);
        }catch (InterruptedException e){

        }
    }
}
