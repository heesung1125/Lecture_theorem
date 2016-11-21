package com.java.Lecture_theorem;

public class gettersetterClass {
	/* 
	 1.Getter / Setter
	 * Getter = get + er : �ν��Ͻ� ������ �� ������
	 * Setter = set + er : �ν��Ͻ��� �� �����ϱ�
	 
	 2.Getter / Setter�� Eclipse�̿��Ͽ� ���� �Է�
	 * �� �Է��� �κп� Ŀ���� ���� ���콺 ������ Ŭ��
	 * �� Source �� Generate Getters and Setters... ����
	 * �� Getter / Setter ���� ������ üũ ��  OK ��ư Ŭ�� ��!
	 
	 3. ����������
	 * �� public  : ��𼭵� ȣ�� ����
	 * �� protected : ������ ��Ű�� ��, �Ǵ� ���� Ŭ�������� ȣ�� ����
	 *  ��(����Ŭ���� �� SubClass.java ����)
	 * �� default : ������ ��Ű�� �ȿ����� ȣ�� ����
	 *  ��(�⺻������ �ڷ��� �տ� �ƹ��͵� �Է����� �ʴ´�. �Ƿ� �Է��ϸ� ���� �߻�!!!)
	 * �� private : ������ Ŭ���� �ȿ����� ȣ�� ����
	  
	 4. static ����
	 * 4-1. static �� ���� ������ �޼ҵ� �տ� static Ű���带 �ٿ��� ����ϰ� �ȴ�.
	 * ������ static Ű���带 ���̸� �ڹٴ� �޸� �Ҵ��� �� �ѹ��� �ϰ� �Ǿ� �޸� ��뿡 ������ �� �� �ְԵȴ�.
	 * �Ʒ� ������ ���� lastname ������ static�� ������ �ָ� �������� ��ü�� �����ص� �޸� �Ҵ��� �ѹ��� �ϰ� �ȴ�.
	 * 
	 * 4-2. static ���� �����ϸ� �� �Ѱ��� �޸� �ּҸ��� �ٶ󺸱� ������ static ������ ���� �����ϰ� �ȴ�.
	 * static�� ���°��... <��� ����� MainClass.java ����>
	 * : c1, c2 ��ü ������ count ���� 1�� �����ϴ��� c1�� c2�� count�� ���� �ٸ� �޸𸮸� ����Ű�� �ֱ� ������ ���ϴ� ���
	 * (ī��Ʈ�� ������ )�� ������ �ʴ´�.
	 * 
	 * static�� �ִ°��... <��� ����� MainClass.java ����>
	 * : static Ű���带 ���̸� ���ϴ����� count ���� �����Ǿ� count�� ������ ������� ������ �ȴ�.
	 * 
	 5. static method 
	 * static�̶�� Ű���尡 �޼ҵ� �տ� ������ �� �޼ҵ�� Ŭ���� �޼ҵ�(static method)�� �ȴ�.
	 * Ŭ������ ������ �޼ҵ�� �ش� Ŭ������ �ν��Ͻ�ȭ �Ǳ� ������ �����ϰų� ����� �� ���µ�, 
	 * static ���� ����� ������ �޼ҵ�� �ش� Ŭ������ �ν��Ͻ�ȭ�� ������� �ٷ� ������ �����ϰ�, �̿��� �����ϴ�.
	 *  static�� �ִ°��... <��� ����� MainClass.java ����>
	 *   : ��ü(�ν��Ͻ�) ������ ���� �ʾƵ� ���� ��� �� �� �ִ�.
	 *   	��staticGetCount()
	 * 
	 *  static�� ���°��... <��� ����� MainClass.java ����>
	 *   : ��ü(�ν��Ͻ�) ������ �ؾ����� ���� ��� �� �� �ִ�.
	 * 
	 * 
	 * Cannot make a static reference to the non-static field count
	*/

	//5. static method (4-2.�� ����� ���� ����!!)
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
	static String lastname = "��";
	
	//3. ����������
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
