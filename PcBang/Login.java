package PcBang;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import d20200117.MakeConnection;

	//로그인 여부 확인
public class Login extends JFrame implements ActionListener{
		
		
		JButton jbtn1, jbtn2, jbtn3;
		JLabel jlb1, jlb2;
		JTextField jtf1;
		JPasswordField jpf;
		JoinForm join;
		public Login() {
			super("java login test");
			setBounds(1100, 300, 400, 400);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLayout(null);
			
			jbtn1 = new JButton("Login");
			jbtn2 = new JButton("Cancel");
			jbtn3 = new JButton("회원가입");
			
			jbtn1.setBounds(270, 60, 80, 40);
			jbtn2.setBounds(270, 130, 80, 40);
			jbtn3.setBounds(100, 200, 150, 40);
			
			add(jbtn1); add(jbtn2); add(jbtn3);
			
			
			
			jlb1 = new JLabel("I D");
			jlb2 = new JLabel("P W");
			
			jlb1.setBounds(30, 60, 70, 40);
			jlb2.setBounds(30, 120, 70, 40);
			
			add(jlb1); add(jlb2);
			
			jtf1 = new JTextField(30);
			jpf = new JPasswordField(30);
			
			jtf1.setBounds(100, 60, 150, 40);
			jpf.setBounds(100, 130, 150, 40);
			
			
			add(jtf1); add(jpf);
			
			jbtn1.addActionListener(this);
			jbtn2.addActionListener(this);
			jbtn3.addActionListener(this);
			
			
			
			
			
			
			
			setVisible(true);
		}
		
		
		
		
	public static void main(String[] args) {
		new Login();
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Object obj = e.getSource();
			
			if(obj==jbtn1) {
				//dbms에 접근해서 id, pw가 일치하는지 확인 (비교)
				//System.out.println("click");
				//사용자 입력 받아오기
				
				String id = jtf1.getText(); //jtf 텍스트 가져오기
				String pw = jpf.getText();
				
				//System.out.println("id : "+id+ ", pw : "+pw);
				//dbms에 접근해서 id, pw가 일치하는지 확인(비교)
				Connection conn = PcBang.MakeConnection.getConnection();
				
				StringBuffer sb = new StringBuffer();
				sb.append("select * from guest ");
				sb.append("where id = ? and password = ?");
				
				
				PreparedStatement pstmt = null;
				ResultSet rs = null;	//rs -> 데이터베이스에 있는 문장 !!@
				
				try {
					pstmt = conn.prepareStatement(sb.toString());
					pstmt.setString(1, id);
					pstmt.setString(2, pw);
				
				rs = pstmt.executeQuery();
				
				//간단한 회원여부 check
				if(rs.next()) {
					System.out.println("존재하는 회원이다.");
					System.out.println(rs.getString("name") + "님 어서오세요"); //db row 통째로 주므로
					new MainFrame();
					this.setVisible(false);
					
				}else {
					System.out.println("회원가입 하세요");
				}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}else if (obj==jbtn2) {
				//회원가입창으로 이동(호출)
				
				System.out.println("회원가입 하세요");
				System.exit(0);
				
			}else if (obj==jbtn3) {
				new JoinForm("회원가입하세요");
				this.setVisible(false);
			}
		}
}
