package practice.ex01;

public class P_11_17_01 {

	public static void main(String[] args) {

				/* <완료시간 6:00>
				 국어 영어 수학 과학       국어 영어 수학 과학 	   국어 영어 수학 과학     국어 영어 수학 과학
		홍길동	 70   88  77  99  이순신 80  68  87  79 김똘똘 60 86  87  30 홍길순 77  56  80  99
				 
				 메인 메소드 args로 아래와 같은 값이 인풋되었을 경우 <출력>과 같이 출력해 보세요
				 args :홍길동 70 88 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99
				        0    1  2  3  4   5   6  7  8   9  10   11 12 13 14 15   16 17 18 19
				      
				 <for 문을 사용해서 출력하세요>
				 
				 <출력>
				 
				 국어    영어    수학    과학     <합계>  <평균>
				 ================================================
			홍길동 70   88  77  99	 
			이순신 80  68  87  79	 
			김똘똘 70 86  87  30
			홍길순 77  56  80  99
			======================================================
			<합계>
			<평균>
				 */
				
				System.out.println("      "+"국어" + " " + "영어" + " " + "수학" + " "+ "과학" + " " + "합계" + " " +" 평균");
				System.out.println("========================================");
				
				for ( int i = 0 ; i < 5 ; i++) {
					System.out.print( args [i] + "  " );
					}
				int sum = 0 ;
				for ( int i = 1 ; i < 5; i++) {
					sum += Integer.parseInt(args[i]);
							}
				double avg = sum / 4.0;	
				System.out.print(sum + " " +avg);
			
				
				System.out.println();
				
				
				for ( int i = 5 ; i < 10 ; i++) {
					System.out.print( args [i] + "  " );
					}
				int sum1 = 0 ;
				
				for ( int i = 6 ; i < 10; i++) {
					sum1 += Integer.parseInt(args[i]);
							}
				double avg1 = sum1 / 4.0;	
				System.out.print(sum1 + " " +avg1);
				
				System.out.println();
			
				for ( int i = 10 ; i < 15 ; i++) {
					System.out.print( args [i] + "  " );
					}
				int sum2 = 0 ;
				
				for ( int i = 11 ; i < 15; i++) {
					sum2 += Integer.parseInt(args[i]);
							}
				double avg2 = sum2 / 4.0;	
				System.out.print(sum2 + " " +avg2);
			
				System.out.println();	
				
				for ( int i = 15 ; i < 20 ; i++) {
					System.out.print( args [i] + "  " );
					}
				int sum3 = 0 ;
				
				for ( int i = 16 ; i < 20; i++) {
					sum3 += Integer.parseInt(args[i]);
							}
				double avg3 = sum3 / 4.0;	
				System.out.print(sum3 + " " +avg3);
				
				System.out.println();
				System.out.println("========================================");
			
				System.out.print("합계" + " " );
				System.out.print("  ");				
				
				for ( int i = 1 ; i < 20 ; i+=5) {
					System.out.print( args [i] + "  " );
					}
				int sum4 = 0 ;
				for ( int i = 1 ; i < 20 ; i+=5) {
					sum += Integer.parseInt(args[i]);
							}
				double avg4 = sum4 / 4.0;	
				System.out.print(sum4 + " " +avg4);
				
				
				System.out.print(sum4);
				
				System.out.print(" ");
				
				String a1 = args[2];
				String b1 = args[7];
				String c1 = args[12];
				String d1 = args[17];
				
				int e1 = Integer.parseInt(a1); 		
				int f1 = Integer.parseInt(b1); 		
				int g1 = Integer.parseInt(c1);
				int h1 = Integer.parseInt(d1);
				int sum5 = 0;
				sum5 = (e1+f1+g1+h1);
				double avg5 = sum5 / 4.0;
				System.out.print(sum5);
				
				
				System.out.print(" ");
				
				String a2 = args[3];
				String b2 = args[8];
				String c2 = args[13];
				String d2 = args[18];
				
				int e2 = Integer.parseInt(a2); 		
				int f2 = Integer.parseInt(b2); 		
				int g2 = Integer.parseInt(c2);
				int h2 = Integer.parseInt(d2);
				
				int sum6 = 0;
				sum6 = (e2+f2+g2+h2);
				double avg6 = sum6 / 4.0;
				System.out.print(sum6);
				System.out.print(" ");
				
				String a3 = args[4];
				String b3 = args[9];
				String c3 = args[14];
				String d3 = args[19];
				
				int e3 = Integer.parseInt(a3); 		
				int f3 = Integer.parseInt(b3); 		
				int g3 = Integer.parseInt(c3);
				int h3 = Integer.parseInt(d3);
				
				int sum7 = 0;
				sum7 = (e3+f3+g3+h3);
				double avg7 = sum7 / 4.0;
				System.out.print(sum7);
				System.out.print("  ");
				System.out.print(sum + sum1 + sum2 + sum3 );
				System.out.print("   ");
				System.out.print(avg + avg1 + avg2+ avg3);
				System.out.println();
				System.out.print("평균");
				System.out.print("  " + avg4 +" "+avg5 + " " + avg6+ " " + avg7);
				System.out.print("   ");
				System.out.print((sum + sum1 + sum2 + sum3) /4.0);
				System.out.print("  ");
				System.out.print((avg + avg1 + avg2+ avg3)/4.0);
			}

		


	}


