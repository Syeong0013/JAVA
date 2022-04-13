package Pkg.AllUnit;

import Pkg.Commons.*;

public class Ghost extends Unit implements IAttack, IHide{
	
	public Ghost() {
		super();
		this.offense = 3;
		this.health = 20;
		this.unitkind = UnitKind.Teran;
	}

	@Override
	void upgrade() {
		// 아직 못정함
	}

	@Override
	public void attack(AllUnit unit) {
		System.out.println("----------------------------");
		if(chkState(unit)) {
			System.out.println(this.name + "이 " + unit.name + "을 공격합니다.");
			unit.attacked(this.offense);
		}
	}
	
	@Override
	public void hide() {
		this.state = State.hide;
		System.out.println("----------------------------");
		System.out.println(this.name + "이 은신합니다.");
		System.out.println("----------------------------");
		hideList.add(this);
	}
	
	
}
