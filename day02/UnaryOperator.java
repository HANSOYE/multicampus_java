package day02;

public class UnaryOperator {
	public static void main(String[] args) {
		System.out.println("1.단항 연산자(부호연산자: +, -)");
		int a = 8;
		System.out.println(-a);
		System.out.println(+a);
		
		System.out.println("2.증감 연산자: ++, --");
		int b = 5;
		long c = 9;
		b++;
		c--;
		System.out.println(b);
		System.out.println(c);
		++b;
		--c;
		System.out.println(b);
		System.out.println(c);
		//++, --가 단독으로 사용될 때는 변수 앞에노나 뒤에오나 별 차이는 없다
		//하지만 다른 수식과 함께 사용되면 ++, --가 앞에 오는 것과 뒤에 오는 것은 차이가 있다.
		
		float d = 5.3f;
		double e = 7.3;
		System.out.println(++d);
		System.out.println("d : "+d);
		System.out.println(e--);
		System.out.println("e : "+e);
		
		int x = 10;
		int y = x++;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		x = 10;
		int z = ++x;
		System.out.println("x="+x);
		System.out.println("z="+z);
		
		System.out.println("3.비트면 not연산자: ~");
		//정수값을 비트로 바꾸고 연산을 수행하는데 비트별 not연산자는 1은 0으로 바꾸고, 
		//0은 1로 바꾸는 연산자이다.
		//첫 비트가 0이면 +, 1이면 -이다.
		// 3(int): 00000000 00000000 00000000 00000011
		//~3(int): 11111111 11111111 11111111 11111100
		// ㄴ -1*2^31 + 1*2^30 ...
		// ㄴ 1이 계속 이어지면 1을 다 지워주고 마지막 1만 남겨둔 채 그 뒤의 수만 십진수로 바꾼다.
		// 100 = -4가 된다.
		
		int m = 3;
		System.out.println(m);
		System.out.println(~m);
		
		//문제1]
		int n = 0xfffffff1; //16진수
		//f = 1111
		//1111 1111 1111 1111 1111 1111 1111 0001
		//0000 0000 0000 0000 0000 0000 0000 1110
		//1*2^3 + 1*2^2 + 1*2^1 = 14
		System.out.println("~n: "+(~n));
		
		//십진수
		//42 : 00000000 00000000 00000000 00101010
		//~42: 11111111 11111111 11111111 11010101 =>1010101
		//  ㄴ -1*2^6 + 2^4 + 2^2 + 1 = -64+21=-43
		
		System.out.println("4.논리 부정 연산자: !");
		//boolean형에만 사용이 가능하다. int형에는 사용할 수 없다.
		//true -> false, false -> true
		boolean bo = true;
		System.out.println(bo);
		System.out.println(!bo);
		
		//3은 2보다 크지만 앞에 !를 붙여줌으로서 false를 true로 바꿔줌
		System.out.println(!(3<2));
		
		int fo = 5;
		System.out.println(fo ==5.0); // == (등가연산자): 기본자료형에서는 값이 같은지 비교한다
		System.out.println(fo != 5.0); // != : 기본자료형에서는 값이 다르면 true, 같으면 false
		
		
		
		
	}

}
