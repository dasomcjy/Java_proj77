package practice.ex01;


interface Animal {
	
}

interface Animal1 extends Animal{
	void cry();
}
interface Animal2 extends Animal{
	void run();
}
interface Animal3 extends Animal{
	void eat();
}

class Cat implements Animal1, Animal2 {
	@Override
	public void cry() {
		System.out.println("고양이 야옹");	
	}
	@Override
	public void run() {
	System.out.println("고양이 껑충");		
	}
}	
	
class Tiger implements Animal1, Animal2{
	@Override
	public void cry() {
		System.out.println("호랑 어흥");	
		
	}
	@Override
	public void run() {
		System.out.println("호랑 점프");	
		
	}
}

class Dog implements Animal2, Animal3 {
	
	@Override
	public void eat() {
		System.out.println(" 멍멍");	
		
	}
	@Override
	public void run() {
		System.out.println("강아지");	
		
	}
	
}

class Lion implements Animal2, Animal3 {
	
	@Override
	public void eat() {
		System.out.println("사자왕");	
		
	}
	@Override
	public void run() {
		System.out.println("사자사자");	
		
	}
}

class Eagle implements Animal1, Animal2, Animal3 {
	@Override
	public void cry() {
		System.out.println("이글이글");
		
	}
	@Override
	public void eat() {
		System.out.println("이글 먹음");	
		
	}
	@Override
	public void run() {
		System.out.println("이글날아");	
		
	}
}
	

//Cat , Tiger <== cry(), run()
//Dog , Lion  <== run(), eat()
//Eagle 	  <== cry(), run(), eat()

//배열에 넣어서 오버라딩된 메소드 출력
		//instanceof 를 사용해서 객체 내부에 Cat , Tiger 타입이 존재하면 cry(), run ()
		//instanceof 를 사용해서 객체 내부에 Dog , Lion 타입이 존재하면 cry(), run () 
		//instanceof 를 사용해서 객체 내부에 Eagle 타입이 존재하면 cry(), run(), eat()

public class P_11_28_02 {

	public static void main(String[] args) {
	            Animal a1 = new Cat();
				Animal a2 = new Tiger();
				Animal a3 = new Dog();
				Animal a4 = new Lion();
				Animal a5 = new Eagle();

	Animal [] arr = new Animal[] {a1, a2, a3, a4, a5};
	
	for (int i = 0; i <arr.length ; i++) {
		if (arr[i] instanceof Cat || arr[i] instanceof Tiger) {
			((Animal1)arr[i]).cry();
			((Animal2)arr[i]).run();		
		}	
		if (arr[i] instanceof Dog|| arr[i] instanceof Lion) {
			((Animal3)arr[i]).eat();
			((Animal2)arr[i]).run();	
		}
		if (arr[i] instanceof Eagle) {
			((Animal1)arr[i]).cry();
			((Animal3)arr[i]).eat();	
			((Animal2)arr[i]).run();	


			}
		}
	}
}
