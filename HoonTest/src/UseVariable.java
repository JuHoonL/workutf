
public class UseVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short num1;	// 변수 num1의 선언
		num1 = 11;	// 변수 num1에 10을 저장
		
		short num2 = 22;	// 변수 num2, 선언과 동시에 20으로 초기화
		int num3 = num1 * num2;	// 두 변수 값을 대상으로 덧셈
		/*
		 * byte, short는 각각 1바이트 2바이트를 대상으로 사용되는데 변수는 각각 1바이트 2바이트가 될 수있으나, 연산의 결과는 4바이트 int형이다.
		 * 보통 연산을 동반하는 경우 int를 사용한다.
		 * 단, 매우 많은 수의 숫자 정보로 이루어진 경우(예시:3d그래픽 정보나 음원정보)에는 메모리 절약을 위해서 연산을 동반하는 경우에도 변수를 byte형과 short형으로 저장하는경우가 있다.
		 */
		
		System.out.println(num1 + "*" + num2 + "=" +num3);

	}

}
