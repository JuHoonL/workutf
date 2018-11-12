package com.biz.star;

public class Star02 {

	public static void main(String[] args) {
		// TODO main이 시작되는 곳 (JAVA DOC에 의한 주석속의 keyword : 북마크역할을 하는 주석)

		// TODO 사각형 숫자찍기
		for(int j = 0 ; j < 5 ; j ++) {			//for문의 연속 - 반복코딩
			for(int i = 0 ; i < 5 ; i ++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("=======================================================");
		System.out.println("\n");
		
		// TODO 역직삼각형 숫자찍기
		for(int j = 0 ; j < 5 ; j ++) {	
			for(int i = j ; i < 5 ; i ++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("=======================================================");
		System.out.println("\n");
		
		// TODO 위코드를 단일코드로 사용한 예제
		for(int i = 0 ; i < 5 ; i ++) {		
			System.out.print(i);
		}
		System.out.print("\n");
		for(int i = 1 ; i < 5 ; i ++) {
			System.out.print(i);
		}
		System.out.print("\n");
		for(int i = 2 ; i < 5 ; i ++) {
			System.out.print(i);
		}
		System.out.print("\n");
		for(int i = 3 ; i < 5 ; i ++) {
			System.out.print(i);
		}
		System.out.print("\n");
		for(int i = 4 ; i < 5 ; i ++) {
			System.out.println(i);
		}
		System.out.println("=======================================================");
		System.out.println("\n");		
		
		// TODO 역직삼각형 별찍기
		for(int j = 0 ; j < 5 ; j ++) {	
			for(int i = j; i < 5 ; i ++) {
				System.out.print("★ ");
			}
			System.out.println();
		}
		System.out.println("=======================================================");
		System.out.println("\n");	
		
		// TODO 직삼각형 별찍기
		for(int j = 0 ; j < 5 ; j ++) {	
			for(int i = 0 ; i < j ; i ++) {
				System.out.print("★ ");
			}
			System.out.println();
		}
		System.out.println("=======================================================");
		System.out.println("\n");	
		
		
		
	}

}
