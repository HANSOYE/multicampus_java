package day07;

public class Superman {
	String name;
	int height;
	int power; //초능력
	
	//기본 생성자
		public Superman() {
			this("슈퍼맨", 166, 100);
			//this() : 자기자신의 생성자를 호출할 때 사용한다.
//					   생성자 안에서만 호출할 수 있으며, 제일 첫번째 문장이어야한다.
//			name = "슈퍼맨";
//			height = 200;
//			power =100;
		}
		
		//인자 생성자 3개 만드세요
		
		public Superman(String name) {
//			this.name = name;
			this(name, 160, 10);
			
		}
		
		//target 여기서 초기화를 하자
		public Superman(String name, int height, int power) {
			this.name = name;
			this.height = height;
			this.power = power;
//			this(name, height, power);
		}
		
		public Superman(int height) {
//			this.height = height;
		}
		
	
	public String getInfo() {
		String info = "===정보===\n이름: "+name+"\n키: "+height+"\n초능력: "+power;
		return info;
	}
}
