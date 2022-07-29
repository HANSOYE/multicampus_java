package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyJPanel extends JPanel{
	//컨테이너의 바깥여백을 주는 메서드를 오버라이딩하자
	@Override
	public Insets getInsets() {
		Insets in = new Insets(5,5,5,5);//(top, left, bottom, right)
		return in;
	}
}

public class SearchEngine extends JFrame{
	
	//JPanel은 padding이 없기 때문에 padding을 넣어주려면 위와같이 class를 하나(이름 MyJPanel) 만들어준다.
//	JPanel p = new JPanel(); //FlowLayout => GridLayout 변경
	MyJPanel p = new MyJPanel(); //FlowLayout => GridLayout 변경
	
	JButton[] bt = new JButton[4];
	String[] str = {"Naver", "Google", "Daum", "Yahoo"};
	public SearchEngine() {
		super ("::MySearchEngine::");
		add(p, "Center");
		
		p.setLayout(new GridLayout(2,2,5,5));
		
		for(int i=0; i<bt.length; i++) {
			bt[i] = new JButton(str[i]);
			p.add(bt[i]);
		}
		//버튼에 대한 이벤트 처리를 anonymous class로 해보자
		//{}: 이름 없는 클래스이며, new ActionListener를 상속받는 클래스가 된다.
		bt[0].addActionListener(new ActionListener() {
			//오버라이드를 하지 않으면 오류가 난다.
			@Override
			public void actionPerformed(ActionEvent e) {
				bt[0].setBackground(Color.white);
				setTitle(str[0]+"버튼을 눌렀군요");
			}
		});
		bt[1].addActionListener(new ActionListener() {
			//오버라이드를 하지 않으면 오류가 난다.
			@Override
			public void actionPerformed(ActionEvent e) {
				bt[1].setBackground(Color.LIGHT_GRAY);
				setTitle(str[1]+"버튼을 눌렀군요");
			}
		});
		bt[2].addActionListener(new ActionListener() {
			//오버라이드를 하지 않으면 오류가 난다.
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource(); //이벤트가 발생된 객체
				String cmd = e.getActionCommand(); //이벤트 소스의 라벨 문자열을 반환한다.
				setTitle(cmd+"버튼을 눌렀군요");
				//object에는 setBackground가 안 된다. 그래서 JButton으로 강제형변환한다.
				((JButton)obj).setBackground(Color.gray);
//				bt[2].setBackground(Color.gray);
//				setTitle(str[2]+"버튼을 눌렀군요");
			}
		});
		bt[3].addActionListener(new ActionListener() {
			//오버라이드를 하지 않으면 오류가 난다.
			@Override
			public void actionPerformed(ActionEvent e) {
				bt[3].setBackground(new Color(100, 100, 100));
				setTitle(str[3]+"버튼을 눌렀군요");
			}
		});
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		SearchEngine my = new SearchEngine();
		my.setSize(500, 500);
		my.setVisible(true);
	}

}
