package com.biz.control;

public class Control02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intPay = 4758760;
		int intPaper = 50000;
		int count = 0;
		
		//5만원권 개수 계산 
		//(정수만 구하는 이유 : int형이기 때문에)->float형이면 소수점까지 나와서 5만원권의 개수X
		
		count = intPay / intPaper;
		//count 변수는 int형으로 선언되어 있기때문에 
		//= 뒤에서 어떤 계산(연산)결과가 나와도 무조건 소수점 이하는 잘라버리고 정수부부만 count 변수에 저장된다.	
		
		System.out.println("5만원권 : " + count);
		
		//5만원권을 계산했으니 5만원권을 제외한 나머지 화폐종류를 계산한다.
		
		//count = (intPay - (count*50000)) / 10000;
		//System.out.println("1만원권 : " + count);
		
		intPay -= (intPaper * count);
		intPaper /= 5;					// 액면가를 5만원에서 1만원으로 바꾸는것
		count = intPay / intPaper;
		System.out.println("1만원권 : " + count);
		
		intPay -= (intPaper * count);
		intPaper /= 2;					// 액면가를 1만원에서 5천원으로 바꾸는것
		count = intPay / intPaper;
		System.out.println("5천원권 : " + count);
		
		intPay -= (intPaper * count);
		intPaper /= 5;					// 액면가를 5천원에서 1천원으로 바꾸는것
		count = intPay / intPaper;
		System.out.println("천원권 : " + count);
		
		intPay -= (intPaper * count);
		intPaper /= 2;					// 액면가를 1천원에서 5백원으로 바꾸는것
		count = intPay / intPaper;
		System.out.println("5백원권 : " + count);
		
		intPay -= (intPaper * count);
		intPaper /= 5;					// 액면가를 5백원에서 백원으로 바꾸는것
		count = intPay / intPaper;
		System.out.println("백원권 : " + count);
		
		intPay -= (intPaper * count);
		intPaper /= 2;					// 액면가를 백원에서 5십원으로 바꾸는것
		count = intPay / intPaper;
		System.out.println("5십원권 : " + count);
		
		intPay -= (intPaper * count);
		intPaper /= 5;					// 액면가를 5십원에서 십원으로 바꾸는것
		count = intPay / intPaper;
		System.out.println("십원권 : " + count);
		
	}

}
