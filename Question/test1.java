package Question;
import java.util.*;

public class test1 {

	public static void main(String[] args) {
		System.out.println("성적을 입력하세요 1~100");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println("학년을 입력하세요 1~4");
		int y = sc.nextInt();
		
		if(1<=y && y <=3) {
			if (x >=60 && x<=100) {
				System.out.println("합격입니다");
			}else if(x <60) {
				System.out.println("불합격입니다");
			}else {
				System.out.println("1~100 사이의 값을 입력해주세요.");
			}
		}else if(y ==4) {
			if (x >=70 && x<=100) {
				System.out.println("합격입니다");
			}else if(x <70) {
				System.out.println("불합격입니다");
			}else {
				System.out.println("1~100 사이의 값을 입력해주세요.");
			}
		}else {
			System.out.println("학년은 1~4까지 있습니다. 다시 입력해주세요.");
		}
	}

}
