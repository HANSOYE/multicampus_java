package day06;
/*
 * try{}
 * catch{}
 * catch{}
 * ...
 * finally{
 * 		finally 블럭은 반드시 한 번은 수행되는 불럭이다.
 * 		위에 return문이 오더라도 한 번은 수행하고 제어권을 넘긴다
 * 		단 예외가 있다. 시스템 종료 코드가 있을 경우는 finally블럭이 실행되지 않는다.
 * }
 * 
 */

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			System.out.println(50/num);
		}
		catch(ArithmeticException e) {
			System.out.println("분모가 0이어선 안 돼요");
			System.exit(0); //시스템 종료 ==> 예외로 인해 finally 수행 안 함
		}
		catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
			return;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("명령줄 인수를 입력해야 해요!");
		}
		catch(Exception e) {
			System.out.println("기타 예상치 못한 예외 발생"+e.getMessage());
			//String getMessage(): 예외 메시지를 문자열로 반환한다.
			//		//반환타입: string
		}
		finally {
			System.out.println("********실행 필수 코드*********");
		}
		System.out.println("끝");
	}

}
