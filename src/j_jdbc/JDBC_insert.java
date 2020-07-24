package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC_insert {

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
			
			String sql = "INSERT INTO dept_test (deptno, dname,loc) VALUES (98, 'DDIT2','daejeon2')"; // 동적으로 쿼리를 넣고싶을떄
			
			ps = con.prepareStatement(sql);

//			rs = ps.executeQuery();
			
			int result = ps.executeUpdate();

			System.out.println(result + "줄 실행 되었습니다");
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(rs != null) try { rs.close();} catch (Exception e){}
			if(ps != null) try { ps.close();} catch (Exception e){}
			if(con != null) try { con.close();} catch (Exception e){}
			
		}
		
		
		
		
		
		
	}
}

	

