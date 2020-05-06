package PcBang;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Menu {
	int count = 0;
	String show = "";
	Color or = new Color(253, 82, 17);
	Color wh = new Color(254, 202, 182);
	Color bl = new Color(43, 43, 43);
	/// 밥류
	Panel pNorth = new Panel();
	String menu[] = { " 김치 볶음밥 ", "  치킨마요  ", " 왕 돈까스 ", " 숯불 덮밥 ", "   라면    ", "  만두라면  ", "  짜파게티  ", "   쫄면   " };
	ImageIcon[] img = { new ImageIcon("src/food/bokum.jpg"), new ImageIcon("src/food/chicken.jpg"),
			new ImageIcon("src/food/donga.jpg"), new ImageIcon("src/food/fire.jpg"),
			new ImageIcon("src/food/raman.jpg"), new ImageIcon("src/food/mandu.jpg"),
			new ImageIcon("src/food/jajang.jpg"), new ImageIcon("src/food/jol.jpg") };

	int price[] = { 4500, 5000, 5500, 5000, 3500, 4500, 4000, 4000 };

	JButton bt[] = new JButton[menu.length];
	JLabel name[] = new JLabel[menu.length];
	TextField suja[] = new TextField[menu.length];
	Button minus[] = new Button[menu.length];
	Button plus[] = new Button[menu.length];
	JButton ok[] = new JButton[menu.length];
	Label l[] = new Label[menu.length];
	ImageIcon icon[] = new ImageIcon[menu.length];
	
	
	
	/// 핫도그
			Panel pNorth_1 = new Panel();
			String menu_1[] = { "매콤 핫도그 ", "갈릭 핫도그 ", "기본 핫도그 ", "피자 핫도그 ", "  감자튀김  " , " 소시지 x2 ", "  물만두   ",
			"  치즈 추가  " };
			ImageIcon[] img_1 = { new ImageIcon("src/food/chee.jpg"), new ImageIcon("src/food/galic.jpg"),
					new ImageIcon("src/food/origin.jpg"), new ImageIcon("src/food/pizza.jpg"),
					new ImageIcon("src/food/kam.jpg"), new ImageIcon("src/food/sose.jpg"),
					new ImageIcon("src/food/mul.jpg"), new ImageIcon("src/food/cheez.jpg") };
			
			int price_1[] = { 3000, 3000, 2500, 3500, 3000, 3000, 3000, 500 };
			
			JButton bt_1[] = new JButton[menu_1.length];
			JLabel name_1[] = new JLabel[menu_1.length];
			TextField suja_1[] = new TextField[menu_1.length];
			Button minus_1[] = new Button[menu_1.length];
			Button plus_1[] = new Button[menu_1.length];
			JButton ok_1[] = new JButton[menu_1.length];
			Label l_1[] = new Label[menu_1.length];
			ImageIcon icon_1[] = new ImageIcon[menu_1.length];
			
			
	//과자
			Panel pNorth_2 = new Panel();
			String menu_2[] = { "  에이스  ", " 츄러스   ", " 꼬북 칩  ", " 홈런 볼  ", "  오잉    " , " 새우 깡   ", "오징어 과자 ",
			" 초코송이  " };
			ImageIcon[] img_2 = { new ImageIcon("src/food/ace.jpg"), new ImageIcon("src/food/churo.jpg"),
					new ImageIcon("src/food/cobuk.jpg"), new ImageIcon("src/food/homrun.jpg"),
					new ImageIcon("src/food/oing.jpg"), new ImageIcon("src/food/sau.jpg"),
					new ImageIcon("src/food/snack.jpg"), new ImageIcon("src/food/song.jpg") };

			int price_2[] = { 1000, 1500, 1500, 1500, 1500, 1500, 1500, 1000 };

			JButton bt_2[] = new JButton[menu_2.length];
			JLabel name_2[] = new JLabel[menu_2.length];
			TextField suja_2[] = new TextField[menu_2.length];
			Button minus_2[] = new Button[menu_2.length];
			Button plus_2[] = new Button[menu_2.length];
			JButton ok_2[] = new JButton[menu_2.length];
			Label l_2[] = new Label[menu_2.length];
			ImageIcon icon_2[] = new ImageIcon[menu_2.length];
	
	//음료
			
			Panel pNorth_3 = new Panel();
			String menu_3[] = { " 아메리카노 ", "  라떼    ", " 바닐라 라떼", "자몽 에이드 ", "레몬 에이드 " , "초코 라떼  ", "  콜라    ",
			" 사이다    " };
			ImageIcon[] img_3 = { new ImageIcon("src/food/ICE.jpg"), new ImageIcon("src/food/latte.jpg"),
					new ImageIcon("src/food/vanila.jpg"), new ImageIcon("src/food/jamong.jpg"),
					new ImageIcon("src/food/blue.jpg"), new ImageIcon("src/food/choco.jpg"),
					new ImageIcon("src/food/coke.jpg"), new ImageIcon("src/food/sida.jpg") };

			int price_3[] = { 2500, 3000, 3500, 2500, 2500, 3000, 1000, 1000};

			JButton bt_3[] = new JButton[menu_3.length];
			JLabel name_3[] = new JLabel[menu_3.length];
			TextField suja_3[] = new TextField[menu_3.length];
			Button minus_3[] = new Button[menu_3.length];
			Button plus_3[] = new Button[menu_3.length];
			JButton ok_3[] = new JButton[menu_3.length];
			Label l_3[] = new Label[menu_3.length];
			ImageIcon icon_3[] = new ImageIcon[menu_3.length];
			
			
			
			
			
			
			

	// 배열 설정 부분

	TextArea ta = new TextArea();
	Panel pSouth = new Panel();
	Button bt1, bt2, bt3 = new Button();
	JLabel orderjl = new JLabel();

	JButton orderbtn;
	JTextArea pricearea;
	JLabel wonlabel;

	int all = 0;



///////////////////////////////////////////////////////////////////////	
	public Menu() {

		// 폰트
		Font font = new Font("나눔바른고딕", Font.PLAIN, 18);
		Font font_1 = new Font("나눔바른고딕", Font.BOLD, 17);
		Font font1 = new Font("나눔바른고딕", Font.BOLD, 22);

//// 북쪽 - 밥류

		pNorth.setLayout(null);
		pNorth.setBounds(400, 0, 1100, 700);
		pNorth.setFont(font_1);
		pNorth.setBackground(Color.black);

		// 버튼 설정 부분
		for (int i = 0; i < menu.length; i++) {

			// 햄버거 버튼
			bt[i] = new JButton(img[i]);
			bt[i].setContentAreaFilled(false); // 테두리 색깔 지우기

			if (i < 4) {
				bt[i].setBounds(25 + i * 260, 50, 250, 170); // 맨위에 4개 !
			} else {
				bt[i].setBounds(25 + (i - 4) * 260, 350, 250, 170);
			}

			// 숫자 txt 버튼 -->가격표시 부분 담으면 가격이 올라감 (suja)

			suja[i] = new TextField("0");
			suja[i].setBackground(bl);
			suja[i].setForeground(Color.white);
			suja[i].setEditable(false);
			suja[i].setBounds(bt[i].getX() + 20, bt[i].getY() + 200, 20, 25);

			// 음식 이름표

			name[i] = new JLabel(menu[i]);
			name[i].setForeground(Color.white);
			name[i].setBackground(bl);
			name[i].setBounds(bt[i].getX(), suja[i].getY() - 27, 250, 25);
			//name[i].setEnabled(false);
			name[i].setHorizontalAlignment(JLabel.CENTER);
			
			name[i].setOpaque(true);

			

			// "-" 버튼
			minus[i] = new Button("-");
			minus[i].setBounds(bt[i].getX(), suja[i].getY(), 20, 25);
			minus[i].setBackground(Color.white);
			minus[i].setForeground(Color.black);
			minus[i].setEnabled(true);

			// "+" 버튼
			plus[i] = new Button("+");
			plus[i].setBounds(bt[i].getX() + 40, suja[i].getY(), 20, 25);
			plus[i].setBackground(Color.white);
			plus[i].setForeground(Color.black);
			plus[i].setEnabled(true);

			// 가격
			l[i] = new Label(price[i] + "￦");
			l[i].setBounds(bt[i].getX() + 60, suja[i].getY(), 130, 25);
			l[i].setFont(font_1);
			l[i].setBackground(bl);
			l[i].setForeground(or);

			// 확인 버튼
			ok[i] = new JButton("확인");
			ok[i].setBackground(Color.white);
			ok[i].setForeground(Color.black);
			ok[i].setBounds(bt[i].getX() + 190, suja[i].getY(), 60, 25);
			ok[i].setEnabled(false);

			pNorth.add(bt[i]);
			pNorth.add(suja[i]);
			pNorth.add(minus[i]);
			pNorth.add(plus[i]);
			pNorth.add(l[i]);
			pNorth.add(ok[i]);
			pNorth.add(name[i]);

		} //// 여기까지 메뉴판 윗부분

		// 북쪽	-	 핫도그

					pNorth_1.setLayout(null);
					pNorth_1.setBounds(400, 0, 1100, 700);
					pNorth_1.setFont(font_1);
					pNorth_1.setBackground(Color.BLACK);

					// 버튼 설정 부분
					for (int i = 0; i < menu_1.length; i++) {

					// 햄버거 버튼
					bt_1[i] = new JButton(img_1[i]);
					bt_1[i].setContentAreaFilled(false);	//테두리 색깔 지우기
						
					if (i < 4) {
							bt_1[i].setBounds(25 + i * 260, 50, 250, 170); // 맨위에 4개 !
						} else {
							bt_1[i].setBounds(25 + (i - 4) * 260, 350, 250, 170);
						}

						// 숫자 txt 버튼 -->가격표시 부분 담으면 가격이 올라감 (suja)

						suja_1[i] = new TextField("0");
						suja_1[i].setBackground(bl);
						suja_1[i].setForeground(Color.white);
						suja_1[i].setEditable(false);
						suja_1[i].setBounds(bt_1[i].getX() + 20, bt_1[i].getY() + 200, 20, 25);
						
						//음식 이름표
						
						name_1[i] = new JLabel(menu_1[i]);
						name_1[i].setBackground(bl);
						name_1[i].setForeground(Color.white);
						name_1[i].setBounds(bt_1[i].getX(), suja_1[i].getY()-27, 250, 25);
						//name_1[i].setEnabled(false);
						name_1[i].setHorizontalAlignment(JLabel.CENTER);
						name_1[i].setOpaque(true);
						
						
						// "-" 버튼
						minus_1[i] = new Button("-");
						minus_1[i].setBounds(bt_1[i].getX(), suja_1[i].getY(), 20, 25);
						minus_1[i].setBackground(Color.white);
						minus_1[i].setForeground(Color.black);
						minus_1[i].setEnabled(true);

						// "+" 버튼
						plus_1[i] = new Button("+");
						plus_1[i].setBounds(bt_1[i].getX() +40, suja_1[i].getY(), 20, 25);
						plus_1[i].setBackground(Color.white);
						plus_1[i].setForeground(Color.black);
						plus_1[i].setEnabled(true);

						// 가격
						l_1[i] = new Label(price_1[i] + "￦");
						l_1[i].setBounds(bt_1[i].getX() + 60, suja_1[i].getY(), 130, 25);
						l_1[i].setFont(font_1);
						l_1[i].setBackground(bl);
						l_1[i].setForeground(or);

						// 확인 버튼
						ok_1[i] = new JButton("확인");
						ok_1[i].setBackground(Color.white);
						ok_1[i].setForeground(Color.black);
						ok_1[i].setBounds(bt_1[i].getX()+190, suja_1[i].getY(), 60, 25);
						ok_1[i].setEnabled(false);

						pNorth_1.add(bt_1[i]);
						pNorth_1.add(suja_1[i]);
						pNorth_1.add(minus_1[i]);
						pNorth_1.add(plus_1[i]);
						pNorth_1.add(l_1[i]);
						pNorth_1.add(ok_1[i]);
						pNorth_1.add(name_1[i]);
						
					
					} //// 여기까지 메뉴판 윗부분	
					
				//// 북쪽 - 과자

					pNorth_2.setLayout(null);
					pNorth_2.setBounds(400, 0, 1100, 700);
					pNorth_2.setFont(font_1);
					pNorth_2.setBackground(Color.BLACK);
					// 버튼 설정 부분
					for (int i = 0; i < menu_2.length; i++) {

						// 햄버거 버튼
						bt_2[i] = new JButton(img_2[i]);
						bt_2[i].setContentAreaFilled(false); // 테두리 색깔 지우기

						if (i < 4) {
							bt_2[i].setBounds(25 + i * 260, 50, 250, 170); // 맨위에 4개 !
						} else {
							bt_2[i].setBounds(25 + (i - 4) * 260, 350, 250, 170);
						}

						// 숫자 txt 버튼 -->가격표시 부분 담으면 가격이 올라감 (suja)

						suja_2[i] = new TextField("0");
						suja_2[i].setBackground(bl);
						suja_2[i].setForeground(Color.white);
						suja_2[i].setEditable(false);
						suja_2[i].setBounds(bt_2[i].getX() + 20, bt_2[i].getY() + 200, 20, 25);

						// 음식 이름표

						name_2[i] = new JLabel(menu_2[i]);
						//name_2[i].setForeground(Color.BLACK);
						name_2[i].setBounds(bt_2[i].getX(), suja_2[i].getY() - 27, 250, 25);
						//name_2[i].setEnabled(false);
						name_2[i].setHorizontalAlignment(JLabel.CENTER);
						name_2[i].setOpaque(true);

						name_2[i].setBackground(bl);
						name_2[i].setForeground(Color.white);

						// "-" 버튼
						minus_2[i] = new Button("-");
						minus_2[i].setBackground(Color.white);
						minus_2[i].setForeground(Color.black);
						minus_2[i].setBounds(bt_2[i].getX(), suja_2[i].getY(), 20, 25);
						minus_2[i].setEnabled(true);

						// "+" 버튼
						plus_2[i] = new Button("+");
						plus_2[i].setBackground(Color.white);
						plus_2[i].setForeground(Color.black);
						plus_2[i].setBounds(bt_2[i].getX() + 40, suja_2[i].getY(), 20, 25);
						plus_2[i].setEnabled(true);

						// 가격
						l_2[i] = new Label(price_2[i] + "￦");
						l_2[i].setBounds(bt_2[i].getX() + 60, suja_2[i].getY(), 130, 25);
						l_2[i].setFont(font_1);
						l_2[i].setBackground(bl);
						l_2[i].setForeground(or);

						// 확인 버튼
						ok_2[i] = new JButton("확인");
						ok_2[i].setBackground(Color.white);
						ok_2[i].setForeground(Color.black);
						ok_2[i].setBounds(bt_2[i].getX() + 190, suja_2[i].getY(), 60, 25);
						ok_2[i].setEnabled(false);

						pNorth_2.add(bt_2[i]);
						pNorth_2.add(suja_2[i]);
						pNorth_2.add(minus_2[i]);
						pNorth_2.add(plus_2[i]);
						pNorth_2.add(l_2[i]);
						pNorth_2.add(ok_2[i]);
						pNorth_2.add(name_2[i]);

					} //// 여기까지 메뉴판 윗부분
					
					
					
				//// 북쪽 - 음료

					pNorth_3.setLayout(null);
					pNorth_3.setBounds(400, 0, 1100, 700);
					pNorth_3.setFont(font_1);
					pNorth_3.setBackground(Color.BLACK);
					// 버튼 설정 부분
					for (int i = 0; i < menu_3.length; i++) {

						// 햄버거 버튼
						bt_3[i] = new JButton(img_3[i]);
						bt_3[i].setContentAreaFilled(false); // 테두리 색깔 지우기

						if (i < 4) {
							bt_3[i].setBounds(25 + i * 260, 50, 250, 170); // 맨위에 4개 !
						} else {
							bt_3[i].setBounds(25 + (i - 4) * 260, 350, 250, 170);
						}

						// 숫자 txt 버튼 -->가격표시 부분 담으면 가격이 올라감 (suja)

						suja_3[i] = new TextField("0");
						suja_3[i].setBackground(bl);
						suja_3[i].setForeground(Color.white);
						suja_3[i].setEditable(false);
						suja_3[i].setBounds(bt_3[i].getX() + 20, bt_3[i].getY() + 200, 20, 25);

						// 음식 이름표

						name_3[i] = new JLabel(menu_3[i]);
						//name_3[i].setForeground(Color.BLACK);
						name_3[i].setBounds(bt_3[i].getX(), suja_3[i].getY() - 27, 250, 25);
						//name_3[i].setEnabled(false);
						name_3[i].setHorizontalAlignment(JLabel.CENTER);
						name_3[i].setOpaque(true);

						name_3[i].setBackground(bl);
						name_3[i].setForeground(Color.white);


						// "-" 버튼
						minus_3[i] = new Button("-");
						minus_3[i].setBounds(bt_3[i].getX(), suja_3[i].getY(), 20, 25);
						minus_3[i].setBackground(Color.white);
						minus_3[i].setForeground(Color.black);
						minus_3[i].setEnabled(true);

						// "+" 버튼
						plus_3[i] = new Button("+");
						plus_3[i].setBackground(Color.white);
						plus_3[i].setForeground(Color.black);
						plus_3[i].setBounds(bt_3[i].getX() + 40, suja_3[i].getY(), 20, 25);
						plus_3[i].setEnabled(true);

						// 가격
						l_3[i] = new Label(price_3[i] + "￦");
						l_3[i].setBounds(bt_3[i].getX() + 60, suja_3[i].getY(), 130, 25);
						l_3[i].setFont(font_1);
						l_3[i].setBackground(bl);
						l_3[i].setForeground(or);

						// 확인 버튼
						ok_3[i] = new JButton("확인");
						ok_3[i].setBackground(Color.white);
						ok_3[i].setForeground(Color.black);
						ok_3[i].setBounds(bt_3[i].getX() + 190, suja_3[i].getY(), 60, 25);
						ok_3[i].setEnabled(false);

						pNorth_3.add(bt_3[i]);
						pNorth_3.add(suja_3[i]);
						pNorth_3.add(minus_3[i]);
						pNorth_3.add(plus_3[i]);
						pNorth_3.add(l_3[i]);
						pNorth_3.add(ok_3[i]);
						pNorth_3.add(name_3[i]);

					} //// 여기까지 메뉴판 윗부분
///////오른쪽 하단(가격나오기 + 주문버튼 누르기)			

		// 주문 금액과 확인 버튼

		pricearea = new JTextArea("\n\n\n\n");
		pricearea.setPreferredSize(new Dimension(300, 150));
		pricearea.setFont(new Font("합초롱돋움", font.BOLD, 100));
		pricearea.setBackground(Color.darkGray);
		pricearea.setForeground(Color.white);

		wonlabel = new JLabel("원");
		wonlabel.setSize(100, 150);
		wonlabel.setBackground(Color.DARK_GRAY);
		wonlabel.setForeground(Color.white);
		wonlabel.setFont(new Font("함초롬돋움", Font.BOLD, 40));

		orderbtn = new JButton("상품 주문하기");
		orderbtn.setPreferredSize(new Dimension(400, 200));
		orderbtn.setBackground(Color.red);
		orderbtn.setForeground(Color.white);
		orderbtn.setFont(new Font("함초롬돋움", Font.BOLD, 60));

//////////////////////////////왼쪽 하단(상품 담은 목록들 나오기)///////////////////////////////////				
		// 남쪽

		pSouth = new Panel();
		pSouth.setFont(font);

		pSouth.setSize(100, 300);
		pSouth.setBackground(new Color(255, 255, 215));

		orderjl = new JLabel("상품 주문 목록");

		Button bt1 = new Button("Order");

		Button bt2 = new Button("Cancel");

		pSouth.add(orderjl);
		pSouth.add(bt1);
		pSouth.add(bt2);

		// 중앙
		ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setText("           상품명        가격        수량          합계\n\n");
		ta.setBackground(Color.white);

		ta.setFont(font1);

		// 초기화 버튼
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < menu.length; i++) {
					bt[i].setEnabled(true);
					minus[i].setEnabled(false);
					plus[i].setEnabled(false);
					suja[i].setText("0");
					ta.setText("           상품명        가격        수량          합계\n\n");

				}
			}
		});

		// bt3 닫기버튼
		
		bt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

// 이벤트단 상품 더하기 상품빼기 상품 확인하기 ! 
		for (int i = 0; i < menu.length; i++) {
			int j = i;

			// "-" 버튼 이벤트
			minus[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if (count > 0) {
						count = count - 1;
						suja[j].setText(count + "");
						ok[j].setEnabled(true);
					} else {
						minus[j].setEnabled(false);
					}
				}
			});
			
			minus_1[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if (count > 0) {
						count = count - 1;
						suja_1[j].setText(count + "");
						ok_1[j].setEnabled(true);
					} else {
						minus_1[j].setEnabled(false);
					}
				}
			});
			
			minus_2[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if (count > 0) {
						count = count - 1;
						suja_2[j].setText(count + "");
						ok_2[j].setEnabled(true);
					} else {
						minus_2[j].setEnabled(false);
					}
				}
			});
			
			minus_3[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if (count > 0) {
						count = count - 1;
						suja_3[j].setText(count + "");
						ok_3[j].setEnabled(true);
					} else {
						minus_3[j].setEnabled(false);
					}
				}
			});

// "+" 버튼 이벤트
			plus[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					count = count + 1;
					suja[j].setText(count + "");
					ok[j].setEnabled(true);
					if (count > 0) {
						minus[j].setEnabled(true);
					}
				}
			});
			
			plus_1[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					count = count + 1;
					suja_1[j].setText(count + "");
					ok_1[j].setEnabled(true);
					if (count > 0) {
						minus_1[j].setEnabled(true);
					}
				}
			});plus_2[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					count = count + 1;
					suja_2[j].setText(count + "");
					ok_2[j].setEnabled(true);
					if (count > 0) {
						minus_2[j].setEnabled(true);
					}
				}
			});plus_3[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					count = count + 1;
					suja_3[j].setText(count + "");
					ok_3[j].setEnabled(true);
					if (count > 0) {
						minus_3[j].setEnabled(true);
					}
				}
			});

// 확인 버튼 이벤트
			ok[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					show = bt[j].getActionCommand();

					ta.append("         " + menu[j] + "     " + price[j] + "        " + count + "          "
							+ price[j] * count + "원" + "\n");
					ok[j].setEnabled(false);
					all += (price[j] * count);

					count = 0;

				}
			});
			ok_1[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					show = bt_1[j].getActionCommand();

					ta.append("         " + menu_1[j] + "     " + price_1[j] + "        " + count + "          "
							+ price_1[j] * count + "원" + "\n");
					ok_1[j].setEnabled(false);
					all += (price_1[j] * count);

					count = 0;

				}
			});ok_2[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					show = bt_2[j].getActionCommand();

					ta.append("         " + menu_2[j] + "     " + price_2[j] + "        " + count + "          "
							+ price_2[j] * count + "원" + "\n");
					ok_2[j].setEnabled(false);
					all += (price_2[j] * count);

					count = 0;

				}
			});ok_3[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					show = bt_3[j].getActionCommand();

					ta.append("         " + menu_3[j] + "     " + price_3[j] + "        " + count + "          "
							+ price_3[j] * count + "원" + "\n");
					ok_3[j].setEnabled(false);
					all += (price_3[j] * count);

					count = 0;

				}
			});

		} // for문 종료 
		all += all;
// 주문버튼 가격뜨게 만들게
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(all);
				
				String str = String.valueOf(all);
				pricearea.setText(str);
			}
		});//bt1 actionlistner 종료


		/// cancel눌렀을때 초기화.
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < menu.length; i++) {
					ta.setFont(font1);
					bt[i].setEnabled(true);
					minus[i].setEnabled(true);
					plus[i].setEnabled(true);
					suja[i].setText("0");
					
					bt_1[i].setEnabled(true);
					minus_1[i].setEnabled(true);
					plus_1[i].setEnabled(true);
					suja_1[i].setText("0");
					
					bt_2[i].setEnabled(true);
					minus_2[i].setEnabled(true);
					plus_2[i].setEnabled(true);
					suja_2[i].setText("0");
					
					bt_3[i].setEnabled(true);
					minus_3[i].setEnabled(true);
					plus_3[i].setEnabled(true);
					suja_3[i].setText("0");
					
					ta.setText("         상품명        단가        수량        합계\n\n");

				}

			}
		});	//bt2 actionlistner

///// 상품주문하기 버튼 눌렀을때 팝업 메시지
		orderbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, ta.getText() + "\n" + all + "원이 주문이 되었습니다.\n      감사합니다.");
				for (int i = 0; i < menu.length; i++) {
					ta.setFont(font1);
					bt[i].setEnabled(true);
					minus[i].setEnabled(true);
					plus[i].setEnabled(true);
					suja[i].setText("0");
					
					bt_1[i].setEnabled(true);
					minus_1[i].setEnabled(true);
					plus_1[i].setEnabled(true);
					suja_1[i].setText("0");
					
					bt_2[i].setEnabled(true);
					minus_2[i].setEnabled(true);
					plus_2[i].setEnabled(true);
					suja_2[i].setText("0");
					
					bt_3[i].setEnabled(true);
					minus_3[i].setEnabled(true);
					plus_3[i].setEnabled(true);
					suja_3[i].setText("0");
					ta.setText("         상품명        단가        수량        합계\n\n");
					pricearea.setText("");
					
				}
				
			}
		});//orderbtn action listner end
	}//생성자 end

}//class end
