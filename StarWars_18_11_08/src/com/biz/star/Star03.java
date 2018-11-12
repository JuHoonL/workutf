package com.biz.star;

public class Star03 {

	public static void main(String[] args) {

		//TODO 빈칸과 문자열 이어서 찍기
		System.out.print(". . . . . ");
		System.out.println("우리");
		System.out.print(". . . . ");
		System.out.println("우리");
		System.out.print(". . . ");
		System.out.println("우리");
		System.out.print(". . ");
		System.out.println("우리");
		System.out.print(". ");
		System.out.println("우리");
		System.out.print("");
		System.out.println("우리");
		System.out.println("=======================================================");
		System.out.println("\n");	
		
		System.out.print("          ");
		System.out.println("* ");
		System.out.print("        ");
		System.out.println("* * ");
		System.out.print("      ");
		System.out.println("* * * ");
		System.out.print("    ");
		System.out.println("* * * * ");
		System.out.print("  ");
		System.out.println("* * * * * ");
		System.out.print("");			// 마지막줄은 필요가없음 생략가능
		System.out.println("* * * * * * ");		
		System.out.println("=======================================================");
		System.out.println("\n");	

		// TODO  직삼각형 별찍기
		for(int j = 0 ; j < 5 ; j ++) {
			//빈칸을 몇개 찍고
			for(int i = j ; i < 5 ; i ++) {
				System.out.print("  ");
			}
			//남은 부분에 별을 찍어라
			for(int k = 0 ; k < j ; k ++) {
				System.out.print("★ ");
			}
			System.out.println();
		}
		System.out.println("=======================================================");
		System.out.println("\n");

		//TODO 역직삼각형 별찍기
		for(int j = 0 ; j < 5 ; j ++) {
			//빈칸을 몇개 찍고
			for(int i = 0 ; i < j ; i ++) {
				System.out.print("  ");
			}
			//남은 부분에 별을 찍어라
			for(int k = j ; k < 5 ; k ++) {
				System.out.print("★ ");
			}
			
			System.out.println();
		}
		System.out.println("=======================================================");
		System.out.println("\n");

		//TODO 역직삼각형에서 빈칸을 한칸만넣고 별찍기 (역삼각형)
		for(int j = 0 ; j < 5 ; j ++) {
			//빈칸을 몇개 찍고
			for(int i = 0 ; i < j ; i ++) {
				System.out.print(" ");
			}
			//남은 부분에 별을 찍어라
			for(int k = j ; k < 5 ; k ++) {
				System.out.print("★ ");
			}
			
			System.out.println();
		}		
		System.out.println("=======================================================");
		System.out.println("\n");

		//TODO 직삼각형에서 빈칸을 한칸만넣고 별찍기 (삼각형)
		for(int j = 0 ; j < 5 ; j ++) {
			//빈칸을 몇개 찍고
			for(int i = j ; i < 5 ; i ++) {
				System.out.print(" ");
			}
			//남은 부분에 별을 찍어라
			for(int k = 0 ; k < j ; k ++) {
				System.out.print("★ ");
			}
			
			System.out.println();
		}		
		System.out.println("=======================================================");
		System.out.println("\n");

		//TODO 마름모 별 찍기
		for(int j = 0 ; j < 5 ; j ++) {
			//빈칸을 몇개 찍고
			for(int i = j ; i < 5 ; i ++) {
				System.out.print(" ");
			}
			//남은 부분에 별을 찍어라
			for(int k = 0 ; k < j ; k ++) {
				System.out.print("★ ");
			}
			
			System.out.println();
		}
		for(int j = 0 ; j < 5 ; j ++) {
			//빈칸을 몇개 찍고
			for(int i = 0 ; i < j ; i ++) {
				System.out.print(" ");
			}
			//남은 부분에 별을 찍어라
			for(int k = j ; k < 5 ; k ++) {
				System.out.print("★ ");
			}
			
			System.out.println();
		}
		System.out.println("=======================================================");
		System.out.println("\n");
		
		//TODO 정삼각형 별찍기
		for(int j = 0 ; j < 5 ; j ++) {
			//빈칸을 몇개 찍고
			for(int i = j ; i < 5 ; i ++) {
				System.out.print("  ");
			}
			//남은 부분에 별을 찍어라
			for(int k = 0 ; k < j ; k ++) {
				System.out.print("★ ");
			}
			for(int k = 0 ; k < (j - 1); k ++) {
				System.out.print("★ ");
			}
			System.out.println();
		}
		
		System.out.println("=======================================================");
		System.out.println("\n");

	}

}
