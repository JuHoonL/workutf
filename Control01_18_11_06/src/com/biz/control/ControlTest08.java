package com.biz.control;

public class ControlTest08 {
	
	public static void main(String[] args) {
		
		int intNum = 0;
		for(;intNum < 10;) {				// ()의 ;; 사이의 일을 하는 동안에 라는 명령어
			System.out.println(intNum++);
		}
		
		intNum = 0;
		for (;intNum < 10 ; intNum++) {
			System.out.println(intNum);
		}	
		
		intNum = 0;
		for(;intNum <= 10; intNum += 2) {
			System.out.println(intNum);
		}
		
		intNum = 0;
		for(;intNum <= 10; intNum += 3) {
			System.out.println(intNum);
		}
		
		for(intNum = 0 ;intNum <10; intNum++) {			// for(n=0 ; 첫번쨰실행 ; 세번쨰실행) {
			System.out.println(intNum);					// System.out.println(두번째실행) }
		}
		System.out.println(intNum);
		
		for(int i = 0 ;i < 10; i++) {
			System.out.println(i);	// 변수가 ()안에서 선언이 되면 
									//그 괄호의 for문의 실행이 끝나면 마지막 변수값은 사라짐
		}
		//System.out.println(i);		// 마지막 변수값이 없으므로 오류가 나는것임.
				
	}

}
