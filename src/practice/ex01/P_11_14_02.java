package practice.ex01;

import java.util.Scanner;

public class P_11_14_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a ;
		
		do {
			System.out.println("========================================================");
			System.out.println("1. 평균출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
			System.out.println("========================================================");
			System.out.println(" 위 번호를 선택하세요>>>");
			a = sc.nextInt();
			
			if ( a == 1) {
				System.out.println(" 1. 평균출력 ");
			}else if ( a == 2) {
				System.out.println(" 2. 합계출력 ");
			}else if ( a == 3) {
				System.out.println(" 3. 이름출력 ");
			}else if ( a == 4)	{
				System.out.println(" 4. 프로그램 종료 ");
				break;
			}else {
				System.out.println("잘못된 입력입니다. 1~4 번까지만 넣어주세요");
		
			}
		} while(true) ; 
		System.out.println(" break!! do while에서 빠져나왔습니다. ");
	}

}
