//import java.util.Date;
import java.util.*;

public class DataType
{
	public static void main(String[] args)
	{
		//������
		Date d = new Date(); //java.utill ��Ű���� �ִ� Ŭ����
		System.out.println(d);
		System.out.println("2. �ڷ���-�Ǽ���-----");
		//float(4byte) < double(8byte)-default
		//float : �����е� �Ҽ������� 7�ڸ� �������� ǥ�� ����
		//double : �����е� �Ҽ������� 15�ڸ�~16�ڸ� ���� (�� �� �����ϴ�)
		float ft1 = 12.34F; //����Ʈ�� �Ҽ����� �� ������ ����ϱ� ������ ����������. 
							//�׷��� float���ÿ��� F ���̻縦 �ٿ�����Ѵ�.
		System.out.println(ft1);
		float ft2 = 321;
		System.out.println(ft2);
		//promotion: ���� �ڷ������� ū �ڷ������� �ڵ����� ����ȯ�� �Ͼ�� ��
		//float�� 321�� ������ 321.0���� ��µǾ� ����
		//byte < short < int < long < float < double
		//		 char  <
		//���������� �������� ���� 4����Ʈ�� �÷��� 8����Ʈ�� �պ��� ������,
		//�Ǽ����� ���������� ū ���� ������
		double d1 = 100.1234567891011D; //���̻� D�� ���̱⵵ ������ ������ ����Ʈ�� ���� ������ �ʾƵ� �ȴ�.
		System.out.println(d1);
		byte i = 9;
		double d2 = i;
		System.out.println(d2);
		//������ ���� ǥ��� : e+4 => 10^4m, e-4 => 10^-4
		double d3 = 200e-4; //200*0.0001
		System.out.println(d3);

		float ft3 = 200e+4f; //200*10000
		System.out.println(ft3);

		float ft4 = 3.69f;
		int k = (int)ft4;

		//casting(��������ȯ) : ū �ڷ����� ���� �ڷ������� ��ȯ�ϰ��� �� �� ���
		//���� = (�ڷ���)�� => ����! ���� �ս��� �߻��� �� �ִ�.
		System.out.println(ft4);
		System.out.println(k);

		byte x = (byte)128;
		System.out.println(x);

		System.out.println("3. �ڷ��� - char(������)");
		//������: character ==> char : ���� 1���� ������ �� �ִ�(�⺻�ڷ���) '��' �� �ϳ��� ���� ������
		//���ڿ�: String ==> ���� �������� ������ �� �ִ�. (������) "���ڿ����尡��"
		//char(2byte): 0 ~ 2^16-1 ==> 0 ~ 65535 ��� ������ ��� ǥ�� ����. �����ڵ� ü�踦 ���
		//short(2byte) : -2^15 ~ 2^15-1
		char ch = 'A';
		// char ch2 = 'Aa' �� ���ڸ� �����ϱ� ������ ������ ��. A�� ���ų� a�� �����
		System.out.println(ch);

		String str = "AB";
		System.out.println(str);

		char ch3 = '��';
		char ch4 = '\uff57';
		System.out.println("ch3="+ch3); //���ڿ��� + �����ڸ� ����ϸ� ���ڿ� ������ �Ͼ��.
		System.out.println("ch4="+ch4);

		System.out.println("4. ���� -boolean");
		//boolean(1) : true, false���� ���´�
		boolean bool = true;
		boolean bool2 = 2>5;
		System.out.println("bool="+bool);
		System.out.println("bool2="+bool2);
		//int a = (int)bool; //�ڹ��� ������ ����ȯ �� �� ����. 0�̳� 1�� ȣȯ���� �ʴ´�.

		/* int ���̸��� �ڷ��� �����͵��� ���꿡 ���� ��� �� ����� int������ �ڵ� ����ȯ�� �Ͼ��.
			byte
			short
			char
		*/
		byte m1 = 1;
		byte m2 = 2;
		//byte result = m1+m2; �����ϸ� int�� ��������ȯ�� �Ǳ� ������ ����Ʈ�� ����� �� ����
		//������ �� int���� ū �ɷ� ������ ��� ����.(double, long��)
		int result = m1 + m2;
		System.out.println("resurlt="+result);

		char c = 'A'; // �ƽ�Ű �ڵ忡 ���ϸ� A�� 65��, B��66�� 
		System.out.println(c);
		System.out.println(c+1); // ����� 66�� �����µ� �ƽ�Ű �ڵ忡�� A(65)+1=66�̱� ����
		System.out.println((char)(c+1));






	}


}