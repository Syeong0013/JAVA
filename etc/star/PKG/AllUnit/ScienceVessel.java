package Pkg.AllUnit;

import Pkg.Commons.*;

public class ScienceVessel extends AllUnit implements IAttack,IFly{
	public ScienceVessel() {
		this.health = 30;
		this.unitkind = UnitKind.Protoss;
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

	//wizard
	@Override
	public void attack(AllUnit unit) {
		System.out.println("----------------------------");
		if(this.chkState(unit)) {
			if(unit.getUnitkind() == UnitKind.Zerg) {
				unit.attacked(5);
			}
			else{
				System.out.println(this.name + "이 마법을 부립니다.");
				System.out.println("----------------------------");
			}
		}
	}
	
	public void observe() {
		if(this.state != State.die) {
			System.out.println("----------------------------");
			System.out.println(this.name + "이 숨은 유닛을 스캔합니다.");
			System.out.println("----------------------------");
			this.showHideList();
		}
	}

	@Override
	public void attacked(int offense) {
		this.health -= offense;
		if(this.health <= 0) {
			this.fall();
		}
		
	}

	public void die() {
		System.out.println(this.name + "이 부서집니다.");
		System.out.println("----------------------------");
	}
	
	
}
