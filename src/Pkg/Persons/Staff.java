package Pkg.Persons;

public class Staff extends Person{
	
	public String staffID;
	
	// ������
	public Staff() {
		super();
	}
	
	public Staff(String gender, String name) {
		super(gender, name);
	}
	
	public Staff(String gender, String name, String staffID) {
		super(gender, name);
		this.staffID = staffID;
	}
	
	// ���Ǹ��� ����
	public void apply() {
		System.out.println("�л��� �����Ѵ�.");
	}
}
