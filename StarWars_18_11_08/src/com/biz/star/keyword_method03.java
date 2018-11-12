package com.biz.star;

public class keyword_method03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 다음에 나열 된 두 숫자의 덧셈, 곱셈을 계산하여 콘솔에 보여주는 코드를 작성하시오 
			30, 40
			50, 20
			100, 200
			3, 100
			5, 20
		 */
		System.out.printf("%d + %d = %d", 30, 40, 30+40);
		System.out.println();
		System.out.printf("%d X %d = %d", 30, 40, 30*40);
		System.out.println();
		System.out.printf("%d + %d = %d", 50, 20, 50+20);
		System.out.println();
		System.out.printf("%d X %d = %d", 50, 20, 50*20);
		System.out.println();
		System.out.printf("%d + %d = %d", 100, 200, 100+200);
		System.out.println();
		System.out.printf("%d X %d = %d", 100, 200, 100*200);
		System.out.println();
		System.out.printf("%d + %d = %d", 3, 100, 3+100);
		System.out.println();
		System.out.printf("%d X %d = %d", 3, 100, 3*100);
		System.out.println();
		System.out.printf("%d + %d = %d", 5, 20, 5+20);
		System.out.println();
		System.out.printf("%d X %d = %d", 5, 20, 5*20);
		
		System.out.println("\n");
		
		pDual(30, 40);
		pDual(50, 20);
		pDual(100, 200);
		pDual(3, 100);
		pDual(5, 20);
		
		
	}
	public static void pDual(int intNum1, int intNum2) {
		System.out.printf("%d + %d = %d\n", intNum1, intNum2, intNum1+ intNum2);
		System.out.printf("%d X %d = %d\n", intNum1, intNum2, intNum1* intNum2);
		System.out.println();
	}

}
