package PcBang;

import java.awt.Color;


import javax.swing.JLabel;
import javax.swing.JPanel;

public class Boxes extends MainFrame {
	
	MainFrame main;
	JPanel paRandomSim ;
	JLabel jl;
	
	public Boxes() {
		paRandomSim = new JPanel();
		paRandomSim.setBounds(0, 0, 400, 700);
		paRandomSim.setBackground(Color.red);
		paRandomSim.setOpaque(true);

		
		
//		jl = new JLabel();
//		jl.setBounds(0, 0, 100, 100);
//		jl.setBackground(Color.green);
//		jl.setOpaque(true);
//		
//		
//		jbtn1 = new JButton("이건 버튼");
//		jbtn1.setBounds(300, 300, 200, 100);
//		jbtn1.setOpaque(true);
//		jbtn1.add(paAddMenu);
//		
//		main.getRandomSim().add(jl);
//		main.getMainFrame().add(main.getRandomSim());
//		
		
		paRandomSim.add(main);
//		jl.add(paRandomSim);
		
	}

public static void main(String[] args) {
	new Boxes();
}
}
