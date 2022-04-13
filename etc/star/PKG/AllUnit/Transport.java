package Pkg.AllUnit;

import java.util.ArrayList;

import Pkg.Commons.*;

public abstract class Transport extends AllUnit{

	protected int pickupNum;
	protected ArrayList<AllUnit> unitList;
	
	// 생성자
	public Transport() {
		unitList = new ArrayList<AllUnit>(8);
		this.state = State.alive;
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
	
	public void pickup(AllUnit unit) {
		if(unit.state == State.die){
			System.out.println(this.name + "은 쓰러진 유닛이므로 태울 수 없습니다.");
			System.out.println("----------------------------");
		}
		else if(this.state != State.die) {
			System.out.println("----------------------------");
			if(this.chkCarrier() && this.chkKind(unit)) {
				if(this.unitList.contains(unit)) {
					System.out.println(unit.getName() + "은 이미 탑승한 유닛입니다.");
					System.out.println("----------------------------");
				}
				else {
					this.unitList.add(unit);
					System.out.println(this.name + "에 " + unit.getName() + "을 태웁니다.");
					System.out.println("----------------------------");
					System.out.println("***\t현재 탑승 유닛\t***");
					for(AllUnit loadUnit : unitList) {
						System.out.println("\t   " + loadUnit.getName());
					}
					System.out.println("----------------------------");					
				}
			}
		}
		else {
			System.out.println(this.name + "은 추락했으므로 사용할 수 없습니다.");
			System.out.println("----------------------------");
		}
	}
	
	
	public void fly() {
		System.out.println("----------------------------");
		if(this.state != State.die) {
			System.out.println(this.name + "이 비행합니다.");
			System.out.println("----------------------------");
		}
		else {
			System.out.println(this.name + "은 추락한 비행기이므로 비행할 수 없습니다.");
		}
		System.out.println("----------------------------");
	}
	
	
	protected void die() {
		this.health = 0;
		this.state = State.die;
		System.out.println(this.name + "이 부서집니다.");
		System.out.println("----------------------------");
	}
	
	
	public void fall() {
		System.out.println(this.name + "이 추락합니다.");
		// 현재탑승유닛들 다 쓰러트린다.
		for(AllUnit loadUnit : unitList) {
			loadUnit.setHealth(0);
			loadUnit.setState(State.die);
			System.out.println(loadUnit.getName() + "이 쓰러집니다.");
		}
		this.die();
	}
	
	
	protected boolean chkCarrier() {
		if(this.unitList.size() == this.pickupNum) {
			System.out.println(this.name + "의 최대 수용인원을 초과합니다.");
			System.out.println("----------------------------");
			return false;
		}
		else return true;
	}
	
	
	protected boolean chkKind(AllUnit unit) {
		if(this.unitkind != unit.getUnitkind()) {
			System.out.println(unit.getName() + "은 " + this.unitkind + "종족이 아니므로 탑승할 수 없습니다.");
			System.out.println("----------------------------");
			return false;
		}
		else if(unit instanceof IFly) {
			System.out.println(unit.getName() + "은 날아다니는 유닛이므로 탑승할 수 없습니다.");
			System.out.println("----------------------------");
			return false;
		}
		else return true;
	}
}
