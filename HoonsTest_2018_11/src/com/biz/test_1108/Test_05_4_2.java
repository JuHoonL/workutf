package com.biz.test_1108;

public class Test_05_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1~100까지 출력하고 이어서 거꾸로 100에서 1까지 출력하는 프로그램을 작성해보자. 
		 * 단, 가급적 while문과 do~while문을 한번씩 사용해서 구현하자
		 */
		
		int n = 1;
		
		while (n <= 100) {
			System.out.println(n++);
		}
		n = 100;
		do {
			System.out.println(--n);
		} while(n > 1);
	}

}
