package practice.ex01;

public class p_11_14_01 {

	public static void main(String[] args) {
		
		for (int i = 1 ; i < 10 ; i++ ) {
			System.out.println( i + "단 출력");
			System.out.println();
			for ( int j = 1 ; j <10 ; j++) {
				System.out.println(i + " * " + j + " = " + i * j );
			}
		System.out.println();
		}
		int a = 0;
		while ( a < 10) {
			System.out.print( a + " ");
			a++;	
		}
		System.out.println();
		
		for ( int b = 0 ; b <10 ; b++) {
			System.out.print(b + " ");
		}
		
		System.out.println();
		
		int c = 100;
		while ( c > 0 ) {
			System.out.print(c + " ");
			c--;				
		}
		
		System.out.println();
		
		for ( int d = 100 ; d>0 ; d--) {
			System.out.print(d +" ");
		}
		System.out.println();
		
		int e = 0;
		while (true) {
			System.out.println("무한루프" + e);
			if( e >100 ) {
				break;
			}
			e++;
		}
		
		System.out.println(" while 문 빠져나옴 ");
	
		System.out.println();
		
		int f = 0 ;
		do {
			System.out.println(f + " ");
			f++;
		}while ( f <10);
		
	}

}
