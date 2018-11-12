package com.biz.star;

public class keyword_method10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0 ; i < 20 ; i++) {
			Boolean end = loop01(i);
			if(end == false) break;
		}
	}
	public static boolean loop01(int intCount) {
		
		if(intCount > 10) {
			System.out.println("그만!!!");
			return false; 
		}
		System.out.println(intCount);
		return true;
	}
}
