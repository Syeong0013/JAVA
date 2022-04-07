package Pkg.Exec;

import Pkg.Coffes.*;
import Pkg.Persons.*;

public class Exec {
	public static void main(String[] args) {
		/*
		Coffee cof = new Coffee("원두", "콜롬비아");
		cof.checkCoffee();				
		
		Person per = new Person("여", "진영서");
		per.drinkCoffee();		// 사람의 행위
		
		// 코드의 재사용
		Student2 stu = new Student2("남", "강태무");
		stu.drinkCoffee();		// 사람의 행위
		
		Student2 stu2 = new Student2("여", "신하리", "17110115");
		stu2.drinkCoffee();		// 사람의 행위
		stu2.study();			// 학생만의 행위
		
		Teacher tea = new Teacher("여", "신금희");
		tea.drinkCoffee();		// 사람의 행위
		tea.teaching();			// 선생만의 행위
		
		Staff sta = new Staff("남", "강회장");
		sta.drinkCoffee();
		sta.apply();dd
		
		CanCoffee cancof = new CanCoffee("원두", "믹스", "카누");
		cancof.can();
		
		MixCoffee mixcof = new MixCoffee("원두", "믹스", "맥심");
		//mixcof.mixing();
		*/
		
		MixCoffee mix1 = new MixCoffee("원두믹스", "칠레", "카누");
		MixCoffee mix2 = new MixCoffee("가루믹스", "칠레", "카누");
		//upcasting >> 형변환
		Person p = new Student2("남자", "고품격");
		p.setCoffee(mix2);
		p.drinkCoffee();
	}
	
}
