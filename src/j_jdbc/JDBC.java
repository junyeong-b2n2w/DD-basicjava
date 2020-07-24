package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
		public static void main(String[] args) {
		
			// db 접속정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "jun";
			String password = "java";
			
			
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			
			try {
				con = DriverManager.getConnection(url, user, password);
				
				
				String sql = "SELECT * FROM emp";
				
				ps = con.prepareStatement(sql);
				
				
				//select
				rs = ps.executeQuery();
				
				
				while(rs.next()){
					int empno = rs.getInt("empno");
					String empname = rs.getString("ename");
					
					
					System.out.println("empno : " + empno + " / ename : "+ empname);
					
					
				}
				
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally{
				if(rs != null) try { rs.close();} catch (Exception e){}
				if(ps != null) try { ps.close();} catch (Exception e){}
				if(con != null) try { con.close();} catch (Exception e){}
				
			}
			
			
			
			
			
			
		}
}
