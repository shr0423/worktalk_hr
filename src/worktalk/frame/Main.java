package worktalk.frame;

import java.awt.FlowLayout;

import javax.swing.JFrame;



public class Main extends JFrame{
	Page[] pages;
	public static final int LOGIN = 0;
	public static final int HOME = 1;

	

	
	public Main() {
		pages = new Page[2];
		pages[0] = new LoginPage(this);
		pages[1] = new Home();

		setLayout(new FlowLayout());
		for(int i=0;i<pages.length;i++) {
			this.add(pages[i]);
		
		}
		
		pack();
		setTitle("Worltalk");
		setLocation(1050,200);
		setVisible(true);
		//setResizable(false); //디자인 확인용으로 잠시 막아둠
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//showHide(LOGIN); //디자인확인용으로 잠시 막아둠
		pages[0].setVisible(true);//디자인 확인용 코드 나중에 삭제 필요
		pages[1].setVisible(true);//디자인 확인용 코드 나중에 삭제 필요

		
	}
	
	//화면 전환을 위한 메서드(로그인과 회원가입페이지 화면전환용)
	public void showHide(int n) {
		for(int i=0;i<pages.length;i++) {			
			if(i==n) {
				pages[i].setVisible(true);	
			}else {
				pages[i].setVisible(false);			
			}
		}
		pack();
	}
	
	public static void main(String[] args) {
		new Main();

	}

}