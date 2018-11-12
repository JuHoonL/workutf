
public class IntegerLiterals01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 235;		//10진수
		int num2 = 0235;	//8진수, 맨앞에 0을 넣으면 8진수로 변환
		int num3 = 0x235;	//16진수, 맨앞에 0x를 넣으면 16진수로 변환
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		
		System.out.println("23 + 34 + 45 = " + (23+34+45));
		System.out.println("023 + 034 + 045 = " + (023+034+045));
		System.out.println("0x23 + 0x34 + 0x45 = " + (0x23+0x34+0x45));
		
		short num4 = 235;		// 결과로서 result입력시에는 byte와 short가 먹히지 않는데 정수지정을 byte와 short로 했을때는 지정한 정수로 연산이 가능 ?? 
								//그럼 result값을 쓰지말고 byte나 short의 범위내 수의 경우 이것들을 사용해서 연산을 하면 메모리부분에서 유리하지않은가 ..? 
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
