package com.biz.control;

public class ControlTest09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 100;
		
		intNum1 = 200;
		if(intNum1 == 200) {
			int intNum2 = 500;
			intNum1 = 300;
			System.out.println(intNum2);
		}									// {}안의 코드를 그룹으로 보기 때문에 그룹내에서 지정한 후 {}가 끝나면
											// 해당 그룹은 끝나기 떄문에 변수값은 소명되어 더이상 읽고 쓰기가 불가
		
		//if() {} 안에서 같은이름의 intNum2를 선언하고 사용했지만 {}밖의 intNum2와는 완전히 다른 변수이다.
		
		int intNum2 = 500;
		
		System.out.println(intNum2);
		System.out.println(intNum1);
		
		//for()안에서 선언된 i는 for() {} 가 끝나면 소멸된다. 
		//for() {} 가 끝난 후에 i 변수를 참조(읽거나 쓰기)를 하면 없는 변수라고 오류가 난다.
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
		
		//ii변수는 for() {} 밖에서 선언된 변수 이다.
		//for() {}의 밖에서 선언된 변수는 for() {}가 끝난 후에도 변화된 채로 값을 유지하고 있다.
	
		int ii;
		for(ii = 0 ; ii <10 ; ii++) {
			System.out.println(ii);
		}
		System.out.println(ii);
		
		System.out.println();
		
		for(ii = 0 ; ii <10 ; ii++) {
			System.out.println(ii);
			ii = 100;
		}
		System.out.println(ii);
	}

}
