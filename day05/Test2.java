package day05;
import java.util.*;

//연습문제7.png
//java의 정석 3판 연습문제 풀이
//ch3/Exercise5_6.java

public class Test2 {

	public static void main(String[] args) {
		//큰 금액의 동전을 우선적으로 거슬로 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		Scanner sc = new Scanner(System.in);
		System.out.println("돈을 숫자로 입력하세요.");
		int money = sc.nextInt();
		int sum = 0;
		for(int i=0; i<coinUnit.length; i++) {
			int pay = (money-sum)/coinUnit[i];
			sum += pay*coinUnit[i];
			System.out.println(coinUnit[i]+": "+pay);
		}
	}

}
