package Pkg.Persons;

import Pkg.Coffes.Coffee;

public class Person {
	//�л� ������ ������
	public String gender;
	public String name;
	
	public Coffee coffee;
	
	//������ 
	public Person() {
		
	}
	
	public Person(String gender, String name) {
		this.gender = gender;
		this.name = name;
	}
	
	
	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
		System.out.println(coffee.beansKind + "Ŀ�Ǹ� ��´�.");
	}
	
	public void drinkCoffee() {
		System.out.println(this.gender + this.name + "Ŀ�Ǹ� ���Ŵ�.");
	}
}
