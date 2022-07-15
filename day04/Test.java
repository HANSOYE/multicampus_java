package day04;

public class Test {

	public static void main(String[] args) {
		/*[4-2]
		 * 1~20 정수 중 2 or 3의 배수가 아닌 값의 총합
		 * 2 or 3의 배수가 아닌 값의 총합
		 */
		System.out.println("==4-2==");
		int i = 1;
		int sum = 0;
		for(; i<=20; i++) {
			if(i%2!=0 && i%3!=0) { //if(! i%2==0 || i%3==0) 로 적어도 OK.
				System.out.println("i: "+i);
				sum = sum +i;
			}
		}System.out.println("sum: "+sum);
		
		//[4-3]
		sum = 0;
		int totalSum = 0;
		for(int j = 1; j<11; j++){
			//sum = sum+i;
			sum+=j;
			totalSum+=sum;
		}
		System.out.println("sum: "+sum);
		System.out.println("totalSum: "+totalSum);

	}

}
