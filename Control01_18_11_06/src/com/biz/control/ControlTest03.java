package com.biz.control;

public class ControlTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum1 = 34;
		
		int intMode = (intNum1 % 2);
		
		boolean even = (intMode == 0);
		
		// if(even == true) {
		if(even) {
			//even이 true일때 실행할 명령문들
			System.out.println("짝수 맞네!!");
			System.out.print("변수의 값은 ");
			System.out.print(intNum1);
			System.out.println("입니다.");
		} else {
			//even이 false일때 실행할 명령문들
			System.out.println("아니야 홀수야!!");
		} 
		// if문, 비교판단문
		// if(변수, 식) {}  : 만약 변수나 식이 true인가 아닌가를 판단해서 명령문의 흐름을 바꾸는 keyword
		
		if(intMode == 0) {
			System.out.println("짝수라니까!!!");
		} // else가 없기 떄문에 true 일 때만 해당문을 실행하고 false 일때는 위의 문장을 전부 건너 뜀.
		
		if(intMode != 0) {
			
		} 
		// intMode는 0 아니면 1인 값을 당연히 갖는다라고 생각하지만 
		// 어떤 불가항력적인 이유로 0과 1이 아닌 값을 가질수 있다.
		//그래서 기준이 되는 intMode == 0 이라는 식의 반대되는 개념은 intMode == 1이 아닌
		//intMode != 0 이라는 생각을 해야 한다.
				
		if(intMode != 1) {
			System.out.println("짝수만세");			
		}
		if(intMode != 0) {
			System.out.println("홀수만세");
		}
		if(intMode == 1) {
			System.out.println("홀수만세");
		}

	}

}
