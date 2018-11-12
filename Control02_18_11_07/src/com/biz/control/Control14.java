package com.biz.control;

public class Control14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 ~ 10까지 반복
		String weekName = "" ;
		for(int i = 0 ; i < 10 ; i ++) {
			int week = (i % 7) + 1;	// 1~7까지
			if(week == 1) weekName = "월요일";
			if(week == 2) weekName = "화요일";
			if(week == 3) weekName = "수요일";
			if(week == 4) weekName = "목요일";
			if(week == 5) weekName = "금요일";
			if(week == 6) weekName = "토요일";
			if(week == 7) weekName = "일요일";
			System.out.println(weekName);
		}
		
		int intNov = 3;		// 0을 월요일에 맞춰서 11월 1일을 맞춘 값
		for(int i = 0 ; i < 30 ; i++) {
			int week = (intNov++ % 7);	// 0~6까지
			if(week == 0) weekName = "월요일";
			if(week == 1) weekName = "화요일";
			if(week == 2) weekName = "수요일";
			if(week == 3) weekName = "목요일";
			if(week == 4) weekName = "금요일";
			if(week == 5) weekName = "토요일";
			if(week == 6) weekName = "일요일";
			System.out.println("11월 " + (i+1) + "일은 " + weekName + " 입니다");
		}
		
		intNov = 3;		// 0을 월요일에 맞춰서 11월 1일을 맞춘 값
		for(int i = 0 ; i < 30 ; i++) {
			int week = (intNov++ % 7);	// 0~6까지
			
			switch(week) {
			case 0 : weekName = "월요일";
						break;						
						// break; 가 없으면 케이스를 무시하고 계속해서 weekName을 초기화해서 맨 마지막 값만 표시
			case 1 : weekName = "화요일";
						break;
			case 2 : weekName = "수요일";
						break;
			case 3 : weekName = "목요일";
						break;
			case 4 : weekName = "금요일";
						break;
			case 5 : weekName = "토요일";
						break;
			case 6 : weekName = "일요일";
			}
			
			System.out.println("11월 " + (i+1) + "일은 " + weekName + " 입니다");
		}
	}

}
