package PcBang;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JPasswordField;

public class JoinForm extends Frame implements ActionListener, ItemListener, Runnable {

	DTO dto = new DTO(); // 객체 생성
	Choice list; // 성별
	TextField in_id; // 아이디
	JPasswordField in_pw; // 비밀번호
	TextField in_name; // 이름
	TextField in_tel; // 번호
	TextField in_birth; // 생년월일
	Button b1; // 전송버튼
	String gender = ""; // 성별

	public JoinForm(String str) {

		super(str);

		init(); // init이라는 메소드 실행
		start(); // start라는 메소드 실행

		this.setLocation(100, 100);
		super.setVisible(true);
		super.setSize(300, 300); // 프레임의 처음 크기
		super.setResizable(true); // 프레임의 사이즈 조절 가능하다

	}// JOINFORM 생성자 종료

	public void init() {

		Panel p = new Panel();
		setLayout(new BorderLayout());
		Label id = new Label("아이디");
		Label password = new Label("비밀번호");
		Label name = new Label("이름");
		Label gender = new Label("성별");
		Label tel = new Label("전화번호");
		Label birth = new Label("생년월일");

		b1 = new Button("회원가입 하기");
		b1.addActionListener(this);

		in_id = new TextField(20);
		in_pw = new JPasswordField(20);
		in_name = new TextField(20);
		list = new Choice();
		list.add("성별을 선택하세요");
		list.add("여자");
		list.add("남자");
		in_tel = new TextField(20);
		in_birth = new TextField(20);

		GridLayout g = new GridLayout(6, 2);
		p.setLayout(g);
		p.add(id);
		p.add(in_id);
		p.add(password);
		p.add(in_pw);
		p.add(name);
		p.add(in_name);
		p.add(gender);
		p.add(list);
		p.add(tel);
		p.add(in_tel);
		p.add(birth);
		p.add(in_birth);

		add("Center", p);
		add("South", b1);

	} //init 생성자 종료( 보이는 프레임) 
	
public void start() {
	this.addWindowListener(new WindowAdapter() {
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}	
		
	});
}// 프로그램 종료 메소드 ! 
	
public static void main(String[] args) {
	JoinForm exam = new JoinForm("회원가입"); 
}	//main 종료
	

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}// 스레드

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}// 체크상태

	@Override
	public void actionPerformed(ActionEvent e) {
		 Object obj = e.getSource();
		 
		 //아이디 체크버튼 눌렀을때 
		 if((Button) obj == b1) {
			 dto.setId(in_id.getText());	//입력된 아이디 가져와 dto에 저장
			 dto.setPassword(in_pw.getText()); //입력된 비번 가져와 dto에 저장
			 dto.setName(in_name.getText());	//입력된 이름 가져와 dto에 저장
			 dto.setGender(list.getSelectedItem());	// 입력된 성별 가져와 dto에 저장
			 dto.setTel(in_tel.getText()); //입력된 번호 가져와 dto에 저장
			 dto.setBirth(in_birth.getText()); //입력된 생년월일 갖와 dto에 저장
			 
//		try {
//			insertDAO.create(dto);
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
			
		 }

	}//액션 이벤트
	



}
