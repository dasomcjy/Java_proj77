package practice.ex01;

public class P_11_22_01 {
	
	String name = "최지윤";
	int age = 0 ;
	
	public static void main(String[] args) {
		P_11_22_01 profile = new P_11_22_01();
		profile.setName("Min");
		profile.setAge(20);
		profile.printName();
	//	profile.printAge();
	}
	
	public void setName(String str) {
		name = str;
	}
	
	public void setAge(int value) {
		age = value;
	}
	
	public void printName() {
		System.out.println("M");
	}

}
