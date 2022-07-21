package day09;
import javax.swing.*;
import java.awt.*;

//CLI : Command Line Interface 도스 콘솔에서 실행되는 프로그램
//GUI : Graphic User interface 그래픽 환경을 갖춘 프로그램
//JFrame : Window 계열의 컨테이너
//			반드시 사이즈를 정해주고 setVisible(true)를 주어야 화면에 보여진다.

//JPanel : Panel 계열의 컨테이너
public class MyGui extends JFrame {
	JPanel p;
	JButton bt1, bt2, bt3;
	Icon icon1, icon2, icon3, icon4, icon5;
	
	JTextField tf1, tf2;
	JTextArea ta1, ta2;
	
	public MyGui() {
		super("::MyGui Program v1.1::");//타이틀에 문자열이 올라간다
		p = new JPanel();
		add(p);//JFrame의 중앙에 판넬이 붙는다.
		p.setBackground(Color.pink);
		icon1 = new ImageIcon("flower.png");
		icon2 = new ImageIcon("flower2.png");
		icon3 = new ImageIcon("flower3.png");
		icon4 = new ImageIcon("flower4.png");
		icon5 = new ImageIcon("flower5.png");
		
		bt1 = new JButton(icon1);
		bt2 = new JButton("HOME", icon2);
		bt2.setHorizontalTextPosition(JButton.CENTER);//텍스트 위치를 수평의 중앙에 위치
		bt2.setVerticalTextPosition(JButton.TOP);//수직의 탑에 위치
		
		bt3 = new JButton("LOGIN", icon3);
		bt3.setHorizontalTextPosition(JButton.CENTER);
		bt3.setVerticalTextPosition(JButton.BOTTOM);
		bt3.setPressedIcon(icon4);//버튼 누르면 icon4 아이콘으로 바뀜
		bt3.setRolloverIcon(icon5);//마우스 가져다 대면 아이콘 바뀜
		
		p.add(bt1);
		p.add(bt2);
		p.add(bt3);
		
		tf1 = new JTextField("tf1", 50);
		tf1.setBackground(Color.LIGHT_GRAY);
		tf2 = new JTextField("tf2",30);
		tf2.setBackground(Color.green);
		p.add(tf1);
		p.add(tf2);
		
		
		//JTextArea는 JScrollPane에 붙여야 스크롤바가 붙는다.
		ta1 = new JTextArea("ta1", 5, 50);
		ta1.setBackground(Color.cyan);
		ta2 = new JTextArea("ta2",3, 5);
		
		JScrollPane sp = new JScrollPane(ta1);
		p.add(sp);
		p.add(new JScrollPane(ta2));
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 창닫기 처리-프로세스 종료
	}//생성자------------------------
	public static void main(String[] args) {
		MyGui my = new MyGui(); //JFrame
		my.setSize(2000, 1000); //폭, 높이
		my.setVisible(true);
	}

}
