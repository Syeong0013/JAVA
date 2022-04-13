package Pkg.AllUnit;
import Pkg.Commons.*;

public abstract class Unit extends AllUnit{
	
	// 필드
	protected int offense;
	protected int grade;
	
	// 업그레이드 필드 
	protected int killNum;
	protected int killPoint;
	protected int level;
	
	// 생성자
	public Unit() {
		this.grade = 0;
		this.state = State.alive;
		
		this.killNum = 0;
		this.level = 0;
	}
	
	// 추상 메소드
	abstract void upgrade();
	
	@Override
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
			this.die();
		}
		else {		
			System.out.println(this.name + "의 체력이 " + Integer.toString(this.health) + " 남았습니다.");
			System.out.println("----------------------------");
		}
	}
	
}
