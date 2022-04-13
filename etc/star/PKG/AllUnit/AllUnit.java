package Pkg.AllUnit;

import java.util.*;

import Pkg.Commons.*;

public abstract class AllUnit {
	protected UnitKind unitkind;
	
	public UnitKind getUnitkind() {
		return unitkind;
	}
	
	protected State state;
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public String name;
	public String getName() {
		return name;
	}
	
	protected int health;
	public void setHealth(int health) {
		this.health = health;
	}
	public int getHealth() {
		return health;
	}
	
	protected static ArrayList<AllUnit> hideList = new ArrayList<AllUnit>();
	
	protected abstract void attacked(int offense);
	
	protected abstract void die();
	
	protected boolean chkState(AllUnit attackedUnit) {
		if(this.state == State.die) {
			System.out.println(this.name + "은 쓰러진 유닛이므로 공격 불가합니다.");
			System.out.println("----------------------------");
			return false; 
		}
		else if(attackedUnit.state == State.die){
			System.out.println(attackedUnit.name + "은 쓰러진 유닛이므로 대상 지정 불가입니다.");
			System.out.println("----------------------------");
			return false;
		}
		else if(attackedUnit.state == State.hide) {
			System.out.println(attackedUnit.name + "은 은신상태이므로 기본 공격으로 공격 불가입니다.");
			System.out.println("----------------------------");
			return false;
		}
		else if(this.unitkind == attackedUnit.unitkind) {
			System.out.println(this.unitkind + "끼리는 공격 불가합니다.");
			System.out.println("----------------------------");
			return false;
		}
		else {
			return true;
		}
	}

	protected void showHideList() {
		System.out.println("\t스캔을 시작합니다.");
		for(AllUnit unit : hideList) {
			if(this.unitkind != unit.unitkind) {
				System.out.println("\t   " + unit.name);
			}
		}
		System.out.println("\t스캔을 종료합니다.");
		System.out.println("----------------------------");
	}
}
