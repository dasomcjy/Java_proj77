package practice.ex01;


class Student {
	//필드
	String name;
	
	// 합계와 평균을 출력하는 메소드
	void sum_avg () {
		
	}
}

class Student_Sub extends Student{
	//자식의 필드
	int kor ; 		//국어 점수
	int eng ; 		//영어 점수
	int math ;      //수학 점수
	int sum ;
	double avg ;
	

	
	@Override 
	void sum_avg () {
		sum = kor + eng + math ;
		avg = sum / 3.0;
		System.out.println("이름 : " + name + " 국어점수 : " + kor + " 영어점수 : " + eng + " 수학점수 : " + math);		
		System.out.println("합계는 " + sum + "이고 ," + "평균은 " + avg + "입니다.");
	
	}


	@Override
	public String toString() {
		return "Student_Sub [kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg=" + avg + "]";
	}
	

	
	// 부모의 sum_avg() 메소드를 오버라이딩해서 객체의 kor , eng , math 의 합계와 평균을 출력하는 메소드
	
}

public class P1125 {

	public static void main(String[] args) {
		// 상속, 업캐스팅, 다운캐스팅, 객체를 배열에 넣어서 배열에 저장된 값을 출력
		
		//생성자를 사용해서 객체 생성시 필드의 값을 할당하고 
		 /*홍길동 70 88 77 
		   이순신 80 68 87 
		   김똘똘 60 86 87 
		   홍길순 77 56 80 
		   강감찬 55 66 77
		 */
		
		 // Student 배열변수 arr 변수에 모든 객체를 저장해서 
		
		 // 배열의 값을 for 문으로 출력할때 
			// 오버라이딩된 메소드 출력 < 그 학생의 국어, 영어, 수학의 합계, 평균> 업캐스팅
			// 5명 학생의 국어에 대한 합계, 평균      <<다운캐스팅 ?
			// 5명의 학생의 영어에 대한 합계 , 평균
			// 5명의 학생의 수학에 대한 합계 , 평균
		
		Student_Sub s1 = new Student_Sub();
		
		
		s1.name = "홍길동";
		s1.kor = 70 ;
		s1.eng = 88;
		s1.math = 77;
		s1.sum_avg();
		
		
		Student_Sub s2 = new Student_Sub();
		
		s2.name = "이순신";
		s2.kor = 80 ;
		s2.eng = 68;
		s2.math = 87;
		s2.sum_avg();
		
		
		Student_Sub s3 = new Student_Sub();
		
		s3.name = "홍길동";
		s3.kor = 60 ;
		s3.eng = 86;
		s3.math = 67;
		s3.sum_avg();
		
		Student_Sub s4 = new Student_Sub();
		
		s4.name = "홍길동";
		s4.kor = 77 ;
		s4.eng = 56;
		s4.math = 80;
		s4.sum_avg();
		
		Student_Sub s5 = new Student_Sub();
		
		s5.name = "홍길동";
		s5.kor = 70 ;
		s5.eng = 88;
		s5.math = 77;
		s5.sum_avg();
		
		Student [] arr1 = new Student_Sub[5];
		arr1[0] = s1;
		arr1[1] = s2;
		arr1[2] = s3;
		arr1[3] = s4;
		arr1[4] = s5; 
	
		for (int i = 0 ; i <arr1.length; i++) {
			Student a = arr1[i];
			System.out.println(a);		
		}	
		
		
	}

}
