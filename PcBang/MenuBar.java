package PcBang;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuBar extends JFrame{
	int count = 0;
	String show = "";
	TextArea ta;
	Panel pSouth;
	Button bt1,bt2,bt3;
	
	
	
		public MenuBar() {
		setSize(700, 400);

		// 폰트
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		Font font_1 = new Font("함초롬돋움", Font.BOLD, 17);
		Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 22);
		// 중앙
		ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setText("   상품명        단가        수량        합계\n\n");
		ta.setBackground(Color.white);
//		ta.setEditable(false);
		ta.setFont(font1);

		// 남쪽

		pSouth = new Panel();
		pSouth.setFont(font);
		pSouth.setSize(100, 300);
		pSouth.setBackground(new Color(255, 255, 215));

		Button bt1 = new Button("Order");
		Button bt2 = new Button("Reset");
		Button bt3 = new Button("Cancel");

		pSouth.add(bt1);
		pSouth.add(bt2);
		pSouth.add(bt3);
		
		add(ta, BorderLayout.CENTER);
		add(pSouth, BorderLayout.SOUTH);
		setVisible(true);
}
//	public static void main(String[] args) {
//		new MenuBar();
//	}
}
