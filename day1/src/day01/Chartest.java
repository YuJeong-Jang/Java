package day01;

public class Chartest {
	public static void main(String[] args) {
		
		//��ҹ���
		char c1 = 'A';
		int c2 = c1 + 32;		//32�� ���ϸ� �ҹ��ڰ� �빮�ڷ� ����
								//32�� ���� �빮�ڰ� �ҹ��ڷ� ����
		System.out.println(c2 + " " + (char)c2);
	
		char c3 = '\uac00';
		char c4 = 0xac00;
		char c5 = '��';
		char c6 = 44032;
		System.out.println(c3 + " " + c4 + " " + c5 +  " " + c6);
		
		//���ڿ�
		String s ="�ȳ�\n\n �ϼ���";
		System.out.println(s);

	
	}
}
