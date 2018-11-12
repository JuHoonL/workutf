package com.biz.control;

public class ControlTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bTest = false;
		int intNum1 = 30;
		int intNum2 = 40;
		
		// +-*/% : 산술연산자
		// <> = : 비교연산자, 관계연산자
		bTest = (intNum1 < intNum2);
		
		System.out.println(bTest);
		
		bTest = (intNum1 > intNum2);
		
		System.out.println(bTest);
		
		bTest = (intNum1 == intNum2);
		
		System.out.println(bTest);
		
		bTest = (intNum1 <= intNum2);
		
		System.out.println(bTest);

		bTest = (intNum1 >= intNum2);
		
		System.out.println(bTest);
		
		bTest = (intNum1 != intNum2);  // 서로 다르냐?
		
		System.out.println(bTest);



	}

}
