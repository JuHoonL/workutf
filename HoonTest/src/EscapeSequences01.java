
public class EscapeSequences01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("AB" + '\b' + "C"); //Ŀ�Ǵ����� �ٸ������� ��Ŭ�������� �ȸ����� ��ɾ�!
		System.out.println("AB" + '\t' + "C");
		System.out.println("AB" + '\n' + "C");
		System.out.println("AB" + '\r' + "C");
		
		System.out.println();
		System.out.println("������ ȯ���� 1$�� 0.88" + '\u20AC' + "�Դϴ�.");
		
		int num1 = 50;
		long num2 = 3147483647l;
		System.out.println(num1 + num2);
		
		System.out.println();
		double pi = 3.1415;
		int wholeNumber = (int)pi;
	}

}
