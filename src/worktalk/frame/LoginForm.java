package worktalk.frame;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame{
	JLabel la_title;
	JLabel la_subtitle;
	JLabel la_id;	
	JLabel la_pass;
	JTextField t_id;
	JPasswordField t_pass;
	JButton bt_login;
	JPanel p_north;
	JPanel p_center;
	JPanel p_south;
	JPanel p_west;
	JPanel p_east;
	
	
	public LoginForm() {
		la_title=new JLabel("work talk");
		la_subtitle=new JLabel("송파여성인력개발센터");
		la_id=new JLabel("ID");
		la_pass=new JLabel("PW");
		t_id=new JTextField(15);
		t_pass=new JPasswordField(15);
		bt_login=new JButton("Login");
		
		p_north=new JPanel();
		p_center=new JPanel();
		p_south=new JPanel();
		p_west=new JPanel();
		p_east=new JPanel();
		
		p_center.setPreferredSize(new Dimension(100,40));
		p_center.setBackground(Color.WHITE);
		p_north.setPreferredSize(new Dimension(150,50));
		p_north.setBackground(new Color(226,240,217));
		p_south.setBackground(new Color(226,240,217));
		p_west.setBackground(new Color(226,240,217));
		p_east.setBackground(new Color(226,240,217));
	
		p_north.add(la_title);
		this.add(p_north,BorderLayout.NORTH);
		
		p_center.add(la_subtitle);
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_pass);
		p_center.add(t_pass);
		p_center.add(bt_login);
		this.add(p_center,BorderLayout.CENTER);
		
		this.add(p_south,BorderLayout.SOUTH);
		
		this.add(p_west,BorderLayout.WEST);
		
		this.add(p_east,BorderLayout.EAST);
	
		this.setSize(250,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new LoginForm();
	}
}
