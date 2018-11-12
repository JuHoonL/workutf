
public class Boolean01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		int num1 = 7;
		int num2 = 12;
		int num3 = 3;
		int num4 = 9;
		int num5 = (num1+num2);
		int num6 = (num3*num4);

		System.out.println("(" + num1 + "+" + num2 + ")" + ">" + "(" + num3 + "*" + num4 + ")" + "=" + (num5>num6));
		System.out.println("(" + num1 + "+" + num2 + ")" + "<" + "(" + num3 + "*" + num4 + ")" + "=" + (num5<num6));
		System.out.println(num5 + ">" + num6 + "=" + (num5>num6));
		System.out.println(num5 + "<" + num6 + "=" + (num5<num6));
		
		System.out.print(num1);
		System.out.print("+");
		System.out.print(num2);
		System.out.print(">");
		System.out.print(num3);
		System.out.print("+");
		System.out.print(num4);
		System.out.print("=");
		System.out.print(num5>num6);
		System.out.println();
		System.out.print(num1);
		System.out.print("+");
		System.out.print(num2);
		System.out.print("<");
		System.out.print(num3);
		System.out.print("+");
		System.out.print(num4);
		System.out.print("=");
		System.out.print(num5<num6);
	}

}
