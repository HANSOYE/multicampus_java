package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import day11.MyGui.MyEventHandler;

import java.awt.*;
import java.awt.event.*;

public class MySearchEngine extends JFrame{
	JPanel p = new JPanel();
	JButton bt1, bt2, bt3, bt4;
	
	public MySearchEngine() {
		super ("::MySearchEngine::");
		add(p, "Center");
		GridLayout grid = new GridLayout(2,2,1,1);
		p.setLayout(grid);
		JButton bt1 = new JButton("Naver");
		JButton bt2 = new JButton("Google");
		JButton bt3 = new JButton("Daum");
		JButton bt4 = new JButton("Nate");
		
		p.add(bt1);
		p.add(bt2);
		p.add(bt3);
		p.add(bt4);
		
		MyEventHandler handler = new MyEventHandler();
		bt1.addActionListener(handler);
		bt2.addActionListener(handler);
		bt3.addActionListener(handler);
		bt4.addActionListener(handler);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyEventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//이벤트가 발생된 객체의 참조값을 얻어보자.
			Object obj = e.getSource(); // 이벤트 소스에 대한 정보를 반환
			if(obj ==bt1) {
				bt1.setBackground(Color.red);
				//이벤트 처리코드
			}else if(obj ==bt1) {
				bt2.setBackground(Color.green);
			}else if(obj ==bt3) {
				bt3.setBackground(Color.blue);
			}else if(obj ==bt4) {
				bt4.setBackground(Color.yellow);
			}
		}
	}	

	public static void main(String[] args) {
		MySearchEngine my = new MySearchEngine();
		my.setSize(500, 500);
		my.setVisible(true);
	}

}
