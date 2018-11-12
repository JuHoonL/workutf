package com.biz.star;

public class keyword_method01 {

	public static void main(String[] args) {
		
		/*
		* method() 이야기
			* Java는 우리(프로그래머)가 어딘가에 public static void 라는 키워드로 시작된
		     명령문으로 method를 선언(정의)해 두면 마치 Java에서 기본적으로 제공하는 키워드 처럼
		     명령문을 통해서 명령을 실행할 수 있다. 
		 
		* method 이름
		 	1. 변수 이름짓기와 같다.
		 	   첫 글자는 영문소문자 두번째부터는 영, 숫자
		 	2. 가급적 2단어 이상을 묶어서 
		 	3. 의미있는 이름으로 짓자
		 	4. 첫글자를 제외하고 단어가 시작될 때에는 대문자로 시작하자(camel 기법)
		 */
		
		Triangle();
		verTriAgle();
		System.out.println();
		verTriAgle();
		Triangle();
		
		for(int i = 0 ; i < 10 ; i ++) {		//지금부터 {}안의 내용을 10번 실행하라 (0~9)
			Triangle();
		}
	}

	// TODO triangle method 선언부 ( 지금부터 이 클래스에 나만의 keyword를 만들겠다.)
	// 반복적으로 실행(사용)할 코드를 나만의 keyword로 지정 - public static void <keyword>(변수) { } 
	// ==> 이를 앞으로 method(메서드)라고 부름
	public static void Triangle() {
		for(int j = 0 ; j < 5 ; j ++) {
			for(int i = j ; i < 5 ; i ++) {
				System.out.print(" ");
			}
			for(int k = 0 ; k < j ; k ++) {
				System.out.print("★ ");
			}			
			System.out.println();
		}
	}		//end triangle
	
	public static void verTriAgle() {
		for(int j = 0 ; j < 5 ; j ++) {
			for(int i = 0 ; i < j ; i ++) {
				System.out.print(" ");
			}
			for(int k = j ; k < 5 ; k ++) {
				System.out.print("★ ");
			}			
			System.out.println();
		}
	}

}
