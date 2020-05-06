package PcBang;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

import d20191227.Medic;

public class MainFrame extends JFrame implements ActionListener, KeyListener{
	JPanel  menuBar, paRandomSim, paMenu, paAddMenu, paOrderBox;
	JPanel paOrderButton;
	
	Color or = new Color(253, 82, 17);
	Color wh = new Color(254, 202, 182);
	Color bl = new Color(43, 43, 43);
	////
	//심심이용
	String[] str = { "오늘은 맛있는 핫도그 어때?", "나는 오늘 아아를 마시고 싶어*^^*", "어제 술을 마셨으면 라면을 먹자 !", "배가 고프니 볶은밥을 먹자", "짜증날땐 짜장면" 
			, "오늘은 달달한 카페라떼", "시원한 복숭아 딸기 아이스티", "추우니까 따뜻한 아메리카노먹고 싶어 ", "오늘 몸이 좀 안좋아서 율무차 어때? ㅠ-ㅠ"};
	JTextArea jta;
	JTextField jtf;
	JButton jbtn;
	JScrollPane jsp;
	JButton menubtn, menubtn_1, menubtn_2, menubtn_3;
	
	OrderBox box = new OrderBox();	//콤보박스 부분
	
	Menu menu = new Menu(); //메뉴부분 불러오기

	
	public MainFrame() {
		super("MainFrame");
		super.setBounds(150, 50, 1500, 1100);
		//super.setResizable(true); // 프레임의 사이즈 조절 가능하다
		super.setBackground(Color.black);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		jta = new JTextArea(); // frame - 부착
		jtf = new JTextField(" 심심이의 메뉴추천     "); // panel - 부착
		jtf.setHorizontalAlignment(JTextField.CENTER);
		jtf.setFont(new Font("나눔바른고딕", Font.BOLD, 35));
		jtf.setBackground(new Color(96,96,96));
		jtf.setForeground(Color.white);
		
		jbtn = new JButton("메뉴추천을 원하면 눌러주세요 "); // 버튼 부착
		jbtn.setBackground(or);
		jbtn.setForeground(Color.white);
		jbtn.setFont(new Font("나눔바른고딕", Font.BOLD, 20));
		
		paRandomSim = new JPanel(new BorderLayout());	//패널 부착, 설정
		paRandomSim.setBounds(0, 400, 400, 300);
		
		
		jsp = new JScrollPane(jta,		//스크룰이 jtarea를 소유하게 됌 
				jsp.VERTICAL_SCROLLBAR_AS_NEEDED, //필요하면 스크롤 나오고
				jsp.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		paRandomSim.setBackground(Color.lightGray);
		jta.setBackground(new Color(96,96,96)); // 텍스트 에리어에 색
//		this.add(jsp);
		
		add(paRandomSim);
		
		//패널에 텍스트필드와 버튼을 부착
//		paRandomSim.add(jta);
		
		paRandomSim.add(jsp, BorderLayout.CENTER);
		paRandomSim.add(jtf, BorderLayout.NORTH);
		paRandomSim.add(jbtn, BorderLayout.SOUTH);
	
		// 페널들 붗여넣기

		
		jtf.addKeyListener(this); // 텍스트필드에 키리스너
		jbtn.addActionListener(this); // 버튼에 누르면 하는 액션 리스터
		jtf.requestFocus(); // text area에 있던 커서를 텍스트필드로 옮기기 !
		
		
		menuBar = new JPanel();
		menuBar.setBounds(200, 0, 200, 400);
		menuBar.setBackground(Color.darkGray);
		menuBar.setLayout(null);
		
		menubtn = new JButton("음식");
		menubtn_1 = new JButton("핫도그");
		menubtn_2 = new JButton("과자");
		menubtn_3 = new JButton("음료");
		
		
		menubtn.setBounds(0, 0, 200, 100);
		menubtn_1.setBounds(0,100, 200, 100);
		menubtn_2.setBounds(0, 200, 200, 100);
		menubtn_3.setBounds(0, 300, 200, 100);
		
		
		menubtn.setBackground(new Color(253, 82, 17));
		menubtn.setForeground(Color.white);
		menubtn_1.setBackground(new Color(253, 82, 17));
		menubtn_1.setForeground(Color.white);
		menubtn_2.setBackground(new Color(253, 82, 17));
		menubtn_2.setForeground(Color.white);
		menubtn_3.setBackground(new Color(253, 82, 17));
		menubtn_3.setForeground(Color.white);
		menubtn.setFont(new Font("나눔바른고딕", Font.BOLD, 35));
		menubtn_1.setFont(new Font("나눔바른고딕", Font.BOLD, 35));
		menubtn_2.setFont(new Font("나눔바른고딕", Font.BOLD, 35));
		menubtn_3.setFont(new Font("나눔바른고딕", Font.BOLD, 35));
		
		menuBar.add(menubtn);
		menuBar.add(menubtn_1);
		menuBar.add(menubtn_2);
		menuBar.add(menubtn_3);
		
		add(menuBar);

		add(menu.pNorth);
		add(menu.pNorth_1);
		add(menu.pNorth_2);
		add(menu.pNorth_3);
		
		
		

		menubtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				menu.pNorth.setVisible(true);
				menu.pNorth_1.setVisible(false);
				menu.pNorth_2.setVisible(false);
				menu.pNorth_3.setVisible(false);
				
				System.out.println("oooo");
				
			}
		});
		
		menubtn_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				menu.pNorth.setVisible(false);
				menu.pNorth_1.setVisible(true);
				menu.pNorth_2.setVisible(false);
				menu.pNorth_3.setVisible(false);
				System.out.println("sss");
			}
		});
		
		menubtn_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.pNorth.setVisible(false);
				menu.pNorth_1.setVisible(false);
				menu.pNorth_2.setVisible(true);
				menu.pNorth_3.setVisible(false);
				
			}
		});
		
		menubtn_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menu.pNorth.setVisible(false);
				menu.pNorth_1.setVisible(false);
				menu.pNorth_2.setVisible(false);
				menu.pNorth_3.setVisible(true);
				
			}
		});
		
		paAddMenu = new JPanel();
		paAddMenu.setBounds(0, 700, 700, 400);
		paAddMenu.setBackground(Color.blue);
		paAddMenu.add(menu.pSouth);
		paAddMenu.add(menu.ta);

		add(paAddMenu);
		/////콤보박스 존 -Orderbox box
		paOrderBox = new JPanel();
		paOrderBox.setBounds(700, 700, 400, 400);
//		paOrderBox.add(box.alljp);
		paOrderBox.add(box.jl);	//맨위 라벨 붙이기
		paOrderBox.add(box.jrbs[0]);
		paOrderBox.add(box.jrbs[1]);
		paOrderBox.add(box.jrbs[2]);
		
		paOrderBox.add(box.combox);
		
		paOrderBox.add(box.jta);
		paOrderBox.add(box.jtf);
		paOrderBox.add(box.jbtn1);
		paOrderBox.setBackground(Color.darkGray);
		add(paOrderBox);

		
		//버튼존
		
		paOrderButton = new JPanel();
		
		paOrderButton.setBackground(Color.darkGray);
		paOrderButton.setBounds(1100, 700, 400, 400);
		paOrderButton.add(menu.pricearea);
		paOrderButton.add(menu.wonlabel);
		paOrderButton.add(menu.orderbtn);
		add(paOrderButton);

		
//		paOrderButton.add(order.jta);
//		paOrderButton.add(order.jlb);
		

		
		
		
		

		
		
		
		setVisible(true);
		this.setResizable(true); // 프레임의 사이즈 조절 가능하다
		
	

	}

	public static void main(String[] args) {
		new MainFrame();
	}

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
		appendData();
	
		
		
	
		
		
	}


}
