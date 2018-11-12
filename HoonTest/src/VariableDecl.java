
public class VariableDecl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2;	// 두 개의 변수 동시 선언
		double result;
		num1 = 1.00000000000001;
		num2 = 2.00000000000001;
		result = num1 + num2;
		/*
		 * 소수점 이하의 값을 지니는 실수의 저장 및 표현은 float과 double로 나뉜다.
		 * float은 소수점 6자리까지의 정밀도를 갖지만 그 이상이 되면 오차(오류x)가 발생한다.
		 * double은 소수점 15자리까지의 정밀도를 갖지만 그 이하부터 오차가 발생하기 때문에 소수점 이하 셋째짜리에서 오차가 발생 가능성이있다.
		 * 그러므로 실수의 계산은 기본적으로 오차가 존재한다고 가정해야 한다. 
		 */
		System.out.println(result);

	}

}
