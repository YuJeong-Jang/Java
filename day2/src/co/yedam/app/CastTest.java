package co.yedam.app;

import java.util.Scanner;

/*
 * �� ��ȯ : ĳ��Ʈ������(Ÿ��)
 * ������ : byte < short < int < long
 * �Ǽ��� : 				float < double
 * string	<-----> byte		Byte.parseByte(����)				
 * 					short		Short.parseShort(����)
 * 					int			Integer.parseInt(����)
 * 					long		Long.parseLong(����)
 * 					float		Float.parseFloat(����)
 * 					double		Double.parseDouble(����)
 * 					char		Char.parseChar(����)
 * 					boolean		Boolean.parseBoolean(����)
 * String str = String.ValueOf(Ÿ�԰�)
 */
public class CastTest {

	public static void main(String[] args) {
		//�ڵ� ����ȯ
		int a = 10;
		long b = a;
		
		//���� ����ȯ
		a = (int)b;
		
		//char(����) <-> int(�ڵ�)
		char c = 'Z';
		System.out.println((int)c);
		int d = 97;
		System.out.println((char)d);
		//�Ǽ�(double) <-> ����(int)
		double e = 10.5;
		int f = (int)e;
		System.out.println(f);
		long g = (int)e;
		System.out.println(g);
//		int h = (long)e;	ū(long)���� ����(int)���� �� ������.(������)
		double o = 5 + 10.5;
		String p = "hi" + 5;
		System.out.println(p);
		System.out.println("hi" + 5 + 10);
		//5�� 10�� ��ȣ�� �������� ������ hi(string)�� 5(int)�� ���� ���ǹǷ� ����� hi510
		System.out.println(5 + 10 + "hi");
		//5�� 10�� �տ� ������ ���ڳ��� ���� ���ǹǷ� ����� 15hi
		//�ΰ��� ��� ���ǹǷ� string�� int��, string������, int�����Ŀ� ���� ������� �޶���.
		
		//���������� �������� ������ ����.
		System.out.println(5/2);
		System.out.println(5/(double)2);	//5�� 2�� double(�Ǽ�)�� �ٲٸ� double���·� ��µ�.
		
		double i = 5 / (double)2;
		System.out.println(i);
	
		//string -> int
		String s1 = "123";
		int j = Integer.parseInt(s1);
		System.out.println(j);
		
		//int -> string
		String s2 = String.valueOf(10.5);
		System.out.println(s2);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է�:");
		String greet = scanner.next();
		System.out.println(greet);
	
	
	
	
	
	}

}
