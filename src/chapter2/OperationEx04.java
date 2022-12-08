package chapter2;

public class OperationEx04 {

	public static void main(String[] args) {
		
		int num = 10;
		
		boolean isEven;
		isEven = (num % 2)==0 ? true : false;
		System.out.println(isEven);
		
		int num1 = 5;
		int num2 = 10;
		int result = num1 ^ num2;
		
		System.out.println(result);
		
		int num3 = 10;
		int result1 = ~num3;
		
		System.out.println(result1);
	}

}
