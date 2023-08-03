package worktalk.frame;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class NaviPanel extends JPanel{
	JLabel la_title;
	
	
	public NaviPanel() {
		//la_title=new JLabel("Accounting");
		//this.la_title=la_title;
		setBackground(Color.YELLOW);
		setPreferredSize(new Dimension(50,25));
		setVisible(true);
	}
	
}
