package day07;

public class Aquaman {
	String name;
	int height;
	double speed;
	/*
	 * 생성자를 구성하지 않으면 컴파일러는 기본적으로 디폴트 생성자를 제공해준다.
	 * 한 개라도 생성자를 구성하게되면, 제공되던 디폴트 생성자는 사라진다.
	 * => 가능하면 기본생성자를 구성한 뒤에 다른 생성자를 구성하는 것이 좋다.
	 */
	
	//기본 생성자
	public Aquaman() {
		this("수중인간", 155, 96.78);
//		name = "포세이돈";
//		height = 250;
//		speed = 50;
	}
	
	//인자 생성자 3개 만드세요
	
	public Aquaman(String name) {
		this.name = name;
	}
	
	public Aquaman(String name, int height, double speed) {
		this.name = name;
		this.height = height;
		this.speed = speed;
	}
	
	public Aquaman(int height) {
		this.height = height;
	}
	
	public String getInfo() {
		String info = "===정보===\n이름: "+name+"\n키: "+height+"\n속도: "+speed;
		return info;
	}

}
