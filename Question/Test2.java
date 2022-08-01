package Question;
import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("몇 월인가요? 숫자를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
		case 12, 1, 2:
			System.out.println("겨울입니다.");
			break;
		case 3, 4, 5:
			System.out.println("봄입니다.");
			break;
		case 6, 7, 8:
			System.out.println("여름입니다.");
			break;
		case 9, 10, 11:
			System.out.println("가을");
			break;
		default :
			System.out.println("1~12 사이의 숫자를 입력해주세요.");
		}
			
	}

}
