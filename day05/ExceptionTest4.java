package day05;
//try  블럭 하나에 catch 절은 여러개 올 수 있다.
//그러나 catch 순서를 주의해야 한다
/*
 * - 부모 자식의 상속 관계가 있는 예외일 경우 자식을 먼저 catch하고
 * 	부모 예외를 나중에 catch 해야한다
 */

public class ExceptionTest4 {
	public static void main(String[] args) {
		//args: String 타입의 배열, 명령줄 인수
		//컴파일: javac ExceptionTest4.java
		//실행: java ExceptionTest4 안녕 잘가
		//							//args[0] args[1]

		try {
			System.out.println("args[0]= "+args[0]);
			System.out.println("args[1]= "+args[1]);
			//총 합계 점수를 구해 출력하세요
			System.out.println("총점: "+(args[0]+args[1]));
			//평균점수 구해서 출력하세요
			//java.lang.Integer클래스 ==> Wrapper class
			//int (기본자료형) => integer
			//public static int parseInt(String s):
			//문자열 s를 정수로 변환시켜 반환해주는 메소드
			int kor = Integer.parseInt(args[0]);//NumberFprmatException
			int eng = Integer.parseInt(args[1]);
			int sum = kor+eng;
			int avg = sum/args.length;
			
			System.out.println("총점: "+sum);
			System.out.println("평균: "+avg);
			System.out.println(avg/0); //연산 오류 분모= 0
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("명령줄 인수를 입력해야 해요!");
		}catch(NumberFormatException e) {
			System.out.println("점수는 숫자로 입력해야 해요");
		}catch(Exception e) {
			System.out.println("기타 예상치 못한 예외 발생"+e);
		}
	}

}
