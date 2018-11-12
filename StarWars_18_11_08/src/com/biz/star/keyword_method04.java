package com.biz.star;

public class keyword_method04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addNum();
		addNum(30);
		addNum(9);
		
		for(int i = 0 ; i <=20 ; i++) {
			addNum(i);
		}

		
		
	}
	public static void addNum() {
		System.out.println("매개 변수가 없는 method");
	}
	public static void addNum(int intNum) {
		if(intNum >10) {
			System.out.println("10 보다 큰 값의 매개 변수");
		} else {
			System.out.println("10 이하의 매개 변수");
		}
	}
	public static void addNum(int intNum1, int intNum2) {
		System.out.println(intNum1 + intNum2);
	}
	/*
	 	※ method를 정의할 때 같은 class 내부에서는 
	 	  원칙적으로 변수와 같이 같은 이름의 method를 정의(선언)할 수 없다.
	  	※ 하지만 Java에서는 (Java의 특징 중 1가지로) 매개변수의 개수가 다르면 
	  	  같은 이름의 method를 정의 할 수 있다.
	  	  ==> 중복정의(overLoading) 가능 이라고 한다.
	 */
}
