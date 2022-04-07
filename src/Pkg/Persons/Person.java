package Pkg.Persons;

import Pkg.Coffes.Coffee;

public class Person {
	//학생 교직원 선생님
	public String gender;
	public String name;
	
	public Coffee coffee;
	
	//생성자 
	public Person() {
		
	}
	
	public Person(String gender, String name) {
		this.gender = gender;
		this.name = name;
	}
	
	
	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
		System.out.println(coffee.beansKind + "커피를 잡는다.");
	}
	
	public void drinkCoffee() {
		System.out.println(this.gender + this.name + "커피를 마신다.");
	}
}
