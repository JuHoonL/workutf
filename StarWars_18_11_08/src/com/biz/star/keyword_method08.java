package com.biz.star;

public class keyword_method08 {

	public static void main(String[] args) {
		Triangle(3);
		
		for(int i = 5 ; i < 20 ; i ++) {
			Triangle(i);
		}
			
		

	}

	public static void Triangle(int intStarCount) {		// int intStarCount 는 매개변수이다.
		// int intStarCount = 10;
		
		for(int j = 0 ; j < intStarCount ; j ++) {
			for(int i = j ; i < intStarCount ; i ++) {
				System.out.print(" ");
			}
			for(int i = 0 ; i < j ; i ++) {
				System.out.print("★ ");
			}			
			System.out.println();
		}
	}
}
