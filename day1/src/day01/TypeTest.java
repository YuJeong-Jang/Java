package day01;
/*
 * �������� ����
 *	1		2		4	8		4		8 
 * byte > short > int > long > float > double
 * 				  char
 * boolean
 */
public class TypeTest {
	public static void main(String[] args) {
//	System.out.println(Integer.MAX_VALUE);
//	System.out.println(Long.MAX_VALUE);
//	long a = 21474836479L;
//	int b = 20;
//	System.out.println(a+b);
	float f = 0.123456789f;
	System.out.println(f); //�������ڸ� ���� �ø��ؼ� �÷��� �������� 9�� ����
	double d = 0.1234567890123456;
	System.out.println(d);
	
	//����ǥ��
	int b = 0111; //0���� �����ϸ� 8����
	System.out.println("8���� 111=" + b);
	
	//10������ 8������ ��ȯ
	int b8 = 015 + 04;
	System.out.println(b8 + " " + Integer.toOctalString(b8));
	
	//0x�� �����ϸ� 16����
	int b16 = 0xFF; 
	System.out.println(b16);
	
	//0b�� �����ϸ� 2����
	int b2 = 0b1111;
	System.out.println(b2);
	
	//char
	System.out.println("==========");
	char c1 = '��';									
	System.out.println((int)c1);						//10����
	System.out.println(Integer.toHexString(c1));		//16����
	char c2 = '\uac01';
	int c3 = 44033;
	System.out.println(c2);
	System.out.println((char)c3);
	
	}
}
