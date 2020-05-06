package PcBang;

import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class OrderBox implements ItemListener,  KeyListener{
	
	
	JLabel jl,jlbtn;
	Container cp;
	String[] str = { "선불(현금)", "충전시간 차감", "카드결제" };
	String[] strsun = {"                      -----선택해주세요-----                      ","현금영수증 신청", "현금영수증 신청하지 않음","즉시차감","즉시 카드결제", "퇴실시 카드결제"};
	String[] money = {"현금영수증 신청","현금 영수증 신청 안함"};
	//	JPanel alljp;
	JRadioButton[] jrbs = new JRadioButton[3];
	JTextArea jta;
	JTextField jtf;
	JButton jbtn1;
	JComboBox combox = new JComboBox();

	public OrderBox() {
//		super("Order Box");
//		setBounds(700, 700, 400, 400);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
////		
//		setLayout(null);
//		alljp = new JPanel();	//판낼 생성
//		alljp.setBounds(0, 0, 400, 400);
//		alljp.setBackground();

		
//		this.add(alljp); //모두를 붙일 큰 팬널


	
		
		//라벨 생성하기
		jl = new JLabel("\t☞상품판매 결제 선택하기");
		jl.setPreferredSize(new Dimension(400, 40));
		jl.setBackground(Color.black);	//판넬의 색깔 설정.
		jl.setForeground(Color.white);
		jl.setOpaque(true);
//		jl.setHorizontalAlignment(JLabel.CENTER);
		
//		alljp.add(jl);	//이름 라벨 붙익
		
		
		
		//선택지 만들기.
		ButtonGroup group = new ButtonGroup();
		
		for (int i = 0; i < jrbs.length; i++) {
			jrbs[i] = new JRadioButton(str[i]); // 라디오는 = 라디오버튼 선언해주면서 단어들 넣어줌
			jrbs[i].setOpaque(false); // 라디오의 불투명도
			group.add(jrbs[i]); // 라디오 버튼 한개씩만 묶이게 설정을 해준다.
//			alljp.add(jrbs[i]);
			jrbs[i].setForeground(Color.black);
			jrbs[i].addItemListener(this);
			
		}
		
		jrbs[0].setPreferredSize(new Dimension(400, 30));
		jrbs[0].setHorizontalAlignment(JRadioButton.CENTER);
		jrbs[1].setPreferredSize(new Dimension(400, 30));
		jrbs[1].setHorizontalAlignment(JRadioButton.CENTER);
		jrbs[2].setPreferredSize(new Dimension(400, 30));
		jrbs[2].setHorizontalAlignment(JRadioButton.CENTER);
		
	
		jrbs[0].setSelected(true); 	//처음에 선택된것 넣어놓게 해줌
		
		
		
		
		
		combox = new JComboBox(strsun);	//콤보박스에 리스트 넣어서 만듬
		combox.setForeground(Color.black);
		
		
		

//		alljp.add(combox);
		
		jta = new JTextArea("");
		jta.setPreferredSize(new Dimension(400,130));
		jta.setBackground(Color.lightGray);
//		jta.setBounds(0, 700, 400, 100);
//		alljp.add(jta);
		
		jtf= new JTextField("주문시 요청사항을 입력해 주세요 ^^");
		jtf.setPreferredSize(new Dimension(300,30));
		jtf.setBackground(Color.gray);
//		alljp.add(jtf);
		
		jbtn1 = new JButton("요청");
		jbtn1.setFont(new Font("함초롬돋움",Font.BOLD, 10));
		jbtn1.setPreferredSize(new Dimension(60,30));
//		alljp.add(jbtn1);
		jbtn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				appendData(); 		//버튼 누르면 appendData 실행 ! 
				
			}
		});
		
		jtf.addKeyListener(this);
		jtf.requestFocus();
		
		
		
		
//
//		setVisible(true);
	}
	
public static void main(String[] args) {
	new OrderBox();
}

//사용자가 대화 처리
	private void appendData() {
		String txt = jtf.getText();	//텍스트필드에서 받은내용 = txt
		
		jta.append("사용자 : " +txt + "\n");	//사용자가 입력하면 그 내용을 jtarea에 노출

		
		jtf.setText("");	//새로운내용 입력하면 지워줌
	}
	// TODO Auto-generated method stub
	


@Override
public void itemStateChanged(ItemEvent e) {
	Object obj = e.getSource();
	if(obj ==jrbs[0]) {
//		combox.setSelectedIndex(0);
//		combox.setSelectedIndex(1);
//		combox.setSelectedIndex(2);
//		combox.setSelectedIndex(3);
//		combox.setSelectedIndex(4);
//		combox.setSelectedIndex(5);
		
		
	}
	
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

//@Override
//public void keyReleased(KeyEvent e) {
//	// TODO Auto-generated method stub
//	
//}



}
