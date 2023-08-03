package worktalk.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class LoginPage extends Page {
	JPanel p_main;//디자인을 위해 모든 페널을 담은 메인페널
	JPanel p_north; //앱이름 넣기위한 패널
	JPanel p_center; //실질적으로 모든 컴포넌트틀을 담고 있는 패널
	
	JLabel space; //오롯이 공백을 위한 디자인을 위한 기능(임시방편)
	JLabel la_title; //앱이름
	JLabel la_comname; //화사명
	JLabel la_id;
	JLabel la_pass;
	JTextField txt_id;
	JPasswordField pass;
	JButton bt_login;
	Main main;
	

	
	
	
	
	public LoginPage(Main main) {
		this.main = main;
		p_main = new JPanel();
		p_north = new JPanel();
		p_center = new JPanel();
		
		space = new JLabel("");
		la_title = new JLabel("work talk");
		la_comname = new JLabel("           송파여성인력개발센터"); //가운데 정렬몰라서 공간으로 일단 꼼수
		la_id = new JLabel("ID");
		la_pass = new JLabel("PW");
		txt_id = new JTextField();
		pass = new JPasswordField();
		bt_login = new JButton("Login");



		
		//사이즈랑 디자인(색상) 조절
		Dimension d1 = new Dimension(50,15);
		Dimension d2 = new Dimension(200,30);
		Color c1 = new Color(68,84,106);
		Font f1 = new Font("dialog", Font.BOLD, 30);
		Font f2 = new Font("dialog", Font.BOLD, 18);
		
		space.setPreferredSize(new Dimension(300,20));
		p_main.setPreferredSize(new Dimension(300,450));
		p_north.setPreferredSize(new Dimension(300,80));
		p_center.setPreferredSize(new Dimension(300,350));
		la_comname.setPreferredSize(new Dimension(300,40));
		la_id.setPreferredSize(d1);
		la_pass.setPreferredSize(d1);
		txt_id.setPreferredSize(d2);
		pass.setPreferredSize(d2);
		bt_login.setPreferredSize(new Dimension(100,30));
		

		la_title.setFont(f1);
		la_comname.setFont(f2);
		la_comname.setVerticalTextPosition(SwingConstants.CENTER);
		
		la_title.setForeground(c1);
		la_comname.setForeground(c1);
		la_id.setForeground(c1);
		la_pass.setForeground(c1);
		bt_login.setBorder(new LineBorder(c1,1,false));
		txt_id.setCaretColor(Color.LIGHT_GRAY);
		
		p_main.setBackground(null);
		p_north.setBackground(null);
		p_center.setBackground(Color.WHITE);
		
		
		//컴포넌트 페널에 붙이기
		p_north.add(space);
		p_north.add(la_title);
		p_center.add(la_comname);
		p_center.add(la_id);
		p_center.add(txt_id);
		p_center.add(la_pass);
		p_center.add(pass);
		p_center.add(bt_login);
		
		//페널을 페이지에 붙이기
		p_main.add(p_north,BorderLayout.NORTH);
		p_main.add(p_center);
		this.add(p_main);


		
		
		bt_login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				main.showHide(1);
				
			}
		});
		
	}


}