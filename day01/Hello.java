public class Hello //클래스명과 파일명이 동일해야 한다
{
	//단문 주석: 한 줄 짜리 주석

	/*
	복문 주석: 여러 줄을
	주석 처리 한다.
	*/

	/** 문서화 주석: javadoc이라는 유틸을 이용해 api문서를
		만들 때 이용한다.
	*/

	//main() 메소드 구성
	public static void main(String[] args) 
	{
		System.out.println("Hello World~~");
		System.out.print("안녕하세요?");
		System.out.println("반갑습니다.");
		System.out.println("안녕하세요 멀티캠퍼스 수강생 한소예라고 합니다.");
		System.out.println("역시 어떤 언어든 똑같이 초반은 항상 쉽네요... \n언어 너무 어려웡");
		System.out.println("국어\t영어\t수학math");
		System.out.println("99\t88\t77");
		System.out.println("\\ \'김소월\'님의 \"진달래 꽃\"");

		/* 특수 제어 문자(Escape문자)
		\n : 줄바꿈
		\t : 탭키 설정한 만큼 띄어쓰기를 한다
		\\ : 역슬래시를 출력하고자할 때 사용
		\" : 쌍따옴표 출력 때 사용
		\' : 홀따옴표 출력 때 사용
		*/
		

	}

}