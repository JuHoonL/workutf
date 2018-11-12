package com.biz.control;

public class Control12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//급여액이 3000이하이면 6%
		//급여액이 3000초과 10000 이하이면 9%
		//급여액이 1억을 초과하면 12%
		
		int intPay = 4800;
		if(intPay <= 3000) {
			System.out.println("세금 : " 
								+ (intPay * .06));
		}
		if(3000 < intPay && intPay <= 10000) {
			System.out.println("세금 : " 
								+ (intPay * .09));
		}
		if(intPay > 10000) {
			System.out.println("세금 : " 
								+ (intPay * .12));
		}

	}

}
