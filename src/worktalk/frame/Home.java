package worktalk.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Home extends Page{
	JPanel p_main;
		
	JTextField search;
	
	
	JButton bt_edit;
	JButton bt_schedule;
	
	JPanel p_north;
	String[] naviTitle= {"회계부","영업부","총무부","인사부","마케팅부"};
	ArrayList<JLabel> navi;
	JPanel p_center;
	JPanel p_south;
	
	NaviPanel[] panels;
	

	
	public static final int ACCOUNTING=0;
	public static final int SALES=1;
	public static final int AFFAIRS=2;
	public static final int HUMAN=3;
	public static final int MARKETING=4;
				
	
	public Home() {
		p_main=new JPanel();
		
		search=new JTextField("사원 번호 또는 이름 입력");
		
		bt_edit=new JButton("상태 수정");
		bt_schedule=new JButton("스케쥴");
		
		
		
		p_north=new JPanel();
		p_center=new JPanel();
		p_south=new JPanel();
		createNavi();
		
		panels=new NaviPanel[5];
		
		panels[0]=new NaviPanel();
		panels[1]=new NaviPanel();
		panels[2]=new NaviPanel();
		panels[3]=new NaviPanel();
		panels[4]=new NaviPanel();
		
		
		
		for(int i=0;i<panels.length;i++) {
			p_center.add(panels[i]);
			
		}
		
		p_main.setPreferredSize(new Dimension(300,450));
		p_north.setPreferredSize(new Dimension(300,50));
		p_center.setPreferredSize(new Dimension(300,300));
		p_south.setPreferredSize(new Dimension(300,100));
		
		
		
		p_north.setBackground(new Color(226,240,217));
		p_center.setBackground(Color.WHITE);
		p_south.setBackground(new Color(226,240,217));
		
		
		
		p_north.add(search);
		
		p_south.add(bt_edit);
		p_south.add(bt_schedule);
	
		
		
		p_main.add(p_north,BorderLayout.NORTH);
		p_main.add(p_center,BorderLayout.CENTER);
		p_main.add(p_south,BorderLayout.SOUTH);

		this.add(p_main);
		
		//this.setSize(300,450);
		this.setVisible(true);
	
		showHide(ACCOUNTING);
		
		for(int i=0;i<navi.size();i++) {
			JLabel obj=navi.get(i);
			obj.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					int index=navi.indexOf(e.getSource());
					showHide(index);
				}
			});
		}
		
	}
	public void createNavi() {
		navi=new ArrayList<JLabel>();
		
		for(int i=0;i<naviTitle.length;i++) {
			JLabel obj=new JLabel(naviTitle[i]);
			navi.add(obj);
			p_center.add(obj);
		}
		
		
	}
	public void showHide(int n) {
		for(int i=0;i<panels.length;i++) {
			if(i==n) {
				panels[i].setVisible(true);
			}else {
				panels[i].setVisible(false);
			}
		}
	}
	public static void main(String[] args) {
		new Home();
	}

	
}