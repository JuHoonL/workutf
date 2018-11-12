package com.biz.star;

public class keyword_method09 {

	public static void main(String[] args) {
		
		for(int i = 5 ; i < 100 ; i ++) {
			Triangle(i);
		}

	}

	public static void Triangle(int intStarCount) {		// int intStarCount 는 매개변수이다.
		// int intStarCount = 10;
		if(intStarCount > 10) {
			System.out.println("별은 10개 까지만 찍을 수 있음");
			// method 내의 코드가 실행되는 동안 return 문을 만나면 그 자리에서 더이상 진행되지 않고
			// method를 중단하고 호출, 실행한 곳으로 돌아간다.
			return;
		}
		
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
