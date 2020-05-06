package PcBang;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import d20200110.SwingChatting;

public class SimSim  implements KeyListener, ActionListener{
	String[] str = { "오늘은 맛있는 핫도그 어때?", "나는 오늘 아아를 마시고 싶어*^^*", "어제 술을 마셨으면 라면을 먹자 !", "배가 고프니 볶은밥을 먹자", "짜증날땐 짜장면" 
			, "오늘은 달달한 카페라떼", "시원한 복숭아 딸기 아이스티", "추우니까 따뜻한 아메리카노먹고 싶어 ", "오늘 몸이 좀 안좋아서 율무차 어때? ㅠ-ㅠ"};
	JTextArea jta;
	JTextField jtf;
	JButton jbtn;

	// 컴포넌트를 부착할 패널
	JPanel jp; // 한구역에서 구역 구분하는 패널이 awt와 가장 큰 차이 !
	JScrollPane jsp;

	//생성자 설정
	public SimSim() {
//		super("메뉴 추천_심심이");
//		setBounds(300, 300, 600, 400);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jta = new JTextArea(); // frame - 부착

		jtf = new JTextField(" 심심아 메뉴추천 부탁해*^^*     "); // panel - 부착
		jbtn = new JButton("Insert"); // panel - 부착

		jp = new JPanel(); // textfield, button을 부착한 panel
		jsp = new JScrollPane(jta,		//스크룰이 jtarea를 소유하게 됌 
				jsp.VERTICAL_SCROLLBAR_AS_NEEDED, //필요하면 스크롤 나오고
				jsp.HORIZONTAL_SCROLLBAR_AS_NEEDED);	//수평으로 하게한다.
		
		//vertical : 수직의 , horizonral : 수평의
		
		
		//color : R(red), G(greeN) , B(blue)
		//			0~255
		
		Color c = new Color(110, 220, 243);
		
		jp.setBackground(Color.lightGray); // 패널에 색
		jta.setBackground(Color.white); // 텍스트 에리어에 색

		// 컨테이너에 컴포넌트를 부착
		//add(jta, "Center"); // 최초로 실행되면 나오는애 ! ->this
//		this.add(jsp,"Center");

		// 패널을 부착 - textfield와 button을 부착
		jp.add(jtf); // 패널에 텍스트 필드 부착
		jp.add(jbtn); // 패널에 버튼을 부착

//		this.add(jp, "South"); // 패널 부착하고+ 남쪽에 둠

		jtf.addKeyListener(this); // 텍스트필드에 키리스너
		jbtn.addActionListener(this); // 버튼에 누르면 하는 액션 리스터

//		setVisible(true);

		jtf.requestFocus(); // text area에 있던 커서를 텍스트필드로 옮기기 !

	}// 생성자 end

	public static void main(String[] args) {
		new SimSim();
	}// main end

	// 심심이가 말하기
	private void makeWord() {
		Random rmd = new Random();

		int value = rmd.nextInt(str.length);// 랜덤의 범위는 str길이까지
		// 이것을 jtarea에 출력해야함
		jta.append("심심이 : " + str[value] + "\n"); // append는 옆으로 축력됌

	}
	
	//사용자가 대화 처리
	private void appendData() {
		String txt = jtf.getText();	//텍스트필드에서 받은내용 = txt
		
		jta.append("사용자 : " +txt + "\n");	//사용자가 입력하면 그 내용을 jtarea에 노출
		makeWord();
		
	//	jtf.setText("");	//새로운내용 입력하면 지워줌
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode(); //-> 아스키코드로 들어옴
		
		if(key == e.VK_ENTER) {			//enter누르면 !(vk는 상수로 입력됌)
			appendData(); 		//data 노출시킨다.
			
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		appendData();
	}
}
