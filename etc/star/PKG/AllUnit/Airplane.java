package Pkg.AllUnit;

import Pkg.Commons.*;

public abstract class Airplane extends AllUnit implements IFly{
	
	//필드
	protected int offense;
	
	//생성자
	public Airplane() {
		this.state = State.alive;
	}
	public Airplane(int offense) {
		this.offense = offense;
		this.state = State.alive;
	}
	
	@Override
	public void fly() {
		if(this.state != State.die) {
			System.out.println("----------------------------");
			System.out.println(this.name + "이 비행합니다.");
			System.out.println("----------------------------");
		}
	}
	
	@Override
	public void fall() {
		System.out.println(this.name + "이 추락합니다.");
		this.die();
		
	}
	
	@Override
	// Mutal, Corsair die 구현
	protected void die() {
		this.health = 0;
		this.state = State.die;
		System.out.println(this.name + "이 쓰러집니다.");
		System.out.println("----------------------------");
	}
	
	@Override
	protected void attacked(int offense) {
		this.health -= offense;
		if(this.health <= 0) {
			this.fall();
		}
		else {
			System.out.println(this.name + "의 체력이 " + Integer.toString(this.health) + " 남았습니다.");
			System.out.println("----------------------------");
		}
	}
	
}
