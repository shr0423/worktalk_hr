package worktalk.frame;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Info extends JFrame{
	JTextField search;
	
	JLabel myinfo;
	JPanel p1;
	JPanel p2;
	JLabel l1;

	JTabbedPane accounting;
	JTabbedPane sales;
	
	JButton bt_edit;
	JButton bt_schedule;
	
	JPanel p_north;
	JPanel p_center;
	JPanel p_south;
	
	public Info() {
		search=new JTextField("사원 번호 또는 이름 입력");
		myinfo=new JLabel("회계팀 사원 박지인");
		p1=new JPanel();
		p2=new JPanel();
		l1=new JLabel("회계팀 부장 김송이");
		accounting=new JTabbedPane();
		sales=new JTabbedPane();
		
		
		bt_edit=new JButton("상태 수정");
		bt_schedule=new JButton("스케쥴");
		
		
		p_north=new JPanel();
		p_center=new JPanel();
		p_south=new JPanel();
		
		p_north.setBackground(new Color(226,240,217));
		p_center.setBackground(new Color(226,240,217));
		p_south.setBackground(new Color(226,240,217));
		
		
		p_north.add(search);
		p_center.add(myinfo);
		p_center.add(accounting);
		p_center.add(sales);
		p_south.add(bt_edit);
		p_south.add(bt_schedule);
		
		accounting.add("회계부",p1);
		sales.add("영업부",p2);
		p1.add(l1);
		
		this.add(p_north,BorderLayout.NORTH);
		this.add(p_center,BorderLayout.CENTER);
		this.add(p_south,BorderLayout.SOUTH);
		
		
		
		this.setSize(350,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

	}
	
	public static void main(String[] args) {
		new Info();
	}

}
