package Pkg.Exec;

import Pkg.Coffes.*;
import Pkg.Persons.*;

public class Exec {
	public static void main(String[] args) {
		/*
		Coffee cof = new Coffee("����", "�ݷҺ��");
		cof.checkCoffee();				
		
		Person per = new Person("��", "������");
		per.drinkCoffee();		// ����� ����
		
		// �ڵ��� ����
		Student2 stu = new Student2("��", "���¹�");
		stu.drinkCoffee();		// ����� ����
		
		Student2 stu2 = new Student2("��", "���ϸ�", "17110115");
		stu2.drinkCoffee();		// ����� ����
		stu2.study();			// �л����� ����
		
		Teacher tea = new Teacher("��", "�ű���");
		tea.drinkCoffee();		// ����� ����
		tea.teaching();			// �������� ����
		
		Staff sta = new Staff("��", "��ȸ��");
		sta.drinkCoffee();
		sta.apply();dd
		
		CanCoffee cancof = new CanCoffee("����", "�ͽ�", "ī��");
		cancof.can();
		
		MixCoffee mixcof = new MixCoffee("����", "�ͽ�", "�ƽ�");
		//mixcof.mixing();
		*/
		
		MixCoffee mix1 = new MixCoffee("���ιͽ�", "ĥ��", "ī��");
		MixCoffee mix2 = new MixCoffee("����ͽ�", "ĥ��", "ī��");
		//upcasting >> ����ȯ
		Person p = new Student2("����", "��ǰ��");
		p.setCoffee(mix2);
		p.drinkCoffee();
	}
	
}
