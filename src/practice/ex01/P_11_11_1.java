package practice.ex01;

import java.util.Scanner;

public class P_11_11_1 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int a;
	
	do {
		System.out.println("=================================================================");
		System.out.println("1. 구구단출력 | 2. 19단출력 | 3. 19단 중 7배수단만 출력 | 4. 프로그램 종료");
		System.out.println("=================================================================");
		System.out.println(" 위 번호를 선택하세요>>>");
		a = sc.nextInt();
	
		if ( a ==1 ) {
			System.out.println(" 1. 구구단출력");
			for (int i = 1 ; i < 10 ; i++) {   
				 System.out.println(i + "단 출력");
				 for (int j = 1 ; j < 10 ; j++) {	
					 System.out.println(i + "*" + j + "=" + i * j);
				 }
				 System.out.println();}
		}else if ( a ==2 ) {
			System.out.println(" 2. 19단 출력");
			for (int i = 1 ; i < 20 ; i++) {   
				 System.out.println(i + "단 출력");
				 for (int j = 1 ; j < 20 ; j++) {	
					 System.out.println(i + "*" + j + "=" + i * j);
				 }
				 System.out.println();}
		}else if ( a ==3 ) {
			System.out.println(" 3. 19단 중 7배수단만 출력");
			 for ( int i =1 ; i <20 ; i++) {
				 if(i%7 ==0) {
					 System.out.println( i + "단 출력");
				 }for (int j = 1 ; j <20 ; j++)
					 if (i%7==0) {
						 System.out.println(i + "*" + j + "=" + i * j);
				 }
				System.out.println();}
		}else if ( a == 4) {
			System.out.println(" 4. 프로그램 종료");
			break;
		}else {
			System.out.println("잘못된 입력입니다.1~4번까지만 넣어주세요");
		}
	
	} while (true) ;
	 System.out.println("do while 문을 빠져나왔습니다");

}
}
