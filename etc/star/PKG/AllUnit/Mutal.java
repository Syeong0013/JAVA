package Pkg.AllUnit;

import Pkg.Commons.*;

public class Mutal extends Airplane implements IAttack, IFly{

	//생성자
	public Mutal() {
		super();
		this.offense = 35;
		this.health = 40;
		this.unitkind = UnitKind.Zerg;
	}
	
	public Mutal(int offense) {
		super(offense);
		this.health = 40;
		this.unitkind = UnitKind.Zerg;
	}
	
	@Override
	public void attack(AllUnit unit) {
		System.out.println("----------------------------");
		if(this.chkState(unit)){
			System.out.println(this.name + "이 " + unit.getName() + "을 공격합니다.");
			unit.attacked(this.offense);
		}
	}
}

