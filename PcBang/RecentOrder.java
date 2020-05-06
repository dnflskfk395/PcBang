package PcBang;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class RecentOrder extends JFrame {
	
	
	
	JLabel jl;
	JButton jb_recent,jb_up, jb_down; 
	
	JTable table;
	JScrollPane scroll; //테이블 위에 열 라벨
	String[][]data; 
	String[]title = {"상품명","판매금액","수량","금액"};
	
	public RecentOrder() {
		
		setBounds(1100, 500, 700, 400);
		
		
		
		jl = new JLabel("상품 주문 목록");
		jl.setPreferredSize(new Dimension(400, 100));
		add(jl);
		
		jb_recent = new JButton("최근 주문 완료 내역");
		jb_recent.setPreferredSize(new Dimension(60, 60));
		add(jb_recent);
		
		jb_up = new JButton("더하기");
		jb_up.setSize(60, 60);
		add(jb_up);
		
		jb_down = new JButton("빼기");
		jb_down.setSize(60, 60);
		add(jb_down);
		
		
		
		
		
		
		
		data = new String[5][4];
		data[0][0]= "핫도그";
		data[0][1]= "123";
		data[0][2]= "12";
		data[0][3]= "123000";
		
		data[0][0]= "핫도그";
		data[0][1]= "123";
		data[0][2]= "12";
		data[0][3]= "123000";
		
		table = new JTable(data,title);
		scroll = new JScrollPane(table);
		add(scroll,BorderLayout.PAGE_END);

this.setDefaultCloseOperation(EXIT_ON_CLOSE);
pack();


setVisible(true);
		
		
	}
	
public static void main(String[] args) {
	new RecentOrder();
}
	
}//클래스 종료
