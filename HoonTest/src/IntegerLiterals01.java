
public class IntegerLiterals01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 235;		//10����
		int num2 = 0235;	//8����, �Ǿտ� 0�� ������ 8������ ��ȯ
		int num3 = 0x235;	//16����, �Ǿտ� 0x�� ������ 16������ ��ȯ
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		
		System.out.println("23 + 34 + 45 = " + (23+34+45));
		System.out.println("023 + 034 + 045 = " + (023+034+045));
		System.out.println("0x23 + 0x34 + 0x45 = " + (0x23+0x34+0x45));
		
		short num4 = 235;		// ����μ� result�Է½ÿ��� byte�� short�� ������ �ʴµ� ���������� byte�� short�� �������� ������ ������ ������ ���� ?? 
								//�׷� result���� �������� byte�� short�� ������ ���� ��� �̰͵��� ����ؼ� ������ �ϸ� �޸𸮺κп��� �������������� ..? 
		short num5 = 0235;
		short num6 = 0x235;
		
		System.out.println("num4 = " + num4);
		System.out.println("num5 = " + num5);
		System.out.println("num6 = " + num6);
		
		System.out.println(num4+num5);
		int result = num4+num5;
		System.out.println(result);
		
		System.out.println("23 + 34 + 45 = " + (23+34+45));
		System.out.println("023 + 034 + 045 = " + (023+034+045));
		System.out.println("0x23 + 0x34 + 0x45 = " + (0x23+0x34+0x45));
		
		
	}

}
