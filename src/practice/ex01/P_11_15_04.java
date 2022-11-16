package practice.ex01;

import java.util.Scanner;

public class P_11_15_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int b;
	    System.out.println("배열의 방갯수를 입력해주세요>>>");
		b = sc.nextInt();				
		
		int[] arr1 = new int [b];			
		for (int i = 0 , k = 1 ; i < arr1.length ; i++ , k++) {
			if(k%7 == 0 || k%8 == 0 ) {
				arr1[i] = k;
		System.out.println(arr1[i] + " ");
		
	
}
}}}
