package Pkg.Persons;

public class Student2 extends Person{
	// �⺻���� �߻�ȭ�� Person class�� �����ؾ� 
	// ���� ¥�� �ִ� ��ü�������α׷����� person �̶�� ������ �ҰŴ�
	
	// ����� �޴´�.  >> ���� "extens" Person
	
	
	// �л����� �Ӽ�
	public String sID;
	
	// ������ 
	public Student2() {
		super();
	}
	
	public Student2(String gender, String name) {
		super(gender, name);
	}
	
	public Student2(String gender, String name, String sID) {
		super(gender, name);
		this.sID = sID;
	}
	
	// �л����� ���� 
	public void study() {
		System.out.println("�л��� ���θ� �Ѵ�.");
	}
}
