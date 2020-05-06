package PcBang;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.text.StyledEditorKit.BoldAction;

public class Order {
	JButton orderbtn;
	JTextArea pricearea;
	JLabel wonlabel;
	
	public Order() {
//		super("상품 주문하기");
//		setBounds(300, 300, 600, 400);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		pricearea = new JTextArea("\n\n\n\n");
		pricearea.setPreferredSize(new Dimension(300,150));
		pricearea.setBackground(Color.darkGray);
		pricearea.setForeground(Color.white);
		
		wonlabel = new JLabel("원");
		wonlabel.setSize(100, 150);
		wonlabel.setBackground(Color.DARK_GRAY);
		wonlabel.setForeground(Color.white);
		wonlabel.setFont(new Font("함초롬돋움", Font.BOLD, 40));
		

		
		orderbtn = new JButton("상품 주문하기");
		orderbtn.setPreferredSize(new Dimension(400,200));
		orderbtn.setBackground(Color.red);
		orderbtn.setForeground(Color.white);
		orderbtn.setFont(new Font("함초롬돋움", Font.BOLD, 60));
//		add(jbtn);
//		
//		
//		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Order();
	}
}
