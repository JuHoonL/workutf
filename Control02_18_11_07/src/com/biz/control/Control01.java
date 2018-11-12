package com.biz.control;

public class Control01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intPay = 4758760;
		
		// 5만원권이 몇개인가?
		int count = 0;
		count = intPay / 50000;
		System.out.println("5만원권 : " + count);
		
		//Pay에서 5만원권에 해당하는 금액을 제외
		intPay = intPay - (count * 50000);	// 5만원권이 제외된 금액
		System.out.println(intPay);
		
		//1만원권 개수 계산
		count = intPay / 10000;
		System.out.println("1만원권은 : " + count);
		
		//원금에서 1만원권 금액 제외
		intPay = intPay - (count * 10000);
		System.out.println(intPay);
		
		//5천원권의 개수 구하기
		count = intPay / 5000;
		System.out.println("5천원권은 : " + count);
		
		//원금에서 5천원권을 제외
		intPay = intPay - (count * 5000);
		System.out.println(intPay);
		
		//1천원권 개수 구하기
		count = intPay / 1000;
		System.out.println("1천원권은 : " + count);
		
		//원금에서 1천원권 제외
		intPay = intPay - (count * 1000);
		System.out.println(intPay);
		
		count = intPay / 500;
		System.out.println("500원권은 : " + count);
		
		intPay = intPay - (count * 500);
		System.out.println(intPay);
		
		count = intPay / 100;
		System.out.println("100원권은 : " + count);
		
		intPay = intPay - (count * 100);
		System.out.println(intPay);
		
		count = intPay / 50;
		System.out.println("50원권은 : " + count);
		
		intPay = intPay - (count * 50);
		System.out.println(intPay);
		
		count = intPay / 10;
		System.out.println("10원권은 : " + count);
		
		intPay = intPay - (count * 10);
		System.out.println(intPay);
	}

}
