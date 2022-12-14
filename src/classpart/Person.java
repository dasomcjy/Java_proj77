package classpart;

public class Person {
	
	int age;
	String name;
	boolean maraged;
	int count;
	
		
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.age = 40;
		p1.name = "Jason";
		p1.maraged = true;
		p1.count = 3;
		
		System.out.println("이 사람의 나이는 " + p1.age + "이고 이름은 " + p1.name + "입니다. 결혼 여부는 " + p1.maraged + "이며 자녀는" + p1.count + "명이 있습니다.");

				

	}

}
