package com.biz.star;

public class Keyword_method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle(5);	//5개
		Triangle(7);	//7개
		Triangle(10);	//10개
		
	}
	/*
	 * method를 선언하면서 ()안에 변수 선언문을 두면 
	   이 method를 사용(호출, 실행) 할 때 method(값) 형태로 작성, 실행
	       예) void method(int a)로 작성하여 선언하고 
		       main에서 method(3)이라고 작성하면 method(int a =3)이라는 것과 같다.
	 */
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
