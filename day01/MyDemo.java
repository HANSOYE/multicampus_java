//package my.com;
//[1] ��Ű�� ���� = package��;
//import java.lang.System; //java.lang : �⺻��Ű���� java.lang ��Ű�� import���� ������ �����ϴ�.
//[2] import�� = import ��Ű����.Ŭ������;

//[3] class ����
public class MyDemo
{
	//main method�� �־�� �Ѵ�.
	public static void main(String[] args)
	{
		System.out.println("--�ڹ��� �ڷ���--");
		//cmd���� ������ �� ����
		//������: byte(1) short(2) int(4) long(8����Ʈ ������)
		//�Ǽ���: float(4) double(8����Ʈ ������)
		byte a = -128; //1 byte => 8bit : -2^7 ~2^7-1 : -128~127
		double b = 127;
		System.out.println(a);
		System.out.println(b);

		short c = 128; //2 byte => 16bit : -2^15 ~2^15-1
		short d = 5000;
		System.out.println(c);
		System.out.println(d);

		int e = 70000; // 4 byte => 32bit : -2^31 ~2^31-1
		System.out.println(e);

		long ln = 40; //8����Ʈ => 64��Ʈ : -2^63 ~ 2^63-1
		long ln2 = 40L; //long�� ��� ���̻� (L, l)�� ���� �� �ִ�.
		System.out.println(ln);
		System.out.println(ln2);

		int i = 1000000000; //0�� ��ȩ �� 4����Ʈ : -21��~21�� ����
		long j = 10000000000l; //0�� �� ��

		System.out.println(i);
		System.out.println(j);

		System.out.println('--------------');
		System.out.println("1"+"2");
		System.out.println(true+ "");
		System.out.println('A' + 'B');
		System.out.println('1'+2);
		System.out.println('1'+'2');
		System.out.println('J'+'ava');
		System.out.println(true+null);


	}
}