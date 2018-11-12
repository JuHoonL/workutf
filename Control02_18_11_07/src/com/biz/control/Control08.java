package com.biz.control;

public class Control08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intCount = 0;
		int intSum = 0;
		
		//1부터 숫자를 더해서 그합이 10000(이상)이 될 때 얼마까지 더해져야 되는지 알아보고 싶다.
		
		while(true) {
			intCount ++;
			intSum += intCount;
			if(intSum >= 10000) break;
			// intSum = 10000으로 설정하면 10000인값이 없으므로 10000을 건너뛰기 때문에 제한값이 무한대가 됌.
		}
		System.out.println("intSum : " + intSum);
		System.out.println("intCount : " + intCount );
	
		intSum = 0;
		for(int i = 1 ; i<= 141; i ++) {
			intSum += i;
			System.out.println(intSum);
		}

		intSum = 0;
		for(int i = 1 ; true ; i ++) {
			intSum += i;
			System.out.println(intSum);	
			if(intSum >= 10000) break;
		}
		
	}

}
