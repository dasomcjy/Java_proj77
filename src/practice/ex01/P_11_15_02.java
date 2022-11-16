package practice.ex01;

public class P_11_15_02 {

	public static void main(String[] args) {
	
		int i = 0;
		int[] arr1 = new int [500];
		
		for (int a = 1 ; a < 3000 ; a++) {
			if ( a%3 == 0 || a%5 == 0) {
				arr1[i] = a;
				i++;
			}
			if (i>499) {
				break;
			}
		}
		
		System.out.println("==========for 문으로 출력======");
		for ( i = 0 ; i <500 ; i++) {
			System.out.println( arr1[i] + " ");
		}
	}
}
