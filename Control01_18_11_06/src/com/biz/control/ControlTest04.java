package com.biz.control;

public class ControlTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum1 = 33;
		
		//int intMode = (intNum1 % 2);
		//boolean b = (intMode ==0); 의 코드가 압축되어있음
		if( (intNum1 % 2) == 0 ) {
			System.out.println(intNum1 + "은 짝수");
		} else {
			System.out.println(intNum1 + "은 홀수");
		}
		System.out.println();
		
		
		//if~else~문에서 다음 명령문이 단 한줄만 나올때 중괄호를 빼도 된다.
		if( (intNum1 % 2) == 0 ) 
			System.out.println(intNum1 + "은 짝수");
		else 
			System.out.println(intNum1 + "은 홀수");
		System.out.println();
		
		
		if( (intNum1 % 2) == 0 ) {
			System.out.println(intNum1 + "은 짝수");
			System.out.println(intNum1 + "은 짝수");
		} else 
			System.out.println(intNum1 + "은 홀수");
		System.out.println();
		
		
		if( (intNum1 % 2) == 0 ) 
			System.out.println(intNum1 + "은 짝수");
			System.out.println("일반명령문");
		// 위의 한문장만 if문으로 적용되고 뒤에 두번째 줄은 일반적인 명령문으로 실행된다.
		// (if문은 {}안에서만 그룹으로 인정)
			System.out.println();
			
			
		if( (intNum1 % 2) == 0 ) ; 						// ; 이후 if문 끝남
			System.out.println("if랑 관계없는 일반명령문"); 	// if문과 관계없는 일반적인 명령문
			System.out.println();
			
		/*
		 * 명령문의 제어권 영역
		 	=== 명령문 끝에 ;이 오면 그 한 줄로 끝
		 	=== 명령문 다음에 {...}이 오면 범위내의 명령들이 한 그룹으로 실행
		 	=== 명령문 다음줄에 명령문과 ;이 오면 거기까지만 실행
		 */
		
	}

}
