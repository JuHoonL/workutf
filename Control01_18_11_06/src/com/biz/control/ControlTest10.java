package com.biz.control;

public class ControlTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intSum = 0;
		for(int count= 0 ; count < 100 ; count++) {
			System.out.println("count : " + (count+1));
			intSum += (count+1);
		}
		
		System.out.println("intSum : " + intSum);
		
		System.out.println();
			intSum = 0;
			for(int count= 0 ; count < 100 ;) {
		 	System.out.println("count : " + (++count));
			intSum += count;
			}
			System.out.println(intSum);
		System.out.println();
		
		
		intSum = 0;
		for(int count = 1; count <=100 ; count++) {
			System.out.println(count);
			intSum += count;
		}
		System.out.println(intSum);
		
		int intEven = 0;
		int intOdd = 0;
		for(int count = 1 ; count <= 100 ; count++) {
			if((count%2)==0) intEven ++;
			else intOdd ++;
		}
		System.out.println("EVEN : " + intEven);
		System.out.println("ODD : " + intOdd);
		
		
		intEven = 0;
		intOdd = 0;
		for(int count = 1 ; count <= 100 ; count++) {
			if((count%2)==0) {
				System.out.println(count);
				intEven += count;}
			else { 
				System.out.println(count);
				intOdd += count;}
			
		}
		System.out.println("EVEN : " + intEven);
		System.out.println("ODD : " + intOdd);
		
		
		int intn3 = 0;
		for(int count = 1 ; count <= 100 ; count++) {
			if((count%3)==0)  intn3 ++;
			}
		
		System.out.println(intn3);
		
		int thSum = 0;
		for(int c = 1 ; c <= 100 ; c++) {
			if((c%3)==0)  thSum += c;
			}
		
		System.out.println(thSum);
		
		
		for(int count = 1 ; count < 10 ; count++) {
			int intGgd = 2*count;
			System.out.println("2"+" X " + count + " = " +intGgd);
		}
		int xSum = 1;
		for(int count = 1 ; count <= 10 ; count++) {
			
			xSum *= count;
		}
		System.out.println(xSum);
		
		for(int count = 1 ; count < 10 ; count++) {
			int intGgd = 5*count;
			System.out.println("5"+" X " + count + " = " +intGgd);
		}
	}

}
