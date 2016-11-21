package com.java.Lecture_theorem;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gettersetterClass sc; // ← 클래스명 변수선언
		sc = new gettersetterClass(); // ← 객체 생성 
		//SubClass sc = new SubClass();  // ← 위 두개 합쳐서 작성 가능
		
		//sc.age = 15;
		//System.out.println(sc.age);
		//SubClass 클래스의 age,name맴버변수(필드)는  private 되어 있어서 외부에서 값을 입출력 할 수 없다.
		
		sc.setAge(15);
		sc.setName("이순신");
		// SubClass 클래스의 setAge 메소드를 사용하여 private 되어있는 age 맴버변수(필드)에  값을 저장 할 수 있다.
		
		System.out.println("나이는 "+sc.getAge()+", 이름은 "+sc.getName());
		// SubClass 클래스의 getAge 메소드를 사용하여 private 되어있는 age 맴버변수(필드)에  값을 출력 할 수 있다.
		
		//4-2. static
		gettersetterClass c1 = new gettersetterClass();
		gettersetterClass c2 = new gettersetterClass();
		c1.Counter();
		c2.Counter();
		
		//5. static method
		//System.out.println(gettersetterClass.nostaticGetCount());
		// : gettersetterClass 클래스에서 static 설정을 하지 않았고, 인스턴스 설정이 안됬기 때문에 에러 발생
		System.out.println(sc.noStaticGetCount()); // 인스턴스 설정된 변수를 거쳐야 출력 가능
		
		System.out.println(gettersetterClass.staticGetCount());
		// : gettersetterClass 클래스에서 static 설정을 했기 때문에 인스턴스 설정 없이도 출력 가능
		

	}

}
