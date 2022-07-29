package day12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class PongApp extends JFrame{
	JPanel p = new JPanel();
	JPanel pN = new JPanel();
	JLabel lb;
	JButton btAdd, btSave;
	JTextArea ta;
	JTextField tfName;
	
	public PongApp() {
		super("::PongApp::");
		add(p, "Center");
		p.setLayout(new BorderLayout());
		
		p.add(pN, "North");
		pN.setBackground(Color.pink);
		
		p.add(new JScrollPane(ta = new JTextArea()), "Center");
		
		lb = new JLabel("이  름: ");
		btAdd = new JButton("입력");
		btSave = new JButton("저장");
		tfName = new JTextField(20);
		
		pN.add(lb);
		pN.add(tfName);
		pN.add(btAdd);
		pN.add(btSave);
		//리스너부착-----
		MyEventHandler handler = new MyEventHandler();
		btAdd.addActionListener(handler);
		btSave.addActionListener(handler);
		tfName.addActionListener(handler);//입력 후 엔터치면 ActionEvent발생함
		
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyEventHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			if(obj==btAdd | obj ==tfName) {
//				setTitle("add");
				//tfName에 입력한 값 얻어오기
				String data = tfName.getText();
				data = data.trim();
				try {
					//입력한 값의 성이 퐁씨이면 타이틀에 "XXX님 환영합니다"타이틀에 출력
					if(data.charAt(0)=='퐁') {
						setTitle(data+"님 환영합니다.");
						//tfName에서 얻어온 값을 ta에 붙이기
						ta.append(data+"\n"); //이것도 가능함
	//					ta.setText(data);//이 전의 데이터를 초기화함
					}else if(data.charAt(0)=='콩') {
						//사용자 정의 예외객체 발생시킴. throw new 예외 객체();
						//예외가 발생이 되면 해당 예외를 try~catch해야 한다.
						throw new NotSupportedNameException("'콩'씨는 가입할 수 없습니다.");
					}else {
						throw new NotSupportedNameException("'퐁'씨가 아닌 분들은 이용에 제한이 있습니다");
					}
				}//try--------
				catch(NotSupportedNameException n) {
					String msg = n.getMessage();
					setTitle(msg);
					//메시지 박스 띄우기
					JOptionPane.showMessageDialog(p,  msg);
				}//catch---------
				finally {
					tfName.setText("");
					tfName.requestFocus();//입력 포커스 추가
				}//finally-----------
			}else if(obj==btSave) {
//				setTitle("save");
				String content = ta.getText();
				if(content.trim().isEmpty()) {//내용이 없다면
					JOptionPane.showMessageDialog(p, "저장할 내용이 없어요");
					return;
				}
				//내용이 없다면
				String fileName = "C:/myjava/PongList.txt";
				try {
					FileWriter fw = new FileWriter(fileName);
					fw.write(content);
					fw.flush();
					fw.close();
					setTitle(fileName+"에 저장 완료!");
				}catch(IOException ex) {
					setTitle("파일 쓰기 중 에러: "+ex.getMessage());
				}
			}
		}
	}///

	public static void main(String[] args) {
		new PongApp();
		
	}

}
