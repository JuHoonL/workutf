
public class EscapeSequences01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("AB" + '\b' + "C"); //커맨더마다 다를수있음 이클립스에선 안먹히는 명령어!
		System.out.println("AB" + '\t' + "C");
		System.out.println("AB" + '\n' + "C");
		System.out.println("AB" + '\r' + "C");
		
		System.out.println();
		System.out.println("오늘의 환율은 1$에 0.88" + '\u20AC' + "입니다.");
		
		int num1 = 50;
		long num2 = 3147483647l;
		System.out.println(num1 + num2);
		
		System.out.println();
		double pi = 3.1415;
		int wholeNumber = (int)pi;
	}

}
