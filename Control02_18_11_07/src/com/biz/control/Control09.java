package com.biz.control;

public class Control09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 100까지 반복하는 코드를 시작
		
		/*
		for(int intNum = 1 ; intNum <= 100 ;  intNum ++) {
		System.out.println(intNum);
		}
		*/
		
		for(int i = 0 ; i < 100; i++) {
			int index = i + 1;
			int m = i % 5;			// m = 0, 1, 2, 3, 4
			if(m ==0) {
				System.out.println(i + "는 5의 배수이다.");
			}
			if(m==1) {
				System.out.println("하늘천따지");
			}
			if(m==2) {
				System.out.println("대한민국만세");
			}
			if(m==3) {
				System.out.println("우리나라만세");
			}
			if(m==4) {
				System.out.println("Republic of korea");
			}
			if(m==5) {
				System.out.println("아무것도 아니야"); // 5는 나머지가 안나오므로 필요없는 코드
			}
		}
	}

}
