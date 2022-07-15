package day04;
import java.util.Scanner;

public class MyGame2 {
	
	//사용자 정의 메소드
	public static void showMenu() {
		System.out.println("***********Game Menu***********");
		System.out.println("1.가위 | 2. 바위 | 3. 보 | 9. 종료");
		System.out.println("*******************************");
		System.out.println("입력하세요 =>");
		System.out.println("*******************************");
		
	}//---------------------------------
	public static String show(int num) {
		String str = "";
		switch(num) {
		case 1: str = "(가위)"; break;
		case 2: str = "(바위)"; break;
		case 3: str = "(보)"; break;
		default: str = "";
		}
		return str;
	}//---------------------------------

	//반복문 돌면서 컴퓨터와 가위 바위 보 게임을 진행하세요.
	//그 결과를 아래 형태로 출력하세요
	/* [1]
	 * 당신: 1(가위)
	 * 컴퓨터: 2(바위)
	 * -------------
	 * 당신이 졌군요
	 * 
	 * [2]
	 * 9를 입력하면 bye bye~~ 종료
	 * 
	 * [3]
	 * 메뉴에 없는 번호를 입력하면 "입력 오류! 메뉴에 없는 번호 입니다" 출력 후 다시 입력할 기회 주기
	 */
	//내장 메소드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			MyGame2.showMenu(); //MyGame2에 있는 showMenu 메소드 들고 오기
			int my = sc.nextInt();
			if(my == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			int comp = (int)(Math.random()*3+1);
			if(my<1||my>3) {
				System.out.println("입력 오류! 메뉴에 없는 번호 입니다.");
				continue;
			}
			String msg = "";
			if(my==comp) {
				msg = "비겼군요!";
			}
			else if((my==1 && comp==3)||(my==2 && comp==1)||(my==3 && comp==2)) {
				msg = "당신이 이겼네요^^";
			}
			else {
				msg = "풉! 당신이 졌군요!";
			}
			System.out.println("당신: "+my+MyGame2.show(my));
			System.out.println("컴퓨터: "+comp+MyGame2.show(comp));
			System.out.println("------------");
			System.out.println(msg);
		}

	}

}
