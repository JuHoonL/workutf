
public class UseVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num1;	// ���� num1�� ����
		num1 = 11;	// ���� num1�� 10�� ����
		
		short num2 = 22;	// ���� num2, ����� ���ÿ� 20���� �ʱ�ȭ
		int num3 = num1 * num2;	// �� ���� ���� ������� ����
		/*
		 * byte, short�� ���� 1����Ʈ 2����Ʈ�� ������� ���Ǵµ� ������ ���� 1����Ʈ 2����Ʈ�� �� ��������, ������ ����� 4����Ʈ int���̴�.
		 * ���� ������ �����ϴ� ��� int�� ����Ѵ�.
		 * ��, �ſ� ���� ���� ���� ������ �̷���� ���(����:3d�׷��� ������ ��������)���� �޸� ������ ���ؼ� ������ �����ϴ� ��쿡�� ������ byte���� short������ �����ϴ°�찡 �ִ�.
		 */
		
		System.out.println(num1 + "*" + num2 + "=" +num3);

	}

}
