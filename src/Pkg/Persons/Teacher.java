package Pkg.Persons;

public class Teacher extends Person{
	
	public int career;
	// ������
	public Teacher() {
		super();
	}
	
	public Teacher(String gender, String name) {
		super(gender, name);
	}
	
	public Teacher(String gender, String name, int career) {
		super(gender, name);
		this.career = career;
	}
	
	
	public void teaching() {
		System.out.println("������ �л��� ����ģ��.");
	}
}
