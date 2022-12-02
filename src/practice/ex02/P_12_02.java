package practice.ex02;
//제너릭클래스 / 제너릭메소드 를 사용해서 두점의 좌표값으로 넓이를 구하는 프로그램작성

//점의 좌표를 처리하는 클래스 생성. < 제너릭 클래스 >
class Point < X, Y >{
	X x;
	Y y;
	
	//생성자를 사용해서 t, v의 값을 입력 ,
	Point () {}			//기본 생성자
	Point (X x, Y y){			// x : x 좌표, y : y좌표
		this.x = x;
		this.y = y; 
	}

	public X getX() {
		return x;
	}

	public Y getY() {
		return y;
	}
	
	
	//getter만 생성
	
}

//제너릭 메소드 : 일반 클래스 내부에 제너릭 메소드
class GenericMethod {
	
	//makeRectangle () 메소드를 호출시 
	public static < T,V > double makeRectangle (Point <T,V> p1 , Point<T,V> p2 ) {
		double a1 = ((Number) p1.getX()).doubleValue();
		double a2 = ((Number) p2.getX()).doubleValue();
		double b1 = ((Number) p1.getY()).doubleValue();
		double b2 = ((Number) p1.getY()).doubleValue();
		
		double width =  a2 - a1;
		double height =  b2 - b1;
		
		return width * height;
	}
		// 두점의 좌표를 받아서 넓이를 계산해서 리턴으로 돌려줌.
}	
		

		
		// 넓이를 리턴해주면 됨.
	




public class P_12_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 두점의 좌표를 저장하는 p1 , p2 
		
		// makeRectangle (p1, p2)   <== 두점의 값을 받아서 넓이를 처리해서 리턴으로 받아옴
		
		Point<Double, Double > p1 = new Point <Double, Double> (2.0 , 5.0);
		Point<Double, Double > p2 = new Point <Double, Double>(10.0 , 6.0);
		
		double rect = GenericMethod.<Double, Double> makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + " 입니다.");
		 
		 
		 
	}

}



