package com.biz.control;

public class Control06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intPay = 4758760;
		int intPaper = 50000;
		int count = 0;
		int index = 0;
		
		//while(true) { 는 무한! ex) 0==0
		while(intPay > 0) {
		
		count = intPay / intPaper;
		intPay -= (intPaper * count);
		System.out.println(intPaper + "원권 : " + count);
		
		//만약 intPay가 0이 되어서 더이상 화폐매수를 계산할 필요가 없을 때 그만 계산하라(제어하는 명령어:break)
		//if(intPay <=0) break;	// 중단
		
		if((index++%2) == 0) intPaper /= 5;
		else intPaper /=2;
		
		}
		
		
	}

}
