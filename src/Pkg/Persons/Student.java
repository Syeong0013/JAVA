package Pkg.Persons;

public class Student extends Person{
	
	public String gender;
	public String name;
	public String sID;
	
	
	
	public Student() {
		
	}
	
	public Student(String gender, String name) {
		this.gender = gender;
		this.name = name;
	}
	
	public void drinkCoffee() {
		System.out.println("�л��� Ŀ�Ǹ� ���Ŵ�.");
	}

	public void study() {
		System.out.println("�л��� ���θ� �Ѵ�.");
	}
}
