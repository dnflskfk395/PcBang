package PcBang;

import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//데이터 베이스에 접근하는 객체 ! 
public class insertDAO {
	
	public static void main(String[] args) {
		
		DTO dto = new DTO();
		
		//dbms 연결
		Connection conn = MakeConnection.getConnection();
		
		String id = dto.getId();
		String pw = dto.getPassword();
		String tel = dto.getTel();
		String birth = dto.getBirth();
		String gender = dto.getGender();
		String name = dto.getName();
		
		//그릇객체에 담아서 보내기
		StringBuffer sb = new StringBuffer();
		sb.append("insert into guest ");
		sb.append("values (?, ?, ?, ?, ?, ?)");
		
		//문장 객체를 통해서 감싸주기
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, tel);
			pstmt.setString(4, birth);
			pstmt.setString(5, gender);
			pstmt.setString(6, name);
			
			//실행
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//자원 반납
		finally {
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	}
	
}
