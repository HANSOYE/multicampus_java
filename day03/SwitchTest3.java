package day03;
import java.util.*;

/*문제2] ***수도요금 계산***************
-메뉴 (1 ~ 3), 사용량 (liter)
   1. 가정용 (liter당 50원)
   2. 상업용 (liter당 45원)
   3. 공업용 (liter당 30원)
   =>메뉴 선택후 사용량을 입력받는다.
 -출력될 내용
  1) 사용자 코드, 사용량, 총수도요금
   cf)사용요금=사용량 * 리터당 가격
      총수도요금=수도사용요금+세금(요금의
          5%)
*/


public class SwitchTest3 {

	public static void main(String[] args) {
		System.out.println("=========menu=========");
		System.out.println("1. 가정용 (liter당 50원)");
		System.out.println("2. 상업용 (liter당 45원)");
		System.out.println("3. 공업용 (liter당 30원)");
		System.out.println("======================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요 =>");
		System.out.println("======================");
		int menu = sc.nextInt();
		
		if (menu ==0 | menu >=4) {
			System.out.println("해당 메뉴가 없습니다. 메뉴는 1, 2, 3이 있습니다.");
		}
		else {
		System.out.println("사용량을 입력하세요 =>");
		System.out.println("======================");
		int liter = sc.nextInt();
		
		int price = 0;
		
		switch(menu) {
		case 1:
			price = 50;
			break;
		case 2:
			price = 45;
			break;
		case 3:
			price = 30;
			break;
//		default:
//			System.out.println("해당 메뉴가 없습니다.");	
		}
		System.out.println("사용자 코드 : "+menu);
		System.out.println("사용요금 : "+liter*price);
		System.out.println("총 수도요금 : "+liter*price*1.05);
		}
	}

}
