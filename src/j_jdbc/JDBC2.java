package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {
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
			
			String sql = "SELECT * FROM cart WHERE cart_member = ?"; // 동적으로 쿼리를 넣고싶을떄
			
			ps = con.prepareStatement(sql);
			ps.setString(1, "a001"); // 첫번째 파라미터 ? 의 인덱스 (여러개일수도 잇으니까) 
//			ps.setObject(parameterIndex, x);
//			ps.setInt(parameterIndex, x);
			
			rs = ps.executeQuery();

			ResultSetMetaData md = rs.getMetaData();
			//메타데이터 : 데이터에 대한 데이터
		
			int columnCount = md.getColumnCount(); // 컬럼 수
			
			while(rs.next()){
					for(int i = 1; i<= columnCount; i++){
						Object value = rs.getObject(md.getColumnName(i));
						System.out.println(md.getColumnName(i) + "\t : "+value + "\t");
					}
					System.out.println();	
			}
			
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
