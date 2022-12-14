package practice.ex01;

import java.util.Scanner;

public class P_11_16_02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		// 배열을 인풋 받는 변수 선언 /// if문이었던거 switch문으로 바꿔봄~~~~~
		int[] arr1;			//배열 변수 선언
		int n ;				// 선택자 ( 1,2,3,4 ) 번호를 인풋 받는 변수
		int idx;			//배열의 방의 크기를 스캐너로 인풋 받는 변수

		while (true) {
		
			System.out.println(" ================================================================================== ");
			System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장후 출력");
			System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 빼고 저장 후 출력");
			System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그 중 6의 배수는 빼고 저장 후 출력");
			System.out.println("4.프로그램 종료");
			System.out.println("===================================================================================");
		
			System.out.println(" 1 ~ 4번까지 번호를 입력하세요>>>>");
			n = sc.nextInt();
			int i = 0 ;		//배열의 방 번호를 지정하는 변수
			int a ;		
				switch ( n ) {
				 case 1 :
						// 1번을 선택시 출력하는 프로그램 작성
						System.out.println("1 번 선택 : 배열의 방의 크기를 넣어주세요 >>>");
						idx = sc.nextInt();		//배열의 방의 크기를 스캐너로 받아서 idx 변수에 할당
						arr1 = new int [idx];	//arr1 배열 변수의 방의 크기를 지정
						// 7의 배수와 8의 배수를 저장하는 프로그램을 작성 : for 반복문을 사용해서 처리
								//7의 배수와 8의 배수를 저장하는 변수
						for ( a = 1 ; ; a++) {	  //조건을 생략하면 무한 루프
							if (a % 7 == 0 || a % 8 == 0) {		//의 배수이거나 8의 배수라면
								arr1[i] = a; 				//배열방에 7의 배수나 8의 배수를 저장
								i++;						//배열의 방의 번호증가는 값이 저장될 때만 증가되어야 됨							
							}
							if (i == idx )  {			// i = 방번호이고, idx : 인풋 받은 방의 갯수
														//99번방 까지 넣고 100번방에서 탈출해야 하므로 (i == idx-1) 수식이 틀렸었음! -1 제거해주면 됨! 
														// i <
								break;
							}							
						}
						
						System.out.println("인풋받은 방의 갯수 : " + idx );
						System.out.println("마지막 방번호 : " + i);
						System.out.println("마지막 방번호에 들어간 값 : "  + a);
						
						//for 문을 사용해서 배열에 (arr1) 저장된 값을 출력
						
						System.out.println("1. 7의 배수, 8의 배수 출력 됨...");
						for ( i = 0 ; i < arr1.length ; i++ ) {
							System.out.print( arr1[i] + " ");
						}
						System.out.println();
						
						//System.out.println("100번 방의 값 출력 : " + arr1[100]);
						break;
				case 2 :
						// 2번을 선택시 출력하는 프로그램 작성					
						System.out.println("2 번 선택 : 방의 크기를 넣어주세요 >>>");
						// 2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4배수만 빼고 저장후 출력
						idx = sc.nextInt(); 		// 배열 방의 크기
						arr1 = new int[idx]; 		// 스캐너로 받은 값을 방크기로 지정
						
						// for 문을 사용해서 1씩 증가하는데 4의 배수는 배열에 넣지 않고 저장
							//값을 저장하는 변수
						for (a = 0 ; ; a++) {
							if ( a % 4 == 0) {
								continue;		//continue를 만나면 아래 내용은 실행되지 않고 증가식으로 올라감
							}
							arr1[i] = a ; 
							i ++;
							if ( i == idx ) {
								break;
							}			
						}
						// for 문을 사용해서 배열에 들어간 값을 출력
						System.out.println("배열의 값 출력");
						for ( i = 0 ; i < arr1.length ; i++) {
							System.out.print( arr1[i] + " ");
						}
						System.out.println();
						break;
						
				case 3 : 
						// 3번을 선택시 출력하는 프로그램 작성
						System.out.println("3 번 선택 : 방의 크기를 넣어주세요 >>>");
						idx = sc.nextInt();
						arr1 = new int[idx];
						
						//3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 그 중 6의 배수는 빼고 저장 후 출력"
						
						//for 문을 사용해서 값을 저장
						for ( a = 1 ; ; a++) {
							if (a % 3 == 0 ) {			//3의 배수이고
								if( a % 6 != 0 ) {		//6의 배수가 아닐때
								arr1[i] = a;
								i++;
								}
							}
							if (i == idx) {
								break;
							}
						}
						
						
						//for 문을 사용해서 넣은 값을 출력
						System.out.println("배열의 내용을 출력");
						for ( i = 0 ; i < arr1.length; i++) {
							System.out.print( arr1[i] + "  " );
						}
						System.out.println();
						
						break;
						
				case 4 :
						// 4번을 선택시 출력하는 프로그램 작성
						System.out.println("4 번 선택");
						break;
				default :
						// 위의 조건이 모두 만족하지 않을 때 : 1 ~ 4 이외의 값이 들어왔을때
						System.out.println("잘못된 입력입니다. 1 번 ~ 4번 까지만 입력해주세요");
					}
		
		}
		
	}
	}




	


