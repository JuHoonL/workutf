package com.biz.control;

public class ControlTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bTest1;
		boolean bTest2;
				
		boolean bT;
		
		int intNum1 = 30;
		int intNum2 = 40;
		
		bTest1 = (intNum1 < intNum2);
		bTest2 = (intNum1 > intNum2);
				
		
		bT = (bTest1 && bTest2);
		System.out.println(bT);
		bT = (bTest1 || bTest2);
		System.out.println(bT);
		
		bTest1 = (intNum1 > intNum2);
		bTest2 = (intNum1 < intNum2);
				
		bT = (bTest1 && bTest2);
		System.out.println(bT);
		bT = (bTest1 || bTest2);
		System.out.println(bT);
	
		

	}

}
