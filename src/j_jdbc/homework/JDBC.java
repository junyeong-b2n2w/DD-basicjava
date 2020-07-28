package j_jdbc.homework;

//JDBC.java

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class JDBC {
  public static void jdbcPrint(String input, int num) {

      // db 접속정보
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
      String user = "jun";
      String password = "java";


      Connection con = null;
      PreparedStatement ps = null;
      ResultSet rs = null;


      try {
          con = DriverManager.getConnection(url, user, password);


          switch (input) {
              case "selectAll": {
                  String selectAll = "SELECT * FROM board ORDER BY board_num DESC";

                  ps = con.prepareStatement(selectAll);
                  //select
                  rs = ps.executeQuery();
                  while (rs.next()) {
                      int board_num = rs.getInt("board_num");
                      String board_title = rs.getString("board_title");
                      String board_author = rs.getString("board_author");
                      Date board_date = (Date) rs.getDate("board_date");
                      String board_text = rs.getString("board_text");
                      System.out.println(board_num + "\t" + board_title + "\t\t\t\t\t" + board_author + "\t\t" + board_date);
                  }
              }
              case "selectOne": {
                  String selectOne = "SELECT * FROM board WHERE board_num = ?";
                  ps = con.prepareStatement(selectOne);
                  ps.setInt(1, num);
                  rs = ps.executeQuery();
                  while (rs.next()) {
                      int board_num = rs.getInt("board_num");
                      String board_title = rs.getString("board_title");
                      String board_author = rs.getString("board_author");
                      Date board_date = (Date) rs.getDate("board_date");
                      String board_text = rs.getString("board_text");
                      System.out.println("-----------------------");
                      System.out.println("제목 \t: " + board_title);
                      System.out.println("작성자 \t: " + board_author);
                      System.out.println("작성일\t: " + board_date);
                      System.out.println("글번호\t: " + board_num);
                      System.out.println("-----------------------");
                      System.out.println(board_text);
                      System.out.println("-----------------------");


                      System.out.println("1. 수정  2. 돌아가기");

                      Scanner sc = new Scanner(System.in);
                      int input2 = Integer.parseInt(sc.nextLine());
                      switch (input2) {
                          case 1:
                              System.out.print("수정할 글 제목을 입력해주세요 >");
                              String title = sc.nextLine();
                              System.out.print("수정할 글 내용을 입력해주세요 >");
                              String text = sc.nextLine();
                              JDBC.jdbcUpdate(num, title, text);
                          case 2:
                              return;
                      }
                  }
              }


          }


      } catch (SQLException e) {
          e.printStackTrace();
      } finally {
          if (rs != null) try {
              rs.close();
          } catch (Exception e) {
          }
          if (ps != null) try {
              ps.close();
          } catch (Exception e) {
          }
          if (con != null) try {
              con.close();
          } catch (Exception e) {
          }

      }


  }

  public static void jdbcInsert(int num, String title, String text) {
      // db 접속정보
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
      String user = "jun";
      String password = "java";


      Connection con = null;
      PreparedStatement ps = null;
      ResultSet rs = null;


      try {
          con = DriverManager.getConnection(url, user, password);


          String insertOne = "INSERT INTO board (board_num, board_title,board_date,board_author,board_text)" +
                  " VALUES( " + num + " , '" + title + "' , SYSDATE , 'jun' , ' " + text + "') ";

          ps = con.prepareStatement(insertOne);

          int result = ps.executeUpdate();

          System.out.println(result + "건의 게시글이 등록 되었습니다");


      } catch (SQLException e) {
          e.printStackTrace();
      } finally {
          if (rs != null) try {
              rs.close();
          } catch (Exception e) {
          }
          if (ps != null) try {
              ps.close();
          } catch (Exception e) {
          }
          if (con != null) try {
              con.close();
          } catch (Exception e) {
          }

      }


  }

  public static void jdbcDelete(int num) {
      // db 접속정보
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
      String user = "jun";
      String password = "java";

      Connection con = null;
      PreparedStatement ps = null;
      ResultSet rs = null;

      try {
          con = DriverManager.getConnection(url, user, password);


          String deleteOne = "DELETE board WHERE board_num = " + num;

          ps = con.prepareStatement(deleteOne);

          int result = ps.executeUpdate();

          System.out.println(result + "건의 게시글이 삭제 되었습니다");

      } catch (SQLException e) {
          e.printStackTrace();
      } finally {
          if (rs != null) try {
              rs.close();
          } catch (Exception e) {
          }
          if (ps != null) try {
              ps.close();
          } catch (Exception e) {
          }
          if (con != null) try {
              con.close();
          } catch (Exception e) {
          }

      }


  }

  public static void jdbcUpdate(int num, String title, String text) {
      // db 접속정보
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
      String user = "jun";
      String password = "java";

      Connection con = null;
      PreparedStatement ps = null;
      ResultSet rs = null;

      try {
          con = DriverManager.getConnection(url, user, password);


          String updateOne = "UPDATE board SET board_title = '" + title +
                  "', board_text = '" + text + "' WHERE board_num = " + num;

          ps = con.prepareStatement(updateOne);

          int result = ps.executeUpdate();

          System.out.println(result + "건의 게시글이 수정 되었습니다");

      } catch (SQLException e) {
          e.printStackTrace();
      } finally {
          if (rs != null) try {
              rs.close();
          } catch (Exception e) {
          }
          if (ps != null) try {
              ps.close();
          } catch (Exception e) {
          }
          if (con != null) try {
              con.close();
          } catch (Exception e) {
          }

      }


  }

}
