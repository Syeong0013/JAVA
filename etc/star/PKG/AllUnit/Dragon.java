package Pkg.AllUnit;

import Pkg.Commons.*;

public class Dragon extends Unit implements IAttack{

	//생성자 
	public Dragon() {
		super();
		this.offense = 40;
		this.health = 100;
		this.unitkind = UnitKind.Protoss;
	}
	
	@Override
	void upgrade() {
		
	}
	
	@Override
	public void attack(AllUnit unit) {
		System.out.println("----------------------------");
		if(this.chkState(unit)) {
			System.out.println(this.name + "이 " + unit.getName() + "을 공격합니다.");
			unit.attacked(this.offense);
		}
	}

}
