package com.java.Lecture_theorem;

public class gettersetterClass {
	/* 
	 1.Getter / Setter
	 * Getter = get + er : 인스턴스 변수의 값 얻어오기
	 * Setter = set + er : 인스턴스에 값 설정하기
	 
	 2.Getter / Setter를 Eclipse이용하여 쉽게 입력
	 * ⓐ 입력할 부분에 커서를 놓고 마우스 오른쪽 클릭
	 * ⓑ Source → Generate Getters and Setters... 선택
	 * ⓒ Getter / Setter 만들 변수명 체크 후  OK 버튼 클릭 끝!
	 
	 3. 접근제어자
	 * ⓐ public  : 어디서든 호출 가능
	 * ⓑ protected : 동일한 패키지 안, 또는 서브 클래스에서 호출 가능
	 *  └(서브클래스 는 SubClass.java 참조)
	 * ⓒ default : 동일한 패키지 안에서만 호출 가능
	 *  └(기본적으로 자료형 앞에 아무것도 입력하지 않는다. 되려 입력하면 에러 발생!!!)
	 * ⓓ private : 동일한 클래스 안에서만 호출 가능
	  
	 4. static 변수
	 * 4-1. static 은 보통 변수나 메소드 앞에 static 키워드를 붙여서 사용하게 된다.
	 * 변수에 static 키워드를 붙이면 자바는 메모리 할당을 딱 한번만 하게 되어 메모리 사용에 이점을 볼 수 있게된다.
	 * 아래 예제와 같이 lastname 변수에 static를 설정해 주면 여러개의 개체를 생성해도 메모리 할당은 한번만 하게 된다.
	 * 
	 * 4-2. static 으로 설정하면 단 한곳의 메모리 주소만을 바라보기 때문에 static 변수의 값을 공유하게 된다.
	 * static이 없는경우... <출력 결과는 MainClass.java 참조>
	 * : c1, c2 객체 생성시 count 값을 1씩 증가하더라도 c1과 c2의 count는 서로 다른 메모리를 가리키고 있기 때문에 원하던 결과
	 * (카운트가 증가된 )가 나오지 않는다.
	 * 
	 * static이 있는경우... <출력 결과는 MainClass.java 참조>
	 * : static 키워드를 붙이면 원하던데로 count 값이 공유되어 count가 증가된 결과값이 나오게 된다.
	 * 
	 5. static method 
	 * static이라는 키워드가 메소드 앞에 붙으면 이 메소드는 클래스 메소드(static method)가 된다.
	 * 클래스의 변수나 메소드는 해당 클래스가 인스턴스화 되기 전에는 접근하거나 사용할 수 없는데, 
	 * static 으로 선언된 변수나 메소드는 해당 클래스의 인스턴스화와 상관없이 바로 접근이 가능하고, 이용이 가능하다.
	 *  static이 있는경우... <출력 결과는 MainClass.java 참조>
	 *   : 객체(인스턴스) 설정을 하지 않아도 값을 출력 할 수 있다.
	 *   	└staticGetCount()
	 * 
	 *  static이 없는경우... <출력 결과는 MainClass.java 참조>
	 *   : 객체(인스턴스) 설정을 해야지만 값을 출력 할 수 있다.
	 * 
	 * 
	 * Cannot make a static reference to the non-static field count
	*/

	//5. static method (4-2.와 연계됨 같이 볼것!!)
	public static int staticGetCount() {
        return count;
    }

	public int noStaticGetCount() {
        return count;
    }
	
	//4-2. static
	static int count = 0;
    void Counter() {
        this.count++;
        System.out.println(this.count);
    }
	
	//4-1. static
	static String lastname = "이";
	
	//3. 접근제어자
	private int age;
	String name; // default
	public int phoa;
	protected  String address;

	//1.Getter / Setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
