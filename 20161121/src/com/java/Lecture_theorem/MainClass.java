package com.java.Lecture_theorem;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gettersetterClass sc; // �� Ŭ������ ��������
		sc = new gettersetterClass(); // �� ��ü ���� 
		//SubClass sc = new SubClass();  // �� �� �ΰ� ���ļ� �ۼ� ����
		
		//sc.age = 15;
		//System.out.println(sc.age);
		//SubClass Ŭ������ age,name�ɹ�����(�ʵ�)��  private �Ǿ� �־ �ܺο��� ���� ����� �� �� ����.
		
		sc.setAge(15);
		sc.setName("�̼���");
		// SubClass Ŭ������ setAge �޼ҵ带 ����Ͽ� private �Ǿ��ִ� age �ɹ�����(�ʵ�)��  ���� ���� �� �� �ִ�.
		
		System.out.println("���̴� "+sc.getAge()+", �̸��� "+sc.getName());
		// SubClass Ŭ������ getAge �޼ҵ带 ����Ͽ� private �Ǿ��ִ� age �ɹ�����(�ʵ�)��  ���� ��� �� �� �ִ�.
		
		//4-2. static
		gettersetterClass c1 = new gettersetterClass();
		gettersetterClass c2 = new gettersetterClass();
		c1.Counter();
		c2.Counter();
		
		//5. static method
		//System.out.println(gettersetterClass.nostaticGetCount());
		// : gettersetterClass Ŭ�������� static ������ ���� �ʾҰ�, �ν��Ͻ� ������ �ȉ�� ������ ���� �߻�
		System.out.println(sc.noStaticGetCount()); // �ν��Ͻ� ������ ������ ���ľ� ��� ����
		
		System.out.println(gettersetterClass.staticGetCount());
		// : gettersetterClass Ŭ�������� static ������ �߱� ������ �ν��Ͻ� ���� ���̵� ��� ����
		

	}

}
