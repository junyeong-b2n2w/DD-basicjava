package j_jdbc.homework;

import java.util.Scanner;


public class Board {


    public Board() {

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int input;

        while (true) {

            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("번호\t제목\t\t\t\t\t\t\t작성자\t작성일");
            System.out.println("----------------------------------------------------------------------------------");

            // 게시글 출력
            JDBC.jdbcPrint("selectAll", 0);

            //선택지 보기
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("1.게시글 보기\t 2.등록\t3.삭제\t4.종료");


            input = Integer.parseInt(sc.nextLine());

            switch (input) {
                case 1:
                    System.out.print("보고싶은 게시글 번호를 입력해주세요 >");
                    input = Integer.parseInt(sc.nextLine());
                    JDBC.jdbcPrint("selectOne", input);
                    break;
                case 2:
                    System.out.print("새로 등록할 글 번호를 입력해주세요 >");
                    input = Integer.parseInt(sc.nextLine());
                    System.out.print("새로 등록할 글 제목을 입력해주세요 >");
                    String title = sc.nextLine();
                    System.out.print("새로 등록할 글 내용을 입력해주세요 >");
                    String text = sc.nextLine();
                    JDBC.jdbcInsert(input, title, text);
                    break;
                case 3:
                    System.out.print("삭제할 게시글 번호를 입력해주세요 >");
                    input = Integer.parseInt(sc.nextLine());
                    JDBC.jdbcDelete(input);
                    break;
                case 4:
                    System.exit(0);
                    break;

                case 0:

                    break;
            }

        }//


    }


}