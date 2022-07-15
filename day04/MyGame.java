package day04;
import java.util.*;

public class MyGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int comp = (int)(Math.random()*100+1); //1 <= comp <101 사이의 정수값을 랜덤하게 발생시킨다
		int count = 0; //시도 횟수를 세기 위한 변수
		while(true) 
		{
			System.out.println("1 ~ 100사이의 정수를 입력하세요");
			count++;
			int input = sc.nextInt();//정수를 하나 입력받기

			if(input>=101 || input <1) {
				System.out.println("1~100 사이의 정수를 입력해야 합니다.");
				continue;
			}
			if(input == comp ) {
				System.out.println("아... 맞췄네요...");	
				break;
			}
			else if(input < comp) 
			{
			System.out.println("더 큰 수를 입력하세요");
			}
			else if(input > comp) {
			System.out.println("더 작은 수를 입력하세요");
			}
			if(count >=7) {
				System.out.println("시도 횟수(7번) 초과: 다음 기회에~~");
				//break; // 게임 시도 횟수 보여줌
				return; //게임 시도 횟수 안 보여줌
			}

	}
		System.out.println("게임 시도 횟수: "+count);

	}}
